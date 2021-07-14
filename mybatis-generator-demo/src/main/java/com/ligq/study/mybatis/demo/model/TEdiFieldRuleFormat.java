package com.ligq.study.mybatis.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_edi_field_rule_format")
public class TEdiFieldRuleFormat {
    /**
     * id
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 规则ID
     */
    @Column(name = "field_rule_id")
    private Long fieldRuleId;

    /**
     * 格式验证类型
     */
    @Column(name = "field_valid_type")
    private Integer fieldValidType;

    /**
     * 长度
     */
    @Column(name = "value_length")
    private Integer valueLength;

    /**
     * 长度类型
     */
    @Column(name = "length_type")
    private Integer lengthType;

    /**
     * 行数
     */
    @Column(name = "line_num")
    private Integer lineNum;

    /**
     * 小数位数
     */
    @Column(name = "decimal_length")
    private Integer decimalLength;

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
     * 获取规则ID
     *
     * @return field_rule_id - 规则ID
     */
    public Long getFieldRuleId() {
        return fieldRuleId;
    }

    /**
     * 设置规则ID
     *
     * @param fieldRuleId 规则ID
     */
    public void setFieldRuleId(Long fieldRuleId) {
        this.fieldRuleId = fieldRuleId;
    }

    /**
     * 获取格式验证类型
     *
     * @return field_valid_type - 格式验证类型
     */
    public Integer getFieldValidType() {
        return fieldValidType;
    }

    /**
     * 设置格式验证类型
     *
     * @param fieldValidType 格式验证类型
     */
    public void setFieldValidType(Integer fieldValidType) {
        this.fieldValidType = fieldValidType;
    }

    /**
     * 获取长度
     *
     * @return value_length - 长度
     */
    public Integer getValueLength() {
        return valueLength;
    }

    /**
     * 设置长度
     *
     * @param valueLength 长度
     */
    public void setValueLength(Integer valueLength) {
        this.valueLength = valueLength;
    }

    /**
     * 获取长度类型
     *
     * @return length_type - 长度类型
     */
    public Integer getLengthType() {
        return lengthType;
    }

    /**
     * 设置长度类型
     *
     * @param lengthType 长度类型
     */
    public void setLengthType(Integer lengthType) {
        this.lengthType = lengthType;
    }

    /**
     * 获取行数
     *
     * @return line_num - 行数
     */
    public Integer getLineNum() {
        return lineNum;
    }

    /**
     * 设置行数
     *
     * @param lineNum 行数
     */
    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    /**
     * 获取小数位数
     *
     * @return decimal_length - 小数位数
     */
    public Integer getDecimalLength() {
        return decimalLength;
    }

    /**
     * 设置小数位数
     *
     * @param decimalLength 小数位数
     */
    public void setDecimalLength(Integer decimalLength) {
        this.decimalLength = decimalLength;
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