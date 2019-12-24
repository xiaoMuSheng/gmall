package com.yourena.gmall.bean;


import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author : 熊亚东
 * @description :
 * @date : 2019/7/14 | 8:31
 **/
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
