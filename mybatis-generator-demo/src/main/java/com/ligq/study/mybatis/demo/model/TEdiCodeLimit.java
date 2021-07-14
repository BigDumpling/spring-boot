package com.ligq.study.mybatis.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_edi_code_limit")
public class TEdiCodeLimit {
    /**
     * 主键
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 系统代码
     */
    @Column(name = "sys_code")
    private String sysCode;

    /**
     * 系统名称
     */
    @Column(name = "sys_name")
    private String sysName;

    /**
     * 通道Id
     */
    @Column(name = "channel_id")
    private Long channelId;

    /**
     * 船公司Id
     */
    @Column(name = "transfer_company_id")
    private Long transferCompanyId;

    /**
     * 基础资料code
     */
    @Column(name = "basic_parameter_code")
    private String basicParameterCode;

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
     * 是否删除 0：否，1：是
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
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取系统代码
     *
     * @return sys_code - 系统代码
     */
    public String getSysCode() {
        return sysCode;
    }

    /**
     * 设置系统代码
     *
     * @param sysCode 系统代码
     */
    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    /**
     * 获取系统名称
     *
     * @return sys_name - 系统名称
     */
    public String getSysName() {
        return sysName;
    }

    /**
     * 设置系统名称
     *
     * @param sysName 系统名称
     */
    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    /**
     * 获取通道Id
     *
     * @return channel_id - 通道Id
     */
    public Long getChannelId() {
        return channelId;
    }

    /**
     * 设置通道Id
     *
     * @param channelId 通道Id
     */
    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    /**
     * 获取船公司Id
     *
     * @return transfer_company_id - 船公司Id
     */
    public Long getTransferCompanyId() {
        return transferCompanyId;
    }

    /**
     * 设置船公司Id
     *
     * @param transferCompanyId 船公司Id
     */
    public void setTransferCompanyId(Long transferCompanyId) {
        this.transferCompanyId = transferCompanyId;
    }

    /**
     * 获取基础资料code
     *
     * @return basic_parameter_code - 基础资料code
     */
    public String getBasicParameterCode() {
        return basicParameterCode;
    }

    /**
     * 设置基础资料code
     *
     * @param basicParameterCode 基础资料code
     */
    public void setBasicParameterCode(String basicParameterCode) {
        this.basicParameterCode = basicParameterCode;
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
     * 获取是否删除 0：否，1：是
     *
     * @return is_deleted - 是否删除 0：否，1：是
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除 0：否，1：是
     *
     * @param isDeleted 是否删除 0：否，1：是
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