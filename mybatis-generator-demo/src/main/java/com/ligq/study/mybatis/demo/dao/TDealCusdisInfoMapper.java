package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TDealCusdisInfo;
import com.ligq.study.mybatis.demo.model.TDealCusdisInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDealCusdisInfoMapper {
    long countByExample(TDealCusdisInfoExample example);

    int deleteByExample(TDealCusdisInfoExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TDealCusdisInfo record);

    int insertSelective(TDealCusdisInfo record);

    List<TDealCusdisInfo> selectByExample(TDealCusdisInfoExample example);

    TDealCusdisInfo selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TDealCusdisInfo record, @Param("example") TDealCusdisInfoExample example);

    int updateByExample(@Param("record") TDealCusdisInfo record, @Param("example") TDealCusdisInfoExample example);

    int updateByPrimaryKeySelective(TDealCusdisInfo record);

    int updateByPrimaryKey(TDealCusdisInfo record);
}