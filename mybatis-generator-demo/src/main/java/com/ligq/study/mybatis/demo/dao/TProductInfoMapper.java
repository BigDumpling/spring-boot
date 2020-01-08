package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TProductInfo;
import com.ligq.study.mybatis.demo.model.TProductInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProductInfoMapper {
    long countByExample(TProductInfoExample example);

    int deleteByExample(TProductInfoExample example);

    int deleteByPrimaryKey(String productId);

    int insert(TProductInfo record);

    int insertSelective(TProductInfo record);

    List<TProductInfo> selectByExample(TProductInfoExample example);

    TProductInfo selectByPrimaryKey(String productId);

    int updateByExampleSelective(@Param("record") TProductInfo record, @Param("example") TProductInfoExample example);

    int updateByExample(@Param("record") TProductInfo record, @Param("example") TProductInfoExample example);

    int updateByPrimaryKeySelective(TProductInfo record);

    int updateByPrimaryKey(TProductInfo record);
}