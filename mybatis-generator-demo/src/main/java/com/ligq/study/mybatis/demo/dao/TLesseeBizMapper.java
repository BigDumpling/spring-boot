package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TLesseeBiz;
import com.ligq.study.mybatis.demo.model.TLesseeBizExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLesseeBizMapper {
    long countByExample(TLesseeBizExample example);

    int deleteByExample(TLesseeBizExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TLesseeBiz record);

    int insertSelective(TLesseeBiz record);

    List<TLesseeBiz> selectByExample(TLesseeBizExample example);

    TLesseeBiz selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TLesseeBiz record, @Param("example") TLesseeBizExample example);

    int updateByExample(@Param("record") TLesseeBiz record, @Param("example") TLesseeBizExample example);

    int updateByPrimaryKeySelective(TLesseeBiz record);

    int updateByPrimaryKey(TLesseeBiz record);
}