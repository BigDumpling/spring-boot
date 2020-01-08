package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TBaseBankInfo;
import com.ligq.study.mybatis.demo.model.TBaseBankInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBaseBankInfoMapper {
    long countByExample(TBaseBankInfoExample example);

    int deleteByExample(TBaseBankInfoExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TBaseBankInfo record);

    int insertSelective(TBaseBankInfo record);

    List<TBaseBankInfo> selectByExample(TBaseBankInfoExample example);

    TBaseBankInfo selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TBaseBankInfo record, @Param("example") TBaseBankInfoExample example);

    int updateByExample(@Param("record") TBaseBankInfo record, @Param("example") TBaseBankInfoExample example);

    int updateByPrimaryKeySelective(TBaseBankInfo record);

    int updateByPrimaryKey(TBaseBankInfo record);
}