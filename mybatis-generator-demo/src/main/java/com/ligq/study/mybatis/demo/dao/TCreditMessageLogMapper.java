package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TCreditMessageLog;
import com.ligq.study.mybatis.demo.model.TCreditMessageLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCreditMessageLogMapper {
    long countByExample(TCreditMessageLogExample example);

    int deleteByExample(TCreditMessageLogExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TCreditMessageLog record);

    int insertSelective(TCreditMessageLog record);

    List<TCreditMessageLog> selectByExample(TCreditMessageLogExample example);

    TCreditMessageLog selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TCreditMessageLog record, @Param("example") TCreditMessageLogExample example);

    int updateByExample(@Param("record") TCreditMessageLog record, @Param("example") TCreditMessageLogExample example);

    int updateByPrimaryKeySelective(TCreditMessageLog record);

    int updateByPrimaryKey(TCreditMessageLog record);
}