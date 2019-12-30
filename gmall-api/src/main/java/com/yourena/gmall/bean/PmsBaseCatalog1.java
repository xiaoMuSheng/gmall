package com.yourena.gmall.bean;

import lombok.Data;


import java.io.Serializable;
import java.util.List;

@Data
public class PmsBaseCatalog1 implements Serializable {

    private String id;
    private String name;
    private List<PmsBaseCatalog2> catalog2s;

}
