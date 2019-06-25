package com.ligq.study.dubbo.server.domain.enums;

public enum DubboServerVersionEnum {

    VERSION_1(1.0D, "1.0版本");


    private double version;
    private String remark;

    DubboServerVersionEnum(double version, String remark) {
        this.version = version;
        this.remark = remark;
    }

    public double getVersion() {
        return version;
    }

    public String getRemark() {
        return remark;
    }
}
