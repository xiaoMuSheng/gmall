package com.yourena.gmall.bean;


import lombok.Data;

import java.io.Serializable;

@Data
public class UmsMemberReceiveAddress implements Serializable {

    private String id;

    private String memberId;

    private String name;

    private String phoneNumber;

    private int defaultStatus;

    private String postCode;

    private String province;

    private String city;

    private String region;

    private String detailAddress;

}
