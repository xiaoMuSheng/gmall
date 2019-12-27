package com.yourena.gmall.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PmsSkuInfo implements Serializable {

    private String id;

    private String productId;

    private String price;

    private String skuName;

    private String skuDesc;

    private String weight;

    private String tmId;

    private String catalog3Id;
    private String skuDefaultImg;
    List<PmsSkuAttrValue> pmsSkuAttrValue;
    List<PmsSkuSaleAttrValue> pmsSkuSaleAttrValue;

}
