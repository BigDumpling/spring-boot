package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.mapper.MyMapper;
import com.ligq.study.mybatis.demo.model.TEdiMatchConfig;

import java.util.List;

public interface TEdiMatchConfigMapper extends MyMapper<TEdiMatchConfig> {

    List<TEdiMatchConfig> selectListByGroup();
}