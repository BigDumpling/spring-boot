package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TCreditApplyFund;
import com.ligq.study.mybatis.demo.model.TCreditApplyFundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCreditApplyFundMapper {
    long countByExample(TCreditApplyFundExample example);

    int deleteByExample(TCreditApplyFundExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TCreditApplyFund record);

    int insertSelective(TCreditApplyFund record);

    List<TCreditApplyFund> selectByExample(TCreditApplyFundExample example);

    TCreditApplyFund selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TCreditApplyFund record, @Param("example") TCreditApplyFundExample example);

    int updateByExample(@Param("record") TCreditApplyFund record, @Param("example") TCreditApplyFundExample example);

    int updateByPrimaryKeySelective(TCreditApplyFund record);

    int updateByPrimaryKey(TCreditApplyFund record);
}