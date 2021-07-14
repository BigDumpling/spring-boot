package com.ligq.study.mybatis.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_edi_field_rule")
public class TEdiFieldRule {
    /**
     * id
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 通道id
     */
    @Column(name = "channel_id")
    private Long channelId;

    /**
     * 数据源id
     */
    @Column(name = "data_id")
    private Long dataId;

    /**
     * 规则名称
     */
    @Column(name = "rule_name")
    private String ruleName;

    /**
     * 描述
     */
    private String description;

    /**
     * 报文类型
     */
    @Column(name = "message_type")
    private String messageType;

    /**
     * 承运人code
     */
    @Column(name = "transfer_company_code")
    private String transferCompanyCode;

    /**
     * 承运人name
     */
    @Column(name = "transfer_company_name")
    private String transferCompanyName;

    /**
     * 字段名
     */
    @Column(name = "field_name")
    private String fieldName;

    /**
     * 是否启用
     */
    private Boolean enabled;

    /**
     * 是否需要条件
     */
    @Column(name = "required_condition")
    private Boolean requiredCondition;

    /**
     * 条件表达式
     */
    @Column(name = "condition_expression")
    private String conditionExpression;

    /**
     * 规则校验表达式
     */
    @Column(name = "rule_valid_expression")
    private String ruleValidExpression;

    /**
     * 是否需要格式校验
     */
    @Column(name = "required_format_valid")
    private Boolean requiredFormatValid;

    /**
     * 额外处理
     */
    @Column(name = "extra_process")
    private Integer extraProcess;

    /**
     * 条件排序规则
     */
    @Column(name = "condition_sort")
    private String conditionSort;

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
     * 获取通道id
     *
     * @return channel_id - 通道id
     */
    public Long getChannelId() {
        return channelId;
    }

    /**
     * 设置通道id
     *
     * @param channelId 通道id
     */
    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取数据源id
     *
     * @return data_id - 数据源id
     */
    public Long getDataId() {
        return dataId;
    }

    /**
     * 设置数据源id
     *
     * @param dataId 数据源id
     */
    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    /**
     * 获取规则名称
     *
     * @return rule_name - 规则名称
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * 设置规则名称
     *
     * @param ruleName 规则名称
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取报文类型
     *
     * @return message_type - 报文类型
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * 设置报文类型
     *
     * @param messageType 报文类型
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    /**
     * 获取承运人code
     *
     * @return transfer_company_code - 承运人code
     */
    public String getTransferCompanyCode() {
        return transferCompanyCode;
    }

    /**
     * 设置承运人code
     *
     * @param transferCompanyCode 承运人code
     */
    public void setTransferCompanyCode(String transferCompanyCode) {
        this.transferCompanyCode = transferCompanyCode;
    }

    /**
     * 获取承运人name
     *
     * @return transfer_company_name - 承运人name
     */
    public String getTransferCompanyName() {
        return transferCompanyName;
    }

    /**
     * 设置承运人name
     *
     * @param transferCompanyName 承运人name
     */
    public void setTransferCompanyName(String transferCompanyName) {
        this.transferCompanyName = transferCompanyName;
    }

    /**
     * 获取字段名
     *
     * @return field_name - 字段名
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * 设置字段名
     *
     * @param fieldName 字段名
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * 获取是否启用
     *
     * @return enabled - 是否启用
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 设置是否启用
     *
     * @param enabled 是否启用
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取是否需要条件
     *
     * @return required_condition - 是否需要条件
     */
    public Boolean getRequiredCondition() {
        return requiredCondition;
    }

    /**
     * 设置是否需要条件
     *
     * @param requiredCondition 是否需要条件
     */
    public void setRequiredCondition(Boolean requiredCondition) {
        this.requiredCondition = requiredCondition;
    }

    /**
     * 获取条件表达式
     *
     * @return condition_expression - 条件表达式
     */
    public String getConditionExpression() {
        return conditionExpression;
    }

    /**
     * 设置条件表达式
     *
     * @param conditionExpression 条件表达式
     */
    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    /**
     * 获取规则校验表达式
     *
     * @return rule_valid_expression - 规则校验表达式
     */
    public String getRuleValidExpression() {
        return ruleValidExpression;
    }

    /**
     * 设置规则校验表达式
     *
     * @param ruleValidExpression 规则校验表达式
     */
    public void setRuleValidExpression(String ruleValidExpression) {
        this.ruleValidExpression = ruleValidExpression;
    }

    /**
     * 获取是否需要格式校验
     *
     * @return required_format_valid - 是否需要格式校验
     */
    public Boolean getRequiredFormatValid() {
        return requiredFormatValid;
    }

    /**
     * 设置是否需要格式校验
     *
     * @param requiredFormatValid 是否需要格式校验
     */
    public void setRequiredFormatValid(Boolean requiredFormatValid) {
        this.requiredFormatValid = requiredFormatValid;
    }

    /**
     * 获取额外处理
     *
     * @return extra_process - 额外处理
     */
    public Integer getExtraProcess() {
        return extraProcess;
    }

    /**
     * 设置额外处理
     *
     * @param extraProcess 额外处理
     */
    public void setExtraProcess(Integer extraProcess) {
        this.extraProcess = extraProcess;
    }

    /**
     * 获取条件排序规则
     *
     * @return condition_sort - 条件排序规则
     */
    public String getConditionSort() {
        return conditionSort;
    }

    /**
     * 设置条件排序规则
     *
     * @param conditionSort 条件排序规则
     */
    public void setConditionSort(String conditionSort) {
        this.conditionSort = conditionSort;
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
}