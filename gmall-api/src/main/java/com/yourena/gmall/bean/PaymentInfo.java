package com.yourena.gmall.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class PaymentInfo implements Serializable {

    private String id;

    private String orderSn;

    private String orderId;

    private String alipayTradeNo;

    private String totalAmount;

    private String subject;

    private String paymentStatus;

    private Date createTime;

    private Date confirmTime;

    private String callbackContent;

    private Date callbackTime;

}
