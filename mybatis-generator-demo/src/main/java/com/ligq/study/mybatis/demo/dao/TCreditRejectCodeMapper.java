package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TCreditRejectCode;
import com.ligq.study.mybatis.demo.model.TCreditRejectCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCreditRejectCodeMapper {
    long countByExample(TCreditRejectCodeExample example);

    int deleteByExample(TCreditRejectCodeExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TCreditRejectCode record);

    int insertSelective(TCreditRejectCode record);

    List<TCreditRejectCode> selectByExample(TCreditRejectCodeExample example);

    TCreditRejectCode selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TCreditRejectCode record, @Param("example") TCreditRejectCodeExample example);

    int updateByExample(@Param("record") TCreditRejectCode record, @Param("example") TCreditRejectCodeExample example);

    int updateByPrimaryKeySelective(TCreditRejectCode record);

    int updateByPrimaryKey(TCreditRejectCode record);
}