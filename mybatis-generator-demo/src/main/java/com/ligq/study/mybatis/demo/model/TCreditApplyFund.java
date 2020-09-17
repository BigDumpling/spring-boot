package com.ligq.study.mybatis.demo.model;

public class TCreditApplyFund {
    private String seqId;

    private String creditApplyLogId;

    private String fundOrgCode;

    private String fundOrgName;

    private String fundType;

    private Long createTime;

    private Long updateTime;

    private String remark;

    public String getSeqId() {
        return seqId;
    }

    public void setSeqId(String seqId) {
        this.seqId = seqId;
    }

    public String getCreditApplyLogId() {
        return creditApplyLogId;
    }

    public void setCreditApplyLogId(String creditApplyLogId) {
        this.creditApplyLogId = creditApplyLogId;
    }

    public String getFundOrgCode() {
        return fundOrgCode;
    }

    public void setFundOrgCode(String fundOrgCode) {
        this.fundOrgCode = fundOrgCode;
    }

    public String getFundOrgName() {
        return fundOrgName;
    }

    public void setFundOrgName(String fundOrgName) {
        this.fundOrgName = fundOrgName;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}