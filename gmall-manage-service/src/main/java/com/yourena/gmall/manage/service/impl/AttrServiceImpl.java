package com.yourena.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.yourena.gmall.bean.PmsBaseAttrInfo;
import com.yourena.gmall.bean.PmsBaseAttrValue;
import com.yourena.gmall.bean.PmsProductSaleAttr;
import com.yourena.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import com.yourena.gmall.manage.mapper.PmsBaseAttrValueMapper;
import com.yourena.gmall.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@Component
public class AttrServiceImpl implements AttrService {

    @Autowired
    private PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Autowired
    private PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
    private List<PmsBaseAttrValue> pmsBaseAttrValues;


    @Override
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id) {
        UpdateWrapper<PmsBaseAttrValue> wrapper = new UpdateWrapper<>();

        List<PmsBaseAttrInfo> pmsBaseAttrInfoList = pmsBaseAttrInfoMapper.selectListPmsBaseAttrInfo(catalog3Id);
        for (PmsBaseAttrInfo pmsBaseAttrInfo : pmsBaseAttrInfoList) {
            List<PmsBaseAttrValue> pmsBaseAttrValueList = new ArrayList<>();
            PmsBaseAttrValue pmsBaseAttrValue = new PmsBaseAttrValue();
            pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
            pmsBaseAttrValues = pmsBaseAttrValueMapper.selectList(wrapper);
            pmsBaseAttrInfo.setPmsBaseAttrValueList(pmsBaseAttrValues);

        }
        return pmsBaseAttrInfoList;
    }

    @Override
    public List<PmsBaseAttrValue> attrValueList(String attrId) {
        return pmsBaseAttrValueMapper.selectPmsBaseAttrValueList(attrId);
    }

    @Override
    public String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {

        //修改操作没写

        //保存属性
        pmsBaseAttrInfoMapper.insert(pmsBaseAttrInfo);
        //保存属性值
        List<PmsBaseAttrValue> pmsBaseAttrValueList = pmsBaseAttrInfo.getPmsBaseAttrValueList();
        System.out.println(pmsBaseAttrValueList);
        for (PmsBaseAttrValue pmsBaseAttrValue : pmsBaseAttrValueList) {
            System.out.println(pmsBaseAttrInfo.getId());
            pmsBaseAttrValue.setAttrId(pmsBaseAttrInfo.getId());
            pmsBaseAttrValueMapper.insert(pmsBaseAttrValue);
        }
        return "null";
    }

    @Override
    public List<PmsBaseAttrInfo> getAttrValueListByValueId(Set<String> valueIdSet) {
        return null;
    }

    @Override
    public List<PmsProductSaleAttr> baseAttrInfoList() {
        return pmsBaseAttrInfoMapper.selectBaseAttrInfo();
    }

}
