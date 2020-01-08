package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TCustomerCardInfo;
import com.ligq.study.mybatis.demo.model.TCustomerCardInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerCardInfoMapper {
    long countByExample(TCustomerCardInfoExample example);

    int deleteByExample(TCustomerCardInfoExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TCustomerCardInfo record);

    int insertSelective(TCustomerCardInfo record);

    List<TCustomerCardInfo> selectByExample(TCustomerCardInfoExample example);

    TCustomerCardInfo selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TCustomerCardInfo record, @Param("example") TCustomerCardInfoExample example);

    int updateByExample(@Param("record") TCustomerCardInfo record, @Param("example") TCustomerCardInfoExample example);

    int updateByPrimaryKeySelective(TCustomerCardInfo record);

    int updateByPrimaryKey(TCustomerCardInfo record);
}