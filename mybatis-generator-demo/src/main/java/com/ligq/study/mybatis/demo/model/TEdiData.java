package com.ligq.study.mybatis.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_edi_data")
public class TEdiData {
    /**
     * 主键
     */
    @Column(name = "data_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dataId;

    /**
     * 数据源名称
     */
    private String name;

    /**
     * 英文名称
     */
    @Column(name = "english_name")
    private String englishName;

    /**
     * 数据类型，取码表中的数据 data_type
     */
    @Column(name = "data_type")
    private String dataType;

    /**
     * 父数据源Id
     */
    @Column(name = "parent_data_id")
    private Long parentDataId;

    /**
     * 是否启用，1：启用，0：禁用
     */
    private Boolean enabled;

    /**
     * 基础参数码值，取码表basic_parameter
     */
    @Column(name = "basic_paramter")
    private String basicParamter;

    /**
     * 基础资料英文编码
     */
    @Column(name = "basic_paramter_name")
    private String basicParamterName;

    /**
     * 备注
     */
    private String remark;

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
     * 创建人描述
     */
    @Column(name = "create_by_desc")
    private String createByDesc;

    /**
     * 获取主键
     *
     * @return data_id - 主键
     */
    public Long getDataId() {
        return dataId;
    }

    /**
     * 设置主键
     *
     * @param dataId 主键
     */
    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    /**
     * 获取数据源名称
     *
     * @return name - 数据源名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置数据源名称
     *
     * @param name 数据源名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取英文名称
     *
     * @return english_name - 英文名称
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * 设置英文名称
     *
     * @param englishName 英文名称
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    /**
     * 获取数据类型，取码表中的数据 data_type
     *
     * @return data_type - 数据类型，取码表中的数据 data_type
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * 设置数据类型，取码表中的数据 data_type
     *
     * @param dataType 数据类型，取码表中的数据 data_type
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * 获取父数据源Id
     *
     * @return parent_data_id - 父数据源Id
     */
    public Long getParentDataId() {
        return parentDataId;
    }

    /**
     * 设置父数据源Id
     *
     * @param parentDataId 父数据源Id
     */
    public void setParentDataId(Long parentDataId) {
        this.parentDataId = parentDataId;
    }

    /**
     * 获取是否启用，1：启用，0：禁用
     *
     * @return enabled - 是否启用，1：启用，0：禁用
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 设置是否启用，1：启用，0：禁用
     *
     * @param enabled 是否启用，1：启用，0：禁用
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取基础参数码值，取码表basic_parameter
     *
     * @return basic_paramter - 基础参数码值，取码表basic_parameter
     */
    public String getBasicParamter() {
        return basicParamter;
    }

    /**
     * 设置基础参数码值，取码表basic_parameter
     *
     * @param basicParamter 基础参数码值，取码表basic_parameter
     */
    public void setBasicParamter(String basicParamter) {
        this.basicParamter = basicParamter;
    }

    /**
     * 获取基础资料英文编码
     *
     * @return basic_paramter_name - 基础资料英文编码
     */
    public String getBasicParamterName() {
        return basicParamterName;
    }

    /**
     * 设置基础资料英文编码
     *
     * @param basicParamterName 基础资料英文编码
     */
    public void setBasicParamterName(String basicParamterName) {
        this.basicParamterName = basicParamterName;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
}