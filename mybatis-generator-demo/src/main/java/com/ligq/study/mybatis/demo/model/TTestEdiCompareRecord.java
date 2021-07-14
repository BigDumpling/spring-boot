package com.ligq.study.mybatis.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_test_edi_compare_record")
public class TTestEdiCompareRecord {
    /**
     * 主键
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * nc工作单号
     */
    @Column(name = "nc_work_no")
    private String ncWorkNo;

    /**
     * gm2工作单号
     */
    @Column(name = "gm2_work_no")
    private String gm2WorkNo;

    /**
     * 状态：0-待处理，1-处理中，2-比对成功，3-比对失败
     */
    private Integer status;

    /**
     * 比对日期，yyyy-MM-dd
     */
    @Column(name = "compare_date")
    private String compareDate;

    /**
     * 比对结果：1-有差异，2-无差异
     */
    @Column(name = "compare_result")
    private Integer compareResult;

    /**
     * 失败原因
     */
    @Column(name = "fail_message")
    private String failMessage;

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
     * nc报文
     */
    @Column(name = "nc_message")
    private String ncMessage;

    /**
     * gm2报文
     */
    @Column(name = "gm2-message")
    private String gm2Message;

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
     * 获取gm2工作单号
     *
     * @return gm2_work_no - gm2工作单号
     */
    public String getGm2WorkNo() {
        return gm2WorkNo;
    }

    /**
     * 设置gm2工作单号
     *
     * @param gm2WorkNo gm2工作单号
     */
    public void setGm2WorkNo(String gm2WorkNo) {
        this.gm2WorkNo = gm2WorkNo;
    }

    /**
     * 获取状态：0-待处理，1-处理中，2-比对成功，3-比对失败
     *
     * @return status - 状态：0-待处理，1-处理中，2-比对成功，3-比对失败
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态：0-待处理，1-处理中，2-比对成功，3-比对失败
     *
     * @param status 状态：0-待处理，1-处理中，2-比对成功，3-比对失败
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取比对日期，yyyy-MM-dd
     *
     * @return compare_date - 比对日期，yyyy-MM-dd
     */
    public String getCompareDate() {
        return compareDate;
    }

    /**
     * 设置比对日期，yyyy-MM-dd
     *
     * @param compareDate 比对日期，yyyy-MM-dd
     */
    public void setCompareDate(String compareDate) {
        this.compareDate = compareDate;
    }

    /**
     * 获取比对结果：1-有差异，2-无差异
     *
     * @return compare_result - 比对结果：1-有差异，2-无差异
     */
    public Integer getCompareResult() {
        return compareResult;
    }

    /**
     * 设置比对结果：1-有差异，2-无差异
     *
     * @param compareResult 比对结果：1-有差异，2-无差异
     */
    public void setCompareResult(Integer compareResult) {
        this.compareResult = compareResult;
    }

    /**
     * 获取失败原因
     *
     * @return fail_message - 失败原因
     */
    public String getFailMessage() {
        return failMessage;
    }

    /**
     * 设置失败原因
     *
     * @param failMessage 失败原因
     */
    public void setFailMessage(String failMessage) {
        this.failMessage = failMessage;
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

    /**
     * 获取nc报文
     *
     * @return nc_message - nc报文
     */
    public String getNcMessage() {
        return ncMessage;
    }

    /**
     * 设置nc报文
     *
     * @param ncMessage nc报文
     */
    public void setNcMessage(String ncMessage) {
        this.ncMessage = ncMessage;
    }

    /**
     * 获取gm2报文
     *
     * @return gm2-message - gm2报文
     */
    public String getGm2Message() {
        return gm2Message;
    }

    /**
     * 设置gm2报文
     *
     * @param gm2Message gm2报文
     */
    public void setGm2Message(String gm2Message) {
        this.gm2Message = gm2Message;
    }
}