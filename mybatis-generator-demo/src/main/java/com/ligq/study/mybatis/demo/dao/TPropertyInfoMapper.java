package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TPropertyInfo;
import com.ligq.study.mybatis.demo.model.TPropertyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPropertyInfoMapper {
    long countByExample(TPropertyInfoExample example);

    int deleteByExample(TPropertyInfoExample example);

    int deleteByPrimaryKey(String propertyId);

    int insert(TPropertyInfo record);

    int insertSelective(TPropertyInfo record);

    List<TPropertyInfo> selectByExample(TPropertyInfoExample example);

    TPropertyInfo selectByPrimaryKey(String propertyId);

    int updateByExampleSelective(@Param("record") TPropertyInfo record, @Param("example") TPropertyInfoExample example);

    int updateByExample(@Param("record") TPropertyInfo record, @Param("example") TPropertyInfoExample example);

    int updateByPrimaryKeySelective(TPropertyInfo record);

    int updateByPrimaryKey(TPropertyInfo record);
}