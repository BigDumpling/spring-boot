package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TFundOrgInfo;
import com.ligq.study.mybatis.demo.model.TFundOrgInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFundOrgInfoMapper {
    long countByExample(TFundOrgInfoExample example);

    int deleteByExample(TFundOrgInfoExample example);

    int deleteByPrimaryKey(String fundOrgCode);

    int insert(TFundOrgInfo record);

    int insertSelective(TFundOrgInfo record);

    List<TFundOrgInfo> selectByExample(TFundOrgInfoExample example);

    TFundOrgInfo selectByPrimaryKey(String fundOrgCode);

    int updateByExampleSelective(@Param("record") TFundOrgInfo record, @Param("example") TFundOrgInfoExample example);

    int updateByExample(@Param("record") TFundOrgInfo record, @Param("example") TFundOrgInfoExample example);

    int updateByPrimaryKeySelective(TFundOrgInfo record);

    int updateByPrimaryKey(TFundOrgInfo record);
}