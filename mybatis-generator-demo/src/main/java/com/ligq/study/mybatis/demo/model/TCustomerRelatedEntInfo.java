package com.ligq.study.mybatis.demo.model;

public class TCustomerRelatedEntInfo {
    private String seqId;

    private String customerId;

    private String entName;

    private String entIdType;

    private String entIdNo;

    private String status;

    private Long createTime;

    private String createRemark;

    private Long updateTime;

    private String updateRemark;

    public String getSeqId() {
        return seqId;
    }

    public void setSeqId(String seqId) {
        this.seqId = seqId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public String getEntIdType() {
        return entIdType;
    }

    public void setEntIdType(String entIdType) {
        this.entIdType = entIdType;
    }

    public String getEntIdNo() {
        return entIdNo;
    }

    public void setEntIdNo(String entIdNo) {
        this.entIdNo = entIdNo;
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

    public String getCreateRemark() {
        return createRemark;
    }

    public void setCreateRemark(String createRemark) {
        this.createRemark = createRemark;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateRemark() {
        return updateRemark;
    }

    public void setUpdateRemark(String updateRemark) {
        this.updateRemark = updateRemark;
    }
}