package com.ligq.study.mybatis.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_notice_info")
public class TNoticeInfo {
    /**
     * 通知ID
     */
    @Id
    @Column(name = "SEQ_ID")
    private String seqId;

    /**
     * 通知类型  01=固定次数 02=重复性
     */
    @Column(name = "NOTICE_TYPE")
    private String noticeType;

    /**
     * 有效期起始
     */
    @Column(name = "PERIOD_START")
    private Date periodStart;

    /**
     * 有效期结束
     */
    @Column(name = "PERIOD_END")
    private Date periodEnd;

    /**
     * URL
     */
    @Column(name = "URL")
    private String url;

    /**
     * 状态 01=有效 02=无效
     */
    @Column(name = "STATUS")
    private String status;

    /**
     * 通知次数
     */
    @Column(name = "NOTICE_TIMES")
    private Long noticeTimes;

    /**
     * 已通知次数
     */
    @Column(name = "NOTIFIED_TIMES")
    private Long notifiedTimes;

    /**
     * 业务ID
     */
    @Column(name = "BIZ_ID")
    private String bizId;

    /**
     * 通知方式 01微信 02短信 03 弹框
     */
    @Column(name = "NOTICE_METHOD")
    private String noticeMethod;

    /**
     * 通知内容
     */
    @Column(name = "NOTICE_VALUE")
    private String noticeValue;

    /**
     * 创建用户
     */
    @Column(name = "CREATE_USER")
    private String createUser;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Long createTime;

    /**
     * 修改用户
     */
    @Column(name = "UPDATE_USER")
    private String updateUser;

    /**
     * 修改时间
     */
    @Column(name = "UPDATE_TIME")
    private Long updateTime;

    /**
     * 获取通知ID
     *
     * @return SEQ_ID - 通知ID
     */
    public String getSeqId() {
        return seqId;
    }

    /**
     * 设置通知ID
     *
     * @param seqId 通知ID
     */
    public void setSeqId(String seqId) {
        this.seqId = seqId;
    }

    /**
     * 获取通知类型  01=固定次数 02=重复性
     *
     * @return NOTICE_TYPE - 通知类型  01=固定次数 02=重复性
     */
    public String getNoticeType() {
        return noticeType;
    }

    /**
     * 设置通知类型  01=固定次数 02=重复性
     *
     * @param noticeType 通知类型  01=固定次数 02=重复性
     */
    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    /**
     * 获取有效期起始
     *
     * @return PERIOD_START - 有效期起始
     */
    public Date getPeriodStart() {
        return periodStart;
    }

    /**
     * 设置有效期起始
     *
     * @param periodStart 有效期起始
     */
    public void setPeriodStart(Date periodStart) {
        this.periodStart = periodStart;
    }

    /**
     * 获取有效期结束
     *
     * @return PERIOD_END - 有效期结束
     */
    public Date getPeriodEnd() {
        return periodEnd;
    }

    /**
     * 设置有效期结束
     *
     * @param periodEnd 有效期结束
     */
    public void setPeriodEnd(Date periodEnd) {
        this.periodEnd = periodEnd;
    }

    /**
     * 获取URL
     *
     * @return URL - URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置URL
     *
     * @param url URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取状态 01=有效 02=无效
     *
     * @return STATUS - 状态 01=有效 02=无效
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态 01=有效 02=无效
     *
     * @param status 状态 01=有效 02=无效
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取通知次数
     *
     * @return NOTICE_TIMES - 通知次数
     */
    public Long getNoticeTimes() {
        return noticeTimes;
    }

    /**
     * 设置通知次数
     *
     * @param noticeTimes 通知次数
     */
    public void setNoticeTimes(Long noticeTimes) {
        this.noticeTimes = noticeTimes;
    }

    /**
     * 获取已通知次数
     *
     * @return NOTIFIED_TIMES - 已通知次数
     */
    public Long getNotifiedTimes() {
        return notifiedTimes;
    }

    /**
     * 设置已通知次数
     *
     * @param notifiedTimes 已通知次数
     */
    public void setNotifiedTimes(Long notifiedTimes) {
        this.notifiedTimes = notifiedTimes;
    }

    /**
     * 获取业务ID
     *
     * @return BIZ_ID - 业务ID
     */
    public String getBizId() {
        return bizId;
    }

    /**
     * 设置业务ID
     *
     * @param bizId 业务ID
     */
    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    /**
     * 获取通知方式 01微信 02短信 03 弹框
     *
     * @return NOTICE_METHOD - 通知方式 01微信 02短信 03 弹框
     */
    public String getNoticeMethod() {
        return noticeMethod;
    }

    /**
     * 设置通知方式 01微信 02短信 03 弹框
     *
     * @param noticeMethod 通知方式 01微信 02短信 03 弹框
     */
    public void setNoticeMethod(String noticeMethod) {
        this.noticeMethod = noticeMethod;
    }

    /**
     * 获取通知内容
     *
     * @return NOTICE_VALUE - 通知内容
     */
    public String getNoticeValue() {
        return noticeValue;
    }

    /**
     * 设置通知内容
     *
     * @param noticeValue 通知内容
     */
    public void setNoticeValue(String noticeValue) {
        this.noticeValue = noticeValue;
    }

    /**
     * 获取创建用户
     *
     * @return CREATE_USER - 创建用户
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建用户
     *
     * @param createUser 创建用户
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改用户
     *
     * @return UPDATE_USER - 修改用户
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置修改用户
     *
     * @param updateUser 修改用户
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取修改时间
     *
     * @return UPDATE_TIME - 修改时间
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}