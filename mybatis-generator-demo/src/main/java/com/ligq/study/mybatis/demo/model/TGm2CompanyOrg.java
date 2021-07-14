package com.ligq.study.mybatis.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_gm2_company_org")
public class TGm2CompanyOrg {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 机构号
     */
    @Column(name = "org_id")
    private Long orgId;

    /**
     * 分公司名称
     */
    @Column(name = "org_name")
    private String orgName;

    /**
     * GM2系统分公司编码
     */
    @Column(name = "gm2_company_code")
    private String gm2CompanyCode;

    /**
     * NC系统分公司编码
     */
    @Column(name = "nc_company_code")
    private String ncCompanyCode;

    /**
     * 是否启用：1-启用，0-不启用
     */
    private Byte enabled;

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
     * 更新时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

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
     * 获取机构号
     *
     * @return org_id - 机构号
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * 设置机构号
     *
     * @param orgId 机构号
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取分公司名称
     *
     * @return org_name - 分公司名称
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置分公司名称
     *
     * @param orgName 分公司名称
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * 获取GM2系统分公司编码
     *
     * @return gm2_company_code - GM2系统分公司编码
     */
    public String getGm2CompanyCode() {
        return gm2CompanyCode;
    }

    /**
     * 设置GM2系统分公司编码
     *
     * @param gm2CompanyCode GM2系统分公司编码
     */
    public void setGm2CompanyCode(String gm2CompanyCode) {
        this.gm2CompanyCode = gm2CompanyCode;
    }

    /**
     * 获取NC系统分公司编码
     *
     * @return nc_company_code - NC系统分公司编码
     */
    public String getNcCompanyCode() {
        return ncCompanyCode;
    }

    /**
     * 设置NC系统分公司编码
     *
     * @param ncCompanyCode NC系统分公司编码
     */
    public void setNcCompanyCode(String ncCompanyCode) {
        this.ncCompanyCode = ncCompanyCode;
    }

    /**
     * 获取是否启用：1-启用，0-不启用
     *
     * @return enabled - 是否启用：1-启用，0-不启用
     */
    public Byte getEnabled() {
        return enabled;
    }

    /**
     * 设置是否启用：1-启用，0-不启用
     *
     * @param enabled 是否启用：1-启用，0-不启用
     */
    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
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
     * 获取更新时间
     *
     * @return modify_time - 更新时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param modifyTime 更新时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}