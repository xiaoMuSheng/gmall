package com.yourena.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.yourena.gmall.bean.PmsSkuAttrValue;
import com.yourena.gmall.bean.PmsSkuInfo;
import com.yourena.gmall.bean.PmsSkuSaleAttrValue;
import com.yourena.gmall.manage.mapper.PmsSkuAttrValueMapper;
import com.yourena.gmall.manage.mapper.PmsSkuInfoMapper;
import com.yourena.gmall.manage.mapper.PmsSkuSaleAttrValueMapper;
import com.yourena.gmall.service.SkuService;
import com.yourena.gmall.manage.util.RedisUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

@Service
public class SkuServiceImpl implements SkuService {

    @Autowired
    PmsSkuInfoMapper pmsSkuInfoMapper;

    @Autowired
    PmsSkuAttrValueMapper pmsSkuAttrValueMapper;

    @Autowired
    PmsSkuSaleAttrValueMapper pmsSkuSaleAttrValueMapper;

    @Autowired
    RedisUtil redisUtil;

    @Override
    public List<PmsSkuInfo> skuList(String catalog3Id) {
        UpdateWrapper<PmsSkuInfo> wrapper = new UpdateWrapper<>();
        return pmsSkuInfoMapper.selectList(wrapper);
    }

    @Override
    public void SavePmsSkuInfo(PmsSkuInfo pmsSkuInfo) {

        //模拟前台提交的form 表单信息，封装在PmsSkuInfo中
        PmsSkuInfo pmsSkuInfo1 = new PmsSkuInfo();
        List<PmsSkuAttrValue> pmsSkuAttrValues = new ArrayList<>();
        PmsSkuAttrValue pmsSkuAttrValue = new PmsSkuAttrValue();
        List<PmsSkuSaleAttrValue> pmsSkuSaleAttrValues = new ArrayList<>();
        PmsSkuSaleAttrValue pmsSkuSaleAttrValue = new PmsSkuSaleAttrValue();
        pmsSkuInfo1.setProductId("4");
        pmsSkuInfo1.setPrice("12999");
        pmsSkuInfo1.setSkuName("华为荣耀20pro手机|8+512G 全网通 MOSCHINO联名版");
        pmsSkuInfo1.setSkuDesc("4800万全焦段AI四摄|麒麟980芯片|屏内指纹");
        pmsSkuInfo1.setWeight("0.53");
        pmsSkuInfo1.setCatalog3Id("1");

        pmsSkuAttrValue.setValueId("1");//处理器
        pmsSkuAttrValue.setAttrId("1");//麒麟980
        pmsSkuAttrValues.add(pmsSkuAttrValue);
        pmsSkuInfo1.setPmsSkuAttrValue(pmsSkuAttrValues);

        pmsSkuSaleAttrValue.setSaleAttrId("6");
        pmsSkuSaleAttrValue.setSaleAttrValueId("23");
        pmsSkuSaleAttrValue.setSaleAttrName("增值业务");
        pmsSkuSaleAttrValue.setSaleAttrValueName("高价回收|卖了赚钱");
        pmsSkuSaleAttrValues.add(pmsSkuSaleAttrValue);
        pmsSkuInfo1.setPmsSkuSaleAttrValue(pmsSkuSaleAttrValues);

        //插入skuinfo
        pmsSkuInfoMapper.insert(pmsSkuInfo1);
        String skuId = pmsSkuInfo1.getId();
        //插入平台属性关联
        List<PmsSkuAttrValue> pmsSkuAttrValueList = pmsSkuInfo1.getPmsSkuAttrValue();
        for (PmsSkuAttrValue pmsSkuAttrValue1 : pmsSkuAttrValueList) {
            pmsSkuAttrValue1.setSkuId(skuId);
            pmsSkuAttrValueMapper.insert(pmsSkuAttrValue1);
        }
        //插入销售属性关联
        List<PmsSkuSaleAttrValue> pmsSkuSaleAttrValueList = pmsSkuInfo1.getPmsSkuSaleAttrValue();
        for (PmsSkuSaleAttrValue pmsSkuSaleAttrValue1 : pmsSkuSaleAttrValueList) {
            pmsSkuSaleAttrValue1.setSkuId(skuId);
            pmsSkuSaleAttrValueMapper.insert(pmsSkuSaleAttrValue1);
        }
        //插入图片，暂时还没有实现，不是技术问题，是资料欠缺！
        System.out.println("以后");
    }


