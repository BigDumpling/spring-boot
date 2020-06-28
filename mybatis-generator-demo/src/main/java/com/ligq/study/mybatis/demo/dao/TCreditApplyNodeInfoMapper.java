package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TCreditApplyNodeInfo;
import com.ligq.study.mybatis.demo.model.TCreditApplyNodeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCreditApplyNodeInfoMapper {
    long countByExample(TCreditApplyNodeInfoExample example);

    int deleteByExample(TCreditApplyNodeInfoExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TCreditApplyNodeInfo record);

    int insertSelective(TCreditApplyNodeInfo record);

    List<TCreditApplyNodeInfo> selectByExampleWithBLOBs(TCreditApplyNodeInfoExample example);

    List<TCreditApplyNodeInfo> selectByExample(TCreditApplyNodeInfoExample example);

    TCreditApplyNodeInfo selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TCreditApplyNodeInfo record, @Param("example") TCreditApplyNodeInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TCreditApplyNodeInfo record, @Param("example") TCreditApplyNodeInfoExample example);

    int updateByExample(@Param("record") TCreditApplyNodeInfo record, @Param("example") TCreditApplyNodeInfoExample example);

    int updateByPrimaryKeySelective(TCreditApplyNodeInfo record);

    int updateByPrimaryKeyWithBLOBs(TCreditApplyNodeInfo record);

    int updateByPrimaryKey(TCreditApplyNodeInfo record);
}