package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TCustomerLabel;
import com.ligq.study.mybatis.demo.model.TCustomerLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerLabelMapper {
    long countByExample(TCustomerLabelExample example);

    int deleteByExample(TCustomerLabelExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TCustomerLabel record);

    int insertSelective(TCustomerLabel record);

    List<TCustomerLabel> selectByExample(TCustomerLabelExample example);

    TCustomerLabel selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TCustomerLabel record, @Param("example") TCustomerLabelExample example);

    int updateByExample(@Param("record") TCustomerLabel record, @Param("example") TCustomerLabelExample example);

    int updateByPrimaryKeySelective(TCustomerLabel record);

    int updateByPrimaryKey(TCustomerLabel record);
}