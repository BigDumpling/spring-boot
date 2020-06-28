package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TempInterestDiscountCust;
import com.ligq.study.mybatis.demo.model.TempInterestDiscountCustExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TempInterestDiscountCustMapper {
    long countByExample(TempInterestDiscountCustExample example);

    int deleteByExample(TempInterestDiscountCustExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TempInterestDiscountCust record);

    int insertSelective(TempInterestDiscountCust record);

    List<TempInterestDiscountCust> selectByExample(TempInterestDiscountCustExample example);

    TempInterestDiscountCust selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TempInterestDiscountCust record, @Param("example") TempInterestDiscountCustExample example);

    int updateByExample(@Param("record") TempInterestDiscountCust record, @Param("example") TempInterestDiscountCustExample example);

    int updateByPrimaryKeySelective(TempInterestDiscountCust record);

    int updateByPrimaryKey(TempInterestDiscountCust record);
}