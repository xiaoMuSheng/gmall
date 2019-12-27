package com.yourena.gmall.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class PmsProductVertifyRecord implements Serializable {

    private String id;

    private String productId;

    private Date createTime;

    private String vertifyMan;

    private String status;

    private String detail;

}
