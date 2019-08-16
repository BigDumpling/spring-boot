package com.ligq.study.mybatis.demo.model;

import javax.persistence.*;

@Table(name = "t_opr_base_log")
public class TOprBaseLog {
    /**
     * 日志编号
     */
    @Id
    @Column(name = "OP_LOG_ID")
    private String opLogId;

    /**
     * 操作对象编号
     */
    @Column(name = "OP_OBJ_ID")
    private String opObjId;

    /**
     * 操作类型
     */
    @Column(name = "OP_TYPE")
    private String opType;

    /**
     * 操作类型说明
     */
    @Column(name = "OP_TYPE_DESC")
    private String opTypeDesc;

    /**
     * 操作人
     */
    @Column(name = "OP_USER")
    private String opUser;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "USE_FLAG")
    private String useFlag;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Long createTime;

    @Column(name = "UPDATE_TIME")
    private Long updateTime;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "ROW_RAW_DATA")
    private String rowRawData;

    /**
     * 数据
     */
    @Column(name = "ROW_DATA")
    private String rowData;

    /**
     * 获取日志编号
     *
     * @return OP_LOG_ID - 日志编号
     */
    public String getOpLogId() {
        return opLogId;
    }

    /**
     * 设置日志编号
     *
     * @param opLogId 日志编号
     */
    public void setOpLogId(String opLogId) {
        this.opLogId = opLogId;
    }

    /**
     * 获取操作对象编号
     *
     * @return OP_OBJ_ID - 操作对象编号
     */
    public String getOpObjId() {
        return opObjId;
    }

    /**
     * 设置操作对象编号
     *
     * @param opObjId 操作对象编号
     */
    public void setOpObjId(String opObjId) {
        this.opObjId = opObjId;
    }

    /**
     * 获取操作类型
     *
     * @return OP_TYPE - 操作类型
     */
    public String getOpType() {
        return opType;
    }

    /**
     * 设置操作类型
     *
     * @param opType 操作类型
     */
    public void setOpType(String opType) {
        this.opType = opType;
    }

    /**
     * 获取操作类型说明
     *
     * @return OP_TYPE_DESC - 操作类型说明
     */
    public String getOpTypeDesc() {
        return opTypeDesc;
    }

    /**
     * 设置操作类型说明
     *
     * @param opTypeDesc 操作类型说明
     */
    public void setOpTypeDesc(String opTypeDesc) {
        this.opTypeDesc = opTypeDesc;
    }

    /**
     * 获取操作人
     *
     * @return OP_USER - 操作人
     */
    public String getOpUser() {
        return opUser;
    }

    /**
     * 设置操作人
     *
     * @param opUser 操作人
     */
    public void setOpUser(String opUser) {
        this.opUser = opUser;
    }

    /**
     * @return STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return USE_FLAG
     */
    public String getUseFlag() {
        return useFlag;
    }

    /**
     * @param useFlag
     */
    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * @return UPDATE_TIME
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return ROW_RAW_DATA
     */
    public String getRowRawData() {
        return rowRawData;
    }

    /**
     * @param rowRawData
     */
    public void setRowRawData(String rowRawData) {
        this.rowRawData = rowRawData;
    }

    /**
     * 获取数据
     *
     * @return ROW_DATA - 数据
     */
    public String getRowData() {
        return rowData;
    }

    /**
     * 设置数据
     *
     * @param rowData 数据
     */
    public void setRowData(String rowData) {
        this.rowData = rowData;
    }
}