package com.ligq.study.mybatis.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_test_edi_compare_detail")
public class TTestEdiCompareDetail {
    /**
     * 主键
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 比对记录表主键
     */
    @Column(name = "compare_id")
    private Long compareId;

    /**
     * 报文行
     */
    private String line;

    /**
     * nc报文数据
     */
    @Column(name = "nc_message")
    private String ncMessage;

    /**
     * gm2报文
     */
    @Column(name = "gm2_message")
    private String gm2Message;

    /**
     * 状态：0-待处理，1-已处理完成，2-可忽略
     */
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
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
     * 获取比对记录表主键
     *
     * @return compare_id - 比对记录表主键
     */
    public Long getCompareId() {
        return compareId;
    }

    /**
     * 设置比对记录表主键
     *
     * @param compareId 比对记录表主键
     */
    public void setCompareId(Long compareId) {
        this.compareId = compareId;
    }

    /**
     * 获取报文行
     *
     * @return line - 报文行
     */
    public String getLine() {
        return line;
    }

    /**
     * 设置报文行
     *
     * @param line 报文行
     */
    public void setLine(String line) {
        this.line = line;
    }

    /**
     * 获取nc报文数据
     *
     * @return nc_message - nc报文数据
     */
    public String getNcMessage() {
        return ncMessage;
    }

    /**
     * 设置nc报文数据
     *
     * @param ncMessage nc报文数据
     */
    public void setNcMessage(String ncMessage) {
        this.ncMessage = ncMessage;
    }

    /**
     * 获取gm2报文
     *
     * @return gm2_message - gm2报文
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

    /**
     * 获取状态：0-待处理，1-已处理完成，2-可忽略
     *
     * @return status - 状态：0-待处理，1-已处理完成，2-可忽略
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态：0-待处理，1-已处理完成，2-可忽略
     *
     * @param status 状态：0-待处理，1-已处理完成，2-可忽略
     */
    public void setStatus(Integer status) {
        this.status = status;
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
}