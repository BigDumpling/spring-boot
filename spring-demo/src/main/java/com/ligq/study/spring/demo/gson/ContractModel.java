package com.ligq.study.spring.demo.gson;

import com.google.gson.annotations.SerializedName;

public class ContractModel {
    private String contractOwer;

    @SerializedName(value = "contractId", alternate = {"contractIds"})
    private String contractId;

    @SerializedName(value = "contractNo", alternate = {"contractNos"})
    private String contractNo;

    @SerializedName(value = "contractFileId", alternate = {"contractFileIds"})
    private String contractFileId;

    @SerializedName(value = "contractTemplateName", alternate = {"contractTemplateNames"})
    private String contractTemplateName;

    public String getContractOwer() {
        return contractOwer;
    }

    public void setContractOwer(String contractOwer) {
        this.contractOwer = contractOwer;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getContractFileId() {
        return contractFileId;
    }

    public void setContractFileId(String contractFileId) {
        this.contractFileId = contractFileId;
    }

    public String getContractTemplateName() {
        return contractTemplateName;
    }

    public void setContractTemplateName(String contractTemplateName) {
        this.contractTemplateName = contractTemplateName;
    }
}
