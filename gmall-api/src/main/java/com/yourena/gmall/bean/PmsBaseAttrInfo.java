package com.yourena.gmall.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PmsBaseAttrInfo implements Serializable {

    private String id;

    private String attrName;

    private String catalog3Id;

    private String isEnabled;
    private List<PmsBaseAttrValue> pmsBaseAttrValueList;

}
