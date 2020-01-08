package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TCustomerSettleaccInfo;
import com.ligq.study.mybatis.demo.model.TCustomerSettleaccInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerSettleaccInfoMapper {
    long countByExample(TCustomerSettleaccInfoExample example);

    int deleteByExample(TCustomerSettleaccInfoExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TCustomerSettleaccInfo record);

    int insertSelective(TCustomerSettleaccInfo record);

    List<TCustomerSettleaccInfo> selectByExample(TCustomerSettleaccInfoExample example);

    TCustomerSettleaccInfo selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TCustomerSettleaccInfo record, @Param("example") TCustomerSettleaccInfoExample example);

    int updateByExample(@Param("record") TCustomerSettleaccInfo record, @Param("example") TCustomerSettleaccInfoExample example);

    int updateByPrimaryKeySelective(TCustomerSettleaccInfo record);

    int updateByPrimaryKey(TCustomerSettleaccInfo record);
}