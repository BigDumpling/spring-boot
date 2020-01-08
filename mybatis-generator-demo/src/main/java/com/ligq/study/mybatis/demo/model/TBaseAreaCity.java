package com.ligq.study.mybatis.demo.model;

public class TBaseAreaCity {
    private String currentCode;

    private String codeFlag;

    private String teleCode;

    private String currentName;

    private String parentCode;

    public String getCurrentCode() {
        return currentCode;
    }

    public void setCurrentCode(String currentCode) {
        this.currentCode = currentCode;
    }

    public String getCodeFlag() {
        return codeFlag;
    }

    public void setCodeFlag(String codeFlag) {
        this.codeFlag = codeFlag;
    }

    public String getTeleCode() {
        return teleCode;
    }

    public void setTeleCode(String teleCode) {
        this.teleCode = teleCode;
    }

    public String getCurrentName() {
        return currentName;
    }

    public void setCurrentName(String currentName) {
        this.currentName = currentName;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }
}