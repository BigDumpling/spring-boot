package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TCreditLimitLog;
import com.ligq.study.mybatis.demo.model.TCreditLimitLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCreditLimitLogMapper {
    long countByExample(TCreditLimitLogExample example);

    int deleteByExample(TCreditLimitLogExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TCreditLimitLog record);

    int insertSelective(TCreditLimitLog record);

    List<TCreditLimitLog> selectByExample(TCreditLimitLogExample example);

    TCreditLimitLog selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TCreditLimitLog record, @Param("example") TCreditLimitLogExample example);

    int updateByExample(@Param("record") TCreditLimitLog record, @Param("example") TCreditLimitLogExample example);

    int updateByPrimaryKeySelective(TCreditLimitLog record);

    int updateByPrimaryKey(TCreditLimitLog record);
}