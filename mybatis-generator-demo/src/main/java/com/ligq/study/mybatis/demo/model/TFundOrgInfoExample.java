package com.ligq.study.mybatis.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TFundOrgInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFundOrgInfoExample() {
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

        public Criteria andFundOrgCodeIsNull() {
            addCriterion("fund_org_code is null");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeIsNotNull() {
            addCriterion("fund_org_code is not null");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeEqualTo(String value) {
            addCriterion("fund_org_code =", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeNotEqualTo(String value) {
            addCriterion("fund_org_code <>", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeGreaterThan(String value) {
            addCriterion("fund_org_code >", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fund_org_code >=", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeLessThan(String value) {
            addCriterion("fund_org_code <", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("fund_org_code <=", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeLike(String value) {
            addCriterion("fund_org_code like", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeNotLike(String value) {
            addCriterion("fund_org_code not like", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeIn(List<String> values) {
            addCriterion("fund_org_code in", values, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeNotIn(List<String> values) {
            addCriterion("fund_org_code not in", values, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeBetween(String value1, String value2) {
            addCriterion("fund_org_code between", value1, value2, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeNotBetween(String value1, String value2) {
            addCriterion("fund_org_code not between", value1, value2, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameIsNull() {
            addCriterion("fund_org_name is null");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameIsNotNull() {
            addCriterion("fund_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameEqualTo(String value) {
            addCriterion("fund_org_name =", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameNotEqualTo(String value) {
            addCriterion("fund_org_name <>", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameGreaterThan(String value) {
            addCriterion("fund_org_name >", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("fund_org_name >=", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameLessThan(String value) {
            addCriterion("fund_org_name <", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameLessThanOrEqualTo(String value) {
            addCriterion("fund_org_name <=", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameLike(String value) {
            addCriterion("fund_org_name like", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameNotLike(String value) {
            addCriterion("fund_org_name not like", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameIn(List<String> values) {
            addCriterion("fund_org_name in", values, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameNotIn(List<String> values) {
            addCriterion("fund_org_name not in", values, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameBetween(String value1, String value2) {
            addCriterion("fund_org_name between", value1, value2, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameNotBetween(String value1, String value2) {
            addCriterion("fund_org_name not between", value1, value2, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundTypeIsNull() {
            addCriterion("fund_type is null");
            return (Criteria) this;
        }

        public Criteria andFundTypeIsNotNull() {
            addCriterion("fund_type is not null");
            return (Criteria) this;
        }

        public Criteria andFundTypeEqualTo(String value) {
            addCriterion("fund_type =", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotEqualTo(String value) {
            addCriterion("fund_type <>", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeGreaterThan(String value) {
            addCriterion("fund_type >", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fund_type >=", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeLessThan(String value) {
            addCriterion("fund_type <", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeLessThanOrEqualTo(String value) {
            addCriterion("fund_type <=", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeLike(String value) {
            addCriterion("fund_type like", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotLike(String value) {
            addCriterion("fund_type not like", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeIn(List<String> values) {
            addCriterion("fund_type in", values, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotIn(List<String> values) {
            addCriterion("fund_type not in", values, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeBetween(String value1, String value2) {
            addCriterion("fund_type between", value1, value2, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotBetween(String value1, String value2) {
            addCriterion("fund_type not between", value1, value2, "fundType");
            return (Criteria) this;
        }

        public Criteria andIsFrontIsNull() {
            addCriterion("is_front is null");
            return (Criteria) this;
        }

        public Criteria andIsFrontIsNotNull() {
            addCriterion("is_front is not null");
            return (Criteria) this;
        }

        public Criteria andIsFrontEqualTo(String value) {
            addCriterion("is_front =", value, "isFront");
            return (Criteria) this;
        }

        public Criteria andIsFrontNotEqualTo(String value) {
            addCriterion("is_front <>", value, "isFront");
            return (Criteria) this;
        }

        public Criteria andIsFrontGreaterThan(String value) {
            addCriterion("is_front >", value, "isFront");
            return (Criteria) this;
        }

        public Criteria andIsFrontGreaterThanOrEqualTo(String value) {
            addCriterion("is_front >=", value, "isFront");
            return (Criteria) this;
        }

        public Criteria andIsFrontLessThan(String value) {
            addCriterion("is_front <", value, "isFront");
            return (Criteria) this;
        }

        public Criteria andIsFrontLessThanOrEqualTo(String value) {
            addCriterion("is_front <=", value, "isFront");
            return (Criteria) this;
        }

        public Criteria andIsFrontLike(String value) {
            addCriterion("is_front like", value, "isFront");
            return (Criteria) this;
        }

        public Criteria andIsFrontNotLike(String value) {
            addCriterion("is_front not like", value, "isFront");
            return (Criteria) this;
        }

        public Criteria andIsFrontIn(List<String> values) {
            addCriterion("is_front in", values, "isFront");
            return (Criteria) this;
        }

        public Criteria andIsFrontNotIn(List<String> values) {
            addCriterion("is_front not in", values, "isFront");
            return (Criteria) this;
        }

        public Criteria andIsFrontBetween(String value1, String value2) {
            addCriterion("is_front between", value1, value2, "isFront");
            return (Criteria) this;
        }

        public Criteria andIsFrontNotBetween(String value1, String value2) {
            addCriterion("is_front not between", value1, value2, "isFront");
            return (Criteria) this;
        }

        public Criteria andCreditSumLimitIsNull() {
            addCriterion("credit_sum_limit is null");
            return (Criteria) this;
        }

        public Criteria andCreditSumLimitIsNotNull() {
            addCriterion("credit_sum_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditSumLimitEqualTo(Long value) {
            addCriterion("credit_sum_limit =", value, "creditSumLimit");
            return (Criteria) this;
        }

        public Criteria andCreditSumLimitNotEqualTo(Long value) {
            addCriterion("credit_sum_limit <>", value, "creditSumLimit");
            return (Criteria) this;
        }

        public Criteria andCreditSumLimitGreaterThan(Long value) {
            addCriterion("credit_sum_limit >", value, "creditSumLimit");
            return (Criteria) this;
        }

        public Criteria andCreditSumLimitGreaterThanOrEqualTo(Long value) {
            addCriterion("credit_sum_limit >=", value, "creditSumLimit");
            return (Criteria) this;
        }

        public Criteria andCreditSumLimitLessThan(Long value) {
            addCriterion("credit_sum_limit <", value, "creditSumLimit");
            return (Criteria) this;
        }

        public Criteria andCreditSumLimitLessThanOrEqualTo(Long value) {
            addCriterion("credit_sum_limit <=", value, "creditSumLimit");
            return (Criteria) this;
        }

        public Criteria andCreditSumLimitIn(List<Long> values) {
            addCriterion("credit_sum_limit in", values, "creditSumLimit");
            return (Criteria) this;
        }

        public Criteria andCreditSumLimitNotIn(List<Long> values) {
            addCriterion("credit_sum_limit not in", values, "creditSumLimit");
            return (Criteria) this;
        }

        public Criteria andCreditSumLimitBetween(Long value1, Long value2) {
            addCriterion("credit_sum_limit between", value1, value2, "creditSumLimit");
            return (Criteria) this;
        }

        public Criteria andCreditSumLimitNotBetween(Long value1, Long value2) {
            addCriterion("credit_sum_limit not between", value1, value2, "creditSumLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitIsNull() {
            addCriterion("available_limit is null");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitIsNotNull() {
            addCriterion("available_limit is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitEqualTo(Long value) {
            addCriterion("available_limit =", value, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitNotEqualTo(Long value) {
            addCriterion("available_limit <>", value, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitGreaterThan(Long value) {
            addCriterion("available_limit >", value, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitGreaterThanOrEqualTo(Long value) {
            addCriterion("available_limit >=", value, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitLessThan(Long value) {
            addCriterion("available_limit <", value, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitLessThanOrEqualTo(Long value) {
            addCriterion("available_limit <=", value, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitIn(List<Long> values) {
            addCriterion("available_limit in", values, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitNotIn(List<Long> values) {
            addCriterion("available_limit not in", values, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitBetween(Long value1, Long value2) {
            addCriterion("available_limit between", value1, value2, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitNotBetween(Long value1, Long value2) {
            addCriterion("available_limit not between", value1, value2, "availableLimit");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateIsNull() {
            addCriterion("limit_start_date is null");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateIsNotNull() {
            addCriterion("limit_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateEqualTo(String value) {
            addCriterion("limit_start_date =", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateNotEqualTo(String value) {
            addCriterion("limit_start_date <>", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateGreaterThan(String value) {
            addCriterion("limit_start_date >", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("limit_start_date >=", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateLessThan(String value) {
            addCriterion("limit_start_date <", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateLessThanOrEqualTo(String value) {
            addCriterion("limit_start_date <=", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateLike(String value) {
            addCriterion("limit_start_date like", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateNotLike(String value) {
            addCriterion("limit_start_date not like", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateIn(List<String> values) {
            addCriterion("limit_start_date in", values, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateNotIn(List<String> values) {
            addCriterion("limit_start_date not in", values, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateBetween(String value1, String value2) {
            addCriterion("limit_start_date between", value1, value2, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateNotBetween(String value1, String value2) {
            addCriterion("limit_start_date not between", value1, value2, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateIsNull() {
            addCriterion("limit_end_date is null");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateIsNotNull() {
            addCriterion("limit_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateEqualTo(String value) {
            addCriterion("limit_end_date =", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateNotEqualTo(String value) {
            addCriterion("limit_end_date <>", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateGreaterThan(String value) {
            addCriterion("limit_end_date >", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("limit_end_date >=", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateLessThan(String value) {
            addCriterion("limit_end_date <", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateLessThanOrEqualTo(String value) {
            addCriterion("limit_end_date <=", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateLike(String value) {
            addCriterion("limit_end_date like", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateNotLike(String value) {
            addCriterion("limit_end_date not like", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateIn(List<String> values) {
            addCriterion("limit_end_date in", values, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateNotIn(List<String> values) {
            addCriterion("limit_end_date not in", values, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateBetween(String value1, String value2) {
            addCriterion("limit_end_date between", value1, value2, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateNotBetween(String value1, String value2) {
            addCriterion("limit_end_date not between", value1, value2, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andCostRateIsNull() {
            addCriterion("cost_rate is null");
            return (Criteria) this;
        }

        public Criteria andCostRateIsNotNull() {
            addCriterion("cost_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCostRateEqualTo(Float value) {
            addCriterion("cost_rate =", value, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostRateNotEqualTo(Float value) {
            addCriterion("cost_rate <>", value, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostRateGreaterThan(Float value) {
            addCriterion("cost_rate >", value, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostRateGreaterThanOrEqualTo(Float value) {
            addCriterion("cost_rate >=", value, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostRateLessThan(Float value) {
            addCriterion("cost_rate <", value, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostRateLessThanOrEqualTo(Float value) {
            addCriterion("cost_rate <=", value, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostRateIn(List<Float> values) {
            addCriterion("cost_rate in", values, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostRateNotIn(List<Float> values) {
            addCriterion("cost_rate not in", values, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostRateBetween(Float value1, Float value2) {
            addCriterion("cost_rate between", value1, value2, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostRateNotBetween(Float value1, Float value2) {
            addCriterion("cost_rate not between", value1, value2, "costRate");
            return (Criteria) this;
        }

        public Criteria andCostTypeIsNull() {
            addCriterion("cost_type is null");
            return (Criteria) this;
        }

        public Criteria andCostTypeIsNotNull() {
            addCriterion("cost_type is not null");
            return (Criteria) this;
        }

        public Criteria andCostTypeEqualTo(String value) {
            addCriterion("cost_type =", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotEqualTo(String value) {
            addCriterion("cost_type <>", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeGreaterThan(String value) {
            addCriterion("cost_type >", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cost_type >=", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeLessThan(String value) {
            addCriterion("cost_type <", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeLessThanOrEqualTo(String value) {
            addCriterion("cost_type <=", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeLike(String value) {
            addCriterion("cost_type like", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotLike(String value) {
            addCriterion("cost_type not like", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeIn(List<String> values) {
            addCriterion("cost_type in", values, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotIn(List<String> values) {
            addCriterion("cost_type not in", values, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeBetween(String value1, String value2) {
            addCriterion("cost_type between", value1, value2, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotBetween(String value1, String value2) {
            addCriterion("cost_type not between", value1, value2, "costType");
            return (Criteria) this;
        }

        public Criteria andLimitMgmIsNull() {
            addCriterion("limit_mgm is null");
            return (Criteria) this;
        }

        public Criteria andLimitMgmIsNotNull() {
            addCriterion("limit_mgm is not null");
            return (Criteria) this;
        }

        public Criteria andLimitMgmEqualTo(String value) {
            addCriterion("limit_mgm =", value, "limitMgm");
            return (Criteria) this;
        }

        public Criteria andLimitMgmNotEqualTo(String value) {
            addCriterion("limit_mgm <>", value, "limitMgm");
            return (Criteria) this;
        }

        public Criteria andLimitMgmGreaterThan(String value) {
            addCriterion("limit_mgm >", value, "limitMgm");
            return (Criteria) this;
        }

        public Criteria andLimitMgmGreaterThanOrEqualTo(String value) {
            addCriterion("limit_mgm >=", value, "limitMgm");
            return (Criteria) this;
        }

        public Criteria andLimitMgmLessThan(String value) {
            addCriterion("limit_mgm <", value, "limitMgm");
            return (Criteria) this;
        }

        public Criteria andLimitMgmLessThanOrEqualTo(String value) {
            addCriterion("limit_mgm <=", value, "limitMgm");
            return (Criteria) this;
        }

        public Criteria andLimitMgmLike(String value) {
            addCriterion("limit_mgm like", value, "limitMgm");
            return (Criteria) this;
        }

        public Criteria andLimitMgmNotLike(String value) {
            addCriterion("limit_mgm not like", value, "limitMgm");
            return (Criteria) this;
        }

        public Criteria andLimitMgmIn(List<String> values) {
            addCriterion("limit_mgm in", values, "limitMgm");
            return (Criteria) this;
        }

        public Criteria andLimitMgmNotIn(List<String> values) {
            addCriterion("limit_mgm not in", values, "limitMgm");
            return (Criteria) this;
        }

        public Criteria andLimitMgmBetween(String value1, String value2) {
            addCriterion("limit_mgm between", value1, value2, "limitMgm");
            return (Criteria) this;
        }

        public Criteria andLimitMgmNotBetween(String value1, String value2) {
            addCriterion("limit_mgm not between", value1, value2, "limitMgm");
            return (Criteria) this;
        }

        public Criteria andSupportTrialIsNull() {
            addCriterion("support_trial is null");
            return (Criteria) this;
        }

        public Criteria andSupportTrialIsNotNull() {
            addCriterion("support_trial is not null");
            return (Criteria) this;
        }

        public Criteria andSupportTrialEqualTo(String value) {
            addCriterion("support_trial =", value, "supportTrial");
            return (Criteria) this;
        }

        public Criteria andSupportTrialNotEqualTo(String value) {
            addCriterion("support_trial <>", value, "supportTrial");
            return (Criteria) this;
        }

        public Criteria andSupportTrialGreaterThan(String value) {
            addCriterion("support_trial >", value, "supportTrial");
            return (Criteria) this;
        }

        public Criteria andSupportTrialGreaterThanOrEqualTo(String value) {
            addCriterion("support_trial >=", value, "supportTrial");
            return (Criteria) this;
        }

        public Criteria andSupportTrialLessThan(String value) {
            addCriterion("support_trial <", value, "supportTrial");
            return (Criteria) this;
        }

        public Criteria andSupportTrialLessThanOrEqualTo(String value) {
            addCriterion("support_trial <=", value, "supportTrial");
            return (Criteria) this;
        }

        public Criteria andSupportTrialLike(String value) {
            addCriterion("support_trial like", value, "supportTrial");
            return (Criteria) this;
        }

        public Criteria andSupportTrialNotLike(String value) {
            addCriterion("support_trial not like", value, "supportTrial");
            return (Criteria) this;
        }

        public Criteria andSupportTrialIn(List<String> values) {
            addCriterion("support_trial in", values, "supportTrial");
            return (Criteria) this;
        }

        public Criteria andSupportTrialNotIn(List<String> values) {
            addCriterion("support_trial not in", values, "supportTrial");
            return (Criteria) this;
        }

        public Criteria andSupportTrialBetween(String value1, String value2) {
            addCriterion("support_trial between", value1, value2, "supportTrial");
            return (Criteria) this;
        }

        public Criteria andSupportTrialNotBetween(String value1, String value2) {
            addCriterion("support_trial not between", value1, value2, "supportTrial");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitMgmIsNull() {
            addCriterion("available_limit_mgm is null");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitMgmIsNotNull() {
            addCriterion("available_limit_mgm is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitMgmEqualTo(String value) {
            addCriterion("available_limit_mgm =", value, "availableLimitMgm");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitMgmNotEqualTo(String value) {
            addCriterion("available_limit_mgm <>", value, "availableLimitMgm");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitMgmGreaterThan(String value) {
            addCriterion("available_limit_mgm >", value, "availableLimitMgm");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitMgmGreaterThanOrEqualTo(String value) {
            addCriterion("available_limit_mgm >=", value, "availableLimitMgm");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitMgmLessThan(String value) {
            addCriterion("available_limit_mgm <", value, "availableLimitMgm");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitMgmLessThanOrEqualTo(String value) {
            addCriterion("available_limit_mgm <=", value, "availableLimitMgm");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitMgmLike(String value) {
            addCriterion("available_limit_mgm like", value, "availableLimitMgm");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitMgmNotLike(String value) {
            addCriterion("available_limit_mgm not like", value, "availableLimitMgm");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitMgmIn(List<String> values) {
            addCriterion("available_limit_mgm in", values, "availableLimitMgm");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitMgmNotIn(List<String> values) {
            addCriterion("available_limit_mgm not in", values, "availableLimitMgm");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitMgmBetween(String value1, String value2) {
            addCriterion("available_limit_mgm between", value1, value2, "availableLimitMgm");
            return (Criteria) this;
        }

        public Criteria andAvailableLimitMgmNotBetween(String value1, String value2) {
            addCriterion("available_limit_mgm not between", value1, value2, "availableLimitMgm");
            return (Criteria) this;
        }

        public Criteria andContractParamProvideIsNull() {
            addCriterion("contract_param_provide is null");
            return (Criteria) this;
        }

        public Criteria andContractParamProvideIsNotNull() {
            addCriterion("contract_param_provide is not null");
            return (Criteria) this;
        }

        public Criteria andContractParamProvideEqualTo(String value) {
            addCriterion("contract_param_provide =", value, "contractParamProvide");
            return (Criteria) this;
        }

        public Criteria andContractParamProvideNotEqualTo(String value) {
            addCriterion("contract_param_provide <>", value, "contractParamProvide");
            return (Criteria) this;
        }

        public Criteria andContractParamProvideGreaterThan(String value) {
            addCriterion("contract_param_provide >", value, "contractParamProvide");
            return (Criteria) this;
        }

        public Criteria andContractParamProvideGreaterThanOrEqualTo(String value) {
            addCriterion("contract_param_provide >=", value, "contractParamProvide");
            return (Criteria) this;
        }

        public Criteria andContractParamProvideLessThan(String value) {
            addCriterion("contract_param_provide <", value, "contractParamProvide");
            return (Criteria) this;
        }

        public Criteria andContractParamProvideLessThanOrEqualTo(String value) {
            addCriterion("contract_param_provide <=", value, "contractParamProvide");
            return (Criteria) this;
        }

        public Criteria andContractParamProvideLike(String value) {
            addCriterion("contract_param_provide like", value, "contractParamProvide");
            return (Criteria) this;
        }

        public Criteria andContractParamProvideNotLike(String value) {
            addCriterion("contract_param_provide not like", value, "contractParamProvide");
            return (Criteria) this;
        }

        public Criteria andContractParamProvideIn(List<String> values) {
            addCriterion("contract_param_provide in", values, "contractParamProvide");
            return (Criteria) this;
        }

        public Criteria andContractParamProvideNotIn(List<String> values) {
            addCriterion("contract_param_provide not in", values, "contractParamProvide");
            return (Criteria) this;
        }

        public Criteria andContractParamProvideBetween(String value1, String value2) {
            addCriterion("contract_param_provide between", value1, value2, "contractParamProvide");
            return (Criteria) this;
        }

        public Criteria andContractParamProvideNotBetween(String value1, String value2) {
            addCriterion("contract_param_provide not between", value1, value2, "contractParamProvide");
            return (Criteria) this;
        }

        public Criteria andContractCreateObjIsNull() {
            addCriterion("contract_create_obj is null");
            return (Criteria) this;
        }

        public Criteria andContractCreateObjIsNotNull() {
            addCriterion("contract_create_obj is not null");
            return (Criteria) this;
        }

        public Criteria andContractCreateObjEqualTo(String value) {
            addCriterion("contract_create_obj =", value, "contractCreateObj");
            return (Criteria) this;
        }

        public Criteria andContractCreateObjNotEqualTo(String value) {
            addCriterion("contract_create_obj <>", value, "contractCreateObj");
            return (Criteria) this;
        }

        public Criteria andContractCreateObjGreaterThan(String value) {
            addCriterion("contract_create_obj >", value, "contractCreateObj");
            return (Criteria) this;
        }

        public Criteria andContractCreateObjGreaterThanOrEqualTo(String value) {
            addCriterion("contract_create_obj >=", value, "contractCreateObj");
            return (Criteria) this;
        }

        public Criteria andContractCreateObjLessThan(String value) {
            addCriterion("contract_create_obj <", value, "contractCreateObj");
            return (Criteria) this;
        }

        public Criteria andContractCreateObjLessThanOrEqualTo(String value) {
            addCriterion("contract_create_obj <=", value, "contractCreateObj");
            return (Criteria) this;
        }

        public Criteria andContractCreateObjLike(String value) {
            addCriterion("contract_create_obj like", value, "contractCreateObj");
            return (Criteria) this;
        }

        public Criteria andContractCreateObjNotLike(String value) {
            addCriterion("contract_create_obj not like", value, "contractCreateObj");
            return (Criteria) this;
        }

        public Criteria andContractCreateObjIn(List<String> values) {
            addCriterion("contract_create_obj in", values, "contractCreateObj");
            return (Criteria) this;
        }

        public Criteria andContractCreateObjNotIn(List<String> values) {
            addCriterion("contract_create_obj not in", values, "contractCreateObj");
            return (Criteria) this;
        }

        public Criteria andContractCreateObjBetween(String value1, String value2) {
            addCriterion("contract_create_obj between", value1, value2, "contractCreateObj");
            return (Criteria) this;
        }

        public Criteria andContractCreateObjNotBetween(String value1, String value2) {
            addCriterion("contract_create_obj not between", value1, value2, "contractCreateObj");
            return (Criteria) this;
        }

        public Criteria andContractSignObjIsNull() {
            addCriterion("contract_sign_obj is null");
            return (Criteria) this;
        }

        public Criteria andContractSignObjIsNotNull() {
            addCriterion("contract_sign_obj is not null");
            return (Criteria) this;
        }

        public Criteria andContractSignObjEqualTo(String value) {
            addCriterion("contract_sign_obj =", value, "contractSignObj");
            return (Criteria) this;
        }

        public Criteria andContractSignObjNotEqualTo(String value) {
            addCriterion("contract_sign_obj <>", value, "contractSignObj");
            return (Criteria) this;
        }

        public Criteria andContractSignObjGreaterThan(String value) {
            addCriterion("contract_sign_obj >", value, "contractSignObj");
            return (Criteria) this;
        }

        public Criteria andContractSignObjGreaterThanOrEqualTo(String value) {
            addCriterion("contract_sign_obj >=", value, "contractSignObj");
            return (Criteria) this;
        }

        public Criteria andContractSignObjLessThan(String value) {
            addCriterion("contract_sign_obj <", value, "contractSignObj");
            return (Criteria) this;
        }

        public Criteria andContractSignObjLessThanOrEqualTo(String value) {
            addCriterion("contract_sign_obj <=", value, "contractSignObj");
            return (Criteria) this;
        }

        public Criteria andContractSignObjLike(String value) {
            addCriterion("contract_sign_obj like", value, "contractSignObj");
            return (Criteria) this;
        }

        public Criteria andContractSignObjNotLike(String value) {
            addCriterion("contract_sign_obj not like", value, "contractSignObj");
            return (Criteria) this;
        }

        public Criteria andContractSignObjIn(List<String> values) {
            addCriterion("contract_sign_obj in", values, "contractSignObj");
            return (Criteria) this;
        }

        public Criteria andContractSignObjNotIn(List<String> values) {
            addCriterion("contract_sign_obj not in", values, "contractSignObj");
            return (Criteria) this;
        }

        public Criteria andContractSignObjBetween(String value1, String value2) {
            addCriterion("contract_sign_obj between", value1, value2, "contractSignObj");
            return (Criteria) this;
        }

        public Criteria andContractSignObjNotBetween(String value1, String value2) {
            addCriterion("contract_sign_obj not between", value1, value2, "contractSignObj");
            return (Criteria) this;
        }

        public Criteria andContactSyncIsNull() {
            addCriterion("contact_sync is null");
            return (Criteria) this;
        }

        public Criteria andContactSyncIsNotNull() {
            addCriterion("contact_sync is not null");
            return (Criteria) this;
        }

        public Criteria andContactSyncEqualTo(String value) {
            addCriterion("contact_sync =", value, "contactSync");
            return (Criteria) this;
        }

        public Criteria andContactSyncNotEqualTo(String value) {
            addCriterion("contact_sync <>", value, "contactSync");
            return (Criteria) this;
        }

        public Criteria andContactSyncGreaterThan(String value) {
            addCriterion("contact_sync >", value, "contactSync");
            return (Criteria) this;
        }

        public Criteria andContactSyncGreaterThanOrEqualTo(String value) {
            addCriterion("contact_sync >=", value, "contactSync");
            return (Criteria) this;
        }

        public Criteria andContactSyncLessThan(String value) {
            addCriterion("contact_sync <", value, "contactSync");
            return (Criteria) this;
        }

        public Criteria andContactSyncLessThanOrEqualTo(String value) {
            addCriterion("contact_sync <=", value, "contactSync");
            return (Criteria) this;
        }

        public Criteria andContactSyncLike(String value) {
            addCriterion("contact_sync like", value, "contactSync");
            return (Criteria) this;
        }

        public Criteria andContactSyncNotLike(String value) {
            addCriterion("contact_sync not like", value, "contactSync");
            return (Criteria) this;
        }

        public Criteria andContactSyncIn(List<String> values) {
            addCriterion("contact_sync in", values, "contactSync");
            return (Criteria) this;
        }

        public Criteria andContactSyncNotIn(List<String> values) {
            addCriterion("contact_sync not in", values, "contactSync");
            return (Criteria) this;
        }

        public Criteria andContactSyncBetween(String value1, String value2) {
            addCriterion("contact_sync between", value1, value2, "contactSync");
            return (Criteria) this;
        }

        public Criteria andContactSyncNotBetween(String value1, String value2) {
            addCriterion("contact_sync not between", value1, value2, "contactSync");
            return (Criteria) this;
        }

        public Criteria andWithholdObjIsNull() {
            addCriterion("withhold_obj is null");
            return (Criteria) this;
        }

        public Criteria andWithholdObjIsNotNull() {
            addCriterion("withhold_obj is not null");
            return (Criteria) this;
        }

        public Criteria andWithholdObjEqualTo(String value) {
            addCriterion("withhold_obj =", value, "withholdObj");
            return (Criteria) this;
        }

        public Criteria andWithholdObjNotEqualTo(String value) {
            addCriterion("withhold_obj <>", value, "withholdObj");
            return (Criteria) this;
        }

        public Criteria andWithholdObjGreaterThan(String value) {
            addCriterion("withhold_obj >", value, "withholdObj");
            return (Criteria) this;
        }

        public Criteria andWithholdObjGreaterThanOrEqualTo(String value) {
            addCriterion("withhold_obj >=", value, "withholdObj");
            return (Criteria) this;
        }

        public Criteria andWithholdObjLessThan(String value) {
            addCriterion("withhold_obj <", value, "withholdObj");
            return (Criteria) this;
        }

        public Criteria andWithholdObjLessThanOrEqualTo(String value) {
            addCriterion("withhold_obj <=", value, "withholdObj");
            return (Criteria) this;
        }

        public Criteria andWithholdObjLike(String value) {
            addCriterion("withhold_obj like", value, "withholdObj");
            return (Criteria) this;
        }

        public Criteria andWithholdObjNotLike(String value) {
            addCriterion("withhold_obj not like", value, "withholdObj");
            return (Criteria) this;
        }

        public Criteria andWithholdObjIn(List<String> values) {
            addCriterion("withhold_obj in", values, "withholdObj");
            return (Criteria) this;
        }

        public Criteria andWithholdObjNotIn(List<String> values) {
            addCriterion("withhold_obj not in", values, "withholdObj");
            return (Criteria) this;
        }

        public Criteria andWithholdObjBetween(String value1, String value2) {
            addCriterion("withhold_obj between", value1, value2, "withholdObj");
            return (Criteria) this;
        }

        public Criteria andWithholdObjNotBetween(String value1, String value2) {
            addCriterion("withhold_obj not between", value1, value2, "withholdObj");
            return (Criteria) this;
        }

        public Criteria andRepayPlanSyncIsNull() {
            addCriterion("repay_plan_sync is null");
            return (Criteria) this;
        }

        public Criteria andRepayPlanSyncIsNotNull() {
            addCriterion("repay_plan_sync is not null");
            return (Criteria) this;
        }

        public Criteria andRepayPlanSyncEqualTo(String value) {
            addCriterion("repay_plan_sync =", value, "repayPlanSync");
            return (Criteria) this;
        }

        public Criteria andRepayPlanSyncNotEqualTo(String value) {
            addCriterion("repay_plan_sync <>", value, "repayPlanSync");
            return (Criteria) this;
        }

        public Criteria andRepayPlanSyncGreaterThan(String value) {
            addCriterion("repay_plan_sync >", value, "repayPlanSync");
            return (Criteria) this;
        }

        public Criteria andRepayPlanSyncGreaterThanOrEqualTo(String value) {
            addCriterion("repay_plan_sync >=", value, "repayPlanSync");
            return (Criteria) this;
        }

        public Criteria andRepayPlanSyncLessThan(String value) {
            addCriterion("repay_plan_sync <", value, "repayPlanSync");
            return (Criteria) this;
        }

        public Criteria andRepayPlanSyncLessThanOrEqualTo(String value) {
            addCriterion("repay_plan_sync <=", value, "repayPlanSync");
            return (Criteria) this;
        }

        public Criteria andRepayPlanSyncLike(String value) {
            addCriterion("repay_plan_sync like", value, "repayPlanSync");
            return (Criteria) this;
        }

        public Criteria andRepayPlanSyncNotLike(String value) {
            addCriterion("repay_plan_sync not like", value, "repayPlanSync");
            return (Criteria) this;
        }

        public Criteria andRepayPlanSyncIn(List<String> values) {
            addCriterion("repay_plan_sync in", values, "repayPlanSync");
            return (Criteria) this;
        }

        public Criteria andRepayPlanSyncNotIn(List<String> values) {
            addCriterion("repay_plan_sync not in", values, "repayPlanSync");
            return (Criteria) this;
        }

        public Criteria andRepayPlanSyncBetween(String value1, String value2) {
            addCriterion("repay_plan_sync between", value1, value2, "repayPlanSync");
            return (Criteria) this;
        }

        public Criteria andRepayPlanSyncNotBetween(String value1, String value2) {
            addCriterion("repay_plan_sync not between", value1, value2, "repayPlanSync");
            return (Criteria) this;
        }

        public Criteria andIsSettleIsNull() {
            addCriterion("is_settle is null");
            return (Criteria) this;
        }

        public Criteria andIsSettleIsNotNull() {
            addCriterion("is_settle is not null");
            return (Criteria) this;
        }

        public Criteria andIsSettleEqualTo(String value) {
            addCriterion("is_settle =", value, "isSettle");
            return (Criteria) this;
        }

        public Criteria andIsSettleNotEqualTo(String value) {
            addCriterion("is_settle <>", value, "isSettle");
            return (Criteria) this;
        }

        public Criteria andIsSettleGreaterThan(String value) {
            addCriterion("is_settle >", value, "isSettle");
            return (Criteria) this;
        }

        public Criteria andIsSettleGreaterThanOrEqualTo(String value) {
            addCriterion("is_settle >=", value, "isSettle");
            return (Criteria) this;
        }

        public Criteria andIsSettleLessThan(String value) {
            addCriterion("is_settle <", value, "isSettle");
            return (Criteria) this;
        }

        public Criteria andIsSettleLessThanOrEqualTo(String value) {
            addCriterion("is_settle <=", value, "isSettle");
            return (Criteria) this;
        }

        public Criteria andIsSettleLike(String value) {
            addCriterion("is_settle like", value, "isSettle");
            return (Criteria) this;
        }

        public Criteria andIsSettleNotLike(String value) {
            addCriterion("is_settle not like", value, "isSettle");
            return (Criteria) this;
        }

        public Criteria andIsSettleIn(List<String> values) {
            addCriterion("is_settle in", values, "isSettle");
            return (Criteria) this;
        }

        public Criteria andIsSettleNotIn(List<String> values) {
            addCriterion("is_settle not in", values, "isSettle");
            return (Criteria) this;
        }

        public Criteria andIsSettleBetween(String value1, String value2) {
            addCriterion("is_settle between", value1, value2, "isSettle");
            return (Criteria) this;
        }

        public Criteria andIsSettleNotBetween(String value1, String value2) {
            addCriterion("is_settle not between", value1, value2, "isSettle");
            return (Criteria) this;
        }

        public Criteria andIsPartRepayIsNull() {
            addCriterion("is_part_repay is null");
            return (Criteria) this;
        }

        public Criteria andIsPartRepayIsNotNull() {
            addCriterion("is_part_repay is not null");
            return (Criteria) this;
        }

        public Criteria andIsPartRepayEqualTo(String value) {
            addCriterion("is_part_repay =", value, "isPartRepay");
            return (Criteria) this;
        }

        public Criteria andIsPartRepayNotEqualTo(String value) {
            addCriterion("is_part_repay <>", value, "isPartRepay");
            return (Criteria) this;
        }

        public Criteria andIsPartRepayGreaterThan(String value) {
            addCriterion("is_part_repay >", value, "isPartRepay");
            return (Criteria) this;
        }

        public Criteria andIsPartRepayGreaterThanOrEqualTo(String value) {
            addCriterion("is_part_repay >=", value, "isPartRepay");
            return (Criteria) this;
        }

        public Criteria andIsPartRepayLessThan(String value) {
            addCriterion("is_part_repay <", value, "isPartRepay");
            return (Criteria) this;
        }

        public Criteria andIsPartRepayLessThanOrEqualTo(String value) {
            addCriterion("is_part_repay <=", value, "isPartRepay");
            return (Criteria) this;
        }

        public Criteria andIsPartRepayLike(String value) {
            addCriterion("is_part_repay like", value, "isPartRepay");
            return (Criteria) this;
        }

        public Criteria andIsPartRepayNotLike(String value) {
            addCriterion("is_part_repay not like", value, "isPartRepay");
            return (Criteria) this;
        }

        public Criteria andIsPartRepayIn(List<String> values) {
            addCriterion("is_part_repay in", values, "isPartRepay");
            return (Criteria) this;
        }

        public Criteria andIsPartRepayNotIn(List<String> values) {
            addCriterion("is_part_repay not in", values, "isPartRepay");
            return (Criteria) this;
        }

        public Criteria andIsPartRepayBetween(String value1, String value2) {
            addCriterion("is_part_repay between", value1, value2, "isPartRepay");
            return (Criteria) this;
        }

        public Criteria andIsPartRepayNotBetween(String value1, String value2) {
            addCriterion("is_part_repay not between", value1, value2, "isPartRepay");
            return (Criteria) this;
        }

        public Criteria andRateRuleMgmIsNull() {
            addCriterion("rate_rule_mgm is null");
            return (Criteria) this;
        }

        public Criteria andRateRuleMgmIsNotNull() {
            addCriterion("rate_rule_mgm is not null");
            return (Criteria) this;
        }

        public Criteria andRateRuleMgmEqualTo(String value) {
            addCriterion("rate_rule_mgm =", value, "rateRuleMgm");
            return (Criteria) this;
        }

        public Criteria andRateRuleMgmNotEqualTo(String value) {
            addCriterion("rate_rule_mgm <>", value, "rateRuleMgm");
            return (Criteria) this;
        }

        public Criteria andRateRuleMgmGreaterThan(String value) {
            addCriterion("rate_rule_mgm >", value, "rateRuleMgm");
            return (Criteria) this;
        }

        public Criteria andRateRuleMgmGreaterThanOrEqualTo(String value) {
            addCriterion("rate_rule_mgm >=", value, "rateRuleMgm");
            return (Criteria) this;
        }

        public Criteria andRateRuleMgmLessThan(String value) {
            addCriterion("rate_rule_mgm <", value, "rateRuleMgm");
            return (Criteria) this;
        }

        public Criteria andRateRuleMgmLessThanOrEqualTo(String value) {
            addCriterion("rate_rule_mgm <=", value, "rateRuleMgm");
            return (Criteria) this;
        }

        public Criteria andRateRuleMgmLike(String value) {
            addCriterion("rate_rule_mgm like", value, "rateRuleMgm");
            return (Criteria) this;
        }

        public Criteria andRateRuleMgmNotLike(String value) {
            addCriterion("rate_rule_mgm not like", value, "rateRuleMgm");
            return (Criteria) this;
        }

        public Criteria andRateRuleMgmIn(List<String> values) {
            addCriterion("rate_rule_mgm in", values, "rateRuleMgm");
            return (Criteria) this;
        }

        public Criteria andRateRuleMgmNotIn(List<String> values) {
            addCriterion("rate_rule_mgm not in", values, "rateRuleMgm");
            return (Criteria) this;
        }

        public Criteria andRateRuleMgmBetween(String value1, String value2) {
            addCriterion("rate_rule_mgm between", value1, value2, "rateRuleMgm");
            return (Criteria) this;
        }

        public Criteria andRateRuleMgmNotBetween(String value1, String value2) {
            addCriterion("rate_rule_mgm not between", value1, value2, "rateRuleMgm");
            return (Criteria) this;
        }

        public Criteria andIsLimitLoopIsNull() {
            addCriterion("is_limit_loop is null");
            return (Criteria) this;
        }

        public Criteria andIsLimitLoopIsNotNull() {
            addCriterion("is_limit_loop is not null");
            return (Criteria) this;
        }

        public Criteria andIsLimitLoopEqualTo(String value) {
            addCriterion("is_limit_loop =", value, "isLimitLoop");
            return (Criteria) this;
        }

        public Criteria andIsLimitLoopNotEqualTo(String value) {
            addCriterion("is_limit_loop <>", value, "isLimitLoop");
            return (Criteria) this;
        }

        public Criteria andIsLimitLoopGreaterThan(String value) {
            addCriterion("is_limit_loop >", value, "isLimitLoop");
            return (Criteria) this;
        }

        public Criteria andIsLimitLoopGreaterThanOrEqualTo(String value) {
            addCriterion("is_limit_loop >=", value, "isLimitLoop");
            return (Criteria) this;
        }

        public Criteria andIsLimitLoopLessThan(String value) {
            addCriterion("is_limit_loop <", value, "isLimitLoop");
            return (Criteria) this;
        }

        public Criteria andIsLimitLoopLessThanOrEqualTo(String value) {
            addCriterion("is_limit_loop <=", value, "isLimitLoop");
            return (Criteria) this;
        }

        public Criteria andIsLimitLoopLike(String value) {
            addCriterion("is_limit_loop like", value, "isLimitLoop");
            return (Criteria) this;
        }

        public Criteria andIsLimitLoopNotLike(String value) {
            addCriterion("is_limit_loop not like", value, "isLimitLoop");
            return (Criteria) this;
        }

        public Criteria andIsLimitLoopIn(List<String> values) {
            addCriterion("is_limit_loop in", values, "isLimitLoop");
            return (Criteria) this;
        }

        public Criteria andIsLimitLoopNotIn(List<String> values) {
            addCriterion("is_limit_loop not in", values, "isLimitLoop");
            return (Criteria) this;
        }

        public Criteria andIsLimitLoopBetween(String value1, String value2) {
            addCriterion("is_limit_loop between", value1, value2, "isLimitLoop");
            return (Criteria) this;
        }

        public Criteria andIsLimitLoopNotBetween(String value1, String value2) {
            addCriterion("is_limit_loop not between", value1, value2, "isLimitLoop");
            return (Criteria) this;
        }

        public Criteria andCompensatoryIsNull() {
            addCriterion("compensatory is null");
            return (Criteria) this;
        }

        public Criteria andCompensatoryIsNotNull() {
            addCriterion("compensatory is not null");
            return (Criteria) this;
        }

        public Criteria andCompensatoryEqualTo(String value) {
            addCriterion("compensatory =", value, "compensatory");
            return (Criteria) this;
        }

        public Criteria andCompensatoryNotEqualTo(String value) {
            addCriterion("compensatory <>", value, "compensatory");
            return (Criteria) this;
        }

        public Criteria andCompensatoryGreaterThan(String value) {
            addCriterion("compensatory >", value, "compensatory");
            return (Criteria) this;
        }

        public Criteria andCompensatoryGreaterThanOrEqualTo(String value) {
            addCriterion("compensatory >=", value, "compensatory");
            return (Criteria) this;
        }

        public Criteria andCompensatoryLessThan(String value) {
            addCriterion("compensatory <", value, "compensatory");
            return (Criteria) this;
        }

        public Criteria andCompensatoryLessThanOrEqualTo(String value) {
            addCriterion("compensatory <=", value, "compensatory");
            return (Criteria) this;
        }

        public Criteria andCompensatoryLike(String value) {
            addCriterion("compensatory like", value, "compensatory");
            return (Criteria) this;
        }

        public Criteria andCompensatoryNotLike(String value) {
            addCriterion("compensatory not like", value, "compensatory");
            return (Criteria) this;
        }

        public Criteria andCompensatoryIn(List<String> values) {
            addCriterion("compensatory in", values, "compensatory");
            return (Criteria) this;
        }

        public Criteria andCompensatoryNotIn(List<String> values) {
            addCriterion("compensatory not in", values, "compensatory");
            return (Criteria) this;
        }

        public Criteria andCompensatoryBetween(String value1, String value2) {
            addCriterion("compensatory between", value1, value2, "compensatory");
            return (Criteria) this;
        }

        public Criteria andCompensatoryNotBetween(String value1, String value2) {
            addCriterion("compensatory not between", value1, value2, "compensatory");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNoIsNull() {
            addCriterion("company_no is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNoIsNotNull() {
            addCriterion("company_no is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNoEqualTo(String value) {
            addCriterion("company_no =", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoNotEqualTo(String value) {
            addCriterion("company_no <>", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoGreaterThan(String value) {
            addCriterion("company_no >", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoGreaterThanOrEqualTo(String value) {
            addCriterion("company_no >=", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoLessThan(String value) {
            addCriterion("company_no <", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoLessThanOrEqualTo(String value) {
            addCriterion("company_no <=", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoLike(String value) {
            addCriterion("company_no like", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoNotLike(String value) {
            addCriterion("company_no not like", value, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoIn(List<String> values) {
            addCriterion("company_no in", values, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoNotIn(List<String> values) {
            addCriterion("company_no not in", values, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoBetween(String value1, String value2) {
            addCriterion("company_no between", value1, value2, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyNoNotBetween(String value1, String value2) {
            addCriterion("company_no not between", value1, value2, "companyNo");
            return (Criteria) this;
        }

        public Criteria andCompanyAddIsNull() {
            addCriterion("company_add is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddIsNotNull() {
            addCriterion("company_add is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddEqualTo(String value) {
            addCriterion("company_add =", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddNotEqualTo(String value) {
            addCriterion("company_add <>", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddGreaterThan(String value) {
            addCriterion("company_add >", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddGreaterThanOrEqualTo(String value) {
            addCriterion("company_add >=", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddLessThan(String value) {
            addCriterion("company_add <", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddLessThanOrEqualTo(String value) {
            addCriterion("company_add <=", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddLike(String value) {
            addCriterion("company_add like", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddNotLike(String value) {
            addCriterion("company_add not like", value, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddIn(List<String> values) {
            addCriterion("company_add in", values, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddNotIn(List<String> values) {
            addCriterion("company_add not in", values, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddBetween(String value1, String value2) {
            addCriterion("company_add between", value1, value2, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyAddNotBetween(String value1, String value2) {
            addCriterion("company_add not between", value1, value2, "companyAdd");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkNameIsNull() {
            addCriterion("company_link_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkNameIsNotNull() {
            addCriterion("company_link_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkNameEqualTo(String value) {
            addCriterion("company_link_name =", value, "companyLinkName");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkNameNotEqualTo(String value) {
            addCriterion("company_link_name <>", value, "companyLinkName");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkNameGreaterThan(String value) {
            addCriterion("company_link_name >", value, "companyLinkName");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_link_name >=", value, "companyLinkName");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkNameLessThan(String value) {
            addCriterion("company_link_name <", value, "companyLinkName");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkNameLessThanOrEqualTo(String value) {
            addCriterion("company_link_name <=", value, "companyLinkName");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkNameLike(String value) {
            addCriterion("company_link_name like", value, "companyLinkName");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkNameNotLike(String value) {
            addCriterion("company_link_name not like", value, "companyLinkName");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkNameIn(List<String> values) {
            addCriterion("company_link_name in", values, "companyLinkName");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkNameNotIn(List<String> values) {
            addCriterion("company_link_name not in", values, "companyLinkName");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkNameBetween(String value1, String value2) {
            addCriterion("company_link_name between", value1, value2, "companyLinkName");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkNameNotBetween(String value1, String value2) {
            addCriterion("company_link_name not between", value1, value2, "companyLinkName");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkPhoneIsNull() {
            addCriterion("company_link_phone is null");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkPhoneIsNotNull() {
            addCriterion("company_link_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkPhoneEqualTo(String value) {
            addCriterion("company_link_phone =", value, "companyLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkPhoneNotEqualTo(String value) {
            addCriterion("company_link_phone <>", value, "companyLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkPhoneGreaterThan(String value) {
            addCriterion("company_link_phone >", value, "companyLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("company_link_phone >=", value, "companyLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkPhoneLessThan(String value) {
            addCriterion("company_link_phone <", value, "companyLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkPhoneLessThanOrEqualTo(String value) {
            addCriterion("company_link_phone <=", value, "companyLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkPhoneLike(String value) {
            addCriterion("company_link_phone like", value, "companyLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkPhoneNotLike(String value) {
            addCriterion("company_link_phone not like", value, "companyLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkPhoneIn(List<String> values) {
            addCriterion("company_link_phone in", values, "companyLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkPhoneNotIn(List<String> values) {
            addCriterion("company_link_phone not in", values, "companyLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkPhoneBetween(String value1, String value2) {
            addCriterion("company_link_phone between", value1, value2, "companyLinkPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyLinkPhoneNotBetween(String value1, String value2) {
            addCriterion("company_link_phone not between", value1, value2, "companyLinkPhone");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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