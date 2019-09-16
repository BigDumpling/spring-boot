package com.ligq.study.mybatis.demo.model;

public class TFundRouteLog {
    private String seqId;

    private String orderId;

    private String fundOrgCode;

    private String customerId;

    private String status;

    private Long createTime;

    private Integer expireMin;

    private Long updateTime;

    public String getSeqId() {
        return seqId;
    }

    public void setSeqId(String seqId) {
        this.seqId = seqId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getFundOrgCode() {
        return fundOrgCode;
    }

    public void setFundOrgCode(String fundOrgCode) {
        this.fundOrgCode = fundOrgCode;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Integer getExpireMin() {
        return expireMin;
    }

    public void setExpireMin(Integer expireMin) {
        this.expireMin = expireMin;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}