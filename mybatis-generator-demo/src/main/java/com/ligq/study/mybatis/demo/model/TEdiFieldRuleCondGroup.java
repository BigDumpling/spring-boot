package com.ligq.study.mybatis.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_edi_field_rule_cond_group")
public class TEdiFieldRuleCondGroup {
    /**
     * id
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 规则id
     */
    @Column(name = "field_rule_id")
    private Long fieldRuleId;

    /**
     * 操作
     */
    @Column(name = "logic_opt")
    private Integer logicOpt;

    /**
     * 父群组ID
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 条件类型
     */
    @Column(name = "rule_condition_type")
    private Integer ruleConditionType;

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
     * 获取规则id
     *
     * @return field_rule_id - 规则id
     */
    public Long getFieldRuleId() {
        return fieldRuleId;
    }

    /**
     * 设置规则id
     *
     * @param fieldRuleId 规则id
     */
    public void setFieldRuleId(Long fieldRuleId) {
        this.fieldRuleId = fieldRuleId;
    }

    /**
     * 获取操作
     *
     * @return logic_opt - 操作
     */
    public Integer getLogicOpt() {
        return logicOpt;
    }

    /**
     * 设置操作
     *
     * @param logicOpt 操作
     */
    public void setLogicOpt(Integer logicOpt) {
        this.logicOpt = logicOpt;
    }

    /**
     * 获取父群组ID
     *
     * @return parent_id - 父群组ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置父群组ID
     *
     * @param parentId 父群组ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取条件类型
     *
     * @return rule_condition_type - 条件类型
     */
    public Integer getRuleConditionType() {
        return ruleConditionType;
    }

    /**
     * 设置条件类型
     *
     * @param ruleConditionType 条件类型
     */
    public void setRuleConditionType(Integer ruleConditionType) {
        this.ruleConditionType = ruleConditionType;
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