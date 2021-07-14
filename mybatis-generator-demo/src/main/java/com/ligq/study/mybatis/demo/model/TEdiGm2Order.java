package com.ligq.study.mybatis.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_edi_gm2_order")
public class TEdiGm2Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * nc工作单号
     */
    @Column(name = "nc_work_no")
    private String ncWorkNo;

    @Column(name = "work_no")
    private String workNo;

    /**
     * gm2的orgId
     */
    @Column(name = "org_id")
    private Long orgId;

    @Column(name = "booking_id")
    private String bookingId;

    @Column(name = "bill_id")
    private String billId;

    @Column(name = "case_number")
    private String caseNumber;

    @Column(name = "manifest_id")
    private Long manifestId;

    /**
     * 是否启用：1-启用，0-不启用
     */
    private Integer enabled;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取nc工作单号
     *
     * @return nc_work_no - nc工作单号
     */
    public String getNcWorkNo() {
        return ncWorkNo;
    }

    /**
     * 设置nc工作单号
     *
     * @param ncWorkNo nc工作单号
     */
    public void setNcWorkNo(String ncWorkNo) {
        this.ncWorkNo = ncWorkNo;
    }

    /**
     * @return work_no
     */
    public String getWorkNo() {
        return workNo;
    }

    /**
     * @param workNo
     */
    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    /**
     * 获取gm2的orgId
     *
     * @return org_id - gm2的orgId
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * 设置gm2的orgId
     *
     * @param orgId gm2的orgId
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * @return booking_id
     */
    public String getBookingId() {
        return bookingId;
    }

    /**
     * @param bookingId
     */
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    /**
     * @return bill_id
     */
    public String getBillId() {
        return billId;
    }

    /**
     * @param billId
     */
    public void setBillId(String billId) {
        this.billId = billId;
    }

    /**
     * @return case_number
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * @param caseNumber
     */
    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    /**
     * @return manifest_id
     */
    public Long getManifestId() {
        return manifestId;
    }

    /**
     * @param manifestId
     */
    public void setManifestId(Long manifestId) {
        this.manifestId = manifestId;
    }

    /**
     * 获取是否启用：1-启用，0-不启用
     *
     * @return enabled - 是否启用：1-启用，0-不启用
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * 设置是否启用：1-启用，0-不启用
     *
     * @param enabled 是否启用：1-启用，0-不启用
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return modify_time
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}