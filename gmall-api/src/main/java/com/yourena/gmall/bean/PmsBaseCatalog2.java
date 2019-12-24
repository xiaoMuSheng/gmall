package com.yourena.gmall.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PmsBaseCatalog2 implements Serializable {


    private String id;

    private String name;

    private String catalog1Id;
    private List<PmsBaseCatalog3> catalog3ss;

}
