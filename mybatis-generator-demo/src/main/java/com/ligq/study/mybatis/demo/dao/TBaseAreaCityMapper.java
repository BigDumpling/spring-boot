package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TBaseAreaCity;
import com.ligq.study.mybatis.demo.model.TBaseAreaCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBaseAreaCityMapper {
    long countByExample(TBaseAreaCityExample example);

    int deleteByExample(TBaseAreaCityExample example);

    int deleteByPrimaryKey(@Param("currentCode") String currentCode, @Param("codeFlag") String codeFlag);

    int insert(TBaseAreaCity record);

    int insertSelective(TBaseAreaCity record);

    List<TBaseAreaCity> selectByExample(TBaseAreaCityExample example);

    TBaseAreaCity selectByPrimaryKey(@Param("currentCode") String currentCode, @Param("codeFlag") String codeFlag);

    int updateByExampleSelective(@Param("record") TBaseAreaCity record, @Param("example") TBaseAreaCityExample example);

    int updateByExample(@Param("record") TBaseAreaCity record, @Param("example") TBaseAreaCityExample example);

    int updateByPrimaryKeySelective(TBaseAreaCity record);

    int updateByPrimaryKey(TBaseAreaCity record);
}