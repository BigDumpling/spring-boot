package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TCreditCiApplyInfo;
import com.ligq.study.mybatis.demo.model.TCreditCiApplyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCreditCiApplyInfoMapper {
    long countByExample(TCreditCiApplyInfoExample example);

    int deleteByExample(TCreditCiApplyInfoExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TCreditCiApplyInfo record);

    int insertSelective(TCreditCiApplyInfo record);

    List<TCreditCiApplyInfo> selectByExample(TCreditCiApplyInfoExample example);

    TCreditCiApplyInfo selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TCreditCiApplyInfo record, @Param("example") TCreditCiApplyInfoExample example);

    int updateByExample(@Param("record") TCreditCiApplyInfo record, @Param("example") TCreditCiApplyInfoExample example);

    int updateByPrimaryKeySelective(TCreditCiApplyInfo record);

    int updateByPrimaryKey(TCreditCiApplyInfo record);
}