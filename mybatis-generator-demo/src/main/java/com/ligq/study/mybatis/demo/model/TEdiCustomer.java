package com.ligq.study.mybatis.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_edi_customer")
public class TEdiCustomer {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 客户名称
     */
    @Column(name = "customer_name")
    private String customerName;

    /**
     * 外部系统code 1 GM1
     */
    @Column(name = "external_system")
    private String externalSystem;

    /**
     * 客户id
     */
    @Column(name = "org_id")
    private Long orgId;

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
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 1：启用，0：禁用
     */
    private Boolean enabled;

    /**
     * 是否删除
     */
    @Column(name = "is_deleted")
    private Integer isDeleted;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取客户名称
     *
     * @return customer_name - 客户名称
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置客户名称
     *
     * @param customerName 客户名称
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * 获取外部系统code 1 GM1
     *
     * @return external_system - 外部系统code 1 GM1
     */
    public String getExternalSystem() {
        return externalSystem;
    }

    /**
     * 设置外部系统code 1 GM1
     *
     * @param externalSystem 外部系统code 1 GM1
     */
    public void setExternalSystem(String externalSystem) {
        this.externalSystem = externalSystem;
    }

    /**
     * 获取客户id
     *
     * @return org_id - 客户id
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * 设置客户id
     *
     * @param orgId 客户id
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
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
     * 获取1：启用，0：禁用
     *
     * @return enabled - 1：启用，0：禁用
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 设置1：启用，0：禁用
     *
     * @param enabled 1：启用，0：禁用
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取是否删除
     *
     * @return is_deleted - 是否删除
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除
     *
     * @param isDeleted 是否删除
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}