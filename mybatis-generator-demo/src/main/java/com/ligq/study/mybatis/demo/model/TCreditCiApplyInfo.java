package com.ligq.study.mybatis.demo.model;

public class TCreditCiApplyInfo {
    private String seqId;

    private String creditApplyLogId;

    private String ciOrgCode;

    private String ciResultData;

    private Long createTime;

    private Long updateTime;

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

    public String getCiOrgCode() {
        return ciOrgCode;
    }

    public void setCiOrgCode(String ciOrgCode) {
        this.ciOrgCode = ciOrgCode;
    }

    public String getCiResultData() {
        return ciResultData;
    }

    public void setCiResultData(String ciResultData) {
        this.ciResultData = ciResultData;
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
}