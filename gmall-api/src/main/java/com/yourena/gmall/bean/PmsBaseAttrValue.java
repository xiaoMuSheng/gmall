package com.yourena.gmall.bean;



import lombok.Data;

import java.io.Serializable;

@Data
public class PmsBaseAttrValue implements Serializable {



    private String id;

    private String valueName;

    private String attrId;

    private String isEnabled;

     }