    /**
     * @author : 熊亚东
     * @description :使用缓存redis解决高并发问题
     * 1.缓存使用简单设计
     * 2.redis整合（redis+Spring）
     * 3.设计一个数据存储策略(如何设计key(核心))
     * *企业中的存储策略
     * *数据对象名：数对象id:对象属性（User:123:password）(User:123:username)
     * @date : 2019/7/6 | 18:29
     **/
    public PmsSkuInfo getSkuByIdFromDb(String skuId) {
        UpdateWrapper<PmsSkuInfo> wrapper = new UpdateWrapper<>();
        PmsSkuInfo pmsSkuInfo1 = new PmsSkuInfo();
        pmsSkuInfo1.setId(skuId);
        return pmsSkuInfoMapper.selectOne(wrapper);
    }

    @Override
    public PmsSkuInfo getSkuById(String skuId, String ip) {
        System.out.println("ip为:" + ip + "的用户:" + Thread.currentThread().getName() + "进入了商品详情的请求");
        PmsSkuInfo pmsSkuInfo = new PmsSkuInfo();

        // 连接缓存
        Jedis jedis = redisUtil.getJedis();
        // 查询缓存
        String skuKey = "sku:" + skuId + ":info";
        String skuJson = jedis.get(skuKey);
        if (StringUtils.isNotBlank(skuJson)) {
            pmsSkuInfo = JSON.parseObject(skuJson, PmsSkuInfo.class);
        } else {
            //查询数据库
            pmsSkuInfo = getSkuByIdFromDb(skuId);
            if (pmsSkuInfo != null) {
                //存入redis
                jedis.set(skuKey, JSON.toJSONString(pmsSkuInfo));
            }
        }
        return pmsSkuInfo;
    }

    @Override
    public List<PmsSkuInfo> getSkuSaleAttrValueListBySpu(String productId) {
        List<PmsSkuInfo> pmsSkuInfos = pmsSkuInfoMapper.selectSkuSaleAttrValueListBySpu(productId);
        return pmsSkuInfos;
    }

    @Override
    public List<PmsSkuInfo> getAllSku(String catalog3Id) {

        UpdateWrapper<PmsSkuInfo> pmsSkuInfoUpdateWrapper = new UpdateWrapper<>();
        UpdateWrapper<PmsSkuAttrValue> pmsSkuAttrValueUpdateWrapper = new UpdateWrapper<>();
        List<PmsSkuInfo> pmsSkuInfos = pmsSkuInfoMapper.selectList(pmsSkuInfoUpdateWrapper);

        for (PmsSkuInfo pmsSkuInfo : pmsSkuInfos) {
            String skuId = pmsSkuInfo.getId();

            PmsSkuAttrValue pmsSkuAttrValue = new PmsSkuAttrValue();
            pmsSkuAttrValue.setSkuId(skuId);

            List<PmsSkuAttrValue> pmsSkuAttrValues = pmsSkuAttrValueMapper.selectList(pmsSkuAttrValueUpdateWrapper);
            pmsSkuInfo.setPmsSkuAttrValue(pmsSkuAttrValues);
        }

        return pmsSkuInfos;
    }

    @Override
    public boolean checkPrice(String productSkuId, String productPrice) {
        boolean b = false;
        UpdateWrapper<PmsSkuInfo> wrapper = new UpdateWrapper<>();
        PmsSkuInfo pmsSkuInfo = new PmsSkuInfo();
        pmsSkuInfo.setId(productSkuId);
        PmsSkuInfo skuInfo = pmsSkuInfoMapper.selectOne(wrapper);
        String price = skuInfo.getPrice();
        if (price != null && price.equals(productPrice)) {/*比较价格最好两个变量都是 BigDecimal 类型，准确，不易出错*/
            b = true;
        }
        return b;
    }
}
