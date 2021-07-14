package com.ligq.study.mybatis.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_edi_gm2_order_plan")
public class TEdiGm2OrderPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "plan_id")
    private Long planId;

    @Column(name = "case_number")
    private Long caseNumber;

    /**
     * 2：bill_id，3：manifest_id
     */
    private Integer type;

    /**
     * 1：有效，0：无效
     */
    private Byte enabled;

    @Column(name = "data_create_time")
    private Date dataCreateTime;

    @Column(name = "data_modify_time")
    private Date dataModifyTime;

    /**
     * 备注
     */
    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

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
     * @return plan_id
     */
    public Long getPlanId() {
        return planId;
    }

    /**
     * @param planId
     */
    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    /**
     * @return case_number
     */
    public Long getCaseNumber() {
        return caseNumber;
    }

    /**
     * @param caseNumber
     */
    public void setCaseNumber(Long caseNumber) {
        this.caseNumber = caseNumber;
    }

    /**
     * 获取2：bill_id，3：manifest_id
     *
     * @return type - 2：bill_id，3：manifest_id
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置2：bill_id，3：manifest_id
     *
     * @param type 2：bill_id，3：manifest_id
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取1：有效，0：无效
     *
     * @return enabled - 1：有效，0：无效
     */
    public Byte getEnabled() {
        return enabled;
    }

    /**
     * 设置1：有效，0：无效
     *
     * @param enabled 1：有效，0：无效
     */
    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    /**
     * @return data_create_time
     */
    public Date getDataCreateTime() {
        return dataCreateTime;
    }

    /**
     * @param dataCreateTime
     */
    public void setDataCreateTime(Date dataCreateTime) {
        this.dataCreateTime = dataCreateTime;
    }

    /**
     * @return data_modify_time
     */
    public Date getDataModifyTime() {
        return dataModifyTime;
    }

    /**
     * @param dataModifyTime
     */
    public void setDataModifyTime(Date dataModifyTime) {
        this.dataModifyTime = dataModifyTime;
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
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}