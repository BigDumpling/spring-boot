package com.ligq.study.mybatis.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_edi_field_rule_condition")
public class TEdiFieldRuleCondition {
    /**
     * id
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 字段规则ID
     */
    @Column(name = "field_rule_id")
    private Long fieldRuleId;

    /**
     * 组ID
     */
    @Column(name = "cond_group_id")
    private Long condGroupId;

    /**
     * 条件类型
     */
    @Column(name = "rule_condition_type")
    private Integer ruleConditionType;

    /**
     * 字段名
     */
    @Column(name = "field_name")
    private String fieldName;

    /**
     * 条件类型
     */
    private Integer condition;

    /**
     * 值
     */
    private String value;

    /**
     * 数据源id
     */
    @Column(name = "data_id")
    private Long dataId;

    /**
     * 顺序
     */
    private Integer sorted;

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
     * 获取字段规则ID
     *
     * @return field_rule_id - 字段规则ID
     */
    public Long getFieldRuleId() {
        return fieldRuleId;
    }

    /**
     * 设置字段规则ID
     *
     * @param fieldRuleId 字段规则ID
     */
    public void setFieldRuleId(Long fieldRuleId) {
        this.fieldRuleId = fieldRuleId;
    }

    /**
     * 获取组ID
     *
     * @return cond_group_id - 组ID
     */
    public Long getCondGroupId() {
        return condGroupId;
    }

    /**
     * 设置组ID
     *
     * @param condGroupId 组ID
     */
    public void setCondGroupId(Long condGroupId) {
        this.condGroupId = condGroupId;
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
     * 获取条件类型
     *
     * @return condition - 条件类型
     */
    public Integer getCondition() {
        return condition;
    }

    /**
     * 设置条件类型
     *
     * @param condition 条件类型
     */
    public void setCondition(Integer condition) {
        this.condition = condition;
    }

    /**
     * 获取值
     *
     * @return value - 值
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置值
     *
     * @param value 值
     */
    public void setValue(String value) {
        this.value = value;
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
     * 获取顺序
     *
     * @return sorted - 顺序
     */
    public Integer getSorted() {
        return sorted;
    }

    /**
     * 设置顺序
     *
     * @param sorted 顺序
     */
    public void setSorted(Integer sorted) {
        this.sorted = sorted;
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