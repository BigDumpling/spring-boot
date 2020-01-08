package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TProductIntroduce;
import com.ligq.study.mybatis.demo.model.TProductIntroduceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProductIntroduceMapper {
    long countByExample(TProductIntroduceExample example);

    int deleteByExample(TProductIntroduceExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TProductIntroduce record);

    int insertSelective(TProductIntroduce record);

    List<TProductIntroduce> selectByExampleWithBLOBs(TProductIntroduceExample example);

    List<TProductIntroduce> selectByExample(TProductIntroduceExample example);

    TProductIntroduce selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TProductIntroduce record, @Param("example") TProductIntroduceExample example);

    int updateByExampleWithBLOBs(@Param("record") TProductIntroduce record, @Param("example") TProductIntroduceExample example);

    int updateByExample(@Param("record") TProductIntroduce record, @Param("example") TProductIntroduceExample example);

    int updateByPrimaryKeySelective(TProductIntroduce record);

    int updateByPrimaryKeyWithBLOBs(TProductIntroduce record);

    int updateByPrimaryKey(TProductIntroduce record);
}