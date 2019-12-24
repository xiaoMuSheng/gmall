package com.yourena.gmall.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PmsProductSaleAttr implements Serializable {


    private String id;

    private String productId;

    private String saleAttrId;

    private String saleAttrName;
    private List<PmsProductSaleAttrValue> pmsProductSaleAttrValueList;
}
