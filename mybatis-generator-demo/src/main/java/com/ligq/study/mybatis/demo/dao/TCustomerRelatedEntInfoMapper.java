package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TCustomerRelatedEntInfo;
import com.ligq.study.mybatis.demo.model.TCustomerRelatedEntInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerRelatedEntInfoMapper {
    long countByExample(TCustomerRelatedEntInfoExample example);

    int deleteByExample(TCustomerRelatedEntInfoExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TCustomerRelatedEntInfo record);

    int insertSelective(TCustomerRelatedEntInfo record);

    List<TCustomerRelatedEntInfo> selectByExample(TCustomerRelatedEntInfoExample example);

    TCustomerRelatedEntInfo selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TCustomerRelatedEntInfo record, @Param("example") TCustomerRelatedEntInfoExample example);

    int updateByExample(@Param("record") TCustomerRelatedEntInfo record, @Param("example") TCustomerRelatedEntInfoExample example);

    int updateByPrimaryKeySelective(TCustomerRelatedEntInfo record);

    int updateByPrimaryKey(TCustomerRelatedEntInfo record);
}