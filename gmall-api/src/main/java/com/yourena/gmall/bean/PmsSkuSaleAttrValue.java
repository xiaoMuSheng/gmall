package com.yourena.gmall.bean;



import lombok.Data;

import java.io.Serializable;

@Data public class PmsSkuSaleAttrValue implements Serializable {



    private String id;

    private String skuId;

    private String saleAttrId;

    private String saleAttrValueId;

    private String saleAttrName;

    private String saleAttrValueName;

}
