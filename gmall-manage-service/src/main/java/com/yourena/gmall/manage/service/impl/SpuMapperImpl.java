package com.yourena.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yourena.gmall.bean.PmsProductInfo;
import com.yourena.gmall.bean.PmsProductSaleAttr;
import com.yourena.gmall.bean.PmsProductSaleAttrValue;
import com.yourena.gmall.manage.mapper.PmsProductInfoMapper;
import com.yourena.gmall.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class SpuMapperImpl implements SpuService {

    @Autowired
    private PmsProductInfoMapper pmsProductInfoMapper;

    @Override
    public List<PmsProductInfo> spuList(String catalog3Id) {
        return pmsProductInfoMapper.selectListPmsProductInfo(catalog3Id);
    }

    @Override
    public List<PmsProductSaleAttr> spuSaleAttr(String productId) {
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
}
