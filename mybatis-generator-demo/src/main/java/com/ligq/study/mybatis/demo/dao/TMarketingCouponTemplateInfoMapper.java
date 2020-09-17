package com.ligq.study.mybatis.demo.dao;

import com.ligq.study.mybatis.demo.model.TMarketingCouponTemplateInfo;
import com.ligq.study.mybatis.demo.model.TMarketingCouponTemplateInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMarketingCouponTemplateInfoMapper {
    long countByExample(TMarketingCouponTemplateInfoExample example);

    int deleteByExample(TMarketingCouponTemplateInfoExample example);

    int deleteByPrimaryKey(String seqId);

    int insert(TMarketingCouponTemplateInfo record);

    int insertSelective(TMarketingCouponTemplateInfo record);

    List<TMarketingCouponTemplateInfo> selectByExample(TMarketingCouponTemplateInfoExample example);

    TMarketingCouponTemplateInfo selectByPrimaryKey(String seqId);

    int updateByExampleSelective(@Param("record") TMarketingCouponTemplateInfo record, @Param("example") TMarketingCouponTemplateInfoExample example);

    int updateByExample(@Param("record") TMarketingCouponTemplateInfo record, @Param("example") TMarketingCouponTemplateInfoExample example);

    int updateByPrimaryKeySelective(TMarketingCouponTemplateInfo record);

    int updateByPrimaryKey(TMarketingCouponTemplateInfo record);
}