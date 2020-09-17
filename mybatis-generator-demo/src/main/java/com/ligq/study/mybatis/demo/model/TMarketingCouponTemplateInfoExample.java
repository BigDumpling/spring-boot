package com.ligq.study.mybatis.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TMarketingCouponTemplateInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMarketingCouponTemplateInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSeqIdIsNull() {
            addCriterion("SEQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeqIdIsNotNull() {
            addCriterion("SEQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeqIdEqualTo(String value) {
            addCriterion("SEQ_ID =", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotEqualTo(String value) {
            addCriterion("SEQ_ID <>", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThan(String value) {
            addCriterion("SEQ_ID >", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("SEQ_ID >=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThan(String value) {
            addCriterion("SEQ_ID <", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThanOrEqualTo(String value) {
            addCriterion("SEQ_ID <=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLike(String value) {
            addCriterion("SEQ_ID like", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotLike(String value) {
            addCriterion("SEQ_ID not like", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdIn(List<String> values) {
            addCriterion("SEQ_ID in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotIn(List<String> values) {
            addCriterion("SEQ_ID not in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdBetween(String value1, String value2) {
            addCriterion("SEQ_ID between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotBetween(String value1, String value2) {
            addCriterion("SEQ_ID not between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andCouponTemplateNameIsNull() {
            addCriterion("COUPON_TEMPLATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCouponTemplateNameIsNotNull() {
            addCriterion("COUPON_TEMPLATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTemplateNameEqualTo(String value) {
            addCriterion("COUPON_TEMPLATE_NAME =", value, "couponTemplateName");
            return (Criteria) this;
        }

        public Criteria andCouponTemplateNameNotEqualTo(String value) {
            addCriterion("COUPON_TEMPLATE_NAME <>", value, "couponTemplateName");
            return (Criteria) this;
        }

        public Criteria andCouponTemplateNameGreaterThan(String value) {
            addCriterion("COUPON_TEMPLATE_NAME >", value, "couponTemplateName");
            return (Criteria) this;
        }

        public Criteria andCouponTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("COUPON_TEMPLATE_NAME >=", value, "couponTemplateName");
            return (Criteria) this;
        }

        public Criteria andCouponTemplateNameLessThan(String value) {
            addCriterion("COUPON_TEMPLATE_NAME <", value, "couponTemplateName");
            return (Criteria) this;
        }

        public Criteria andCouponTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("COUPON_TEMPLATE_NAME <=", value, "couponTemplateName");
            return (Criteria) this;
        }

        public Criteria andCouponTemplateNameLike(String value) {
            addCriterion("COUPON_TEMPLATE_NAME like", value, "couponTemplateName");
            return (Criteria) this;
        }

        public Criteria andCouponTemplateNameNotLike(String value) {
            addCriterion("COUPON_TEMPLATE_NAME not like", value, "couponTemplateName");
            return (Criteria) this;
        }

        public Criteria andCouponTemplateNameIn(List<String> values) {
            addCriterion("COUPON_TEMPLATE_NAME in", values, "couponTemplateName");
            return (Criteria) this;
        }

        public Criteria andCouponTemplateNameNotIn(List<String> values) {
            addCriterion("COUPON_TEMPLATE_NAME not in", values, "couponTemplateName");
            return (Criteria) this;
        }

        public Criteria andCouponTemplateNameBetween(String value1, String value2) {
            addCriterion("COUPON_TEMPLATE_NAME between", value1, value2, "couponTemplateName");
            return (Criteria) this;
        }

        public Criteria andCouponTemplateNameNotBetween(String value1, String value2) {
            addCriterion("COUPON_TEMPLATE_NAME not between", value1, value2, "couponTemplateName");
            return (Criteria) this;
        }

        public Criteria andUseTypeIsNull() {
            addCriterion("USE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUseTypeIsNotNull() {
            addCriterion("USE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUseTypeEqualTo(String value) {
            addCriterion("USE_TYPE =", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotEqualTo(String value) {
            addCriterion("USE_TYPE <>", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeGreaterThan(String value) {
            addCriterion("USE_TYPE >", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USE_TYPE >=", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLessThan(String value) {
            addCriterion("USE_TYPE <", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLessThanOrEqualTo(String value) {
            addCriterion("USE_TYPE <=", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLike(String value) {
            addCriterion("USE_TYPE like", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotLike(String value) {
            addCriterion("USE_TYPE not like", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeIn(List<String> values) {
            addCriterion("USE_TYPE in", values, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotIn(List<String> values) {
            addCriterion("USE_TYPE not in", values, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeBetween(String value1, String value2) {
            addCriterion("USE_TYPE between", value1, value2, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotBetween(String value1, String value2) {
            addCriterion("USE_TYPE not between", value1, value2, "useType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeIsNull() {
            addCriterion("PERIOD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeIsNotNull() {
            addCriterion("PERIOD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeEqualTo(String value) {
            addCriterion("PERIOD_TYPE =", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotEqualTo(String value) {
            addCriterion("PERIOD_TYPE <>", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeGreaterThan(String value) {
            addCriterion("PERIOD_TYPE >", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD_TYPE >=", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeLessThan(String value) {
            addCriterion("PERIOD_TYPE <", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeLessThanOrEqualTo(String value) {
            addCriterion("PERIOD_TYPE <=", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeLike(String value) {
            addCriterion("PERIOD_TYPE like", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotLike(String value) {
            addCriterion("PERIOD_TYPE not like", value, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeIn(List<String> values) {
            addCriterion("PERIOD_TYPE in", values, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotIn(List<String> values) {
            addCriterion("PERIOD_TYPE not in", values, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeBetween(String value1, String value2) {
            addCriterion("PERIOD_TYPE between", value1, value2, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodTypeNotBetween(String value1, String value2) {
            addCriterion("PERIOD_TYPE not between", value1, value2, "periodType");
            return (Criteria) this;
        }

        public Criteria andPeriodStartIsNull() {
            addCriterion("PERIOD_START is null");
            return (Criteria) this;
        }

        public Criteria andPeriodStartIsNotNull() {
            addCriterion("PERIOD_START is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodStartEqualTo(String value) {
            addCriterion("PERIOD_START =", value, "periodStart");
            return (Criteria) this;
        }

        public Criteria andPeriodStartNotEqualTo(String value) {
            addCriterion("PERIOD_START <>", value, "periodStart");
            return (Criteria) this;
        }

        public Criteria andPeriodStartGreaterThan(String value) {
            addCriterion("PERIOD_START >", value, "periodStart");
            return (Criteria) this;
        }

        public Criteria andPeriodStartGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD_START >=", value, "periodStart");
            return (Criteria) this;
        }

        public Criteria andPeriodStartLessThan(String value) {
            addCriterion("PERIOD_START <", value, "periodStart");
            return (Criteria) this;
        }

        public Criteria andPeriodStartLessThanOrEqualTo(String value) {
            addCriterion("PERIOD_START <=", value, "periodStart");
            return (Criteria) this;
        }

        public Criteria andPeriodStartLike(String value) {
            addCriterion("PERIOD_START like", value, "periodStart");
            return (Criteria) this;
        }

        public Criteria andPeriodStartNotLike(String value) {
            addCriterion("PERIOD_START not like", value, "periodStart");
            return (Criteria) this;
        }

        public Criteria andPeriodStartIn(List<String> values) {
            addCriterion("PERIOD_START in", values, "periodStart");
            return (Criteria) this;
        }

        public Criteria andPeriodStartNotIn(List<String> values) {
            addCriterion("PERIOD_START not in", values, "periodStart");
            return (Criteria) this;
        }

        public Criteria andPeriodStartBetween(String value1, String value2) {
            addCriterion("PERIOD_START between", value1, value2, "periodStart");
            return (Criteria) this;
        }

        public Criteria andPeriodStartNotBetween(String value1, String value2) {
            addCriterion("PERIOD_START not between", value1, value2, "periodStart");
            return (Criteria) this;
        }

        public Criteria andPeriodEndIsNull() {
            addCriterion("PERIOD_END is null");
            return (Criteria) this;
        }

        public Criteria andPeriodEndIsNotNull() {
            addCriterion("PERIOD_END is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEndEqualTo(String value) {
            addCriterion("PERIOD_END =", value, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndNotEqualTo(String value) {
            addCriterion("PERIOD_END <>", value, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndGreaterThan(String value) {
            addCriterion("PERIOD_END >", value, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndGreaterThanOrEqualTo(String value) {
            addCriterion("PERIOD_END >=", value, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndLessThan(String value) {
            addCriterion("PERIOD_END <", value, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndLessThanOrEqualTo(String value) {
            addCriterion("PERIOD_END <=", value, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndLike(String value) {
            addCriterion("PERIOD_END like", value, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndNotLike(String value) {
            addCriterion("PERIOD_END not like", value, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndIn(List<String> values) {
            addCriterion("PERIOD_END in", values, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndNotIn(List<String> values) {
            addCriterion("PERIOD_END not in", values, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndBetween(String value1, String value2) {
            addCriterion("PERIOD_END between", value1, value2, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andPeriodEndNotBetween(String value1, String value2) {
            addCriterion("PERIOD_END not between", value1, value2, "periodEnd");
            return (Criteria) this;
        }

        public Criteria andDeductionTypeIsNull() {
            addCriterion("DEDUCTION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeductionTypeIsNotNull() {
            addCriterion("DEDUCTION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeductionTypeEqualTo(String value) {
            addCriterion("DEDUCTION_TYPE =", value, "deductionType");
            return (Criteria) this;
        }

        public Criteria andDeductionTypeNotEqualTo(String value) {
            addCriterion("DEDUCTION_TYPE <>", value, "deductionType");
            return (Criteria) this;
        }

        public Criteria andDeductionTypeGreaterThan(String value) {
            addCriterion("DEDUCTION_TYPE >", value, "deductionType");
            return (Criteria) this;
        }

        public Criteria andDeductionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEDUCTION_TYPE >=", value, "deductionType");
            return (Criteria) this;
        }

        public Criteria andDeductionTypeLessThan(String value) {
            addCriterion("DEDUCTION_TYPE <", value, "deductionType");
            return (Criteria) this;
        }

        public Criteria andDeductionTypeLessThanOrEqualTo(String value) {
            addCriterion("DEDUCTION_TYPE <=", value, "deductionType");
            return (Criteria) this;
        }

        public Criteria andDeductionTypeLike(String value) {
            addCriterion("DEDUCTION_TYPE like", value, "deductionType");
            return (Criteria) this;
        }

        public Criteria andDeductionTypeNotLike(String value) {
            addCriterion("DEDUCTION_TYPE not like", value, "deductionType");
            return (Criteria) this;
        }

        public Criteria andDeductionTypeIn(List<String> values) {
            addCriterion("DEDUCTION_TYPE in", values, "deductionType");
            return (Criteria) this;
        }

        public Criteria andDeductionTypeNotIn(List<String> values) {
            addCriterion("DEDUCTION_TYPE not in", values, "deductionType");
            return (Criteria) this;
        }

        public Criteria andDeductionTypeBetween(String value1, String value2) {
            addCriterion("DEDUCTION_TYPE between", value1, value2, "deductionType");
            return (Criteria) this;
        }

        public Criteria andDeductionTypeNotBetween(String value1, String value2) {
            addCriterion("DEDUCTION_TYPE not between", value1, value2, "deductionType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDeductionValueIsNull() {
            addCriterion("DEDUCTION_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andDeductionValueIsNotNull() {
            addCriterion("DEDUCTION_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDeductionValueEqualTo(BigDecimal value) {
            addCriterion("DEDUCTION_VALUE =", value, "deductionValue");
            return (Criteria) this;
        }

        public Criteria andDeductionValueNotEqualTo(BigDecimal value) {
            addCriterion("DEDUCTION_VALUE <>", value, "deductionValue");
            return (Criteria) this;
        }

        public Criteria andDeductionValueGreaterThan(BigDecimal value) {
            addCriterion("DEDUCTION_VALUE >", value, "deductionValue");
            return (Criteria) this;
        }

        public Criteria andDeductionValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEDUCTION_VALUE >=", value, "deductionValue");
            return (Criteria) this;
        }

        public Criteria andDeductionValueLessThan(BigDecimal value) {
            addCriterion("DEDUCTION_VALUE <", value, "deductionValue");
            return (Criteria) this;
        }

        public Criteria andDeductionValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEDUCTION_VALUE <=", value, "deductionValue");
            return (Criteria) this;
        }

        public Criteria andDeductionValueIn(List<BigDecimal> values) {
            addCriterion("DEDUCTION_VALUE in", values, "deductionValue");
            return (Criteria) this;
        }

        public Criteria andDeductionValueNotIn(List<BigDecimal> values) {
            addCriterion("DEDUCTION_VALUE not in", values, "deductionValue");
            return (Criteria) this;
        }

        public Criteria andDeductionValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEDUCTION_VALUE between", value1, value2, "deductionValue");
            return (Criteria) this;
        }

        public Criteria andDeductionValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEDUCTION_VALUE not between", value1, value2, "deductionValue");
            return (Criteria) this;
        }

        public Criteria andDeductionRuleIsNull() {
            addCriterion("DEDUCTION_RULE is null");
            return (Criteria) this;
        }

        public Criteria andDeductionRuleIsNotNull() {
            addCriterion("DEDUCTION_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andDeductionRuleEqualTo(String value) {
            addCriterion("DEDUCTION_RULE =", value, "deductionRule");
            return (Criteria) this;
        }

        public Criteria andDeductionRuleNotEqualTo(String value) {
            addCriterion("DEDUCTION_RULE <>", value, "deductionRule");
            return (Criteria) this;
        }

        public Criteria andDeductionRuleGreaterThan(String value) {
            addCriterion("DEDUCTION_RULE >", value, "deductionRule");
            return (Criteria) this;
        }

        public Criteria andDeductionRuleGreaterThanOrEqualTo(String value) {
            addCriterion("DEDUCTION_RULE >=", value, "deductionRule");
            return (Criteria) this;
        }

        public Criteria andDeductionRuleLessThan(String value) {
            addCriterion("DEDUCTION_RULE <", value, "deductionRule");
            return (Criteria) this;
        }

        public Criteria andDeductionRuleLessThanOrEqualTo(String value) {
            addCriterion("DEDUCTION_RULE <=", value, "deductionRule");
            return (Criteria) this;
        }

        public Criteria andDeductionRuleLike(String value) {
            addCriterion("DEDUCTION_RULE like", value, "deductionRule");
            return (Criteria) this;
        }

        public Criteria andDeductionRuleNotLike(String value) {
            addCriterion("DEDUCTION_RULE not like", value, "deductionRule");
            return (Criteria) this;
        }

        public Criteria andDeductionRuleIn(List<String> values) {
            addCriterion("DEDUCTION_RULE in", values, "deductionRule");
            return (Criteria) this;
        }

        public Criteria andDeductionRuleNotIn(List<String> values) {
            addCriterion("DEDUCTION_RULE not in", values, "deductionRule");
            return (Criteria) this;
        }

        public Criteria andDeductionRuleBetween(String value1, String value2) {
            addCriterion("DEDUCTION_RULE between", value1, value2, "deductionRule");
            return (Criteria) this;
        }

        public Criteria andDeductionRuleNotBetween(String value1, String value2) {
            addCriterion("DEDUCTION_RULE not between", value1, value2, "deductionRule");
            return (Criteria) this;
        }

        public Criteria andMaxAmtIsNull() {
            addCriterion("MAX_AMT is null");
            return (Criteria) this;
        }

        public Criteria andMaxAmtIsNotNull() {
            addCriterion("MAX_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxAmtEqualTo(BigDecimal value) {
            addCriterion("MAX_AMT =", value, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andMaxAmtNotEqualTo(BigDecimal value) {
            addCriterion("MAX_AMT <>", value, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andMaxAmtGreaterThan(BigDecimal value) {
            addCriterion("MAX_AMT >", value, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andMaxAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_AMT >=", value, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andMaxAmtLessThan(BigDecimal value) {
            addCriterion("MAX_AMT <", value, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andMaxAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_AMT <=", value, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andMaxAmtIn(List<BigDecimal> values) {
            addCriterion("MAX_AMT in", values, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andMaxAmtNotIn(List<BigDecimal> values) {
            addCriterion("MAX_AMT not in", values, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andMaxAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_AMT between", value1, value2, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andMaxAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_AMT not between", value1, value2, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andFloorAmtIsNull() {
            addCriterion("FLOOR_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFloorAmtIsNotNull() {
            addCriterion("FLOOR_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFloorAmtEqualTo(BigDecimal value) {
            addCriterion("FLOOR_AMT =", value, "floorAmt");
            return (Criteria) this;
        }

        public Criteria andFloorAmtNotEqualTo(BigDecimal value) {
            addCriterion("FLOOR_AMT <>", value, "floorAmt");
            return (Criteria) this;
        }

        public Criteria andFloorAmtGreaterThan(BigDecimal value) {
            addCriterion("FLOOR_AMT >", value, "floorAmt");
            return (Criteria) this;
        }

        public Criteria andFloorAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FLOOR_AMT >=", value, "floorAmt");
            return (Criteria) this;
        }

        public Criteria andFloorAmtLessThan(BigDecimal value) {
            addCriterion("FLOOR_AMT <", value, "floorAmt");
            return (Criteria) this;
        }

        public Criteria andFloorAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FLOOR_AMT <=", value, "floorAmt");
            return (Criteria) this;
        }

        public Criteria andFloorAmtIn(List<BigDecimal> values) {
            addCriterion("FLOOR_AMT in", values, "floorAmt");
            return (Criteria) this;
        }

        public Criteria andFloorAmtNotIn(List<BigDecimal> values) {
            addCriterion("FLOOR_AMT not in", values, "floorAmt");
            return (Criteria) this;
        }

        public Criteria andFloorAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLOOR_AMT between", value1, value2, "floorAmt");
            return (Criteria) this;
        }

        public Criteria andFloorAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLOOR_AMT not between", value1, value2, "floorAmt");
            return (Criteria) this;
        }

        public Criteria andProductListIsNull() {
            addCriterion("PRODUCT_LIST is null");
            return (Criteria) this;
        }

        public Criteria andProductListIsNotNull() {
            addCriterion("PRODUCT_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andProductListEqualTo(String value) {
            addCriterion("PRODUCT_LIST =", value, "productList");
            return (Criteria) this;
        }

        public Criteria andProductListNotEqualTo(String value) {
            addCriterion("PRODUCT_LIST <>", value, "productList");
            return (Criteria) this;
        }

        public Criteria andProductListGreaterThan(String value) {
            addCriterion("PRODUCT_LIST >", value, "productList");
            return (Criteria) this;
        }

        public Criteria andProductListGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_LIST >=", value, "productList");
            return (Criteria) this;
        }

        public Criteria andProductListLessThan(String value) {
            addCriterion("PRODUCT_LIST <", value, "productList");
            return (Criteria) this;
        }

        public Criteria andProductListLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_LIST <=", value, "productList");
            return (Criteria) this;
        }

        public Criteria andProductListLike(String value) {
            addCriterion("PRODUCT_LIST like", value, "productList");
            return (Criteria) this;
        }

        public Criteria andProductListNotLike(String value) {
            addCriterion("PRODUCT_LIST not like", value, "productList");
            return (Criteria) this;
        }

        public Criteria andProductListIn(List<String> values) {
            addCriterion("PRODUCT_LIST in", values, "productList");
            return (Criteria) this;
        }

        public Criteria andProductListNotIn(List<String> values) {
            addCriterion("PRODUCT_LIST not in", values, "productList");
            return (Criteria) this;
        }

        public Criteria andProductListBetween(String value1, String value2) {
            addCriterion("PRODUCT_LIST between", value1, value2, "productList");
            return (Criteria) this;
        }

        public Criteria andProductListNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_LIST not between", value1, value2, "productList");
            return (Criteria) this;
        }

        public Criteria andPartUseIsNull() {
            addCriterion("PART_USE is null");
            return (Criteria) this;
        }

        public Criteria andPartUseIsNotNull() {
            addCriterion("PART_USE is not null");
            return (Criteria) this;
        }

        public Criteria andPartUseEqualTo(String value) {
            addCriterion("PART_USE =", value, "partUse");
            return (Criteria) this;
        }

        public Criteria andPartUseNotEqualTo(String value) {
            addCriterion("PART_USE <>", value, "partUse");
            return (Criteria) this;
        }

        public Criteria andPartUseGreaterThan(String value) {
            addCriterion("PART_USE >", value, "partUse");
            return (Criteria) this;
        }

        public Criteria andPartUseGreaterThanOrEqualTo(String value) {
            addCriterion("PART_USE >=", value, "partUse");
            return (Criteria) this;
        }

        public Criteria andPartUseLessThan(String value) {
            addCriterion("PART_USE <", value, "partUse");
            return (Criteria) this;
        }

        public Criteria andPartUseLessThanOrEqualTo(String value) {
            addCriterion("PART_USE <=", value, "partUse");
            return (Criteria) this;
        }

        public Criteria andPartUseLike(String value) {
            addCriterion("PART_USE like", value, "partUse");
            return (Criteria) this;
        }

        public Criteria andPartUseNotLike(String value) {
            addCriterion("PART_USE not like", value, "partUse");
            return (Criteria) this;
        }

        public Criteria andPartUseIn(List<String> values) {
            addCriterion("PART_USE in", values, "partUse");
            return (Criteria) this;
        }

        public Criteria andPartUseNotIn(List<String> values) {
            addCriterion("PART_USE not in", values, "partUse");
            return (Criteria) this;
        }

        public Criteria andPartUseBetween(String value1, String value2) {
            addCriterion("PART_USE between", value1, value2, "partUse");
            return (Criteria) this;
        }

        public Criteria andPartUseNotBetween(String value1, String value2) {
            addCriterion("PART_USE not between", value1, value2, "partUse");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("UPDATE_USER like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("UPDATE_USER not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUseLimitIsNull() {
            addCriterion("use_limit is null");
            return (Criteria) this;
        }

        public Criteria andUseLimitIsNotNull() {
            addCriterion("use_limit is not null");
            return (Criteria) this;
        }

        public Criteria andUseLimitEqualTo(String value) {
            addCriterion("use_limit =", value, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitNotEqualTo(String value) {
            addCriterion("use_limit <>", value, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitGreaterThan(String value) {
            addCriterion("use_limit >", value, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitGreaterThanOrEqualTo(String value) {
            addCriterion("use_limit >=", value, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitLessThan(String value) {
            addCriterion("use_limit <", value, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitLessThanOrEqualTo(String value) {
            addCriterion("use_limit <=", value, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitLike(String value) {
            addCriterion("use_limit like", value, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitNotLike(String value) {
            addCriterion("use_limit not like", value, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitIn(List<String> values) {
            addCriterion("use_limit in", values, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitNotIn(List<String> values) {
            addCriterion("use_limit not in", values, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitBetween(String value1, String value2) {
            addCriterion("use_limit between", value1, value2, "useLimit");
            return (Criteria) this;
        }

        public Criteria andUseLimitNotBetween(String value1, String value2) {
            addCriterion("use_limit not between", value1, value2, "useLimit");
            return (Criteria) this;
        }

        public Criteria andFaceSetWayIsNull() {
            addCriterion("FACE_SET_WAY is null");
            return (Criteria) this;
        }

        public Criteria andFaceSetWayIsNotNull() {
            addCriterion("FACE_SET_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andFaceSetWayEqualTo(String value) {
            addCriterion("FACE_SET_WAY =", value, "faceSetWay");
            return (Criteria) this;
        }

        public Criteria andFaceSetWayNotEqualTo(String value) {
            addCriterion("FACE_SET_WAY <>", value, "faceSetWay");
            return (Criteria) this;
        }

        public Criteria andFaceSetWayGreaterThan(String value) {
            addCriterion("FACE_SET_WAY >", value, "faceSetWay");
            return (Criteria) this;
        }

        public Criteria andFaceSetWayGreaterThanOrEqualTo(String value) {
            addCriterion("FACE_SET_WAY >=", value, "faceSetWay");
            return (Criteria) this;
        }

        public Criteria andFaceSetWayLessThan(String value) {
            addCriterion("FACE_SET_WAY <", value, "faceSetWay");
            return (Criteria) this;
        }

        public Criteria andFaceSetWayLessThanOrEqualTo(String value) {
            addCriterion("FACE_SET_WAY <=", value, "faceSetWay");
            return (Criteria) this;
        }

        public Criteria andFaceSetWayLike(String value) {
            addCriterion("FACE_SET_WAY like", value, "faceSetWay");
            return (Criteria) this;
        }

        public Criteria andFaceSetWayNotLike(String value) {
            addCriterion("FACE_SET_WAY not like", value, "faceSetWay");
            return (Criteria) this;
        }

        public Criteria andFaceSetWayIn(List<String> values) {
            addCriterion("FACE_SET_WAY in", values, "faceSetWay");
            return (Criteria) this;
        }

        public Criteria andFaceSetWayNotIn(List<String> values) {
            addCriterion("FACE_SET_WAY not in", values, "faceSetWay");
            return (Criteria) this;
        }

        public Criteria andFaceSetWayBetween(String value1, String value2) {
            addCriterion("FACE_SET_WAY between", value1, value2, "faceSetWay");
            return (Criteria) this;
        }

        public Criteria andFaceSetWayNotBetween(String value1, String value2) {
            addCriterion("FACE_SET_WAY not between", value1, value2, "faceSetWay");
            return (Criteria) this;
        }

        public Criteria andIsReturnIsNull() {
            addCriterion("IS_RETURN is null");
            return (Criteria) this;
        }

        public Criteria andIsReturnIsNotNull() {
            addCriterion("IS_RETURN is not null");
            return (Criteria) this;
        }

        public Criteria andIsReturnEqualTo(String value) {
            addCriterion("IS_RETURN =", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnNotEqualTo(String value) {
            addCriterion("IS_RETURN <>", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnGreaterThan(String value) {
            addCriterion("IS_RETURN >", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnGreaterThanOrEqualTo(String value) {
            addCriterion("IS_RETURN >=", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnLessThan(String value) {
            addCriterion("IS_RETURN <", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnLessThanOrEqualTo(String value) {
            addCriterion("IS_RETURN <=", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnLike(String value) {
            addCriterion("IS_RETURN like", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnNotLike(String value) {
            addCriterion("IS_RETURN not like", value, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnIn(List<String> values) {
            addCriterion("IS_RETURN in", values, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnNotIn(List<String> values) {
            addCriterion("IS_RETURN not in", values, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnBetween(String value1, String value2) {
            addCriterion("IS_RETURN between", value1, value2, "isReturn");
            return (Criteria) this;
        }

        public Criteria andIsReturnNotBetween(String value1, String value2) {
            addCriterion("IS_RETURN not between", value1, value2, "isReturn");
            return (Criteria) this;
        }

        public Criteria andAvailableUseCountIsNull() {
            addCriterion("available_use_count is null");
            return (Criteria) this;
        }

        public Criteria andAvailableUseCountIsNotNull() {
            addCriterion("available_use_count is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableUseCountEqualTo(Integer value) {
            addCriterion("available_use_count =", value, "availableUseCount");
            return (Criteria) this;
        }

        public Criteria andAvailableUseCountNotEqualTo(Integer value) {
            addCriterion("available_use_count <>", value, "availableUseCount");
            return (Criteria) this;
        }

        public Criteria andAvailableUseCountGreaterThan(Integer value) {
            addCriterion("available_use_count >", value, "availableUseCount");
            return (Criteria) this;
        }

        public Criteria andAvailableUseCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("available_use_count >=", value, "availableUseCount");
            return (Criteria) this;
        }

        public Criteria andAvailableUseCountLessThan(Integer value) {
            addCriterion("available_use_count <", value, "availableUseCount");
            return (Criteria) this;
        }

        public Criteria andAvailableUseCountLessThanOrEqualTo(Integer value) {
            addCriterion("available_use_count <=", value, "availableUseCount");
            return (Criteria) this;
        }

        public Criteria andAvailableUseCountIn(List<Integer> values) {
            addCriterion("available_use_count in", values, "availableUseCount");
            return (Criteria) this;
        }

        public Criteria andAvailableUseCountNotIn(List<Integer> values) {
            addCriterion("available_use_count not in", values, "availableUseCount");
            return (Criteria) this;
        }

        public Criteria andAvailableUseCountBetween(Integer value1, Integer value2) {
            addCriterion("available_use_count between", value1, value2, "availableUseCount");
            return (Criteria) this;
        }

        public Criteria andAvailableUseCountNotBetween(Integer value1, Integer value2) {
            addCriterion("available_use_count not between", value1, value2, "availableUseCount");
            return (Criteria) this;
        }

        public Criteria andFrontShowIsNull() {
            addCriterion("front_show is null");
            return (Criteria) this;
        }

        public Criteria andFrontShowIsNotNull() {
            addCriterion("front_show is not null");
            return (Criteria) this;
        }

        public Criteria andFrontShowEqualTo(String value) {
            addCriterion("front_show =", value, "frontShow");
            return (Criteria) this;
        }

        public Criteria andFrontShowNotEqualTo(String value) {
            addCriterion("front_show <>", value, "frontShow");
            return (Criteria) this;
        }

        public Criteria andFrontShowGreaterThan(String value) {
            addCriterion("front_show >", value, "frontShow");
            return (Criteria) this;
        }

        public Criteria andFrontShowGreaterThanOrEqualTo(String value) {
            addCriterion("front_show >=", value, "frontShow");
            return (Criteria) this;
        }

        public Criteria andFrontShowLessThan(String value) {
            addCriterion("front_show <", value, "frontShow");
            return (Criteria) this;
        }

        public Criteria andFrontShowLessThanOrEqualTo(String value) {
            addCriterion("front_show <=", value, "frontShow");
            return (Criteria) this;
        }

        public Criteria andFrontShowLike(String value) {
            addCriterion("front_show like", value, "frontShow");
            return (Criteria) this;
        }

        public Criteria andFrontShowNotLike(String value) {
            addCriterion("front_show not like", value, "frontShow");
            return (Criteria) this;
        }

        public Criteria andFrontShowIn(List<String> values) {
            addCriterion("front_show in", values, "frontShow");
            return (Criteria) this;
        }

        public Criteria andFrontShowNotIn(List<String> values) {
            addCriterion("front_show not in", values, "frontShow");
            return (Criteria) this;
        }

        public Criteria andFrontShowBetween(String value1, String value2) {
            addCriterion("front_show between", value1, value2, "frontShow");
            return (Criteria) this;
        }

        public Criteria andFrontShowNotBetween(String value1, String value2) {
            addCriterion("front_show not between", value1, value2, "frontShow");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitIsNull() {
            addCriterion("use_count_limit is null");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitIsNotNull() {
            addCriterion("use_count_limit is not null");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitEqualTo(String value) {
            addCriterion("use_count_limit =", value, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitNotEqualTo(String value) {
            addCriterion("use_count_limit <>", value, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitGreaterThan(String value) {
            addCriterion("use_count_limit >", value, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitGreaterThanOrEqualTo(String value) {
            addCriterion("use_count_limit >=", value, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitLessThan(String value) {
            addCriterion("use_count_limit <", value, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitLessThanOrEqualTo(String value) {
            addCriterion("use_count_limit <=", value, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitLike(String value) {
            addCriterion("use_count_limit like", value, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitNotLike(String value) {
            addCriterion("use_count_limit not like", value, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitIn(List<String> values) {
            addCriterion("use_count_limit in", values, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitNotIn(List<String> values) {
            addCriterion("use_count_limit not in", values, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitBetween(String value1, String value2) {
            addCriterion("use_count_limit between", value1, value2, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andUseCountLimitNotBetween(String value1, String value2) {
            addCriterion("use_count_limit not between", value1, value2, "useCountLimit");
            return (Criteria) this;
        }

        public Criteria andFrontTemplateNameIsNull() {
            addCriterion("FRONT_TEMPLATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFrontTemplateNameIsNotNull() {
            addCriterion("FRONT_TEMPLATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFrontTemplateNameEqualTo(String value) {
            addCriterion("FRONT_TEMPLATE_NAME =", value, "frontTemplateName");
            return (Criteria) this;
        }

        public Criteria andFrontTemplateNameNotEqualTo(String value) {
            addCriterion("FRONT_TEMPLATE_NAME <>", value, "frontTemplateName");
            return (Criteria) this;
        }

        public Criteria andFrontTemplateNameGreaterThan(String value) {
            addCriterion("FRONT_TEMPLATE_NAME >", value, "frontTemplateName");
            return (Criteria) this;
        }

        public Criteria andFrontTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("FRONT_TEMPLATE_NAME >=", value, "frontTemplateName");
            return (Criteria) this;
        }

        public Criteria andFrontTemplateNameLessThan(String value) {
            addCriterion("FRONT_TEMPLATE_NAME <", value, "frontTemplateName");
            return (Criteria) this;
        }

        public Criteria andFrontTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("FRONT_TEMPLATE_NAME <=", value, "frontTemplateName");
            return (Criteria) this;
        }

        public Criteria andFrontTemplateNameLike(String value) {
            addCriterion("FRONT_TEMPLATE_NAME like", value, "frontTemplateName");
            return (Criteria) this;
        }

        public Criteria andFrontTemplateNameNotLike(String value) {
            addCriterion("FRONT_TEMPLATE_NAME not like", value, "frontTemplateName");
            return (Criteria) this;
        }

        public Criteria andFrontTemplateNameIn(List<String> values) {
            addCriterion("FRONT_TEMPLATE_NAME in", values, "frontTemplateName");
            return (Criteria) this;
        }

        public Criteria andFrontTemplateNameNotIn(List<String> values) {
            addCriterion("FRONT_TEMPLATE_NAME not in", values, "frontTemplateName");
            return (Criteria) this;
        }

        public Criteria andFrontTemplateNameBetween(String value1, String value2) {
            addCriterion("FRONT_TEMPLATE_NAME between", value1, value2, "frontTemplateName");
            return (Criteria) this;
        }

        public Criteria andFrontTemplateNameNotBetween(String value1, String value2) {
            addCriterion("FRONT_TEMPLATE_NAME not between", value1, value2, "frontTemplateName");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNull() {
            addCriterion("COUPON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNotNull() {
            addCriterion("COUPON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNameEqualTo(String value) {
            addCriterion("COUPON_NAME =", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotEqualTo(String value) {
            addCriterion("COUPON_NAME <>", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThan(String value) {
            addCriterion("COUPON_NAME >", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThanOrEqualTo(String value) {
            addCriterion("COUPON_NAME >=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThan(String value) {
            addCriterion("COUPON_NAME <", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThanOrEqualTo(String value) {
            addCriterion("COUPON_NAME <=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLike(String value) {
            addCriterion("COUPON_NAME like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotLike(String value) {
            addCriterion("COUPON_NAME not like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameIn(List<String> values) {
            addCriterion("COUPON_NAME in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotIn(List<String> values) {
            addCriterion("COUPON_NAME not in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameBetween(String value1, String value2) {
            addCriterion("COUPON_NAME between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotBetween(String value1, String value2) {
            addCriterion("COUPON_NAME not between", value1, value2, "couponName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}