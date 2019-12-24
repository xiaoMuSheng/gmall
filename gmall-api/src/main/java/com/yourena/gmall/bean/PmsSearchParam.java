package com.yourena.gmall.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author : 熊亚东
 * @description :
 * @date : 2019/7/15 | 12:25
 **/
@Data
public class PmsSearchParam implements Serializable {

    private String catalog3Id;
    private String keyword;
    private String[] valueId;

}
