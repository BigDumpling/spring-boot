package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TNoticeTemplate;
import java.util.List;

public interface TNoticeTemplateMapper {
    int deleteByPrimaryKey(String id);

    int insert(TNoticeTemplate record);

    TNoticeTemplate selectByPrimaryKey(String id);

    List<TNoticeTemplate> selectAll();

    int updateByPrimaryKey(TNoticeTemplate record);
}