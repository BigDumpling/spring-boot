package com.ligq.study.mybatis.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_edi_log_track")
public class TEdiLogTrack {
    /**
     * id
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 计划号
     */
    @Column(name = "work_no")
    private String workNo;

    /**
     * traceId
     */
    @Column(name = "trace_id")
    private String traceId;

    /**
     * 工作号
     */
    @Column(name = "business_no")
    private String businessNo;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private Long createBy;

    /**
     * 创建人描述
     */
    @Column(name = "create_by_desc")
    private String createByDesc;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 修改人
     */
    @Column(name = "modify_by")
    private Long modifyBy;

    /**
     * 创建人描述
     */
    @Column(name = "modify_by_desc")
    private String modifyByDesc;

    /**
     * 是否删除 1：是，0：否
     */
    @Column(name = "is_deleted")
    private Boolean isDeleted;

    /**
     * 接收对象
     */
    @Column(name = "receive_info")
    private String receiveInfo;

    /**
     * 配置信息
     */
    @Column(name = "config_info")
    private String configInfo;

    /**
     * 操作人信息
     */
    private String operator;

    /**
     * 原始参数
     */
    @Column(name = "source_param")
    private String sourceParam;

    /**
     * 填充后参数
     */
    @Column(name = "fill_param")
    private String fillParam;

    /**
     * 组装数据
     */
    @Column(name = "package_param")
    private String packageParam;

    /**
     * 模板
     */
    private String template;

    /**
     * 模板参数
     */
    @Column(name = "template_param")
    private String templateParam;

    /**
     * 生成报文
     */
    @Column(name = "error_msg")
    private String errorMsg;

    /**
     * 生成报文
     */
    private String message;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取计划号
     *
     * @return work_no - 计划号
     */
    public String getWorkNo() {
        return workNo;
    }

    /**
     * 设置计划号
     *
     * @param workNo 计划号
     */
    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    /**
     * 获取traceId
     *
     * @return trace_id - traceId
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * 设置traceId
     *
     * @param traceId traceId
     */
    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    /**
     * 获取工作号
     *
     * @return business_no - 工作号
     */
    public String getBusinessNo() {
        return businessNo;
    }

    /**
     * 设置工作号
     *
     * @param businessNo 工作号
     */
    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建人描述
     *
     * @return create_by_desc - 创建人描述
     */
    public String getCreateByDesc() {
        return createByDesc;
    }

    /**
     * 设置创建人描述
     *
     * @param createByDesc 创建人描述
     */
    public void setCreateByDesc(String createByDesc) {
        this.createByDesc = createByDesc;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取修改人
     *
     * @return modify_by - 修改人
     */
    public Long getModifyBy() {
        return modifyBy;
    }

    /**
     * 设置修改人
     *
     * @param modifyBy 修改人
     */
    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    /**
     * 获取创建人描述
     *
     * @return modify_by_desc - 创建人描述
     */
    public String getModifyByDesc() {
        return modifyByDesc;
    }

    /**
     * 设置创建人描述
     *
     * @param modifyByDesc 创建人描述
     */
    public void setModifyByDesc(String modifyByDesc) {
        this.modifyByDesc = modifyByDesc;
    }

    /**
     * 获取是否删除 1：是，0：否
     *
     * @return is_deleted - 是否删除 1：是，0：否
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除 1：是，0：否
     *
     * @param isDeleted 是否删除 1：是，0：否
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取接收对象
     *
     * @return receive_info - 接收对象
     */
    public String getReceiveInfo() {
        return receiveInfo;
    }

    /**
     * 设置接收对象
     *
     * @param receiveInfo 接收对象
     */
    public void setReceiveInfo(String receiveInfo) {
        this.receiveInfo = receiveInfo;
    }

    /**
     * 获取配置信息
     *
     * @return config_info - 配置信息
     */
    public String getConfigInfo() {
        return configInfo;
    }

    /**
     * 设置配置信息
     *
     * @param configInfo 配置信息
     */
    public void setConfigInfo(String configInfo) {
        this.configInfo = configInfo;
    }

    /**
     * 获取操作人信息
     *
     * @return operator - 操作人信息
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置操作人信息
     *
     * @param operator 操作人信息
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 获取原始参数
     *
     * @return source_param - 原始参数
     */
    public String getSourceParam() {
        return sourceParam;
    }

    /**
     * 设置原始参数
     *
     * @param sourceParam 原始参数
     */
    public void setSourceParam(String sourceParam) {
        this.sourceParam = sourceParam;
    }

    /**
     * 获取填充后参数
     *
     * @return fill_param - 填充后参数
     */
    public String getFillParam() {
        return fillParam;
    }

    /**
     * 设置填充后参数
     *
     * @param fillParam 填充后参数
     */
    public void setFillParam(String fillParam) {
        this.fillParam = fillParam;
    }

    /**
     * 获取组装数据
     *
     * @return package_param - 组装数据
     */
    public String getPackageParam() {
        return packageParam;
    }

    /**
     * 设置组装数据
     *
     * @param packageParam 组装数据
     */
    public void setPackageParam(String packageParam) {
        this.packageParam = packageParam;
    }

    /**
     * 获取模板
     *
     * @return template - 模板
     */
    public String getTemplate() {
        return template;
    }

    /**
     * 设置模板
     *
     * @param template 模板
     */
    public void setTemplate(String template) {
        this.template = template;
    }

    /**
     * 获取模板参数
     *
     * @return template_param - 模板参数
     */
    public String getTemplateParam() {
        return templateParam;
    }

    /**
     * 设置模板参数
     *
     * @param templateParam 模板参数
     */
    public void setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
    }

    /**
     * 获取生成报文
     *
     * @return error_msg - 生成报文
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * 设置生成报文
     *
     * @param errorMsg 生成报文
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    /**
     * 获取生成报文
     *
     * @return message - 生成报文
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置生成报文
     *
     * @param message 生成报文
     */
    public void setMessage(String message) {
        this.message = message;
    }
}