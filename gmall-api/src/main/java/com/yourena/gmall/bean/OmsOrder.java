package com.yourena.gmall.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : 熊亚东
 * @description :
 * @date : 2019/7/20 | 14:05
 **/
@Data public class OmsOrder implements Serializable {
    private String id;

    private String memberId;

    private String couponId;

    private String orderSn;

    private Date createTime;

    private String memberUsername;

    private String totalAmount;

    private String payAmount;

    private String freightAmount;

    private String promotionAmount;

    private String integrationAmount;

    private String couponAmount;

    private String discountAmount;

    private String payType;

    private String sourceType;

    private String status;

    private String orderType;

    private String deliveryCompany;

    private String deliverySn;

    private String autoConfigDay;

    private String integration;

    private String growth;

    private String promotionInfo;

    private String billType;

    private String billHeader;

    private String billContent;

    private String bill_receiverPhone;

    private String billReceiverEmail;

    private String receiverName;

    private String receiverPhone;

    private String receiverPostCode;

    private String receiverProvince;

    private String receiverCity;

    private String receiverRegion;

    private String receiverDetailAddress;

    private String note;

    private String confirmStatus;

    private String deleteStatus;

    private String useIntegration;

    private Date paymentTime;

    private Date deliveryTime;

    private Date receiveTime;

    private Date commentTime;

    private Date modifyTime;

}
