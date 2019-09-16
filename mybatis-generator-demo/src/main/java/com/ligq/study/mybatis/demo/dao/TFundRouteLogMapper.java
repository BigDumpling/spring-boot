package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TFundRouteLog;
import com.ligq.study.mybatis.demo.model.TFundRouteLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFundRouteLogMapper {
    long countByExample(TFundRouteLogExample example);

    int deleteByExample(TFundRouteLogExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TFundRouteLog record);

    int insertSelective(TFundRouteLog record);

    List<TFundRouteLog> selectByExample(TFundRouteLogExample example);

    TFundRouteLog selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TFundRouteLog record, @Param("example") TFundRouteLogExample example);

    int updateByExample(@Param("record") TFundRouteLog record, @Param("example") TFundRouteLogExample example);

    int updateByPrimaryKeySelective(TFundRouteLog record);

    int updateByPrimaryKey(TFundRouteLog record);
}