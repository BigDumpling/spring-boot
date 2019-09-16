package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TFundLoanInfo;
import com.ligq.study.mybatis.demo.model.TFundLoanInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFundLoanInfoMapper {
    long countByExample(TFundLoanInfoExample example);

    int deleteByExample(TFundLoanInfoExample example);

    int deleteByPrimaryKey(String loanId);

    int insert(TFundLoanInfo record);

    int insertSelective(TFundLoanInfo record);

    List<TFundLoanInfo> selectByExampleWithBLOBs(TFundLoanInfoExample example);

    List<TFundLoanInfo> selectByExample(TFundLoanInfoExample example);

    TFundLoanInfo selectByPrimaryKey(String loanId);

    int updateByExampleSelective(@Param("record") TFundLoanInfo record, @Param("example") TFundLoanInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TFundLoanInfo record, @Param("example") TFundLoanInfoExample example);

    int updateByExample(@Param("record") TFundLoanInfo record, @Param("example") TFundLoanInfoExample example);

    int updateByPrimaryKeySelective(TFundLoanInfo record);

    int updateByPrimaryKeyWithBLOBs(TFundLoanInfo record);

    int updateByPrimaryKey(TFundLoanInfo record);
}