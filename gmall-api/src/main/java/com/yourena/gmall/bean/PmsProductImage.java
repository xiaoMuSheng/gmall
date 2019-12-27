package com.yourena.gmall.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class PmsProductImage implements Serializable {

    private String id;

    private String productId;

    private String imgName;

    private String imgUrl;

     }
