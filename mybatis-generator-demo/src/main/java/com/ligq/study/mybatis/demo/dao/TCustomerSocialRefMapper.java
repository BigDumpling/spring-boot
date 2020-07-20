package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TCustomerSocialRef;
import com.ligq.study.mybatis.demo.model.TCustomerSocialRefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustomerSocialRefMapper {
    long countByExample(TCustomerSocialRefExample example);

    int deleteByExample(TCustomerSocialRefExample example);

    int deleteByPrimaryKey(String customerSocialRefId);

    int insert(TCustomerSocialRef record);

    int insertSelective(TCustomerSocialRef record);

    List<TCustomerSocialRef> selectByExample(TCustomerSocialRefExample example);

    TCustomerSocialRef selectByPrimaryKey(String customerSocialRefId);

    int updateByExampleSelective(@Param("record") TCustomerSocialRef record, @Param("example") TCustomerSocialRefExample example);

    int updateByExample(@Param("record") TCustomerSocialRef record, @Param("example") TCustomerSocialRefExample example);

    int updateByPrimaryKeySelective(TCustomerSocialRef record);

    int updateByPrimaryKey(TCustomerSocialRef record);
}