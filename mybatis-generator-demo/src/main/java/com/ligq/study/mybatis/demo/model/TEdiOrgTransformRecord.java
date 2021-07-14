package com.ligq.study.mybatis.demo.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_edi_org_transform_record")
public class TEdiOrgTransformRecord {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 集团orgId
     */
    @Column(name = "org_id")
    private Long orgId;

    /**
     * 拷贝数据数量
     */
    @Column(name = "copy_data_num")
    private Integer copyDataNum;

    /**
     * 创建者
     */
    @Column(name = "create_by")
    private Long createBy;

    /**
     * 创建者描述
     */
    @Column(name = "create_by_desc")
    private String createByDesc;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取集团orgId
     *
     * @return org_id - 集团orgId
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * 设置集团orgId
     *
     * @param orgId 集团orgId
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取拷贝数据数量
     *
     * @return copy_data_num - 拷贝数据数量
     */
    public Integer getCopyDataNum() {
        return copyDataNum;
    }

    /**
     * 设置拷贝数据数量
     *
     * @param copyDataNum 拷贝数据数量
     */
    public void setCopyDataNum(Integer copyDataNum) {
        this.copyDataNum = copyDataNum;
    }

    /**
     * 获取创建者
     *
     * @return create_by - 创建者
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建者
     *
     * @param createBy 创建者
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建者描述
     *
     * @return create_by_desc - 创建者描述
     */
    public String getCreateByDesc() {
        return createByDesc;
    }

    /**
     * 设置创建者描述
     *
     * @param createByDesc 创建者描述
     */
    public void setCreateByDesc(String createByDesc) {
        this.createByDesc = createByDesc;
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
}