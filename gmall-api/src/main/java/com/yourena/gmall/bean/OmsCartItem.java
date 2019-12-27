package com.yourena.gmall.bean;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data public class OmsCartItem implements Serializable {

    private String id;

    private String productId;

    private String productSkuId;

    private String memberId;

    private BigDecimal quantity;

    private String price;

    private String sp1;

    private String sp2;

    private String sp3;

    private String productPic;

    private String productName;

    private String productSubTitle;

    private Date createDate;

    private int deleteStatus;

    private String productCategoryId;

    private String productBrand;

    private String productSn;

    private String productAttr;

    private String cartAllPrice;

    private String isChecked;

}
