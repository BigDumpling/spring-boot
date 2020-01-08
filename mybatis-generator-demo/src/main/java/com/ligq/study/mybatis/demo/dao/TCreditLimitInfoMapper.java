package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TCreditLimitInfo;
import com.ligq.study.mybatis.demo.model.TCreditLimitInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCreditLimitInfoMapper {
    long countByExample(TCreditLimitInfoExample example);

    int deleteByExample(TCreditLimitInfoExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TCreditLimitInfo record);

    int insertSelective(TCreditLimitInfo record);

    List<TCreditLimitInfo> selectByExample(TCreditLimitInfoExample example);

    TCreditLimitInfo selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TCreditLimitInfo record, @Param("example") TCreditLimitInfoExample example);

    int updateByExample(@Param("record") TCreditLimitInfo record, @Param("example") TCreditLimitInfoExample example);

    int updateByPrimaryKeySelective(TCreditLimitInfo record);

    int updateByPrimaryKey(TCreditLimitInfo record);
}