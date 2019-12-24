package com.yourena.gmall.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PmsProductInfo implements Serializable {



    private String id;

    private String productName;

    private String description;

    private String catalog3Id;

    private String tmId;
    private List<PmsProductImage> pmsProductImageList;
    private  List<PmsProductSaleAttr> pmsProductSaleAttrList;

     }
