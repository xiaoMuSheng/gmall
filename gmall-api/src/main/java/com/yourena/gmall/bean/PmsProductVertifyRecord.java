package com.yourena.gmall.bean;



import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data public class PmsProductVertifyRecord implements Serializable {



    private String id;

    private String productId;

    private Date createTime;

    private String vertifyMan;

    private String status;

    private String detail;

    public PmsProductVertifyRecord() {
    }

    public PmsProductVertifyRecord(String id, String productId, Date createTime, String vertifyMan, String status, String detail) {
        this.id = id;
        this.productId = productId;
        this.createTime = createTime;
        this.vertifyMan = vertifyMan;
        this.status = status;
        this.detail = detail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getVertifyMan() {
        return vertifyMan;
    }

    public void setVertifyMan(String vertifyMan) {
        this.vertifyMan = vertifyMan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
