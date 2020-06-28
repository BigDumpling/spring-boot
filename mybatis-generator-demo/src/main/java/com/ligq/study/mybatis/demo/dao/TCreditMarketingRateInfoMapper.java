package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TCreditMarketingRateInfo;
import com.ligq.study.mybatis.demo.model.TCreditMarketingRateInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCreditMarketingRateInfoMapper {
    long countByExample(TCreditMarketingRateInfoExample example);

    int deleteByExample(TCreditMarketingRateInfoExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TCreditMarketingRateInfo record);

    int insertSelective(TCreditMarketingRateInfo record);

    List<TCreditMarketingRateInfo> selectByExample(TCreditMarketingRateInfoExample example);

    TCreditMarketingRateInfo selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TCreditMarketingRateInfo record, @Param("example") TCreditMarketingRateInfoExample example);

    int updateByExample(@Param("record") TCreditMarketingRateInfo record, @Param("example") TCreditMarketingRateInfoExample example);

    int updateByPrimaryKeySelective(TCreditMarketingRateInfo record);

    int updateByPrimaryKey(TCreditMarketingRateInfo record);
}