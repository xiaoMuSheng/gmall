package com.yourena.gmall.service;

 import com.yourena.gmall.bean.PmsProductImage;
 import com.yourena.gmall.bean.PmsProductInfo;
 import com.yourena.gmall.bean.PmsProductSaleAttr;
 import com.yourena.gmall.bean.PmsProductSaleAttrValue;

import java.util.List;

public interface SpuService {

    List<PmsProductInfo> spuList(String catalog3Id);

    List<PmsProductSaleAttr> spuSaleAttr(String productId);

    List<PmsProductSaleAttrValue> spuSaleAttrValue(PmsProductSaleAttr pmsProductSaleAttr);

    List<PmsProductSaleAttr> spuSaleAttrListCheckBySku(String productId, String skuId);

    List<PmsProductImage> spuImageList(String spuId);
}
