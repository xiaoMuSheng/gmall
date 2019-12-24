package com.yourena.gmall.bean;

import lombok.Data;

import java.beans.Transient;
import java.io.Serializable;
import java.util.List;

@Data
public class PmsSkuAttrValue implements Serializable {



    private String id;

    private String attrId;

    private String valueId;

    private String skuId;
    List<PmsSkuSaleAttrValue> pmsSkuSaleAttrValue;

}
