package com.yourena.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.yourena.gmall.bean.PmsProductImage;
import com.yourena.gmall.bean.PmsProductInfo;
import com.yourena.gmall.bean.PmsProductSaleAttr;
import com.yourena.gmall.bean.PmsProductSaleAttrValue;
import com.yourena.gmall.manage.mapper.PmsProductImageMapper;
import com.yourena.gmall.manage.mapper.PmsProductInfoMapper;
import com.yourena.gmall.manage.mapper.PmsProductSaleAttrMapper;
import com.yourena.gmall.manage.mapper.PmsProductSaleAttrValueMapper;
import com.yourena.gmall.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class SpuMapperImpl implements SpuService {

    @Autowired
    private PmsProductInfoMapper pmsProductInfoMapper;

    @Autowired
    private PmsProductSaleAttrMapper pmsProductSaleAttrMapper;

    @Autowired
    private PmsProductSaleAttrValueMapper pmsProductSaleAttrValueMapper;

    @Autowired
    private PmsProductImageMapper pmsProductImageMapper;

    @Override
    public List<PmsProductInfo> spuList(String catalog3Id) {
        return pmsProductInfoMapper.selectListPmsProductInfo(catalog3Id);
    }

    @Override
    public List<PmsProductSaleAttr> spuSaleAttr(String productId) {
        PmsProductSaleAttr pmsProductSaleAttr = new PmsProductSaleAttr();
        pmsProductSaleAttr.setProductId(productId);
        UpdateWrapper<PmsProductSaleAttr> pmsProductSaleAttrUpdateWrapper = new UpdateWrapper<>();
        UpdateWrapper<PmsProductSaleAttrValue> pmsProductSaleAttrValueWrapper = new UpdateWrapper<>();

        List<PmsProductSaleAttr> pmsProductSaleAttrList = pmsProductSaleAttrMapper.selectList(pmsProductSaleAttrUpdateWrapper);
        for (PmsProductSaleAttr productSaleAttr : pmsProductSaleAttrList) {
            PmsProductSaleAttrValue pmsProductSaleAttrValue = new PmsProductSaleAttrValue();
            pmsProductSaleAttrValue.setProductId(productId);
            pmsProductSaleAttrValue.setSaleAttrId(productSaleAttr.getSaleAttrId());
            List<PmsProductSaleAttrValue> productSaleAttrValues = pmsProductSaleAttrValueMapper.selectList(pmsProductSaleAttrValueWrapper);
            pmsProductSaleAttr.setPmsProductSaleAttrValueList(productSaleAttrValues);
        }
        return null;
    }

    @Override
    public List<PmsProductSaleAttrValue> spuSaleAttrValue(PmsProductSaleAttr pmsProductSaleAttr) {
        return null;
    }

    @Override
    public List<PmsProductSaleAttr> spuSaleAttrListCheckBySku(String productId, String skuId) {
        return null;
    }

    @Override
    public List<PmsProductImage> spuImageList(String spuId) {
        UpdateWrapper<PmsProductImage> wrapper = new UpdateWrapper<>();
        PmsProductImage pmsProductImage = new PmsProductImage();
        pmsProductImage.setProductId(spuId);
        return pmsProductImageMapper.selectList(wrapper);
    }
}
