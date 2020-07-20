package com.ligq.study.mybatis.demo.model;

public class TCustomerSocialRef {
    private String customerSocialRefId;

    private String customerId;

    private String refType;

    private String refPersonName;

    private String mobileNo;

    private Long createTime;

    private String idType;

    private String idNo;

    public String getCustomerSocialRefId() {
        return customerSocialRefId;
    }

    public void setCustomerSocialRefId(String customerSocialRefId) {
        this.customerSocialRefId = customerSocialRefId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType;
    }

    public String getRefPersonName() {
        return refPersonName;
    }

    public void setRefPersonName(String refPersonName) {
        this.refPersonName = refPersonName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
}