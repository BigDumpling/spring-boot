package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TNoticeTemplate;
import com.ligq.study.mybatis.demo.model.TNoticeTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TNoticeTemplateMapper {
    long countByExample(TNoticeTemplateExample example);

    int deleteByExample(TNoticeTemplateExample example);

    int deleteByPrimaryKey(String id);

    int insert(TNoticeTemplate record);

    int insertSelective(TNoticeTemplate record);

    List<TNoticeTemplate> selectByExampleWithBLOBs(TNoticeTemplateExample example);

    List<TNoticeTemplate> selectByExample(TNoticeTemplateExample example);

    TNoticeTemplate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TNoticeTemplate record, @Param("example") TNoticeTemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") TNoticeTemplate record, @Param("example") TNoticeTemplateExample example);

    int updateByExample(@Param("record") TNoticeTemplate record, @Param("example") TNoticeTemplateExample example);

    int updateByPrimaryKeySelective(TNoticeTemplate record);

    int updateByPrimaryKeyWithBLOBs(TNoticeTemplate record);

    int updateByPrimaryKey(TNoticeTemplate record);
}