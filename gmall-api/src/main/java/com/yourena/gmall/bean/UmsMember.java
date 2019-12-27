package com.yourena.gmall.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UmsMember implements Serializable {

    private String id;

    private String memberLevelId;

    private String username;

    private String password;

    private String nickname;

    private String phone;

    private int    status;

    private Date   createTime;

    private String icon;

    private String    gender;

    private Date   birthday;

    private String city;

    private String job;

    private String personalizedSignature;

    private Long sourceUid;

    private String    sourceType;

    private int    integration;

    private int    growth;

    private int    luckeyCount;

    private int    historyIntegration;

    private String accessToken;

    private String accessCode;

}
