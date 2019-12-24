package com.yourena.gmall.bean;



import lombok.Data;

import java.beans.Transient;
import java.io.Serializable;

@Data public class PmsProductSaleAttrValue implements Serializable {
    private String id;

    private String productId;

    private String saleAttrId;

    private String saleAttrValueName;
    private String isChecked;

}
