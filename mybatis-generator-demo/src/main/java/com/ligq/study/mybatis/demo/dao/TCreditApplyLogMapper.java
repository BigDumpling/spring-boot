package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TCreditApplyLog;
import com.ligq.study.mybatis.demo.model.TCreditApplyLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCreditApplyLogMapper {
    long countByExample(TCreditApplyLogExample example);

    int deleteByExample(TCreditApplyLogExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TCreditApplyLog record);

    int insertSelective(TCreditApplyLog record);

    List<TCreditApplyLog> selectByExample(TCreditApplyLogExample example);

    TCreditApplyLog selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TCreditApplyLog record, @Param("example") TCreditApplyLogExample example);

    int updateByExample(@Param("record") TCreditApplyLog record, @Param("example") TCreditApplyLogExample example);

    int updateByPrimaryKeySelective(TCreditApplyLog record);

    int updateByPrimaryKey(TCreditApplyLog record);
}