package com.yourena.gmall.bean;


import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PmsSearchSkuInfo implements Serializable {

    private String id;
    private String skuName;
    private String skuDesc;
    private String catalog3Id;
    private String price;
    private String skuDefaultImg;
    private double hotScore;
    private String productId;
    private List<PmsSkuAttrValue> pmsSkuAttrValue;

}
