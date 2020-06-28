package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TCustomerGroupInfo;
import com.ligq.study.mybatis.demo.model.TCustomerGroupInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerGroupInfoMapper {
    long countByExample(TCustomerGroupInfoExample example);

    int deleteByExample(TCustomerGroupInfoExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TCustomerGroupInfo record);

    int insertSelective(TCustomerGroupInfo record);

    List<TCustomerGroupInfo> selectByExample(TCustomerGroupInfoExample example);

    TCustomerGroupInfo selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TCustomerGroupInfo record, @Param("example") TCustomerGroupInfoExample example);

    int updateByExample(@Param("record") TCustomerGroupInfo record, @Param("example") TCustomerGroupInfoExample example);

    int updateByPrimaryKeySelective(TCustomerGroupInfo record);

    int updateByPrimaryKey(TCustomerGroupInfo record);
}