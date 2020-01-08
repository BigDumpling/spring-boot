package com.ligq.study.mybatis.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TProductInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TProductInfoExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("PRODUCT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("PRODUCT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("PRODUCT_CODE =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("PRODUCT_CODE <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("PRODUCT_CODE >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CODE >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("PRODUCT_CODE <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CODE <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("PRODUCT_CODE like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("PRODUCT_CODE not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("PRODUCT_CODE in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("PRODUCT_CODE not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("PRODUCT_CODE between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_CODE not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
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

        public Criteria andProductTypeIsNull() {
            addCriterion("PRODUCT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("PRODUCT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("PRODUCT_TYPE =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("PRODUCT_TYPE <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("PRODUCT_TYPE >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("PRODUCT_TYPE <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("PRODUCT_TYPE like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("PRODUCT_TYPE not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("PRODUCT_TYPE in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("PRODUCT_TYPE not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andStandardPriceRateIsNull() {
            addCriterion("STANDARD_PRICE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andStandardPriceRateIsNotNull() {
            addCriterion("STANDARD_PRICE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andStandardPriceRateEqualTo(Float value) {
            addCriterion("STANDARD_PRICE_RATE =", value, "standardPriceRate");
            return (Criteria) this;
        }

        public Criteria andStandardPriceRateNotEqualTo(Float value) {
            addCriterion("STANDARD_PRICE_RATE <>", value, "standardPriceRate");
            return (Criteria) this;
        }

        public Criteria andStandardPriceRateGreaterThan(Float value) {
            addCriterion("STANDARD_PRICE_RATE >", value, "standardPriceRate");
            return (Criteria) this;
        }

        public Criteria andStandardPriceRateGreaterThanOrEqualTo(Float value) {
            addCriterion("STANDARD_PRICE_RATE >=", value, "standardPriceRate");
            return (Criteria) this;
        }

        public Criteria andStandardPriceRateLessThan(Float value) {
            addCriterion("STANDARD_PRICE_RATE <", value, "standardPriceRate");
            return (Criteria) this;
        }

        public Criteria andStandardPriceRateLessThanOrEqualTo(Float value) {
            addCriterion("STANDARD_PRICE_RATE <=", value, "standardPriceRate");
            return (Criteria) this;
        }

        public Criteria andStandardPriceRateIn(List<Float> values) {
            addCriterion("STANDARD_PRICE_RATE in", values, "standardPriceRate");
            return (Criteria) this;
        }

        public Criteria andStandardPriceRateNotIn(List<Float> values) {
            addCriterion("STANDARD_PRICE_RATE not in", values, "standardPriceRate");
            return (Criteria) this;
        }

        public Criteria andStandardPriceRateBetween(Float value1, Float value2) {
            addCriterion("STANDARD_PRICE_RATE between", value1, value2, "standardPriceRate");
            return (Criteria) this;
        }

        public Criteria andStandardPriceRateNotBetween(Float value1, Float value2) {
            addCriterion("STANDARD_PRICE_RATE not between", value1, value2, "standardPriceRate");
            return (Criteria) this;
        }

        public Criteria andPlatfontPriceRateIsNull() {
            addCriterion("PLATFONT_PRICE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPlatfontPriceRateIsNotNull() {
            addCriterion("PLATFONT_PRICE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlatfontPriceRateEqualTo(Float value) {
            addCriterion("PLATFONT_PRICE_RATE =", value, "platfontPriceRate");
            return (Criteria) this;
        }

        public Criteria andPlatfontPriceRateNotEqualTo(Float value) {
            addCriterion("PLATFONT_PRICE_RATE <>", value, "platfontPriceRate");
            return (Criteria) this;
        }

        public Criteria andPlatfontPriceRateGreaterThan(Float value) {
            addCriterion("PLATFONT_PRICE_RATE >", value, "platfontPriceRate");
            return (Criteria) this;
        }

        public Criteria andPlatfontPriceRateGreaterThanOrEqualTo(Float value) {
            addCriterion("PLATFONT_PRICE_RATE >=", value, "platfontPriceRate");
            return (Criteria) this;
        }

        public Criteria andPlatfontPriceRateLessThan(Float value) {
            addCriterion("PLATFONT_PRICE_RATE <", value, "platfontPriceRate");
            return (Criteria) this;
        }

        public Criteria andPlatfontPriceRateLessThanOrEqualTo(Float value) {
            addCriterion("PLATFONT_PRICE_RATE <=", value, "platfontPriceRate");
            return (Criteria) this;
        }

        public Criteria andPlatfontPriceRateIn(List<Float> values) {
            addCriterion("PLATFONT_PRICE_RATE in", values, "platfontPriceRate");
            return (Criteria) this;
        }

        public Criteria andPlatfontPriceRateNotIn(List<Float> values) {
            addCriterion("PLATFONT_PRICE_RATE not in", values, "platfontPriceRate");
            return (Criteria) this;
        }

        public Criteria andPlatfontPriceRateBetween(Float value1, Float value2) {
            addCriterion("PLATFONT_PRICE_RATE between", value1, value2, "platfontPriceRate");
            return (Criteria) this;
        }

        public Criteria andPlatfontPriceRateNotBetween(Float value1, Float value2) {
            addCriterion("PLATFONT_PRICE_RATE not between", value1, value2, "platfontPriceRate");
            return (Criteria) this;
        }

        public Criteria andFloorPriceRateIsNull() {
            addCriterion("FLOOR_PRICE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andFloorPriceRateIsNotNull() {
            addCriterion("FLOOR_PRICE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andFloorPriceRateEqualTo(Float value) {
            addCriterion("FLOOR_PRICE_RATE =", value, "floorPriceRate");
            return (Criteria) this;
        }

        public Criteria andFloorPriceRateNotEqualTo(Float value) {
            addCriterion("FLOOR_PRICE_RATE <>", value, "floorPriceRate");
            return (Criteria) this;
        }

        public Criteria andFloorPriceRateGreaterThan(Float value) {
            addCriterion("FLOOR_PRICE_RATE >", value, "floorPriceRate");
            return (Criteria) this;
        }

        public Criteria andFloorPriceRateGreaterThanOrEqualTo(Float value) {
            addCriterion("FLOOR_PRICE_RATE >=", value, "floorPriceRate");
            return (Criteria) this;
        }

        public Criteria andFloorPriceRateLessThan(Float value) {
            addCriterion("FLOOR_PRICE_RATE <", value, "floorPriceRate");
            return (Criteria) this;
        }

        public Criteria andFloorPriceRateLessThanOrEqualTo(Float value) {
            addCriterion("FLOOR_PRICE_RATE <=", value, "floorPriceRate");
            return (Criteria) this;
        }

        public Criteria andFloorPriceRateIn(List<Float> values) {
            addCriterion("FLOOR_PRICE_RATE in", values, "floorPriceRate");
            return (Criteria) this;
        }

        public Criteria andFloorPriceRateNotIn(List<Float> values) {
            addCriterion("FLOOR_PRICE_RATE not in", values, "floorPriceRate");
            return (Criteria) this;
        }

        public Criteria andFloorPriceRateBetween(Float value1, Float value2) {
            addCriterion("FLOOR_PRICE_RATE between", value1, value2, "floorPriceRate");
            return (Criteria) this;
        }

        public Criteria andFloorPriceRateNotBetween(Float value1, Float value2) {
            addCriterion("FLOOR_PRICE_RATE not between", value1, value2, "floorPriceRate");
            return (Criteria) this;
        }

        public Criteria andYearInterestDaysIsNull() {
            addCriterion("YEAR_INTEREST_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andYearInterestDaysIsNotNull() {
            addCriterion("YEAR_INTEREST_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andYearInterestDaysEqualTo(Integer value) {
            addCriterion("YEAR_INTEREST_DAYS =", value, "yearInterestDays");
            return (Criteria) this;
        }

        public Criteria andYearInterestDaysNotEqualTo(Integer value) {
            addCriterion("YEAR_INTEREST_DAYS <>", value, "yearInterestDays");
            return (Criteria) this;
        }

        public Criteria andYearInterestDaysGreaterThan(Integer value) {
            addCriterion("YEAR_INTEREST_DAYS >", value, "yearInterestDays");
            return (Criteria) this;
        }

        public Criteria andYearInterestDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("YEAR_INTEREST_DAYS >=", value, "yearInterestDays");
            return (Criteria) this;
        }

        public Criteria andYearInterestDaysLessThan(Integer value) {
            addCriterion("YEAR_INTEREST_DAYS <", value, "yearInterestDays");
            return (Criteria) this;
        }

        public Criteria andYearInterestDaysLessThanOrEqualTo(Integer value) {
            addCriterion("YEAR_INTEREST_DAYS <=", value, "yearInterestDays");
            return (Criteria) this;
        }

        public Criteria andYearInterestDaysIn(List<Integer> values) {
            addCriterion("YEAR_INTEREST_DAYS in", values, "yearInterestDays");
            return (Criteria) this;
        }

        public Criteria andYearInterestDaysNotIn(List<Integer> values) {
            addCriterion("YEAR_INTEREST_DAYS not in", values, "yearInterestDays");
            return (Criteria) this;
        }

        public Criteria andYearInterestDaysBetween(Integer value1, Integer value2) {
            addCriterion("YEAR_INTEREST_DAYS between", value1, value2, "yearInterestDays");
            return (Criteria) this;
        }

        public Criteria andYearInterestDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("YEAR_INTEREST_DAYS not between", value1, value2, "yearInterestDays");
            return (Criteria) this;
        }

        public Criteria andRepayTypeIsNull() {
            addCriterion("REPAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRepayTypeIsNotNull() {
            addCriterion("REPAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRepayTypeEqualTo(String value) {
            addCriterion("REPAY_TYPE =", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeNotEqualTo(String value) {
            addCriterion("REPAY_TYPE <>", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeGreaterThan(String value) {
            addCriterion("REPAY_TYPE >", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPAY_TYPE >=", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeLessThan(String value) {
            addCriterion("REPAY_TYPE <", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeLessThanOrEqualTo(String value) {
            addCriterion("REPAY_TYPE <=", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeLike(String value) {
            addCriterion("REPAY_TYPE like", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeNotLike(String value) {
            addCriterion("REPAY_TYPE not like", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeIn(List<String> values) {
            addCriterion("REPAY_TYPE in", values, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeNotIn(List<String> values) {
            addCriterion("REPAY_TYPE not in", values, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeBetween(String value1, String value2) {
            addCriterion("REPAY_TYPE between", value1, value2, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeNotBetween(String value1, String value2) {
            addCriterion("REPAY_TYPE not between", value1, value2, "repayType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeIsNull() {
            addCriterion("INTEREST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInterestTypeIsNotNull() {
            addCriterion("INTEREST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInterestTypeEqualTo(String value) {
            addCriterion("INTEREST_TYPE =", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeNotEqualTo(String value) {
            addCriterion("INTEREST_TYPE <>", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeGreaterThan(String value) {
            addCriterion("INTEREST_TYPE >", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeGreaterThanOrEqualTo(String value) {
            addCriterion("INTEREST_TYPE >=", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeLessThan(String value) {
            addCriterion("INTEREST_TYPE <", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeLessThanOrEqualTo(String value) {
            addCriterion("INTEREST_TYPE <=", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeLike(String value) {
            addCriterion("INTEREST_TYPE like", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeNotLike(String value) {
            addCriterion("INTEREST_TYPE not like", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeIn(List<String> values) {
            addCriterion("INTEREST_TYPE in", values, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeNotIn(List<String> values) {
            addCriterion("INTEREST_TYPE not in", values, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeBetween(String value1, String value2) {
            addCriterion("INTEREST_TYPE between", value1, value2, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeNotBetween(String value1, String value2) {
            addCriterion("INTEREST_TYPE not between", value1, value2, "interestType");
            return (Criteria) this;
        }

        public Criteria andLoanTermIsNull() {
            addCriterion("LOAN_TERM is null");
            return (Criteria) this;
        }

        public Criteria andLoanTermIsNotNull() {
            addCriterion("LOAN_TERM is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTermEqualTo(String value) {
            addCriterion("LOAN_TERM =", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermNotEqualTo(String value) {
            addCriterion("LOAN_TERM <>", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermGreaterThan(String value) {
            addCriterion("LOAN_TERM >", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermGreaterThanOrEqualTo(String value) {
            addCriterion("LOAN_TERM >=", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermLessThan(String value) {
            addCriterion("LOAN_TERM <", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermLessThanOrEqualTo(String value) {
            addCriterion("LOAN_TERM <=", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermLike(String value) {
            addCriterion("LOAN_TERM like", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermNotLike(String value) {
            addCriterion("LOAN_TERM not like", value, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermIn(List<String> values) {
            addCriterion("LOAN_TERM in", values, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermNotIn(List<String> values) {
            addCriterion("LOAN_TERM not in", values, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermBetween(String value1, String value2) {
            addCriterion("LOAN_TERM between", value1, value2, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andLoanTermNotBetween(String value1, String value2) {
            addCriterion("LOAN_TERM not between", value1, value2, "loanTerm");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeIsNull() {
            addCriterion("REPAY_CYCLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeIsNotNull() {
            addCriterion("REPAY_CYCLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeEqualTo(String value) {
            addCriterion("REPAY_CYCLE_TYPE =", value, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeNotEqualTo(String value) {
            addCriterion("REPAY_CYCLE_TYPE <>", value, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeGreaterThan(String value) {
            addCriterion("REPAY_CYCLE_TYPE >", value, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPAY_CYCLE_TYPE >=", value, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeLessThan(String value) {
            addCriterion("REPAY_CYCLE_TYPE <", value, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeLessThanOrEqualTo(String value) {
            addCriterion("REPAY_CYCLE_TYPE <=", value, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeLike(String value) {
            addCriterion("REPAY_CYCLE_TYPE like", value, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeNotLike(String value) {
            addCriterion("REPAY_CYCLE_TYPE not like", value, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeIn(List<String> values) {
            addCriterion("REPAY_CYCLE_TYPE in", values, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeNotIn(List<String> values) {
            addCriterion("REPAY_CYCLE_TYPE not in", values, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeBetween(String value1, String value2) {
            addCriterion("REPAY_CYCLE_TYPE between", value1, value2, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeNotBetween(String value1, String value2) {
            addCriterion("REPAY_CYCLE_TYPE not between", value1, value2, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleNumIsNull() {
            addCriterion("REPAY_CYCLE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRepayCycleNumIsNotNull() {
            addCriterion("REPAY_CYCLE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRepayCycleNumEqualTo(Integer value) {
            addCriterion("REPAY_CYCLE_NUM =", value, "repayCycleNum");
            return (Criteria) this;
        }

        public Criteria andRepayCycleNumNotEqualTo(Integer value) {
            addCriterion("REPAY_CYCLE_NUM <>", value, "repayCycleNum");
            return (Criteria) this;
        }

        public Criteria andRepayCycleNumGreaterThan(Integer value) {
            addCriterion("REPAY_CYCLE_NUM >", value, "repayCycleNum");
            return (Criteria) this;
        }

        public Criteria andRepayCycleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("REPAY_CYCLE_NUM >=", value, "repayCycleNum");
            return (Criteria) this;
        }

        public Criteria andRepayCycleNumLessThan(Integer value) {
            addCriterion("REPAY_CYCLE_NUM <", value, "repayCycleNum");
            return (Criteria) this;
        }

        public Criteria andRepayCycleNumLessThanOrEqualTo(Integer value) {
            addCriterion("REPAY_CYCLE_NUM <=", value, "repayCycleNum");
            return (Criteria) this;
        }

        public Criteria andRepayCycleNumIn(List<Integer> values) {
            addCriterion("REPAY_CYCLE_NUM in", values, "repayCycleNum");
            return (Criteria) this;
        }

        public Criteria andRepayCycleNumNotIn(List<Integer> values) {
            addCriterion("REPAY_CYCLE_NUM not in", values, "repayCycleNum");
            return (Criteria) this;
        }

        public Criteria andRepayCycleNumBetween(Integer value1, Integer value2) {
            addCriterion("REPAY_CYCLE_NUM between", value1, value2, "repayCycleNum");
            return (Criteria) this;
        }

        public Criteria andRepayCycleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("REPAY_CYCLE_NUM not between", value1, value2, "repayCycleNum");
            return (Criteria) this;
        }

        public Criteria andRepayDayTypeIsNull() {
            addCriterion("REPAY_DAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRepayDayTypeIsNotNull() {
            addCriterion("REPAY_DAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRepayDayTypeEqualTo(String value) {
            addCriterion("REPAY_DAY_TYPE =", value, "repayDayType");
            return (Criteria) this;
        }

        public Criteria andRepayDayTypeNotEqualTo(String value) {
            addCriterion("REPAY_DAY_TYPE <>", value, "repayDayType");
            return (Criteria) this;
        }

        public Criteria andRepayDayTypeGreaterThan(String value) {
            addCriterion("REPAY_DAY_TYPE >", value, "repayDayType");
            return (Criteria) this;
        }

        public Criteria andRepayDayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPAY_DAY_TYPE >=", value, "repayDayType");
            return (Criteria) this;
        }

        public Criteria andRepayDayTypeLessThan(String value) {
            addCriterion("REPAY_DAY_TYPE <", value, "repayDayType");
            return (Criteria) this;
        }

        public Criteria andRepayDayTypeLessThanOrEqualTo(String value) {
            addCriterion("REPAY_DAY_TYPE <=", value, "repayDayType");
            return (Criteria) this;
        }

        public Criteria andRepayDayTypeLike(String value) {
            addCriterion("REPAY_DAY_TYPE like", value, "repayDayType");
            return (Criteria) this;
        }

        public Criteria andRepayDayTypeNotLike(String value) {
            addCriterion("REPAY_DAY_TYPE not like", value, "repayDayType");
            return (Criteria) this;
        }

        public Criteria andRepayDayTypeIn(List<String> values) {
            addCriterion("REPAY_DAY_TYPE in", values, "repayDayType");
            return (Criteria) this;
        }

        public Criteria andRepayDayTypeNotIn(List<String> values) {
            addCriterion("REPAY_DAY_TYPE not in", values, "repayDayType");
            return (Criteria) this;
        }

        public Criteria andRepayDayTypeBetween(String value1, String value2) {
            addCriterion("REPAY_DAY_TYPE between", value1, value2, "repayDayType");
            return (Criteria) this;
        }

        public Criteria andRepayDayTypeNotBetween(String value1, String value2) {
            addCriterion("REPAY_DAY_TYPE not between", value1, value2, "repayDayType");
            return (Criteria) this;
        }

        public Criteria andRateTypeIsNull() {
            addCriterion("RATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRateTypeIsNotNull() {
            addCriterion("RATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRateTypeEqualTo(String value) {
            addCriterion("RATE_TYPE =", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotEqualTo(String value) {
            addCriterion("RATE_TYPE <>", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeGreaterThan(String value) {
            addCriterion("RATE_TYPE >", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RATE_TYPE >=", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLessThan(String value) {
            addCriterion("RATE_TYPE <", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLessThanOrEqualTo(String value) {
            addCriterion("RATE_TYPE <=", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLike(String value) {
            addCriterion("RATE_TYPE like", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotLike(String value) {
            addCriterion("RATE_TYPE not like", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeIn(List<String> values) {
            addCriterion("RATE_TYPE in", values, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotIn(List<String> values) {
            addCriterion("RATE_TYPE not in", values, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeBetween(String value1, String value2) {
            addCriterion("RATE_TYPE between", value1, value2, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotBetween(String value1, String value2) {
            addCriterion("RATE_TYPE not between", value1, value2, "rateType");
            return (Criteria) this;
        }

        public Criteria andRepayDayIsNull() {
            addCriterion("REPAY_DAY is null");
            return (Criteria) this;
        }

        public Criteria andRepayDayIsNotNull() {
            addCriterion("REPAY_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andRepayDayEqualTo(String value) {
            addCriterion("REPAY_DAY =", value, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayNotEqualTo(String value) {
            addCriterion("REPAY_DAY <>", value, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayGreaterThan(String value) {
            addCriterion("REPAY_DAY >", value, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayGreaterThanOrEqualTo(String value) {
            addCriterion("REPAY_DAY >=", value, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayLessThan(String value) {
            addCriterion("REPAY_DAY <", value, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayLessThanOrEqualTo(String value) {
            addCriterion("REPAY_DAY <=", value, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayLike(String value) {
            addCriterion("REPAY_DAY like", value, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayNotLike(String value) {
            addCriterion("REPAY_DAY not like", value, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayIn(List<String> values) {
            addCriterion("REPAY_DAY in", values, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayNotIn(List<String> values) {
            addCriterion("REPAY_DAY not in", values, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayBetween(String value1, String value2) {
            addCriterion("REPAY_DAY between", value1, value2, "repayDay");
            return (Criteria) this;
        }

        public Criteria andRepayDayNotBetween(String value1, String value2) {
            addCriterion("REPAY_DAY not between", value1, value2, "repayDay");
            return (Criteria) this;
        }

        public Criteria andTotalLimitIsNull() {
            addCriterion("TOTAL_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andTotalLimitIsNotNull() {
            addCriterion("TOTAL_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLimitEqualTo(Long value) {
            addCriterion("TOTAL_LIMIT =", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitNotEqualTo(Long value) {
            addCriterion("TOTAL_LIMIT <>", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitGreaterThan(Long value) {
            addCriterion("TOTAL_LIMIT >", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_LIMIT >=", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitLessThan(Long value) {
            addCriterion("TOTAL_LIMIT <", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_LIMIT <=", value, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitIn(List<Long> values) {
            addCriterion("TOTAL_LIMIT in", values, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitNotIn(List<Long> values) {
            addCriterion("TOTAL_LIMIT not in", values, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitBetween(Long value1, Long value2) {
            addCriterion("TOTAL_LIMIT between", value1, value2, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andTotalLimitNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_LIMIT not between", value1, value2, "totalLimit");
            return (Criteria) this;
        }

        public Criteria andPlatfontLimitIsNull() {
            addCriterion("PLATFONT_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andPlatfontLimitIsNotNull() {
            addCriterion("PLATFONT_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andPlatfontLimitEqualTo(Long value) {
            addCriterion("PLATFONT_LIMIT =", value, "platfontLimit");
            return (Criteria) this;
        }

        public Criteria andPlatfontLimitNotEqualTo(Long value) {
            addCriterion("PLATFONT_LIMIT <>", value, "platfontLimit");
            return (Criteria) this;
        }

        public Criteria andPlatfontLimitGreaterThan(Long value) {
            addCriterion("PLATFONT_LIMIT >", value, "platfontLimit");
            return (Criteria) this;
        }

        public Criteria andPlatfontLimitGreaterThanOrEqualTo(Long value) {
            addCriterion("PLATFONT_LIMIT >=", value, "platfontLimit");
            return (Criteria) this;
        }

        public Criteria andPlatfontLimitLessThan(Long value) {
            addCriterion("PLATFONT_LIMIT <", value, "platfontLimit");
            return (Criteria) this;
        }

        public Criteria andPlatfontLimitLessThanOrEqualTo(Long value) {
            addCriterion("PLATFONT_LIMIT <=", value, "platfontLimit");
            return (Criteria) this;
        }

        public Criteria andPlatfontLimitIn(List<Long> values) {
            addCriterion("PLATFONT_LIMIT in", values, "platfontLimit");
            return (Criteria) this;
        }

        public Criteria andPlatfontLimitNotIn(List<Long> values) {
            addCriterion("PLATFONT_LIMIT not in", values, "platfontLimit");
            return (Criteria) this;
        }

        public Criteria andPlatfontLimitBetween(Long value1, Long value2) {
            addCriterion("PLATFONT_LIMIT between", value1, value2, "platfontLimit");
            return (Criteria) this;
        }

        public Criteria andPlatfontLimitNotBetween(Long value1, Long value2) {
            addCriterion("PLATFONT_LIMIT not between", value1, value2, "platfontLimit");
            return (Criteria) this;
        }

        public Criteria andFloorLimitIsNull() {
            addCriterion("FLOOR_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andFloorLimitIsNotNull() {
            addCriterion("FLOOR_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andFloorLimitEqualTo(Long value) {
            addCriterion("FLOOR_LIMIT =", value, "floorLimit");
            return (Criteria) this;
        }

        public Criteria andFloorLimitNotEqualTo(Long value) {
            addCriterion("FLOOR_LIMIT <>", value, "floorLimit");
            return (Criteria) this;
        }

        public Criteria andFloorLimitGreaterThan(Long value) {
            addCriterion("FLOOR_LIMIT >", value, "floorLimit");
            return (Criteria) this;
        }

        public Criteria andFloorLimitGreaterThanOrEqualTo(Long value) {
            addCriterion("FLOOR_LIMIT >=", value, "floorLimit");
            return (Criteria) this;
        }

        public Criteria andFloorLimitLessThan(Long value) {
            addCriterion("FLOOR_LIMIT <", value, "floorLimit");
            return (Criteria) this;
        }

        public Criteria andFloorLimitLessThanOrEqualTo(Long value) {
            addCriterion("FLOOR_LIMIT <=", value, "floorLimit");
            return (Criteria) this;
        }

        public Criteria andFloorLimitIn(List<Long> values) {
            addCriterion("FLOOR_LIMIT in", values, "floorLimit");
            return (Criteria) this;
        }

        public Criteria andFloorLimitNotIn(List<Long> values) {
            addCriterion("FLOOR_LIMIT not in", values, "floorLimit");
            return (Criteria) this;
        }

        public Criteria andFloorLimitBetween(Long value1, Long value2) {
            addCriterion("FLOOR_LIMIT between", value1, value2, "floorLimit");
            return (Criteria) this;
        }

        public Criteria andFloorLimitNotBetween(Long value1, Long value2) {
            addCriterion("FLOOR_LIMIT not between", value1, value2, "floorLimit");
            return (Criteria) this;
        }

        public Criteria andGuarantyTypeIsNull() {
            addCriterion("GUARANTY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGuarantyTypeIsNotNull() {
            addCriterion("GUARANTY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantyTypeEqualTo(String value) {
            addCriterion("GUARANTY_TYPE =", value, "guarantyType");
            return (Criteria) this;
        }

        public Criteria andGuarantyTypeNotEqualTo(String value) {
            addCriterion("GUARANTY_TYPE <>", value, "guarantyType");
            return (Criteria) this;
        }

        public Criteria andGuarantyTypeGreaterThan(String value) {
            addCriterion("GUARANTY_TYPE >", value, "guarantyType");
            return (Criteria) this;
        }

        public Criteria andGuarantyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTY_TYPE >=", value, "guarantyType");
            return (Criteria) this;
        }

        public Criteria andGuarantyTypeLessThan(String value) {
            addCriterion("GUARANTY_TYPE <", value, "guarantyType");
            return (Criteria) this;
        }

        public Criteria andGuarantyTypeLessThanOrEqualTo(String value) {
            addCriterion("GUARANTY_TYPE <=", value, "guarantyType");
            return (Criteria) this;
        }

        public Criteria andGuarantyTypeLike(String value) {
            addCriterion("GUARANTY_TYPE like", value, "guarantyType");
            return (Criteria) this;
        }

        public Criteria andGuarantyTypeNotLike(String value) {
            addCriterion("GUARANTY_TYPE not like", value, "guarantyType");
            return (Criteria) this;
        }

        public Criteria andGuarantyTypeIn(List<String> values) {
            addCriterion("GUARANTY_TYPE in", values, "guarantyType");
            return (Criteria) this;
        }

        public Criteria andGuarantyTypeNotIn(List<String> values) {
            addCriterion("GUARANTY_TYPE not in", values, "guarantyType");
            return (Criteria) this;
        }

        public Criteria andGuarantyTypeBetween(String value1, String value2) {
            addCriterion("GUARANTY_TYPE between", value1, value2, "guarantyType");
            return (Criteria) this;
        }

        public Criteria andGuarantyTypeNotBetween(String value1, String value2) {
            addCriterion("GUARANTY_TYPE not between", value1, value2, "guarantyType");
            return (Criteria) this;
        }

        public Criteria andIsLoopIsNull() {
            addCriterion("IS_LOOP is null");
            return (Criteria) this;
        }

        public Criteria andIsLoopIsNotNull() {
            addCriterion("IS_LOOP is not null");
            return (Criteria) this;
        }

        public Criteria andIsLoopEqualTo(String value) {
            addCriterion("IS_LOOP =", value, "isLoop");
            return (Criteria) this;
        }

        public Criteria andIsLoopNotEqualTo(String value) {
            addCriterion("IS_LOOP <>", value, "isLoop");
            return (Criteria) this;
        }

        public Criteria andIsLoopGreaterThan(String value) {
            addCriterion("IS_LOOP >", value, "isLoop");
            return (Criteria) this;
        }

        public Criteria andIsLoopGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LOOP >=", value, "isLoop");
            return (Criteria) this;
        }

        public Criteria andIsLoopLessThan(String value) {
            addCriterion("IS_LOOP <", value, "isLoop");
            return (Criteria) this;
        }

        public Criteria andIsLoopLessThanOrEqualTo(String value) {
            addCriterion("IS_LOOP <=", value, "isLoop");
            return (Criteria) this;
        }

        public Criteria andIsLoopLike(String value) {
            addCriterion("IS_LOOP like", value, "isLoop");
            return (Criteria) this;
        }

        public Criteria andIsLoopNotLike(String value) {
            addCriterion("IS_LOOP not like", value, "isLoop");
            return (Criteria) this;
        }

        public Criteria andIsLoopIn(List<String> values) {
            addCriterion("IS_LOOP in", values, "isLoop");
            return (Criteria) this;
        }

        public Criteria andIsLoopNotIn(List<String> values) {
            addCriterion("IS_LOOP not in", values, "isLoop");
            return (Criteria) this;
        }

        public Criteria andIsLoopBetween(String value1, String value2) {
            addCriterion("IS_LOOP between", value1, value2, "isLoop");
            return (Criteria) this;
        }

        public Criteria andIsLoopNotBetween(String value1, String value2) {
            addCriterion("IS_LOOP not between", value1, value2, "isLoop");
            return (Criteria) this;
        }

        public Criteria andIsRepayIsNull() {
            addCriterion("IS_REPAY is null");
            return (Criteria) this;
        }

        public Criteria andIsRepayIsNotNull() {
            addCriterion("IS_REPAY is not null");
            return (Criteria) this;
        }

        public Criteria andIsRepayEqualTo(String value) {
            addCriterion("IS_REPAY =", value, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayNotEqualTo(String value) {
            addCriterion("IS_REPAY <>", value, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayGreaterThan(String value) {
            addCriterion("IS_REPAY >", value, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayGreaterThanOrEqualTo(String value) {
            addCriterion("IS_REPAY >=", value, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayLessThan(String value) {
            addCriterion("IS_REPAY <", value, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayLessThanOrEqualTo(String value) {
            addCriterion("IS_REPAY <=", value, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayLike(String value) {
            addCriterion("IS_REPAY like", value, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayNotLike(String value) {
            addCriterion("IS_REPAY not like", value, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayIn(List<String> values) {
            addCriterion("IS_REPAY in", values, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayNotIn(List<String> values) {
            addCriterion("IS_REPAY not in", values, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayBetween(String value1, String value2) {
            addCriterion("IS_REPAY between", value1, value2, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsRepayNotBetween(String value1, String value2) {
            addCriterion("IS_REPAY not between", value1, value2, "isRepay");
            return (Criteria) this;
        }

        public Criteria andIsFixPayIsNull() {
            addCriterion("IS_FIX_PAY is null");
            return (Criteria) this;
        }

        public Criteria andIsFixPayIsNotNull() {
            addCriterion("IS_FIX_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andIsFixPayEqualTo(String value) {
            addCriterion("IS_FIX_PAY =", value, "isFixPay");
            return (Criteria) this;
        }

        public Criteria andIsFixPayNotEqualTo(String value) {
            addCriterion("IS_FIX_PAY <>", value, "isFixPay");
            return (Criteria) this;
        }

        public Criteria andIsFixPayGreaterThan(String value) {
            addCriterion("IS_FIX_PAY >", value, "isFixPay");
            return (Criteria) this;
        }

        public Criteria andIsFixPayGreaterThanOrEqualTo(String value) {
            addCriterion("IS_FIX_PAY >=", value, "isFixPay");
            return (Criteria) this;
        }

        public Criteria andIsFixPayLessThan(String value) {
            addCriterion("IS_FIX_PAY <", value, "isFixPay");
            return (Criteria) this;
        }

        public Criteria andIsFixPayLessThanOrEqualTo(String value) {
            addCriterion("IS_FIX_PAY <=", value, "isFixPay");
            return (Criteria) this;
        }

        public Criteria andIsFixPayLike(String value) {
            addCriterion("IS_FIX_PAY like", value, "isFixPay");
            return (Criteria) this;
        }

        public Criteria andIsFixPayNotLike(String value) {
            addCriterion("IS_FIX_PAY not like", value, "isFixPay");
            return (Criteria) this;
        }

        public Criteria andIsFixPayIn(List<String> values) {
            addCriterion("IS_FIX_PAY in", values, "isFixPay");
            return (Criteria) this;
        }

        public Criteria andIsFixPayNotIn(List<String> values) {
            addCriterion("IS_FIX_PAY not in", values, "isFixPay");
            return (Criteria) this;
        }

        public Criteria andIsFixPayBetween(String value1, String value2) {
            addCriterion("IS_FIX_PAY between", value1, value2, "isFixPay");
            return (Criteria) this;
        }

        public Criteria andIsFixPayNotBetween(String value1, String value2) {
            addCriterion("IS_FIX_PAY not between", value1, value2, "isFixPay");
            return (Criteria) this;
        }

        public Criteria andRepayResourceTypeIsNull() {
            addCriterion("REPAY_RESOURCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRepayResourceTypeIsNotNull() {
            addCriterion("REPAY_RESOURCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRepayResourceTypeEqualTo(String value) {
            addCriterion("REPAY_RESOURCE_TYPE =", value, "repayResourceType");
            return (Criteria) this;
        }

        public Criteria andRepayResourceTypeNotEqualTo(String value) {
            addCriterion("REPAY_RESOURCE_TYPE <>", value, "repayResourceType");
            return (Criteria) this;
        }

        public Criteria andRepayResourceTypeGreaterThan(String value) {
            addCriterion("REPAY_RESOURCE_TYPE >", value, "repayResourceType");
            return (Criteria) this;
        }

        public Criteria andRepayResourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPAY_RESOURCE_TYPE >=", value, "repayResourceType");
            return (Criteria) this;
        }

        public Criteria andRepayResourceTypeLessThan(String value) {
            addCriterion("REPAY_RESOURCE_TYPE <", value, "repayResourceType");
            return (Criteria) this;
        }

        public Criteria andRepayResourceTypeLessThanOrEqualTo(String value) {
            addCriterion("REPAY_RESOURCE_TYPE <=", value, "repayResourceType");
            return (Criteria) this;
        }

        public Criteria andRepayResourceTypeLike(String value) {
            addCriterion("REPAY_RESOURCE_TYPE like", value, "repayResourceType");
            return (Criteria) this;
        }

        public Criteria andRepayResourceTypeNotLike(String value) {
            addCriterion("REPAY_RESOURCE_TYPE not like", value, "repayResourceType");
            return (Criteria) this;
        }

        public Criteria andRepayResourceTypeIn(List<String> values) {
            addCriterion("REPAY_RESOURCE_TYPE in", values, "repayResourceType");
            return (Criteria) this;
        }

        public Criteria andRepayResourceTypeNotIn(List<String> values) {
            addCriterion("REPAY_RESOURCE_TYPE not in", values, "repayResourceType");
            return (Criteria) this;
        }

        public Criteria andRepayResourceTypeBetween(String value1, String value2) {
            addCriterion("REPAY_RESOURCE_TYPE between", value1, value2, "repayResourceType");
            return (Criteria) this;
        }

        public Criteria andRepayResourceTypeNotBetween(String value1, String value2) {
            addCriterion("REPAY_RESOURCE_TYPE not between", value1, value2, "repayResourceType");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestRateIsNull() {
            addCriterion("PENALTY_INTEREST_RATE is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestRateIsNotNull() {
            addCriterion("PENALTY_INTEREST_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestRateEqualTo(Float value) {
            addCriterion("PENALTY_INTEREST_RATE =", value, "penaltyInterestRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestRateNotEqualTo(Float value) {
            addCriterion("PENALTY_INTEREST_RATE <>", value, "penaltyInterestRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestRateGreaterThan(Float value) {
            addCriterion("PENALTY_INTEREST_RATE >", value, "penaltyInterestRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestRateGreaterThanOrEqualTo(Float value) {
            addCriterion("PENALTY_INTEREST_RATE >=", value, "penaltyInterestRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestRateLessThan(Float value) {
            addCriterion("PENALTY_INTEREST_RATE <", value, "penaltyInterestRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestRateLessThanOrEqualTo(Float value) {
            addCriterion("PENALTY_INTEREST_RATE <=", value, "penaltyInterestRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestRateIn(List<Float> values) {
            addCriterion("PENALTY_INTEREST_RATE in", values, "penaltyInterestRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestRateNotIn(List<Float> values) {
            addCriterion("PENALTY_INTEREST_RATE not in", values, "penaltyInterestRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestRateBetween(Float value1, Float value2) {
            addCriterion("PENALTY_INTEREST_RATE between", value1, value2, "penaltyInterestRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyInterestRateNotBetween(Float value1, Float value2) {
            addCriterion("PENALTY_INTEREST_RATE not between", value1, value2, "penaltyInterestRate");
            return (Criteria) this;
        }

        public Criteria andGracePeriodIsNull() {
            addCriterion("GRACE_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andGracePeriodIsNotNull() {
            addCriterion("GRACE_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andGracePeriodEqualTo(Integer value) {
            addCriterion("GRACE_PERIOD =", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodNotEqualTo(Integer value) {
            addCriterion("GRACE_PERIOD <>", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodGreaterThan(Integer value) {
            addCriterion("GRACE_PERIOD >", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("GRACE_PERIOD >=", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodLessThan(Integer value) {
            addCriterion("GRACE_PERIOD <", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodLessThanOrEqualTo(Integer value) {
            addCriterion("GRACE_PERIOD <=", value, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodIn(List<Integer> values) {
            addCriterion("GRACE_PERIOD in", values, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodNotIn(List<Integer> values) {
            addCriterion("GRACE_PERIOD not in", values, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodBetween(Integer value1, Integer value2) {
            addCriterion("GRACE_PERIOD between", value1, value2, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andGracePeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("GRACE_PERIOD not between", value1, value2, "gracePeriod");
            return (Criteria) this;
        }

        public Criteria andAdvanceEndPeriodIsNull() {
            addCriterion("ADVANCE_END_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andAdvanceEndPeriodIsNotNull() {
            addCriterion("ADVANCE_END_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andAdvanceEndPeriodEqualTo(Integer value) {
            addCriterion("ADVANCE_END_PERIOD =", value, "advanceEndPeriod");
            return (Criteria) this;
        }

        public Criteria andAdvanceEndPeriodNotEqualTo(Integer value) {
            addCriterion("ADVANCE_END_PERIOD <>", value, "advanceEndPeriod");
            return (Criteria) this;
        }

        public Criteria andAdvanceEndPeriodGreaterThan(Integer value) {
            addCriterion("ADVANCE_END_PERIOD >", value, "advanceEndPeriod");
            return (Criteria) this;
        }

        public Criteria andAdvanceEndPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("ADVANCE_END_PERIOD >=", value, "advanceEndPeriod");
            return (Criteria) this;
        }

        public Criteria andAdvanceEndPeriodLessThan(Integer value) {
            addCriterion("ADVANCE_END_PERIOD <", value, "advanceEndPeriod");
            return (Criteria) this;
        }

        public Criteria andAdvanceEndPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("ADVANCE_END_PERIOD <=", value, "advanceEndPeriod");
            return (Criteria) this;
        }

        public Criteria andAdvanceEndPeriodIn(List<Integer> values) {
            addCriterion("ADVANCE_END_PERIOD in", values, "advanceEndPeriod");
            return (Criteria) this;
        }

        public Criteria andAdvanceEndPeriodNotIn(List<Integer> values) {
            addCriterion("ADVANCE_END_PERIOD not in", values, "advanceEndPeriod");
            return (Criteria) this;
        }

        public Criteria andAdvanceEndPeriodBetween(Integer value1, Integer value2) {
            addCriterion("ADVANCE_END_PERIOD between", value1, value2, "advanceEndPeriod");
            return (Criteria) this;
        }

        public Criteria andAdvanceEndPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("ADVANCE_END_PERIOD not between", value1, value2, "advanceEndPeriod");
            return (Criteria) this;
        }

        public Criteria andCustLableIsNull() {
            addCriterion("CUST_LABLE is null");
            return (Criteria) this;
        }

        public Criteria andCustLableIsNotNull() {
            addCriterion("CUST_LABLE is not null");
            return (Criteria) this;
        }

        public Criteria andCustLableEqualTo(String value) {
            addCriterion("CUST_LABLE =", value, "custLable");
            return (Criteria) this;
        }

        public Criteria andCustLableNotEqualTo(String value) {
            addCriterion("CUST_LABLE <>", value, "custLable");
            return (Criteria) this;
        }

        public Criteria andCustLableGreaterThan(String value) {
            addCriterion("CUST_LABLE >", value, "custLable");
            return (Criteria) this;
        }

        public Criteria andCustLableGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_LABLE >=", value, "custLable");
            return (Criteria) this;
        }

        public Criteria andCustLableLessThan(String value) {
            addCriterion("CUST_LABLE <", value, "custLable");
            return (Criteria) this;
        }

        public Criteria andCustLableLessThanOrEqualTo(String value) {
            addCriterion("CUST_LABLE <=", value, "custLable");
            return (Criteria) this;
        }

        public Criteria andCustLableLike(String value) {
            addCriterion("CUST_LABLE like", value, "custLable");
            return (Criteria) this;
        }

        public Criteria andCustLableNotLike(String value) {
            addCriterion("CUST_LABLE not like", value, "custLable");
            return (Criteria) this;
        }

        public Criteria andCustLableIn(List<String> values) {
            addCriterion("CUST_LABLE in", values, "custLable");
            return (Criteria) this;
        }

        public Criteria andCustLableNotIn(List<String> values) {
            addCriterion("CUST_LABLE not in", values, "custLable");
            return (Criteria) this;
        }

        public Criteria andCustLableBetween(String value1, String value2) {
            addCriterion("CUST_LABLE between", value1, value2, "custLable");
            return (Criteria) this;
        }

        public Criteria andCustLableNotBetween(String value1, String value2) {
            addCriterion("CUST_LABLE not between", value1, value2, "custLable");
            return (Criteria) this;
        }

        public Criteria andMarketLabelIsNull() {
            addCriterion("MARKET_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andMarketLabelIsNotNull() {
            addCriterion("MARKET_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andMarketLabelEqualTo(String value) {
            addCriterion("MARKET_LABEL =", value, "marketLabel");
            return (Criteria) this;
        }

        public Criteria andMarketLabelNotEqualTo(String value) {
            addCriterion("MARKET_LABEL <>", value, "marketLabel");
            return (Criteria) this;
        }

        public Criteria andMarketLabelGreaterThan(String value) {
            addCriterion("MARKET_LABEL >", value, "marketLabel");
            return (Criteria) this;
        }

        public Criteria andMarketLabelGreaterThanOrEqualTo(String value) {
            addCriterion("MARKET_LABEL >=", value, "marketLabel");
            return (Criteria) this;
        }

        public Criteria andMarketLabelLessThan(String value) {
            addCriterion("MARKET_LABEL <", value, "marketLabel");
            return (Criteria) this;
        }

        public Criteria andMarketLabelLessThanOrEqualTo(String value) {
            addCriterion("MARKET_LABEL <=", value, "marketLabel");
            return (Criteria) this;
        }

        public Criteria andMarketLabelLike(String value) {
            addCriterion("MARKET_LABEL like", value, "marketLabel");
            return (Criteria) this;
        }

        public Criteria andMarketLabelNotLike(String value) {
            addCriterion("MARKET_LABEL not like", value, "marketLabel");
            return (Criteria) this;
        }

        public Criteria andMarketLabelIn(List<String> values) {
            addCriterion("MARKET_LABEL in", values, "marketLabel");
            return (Criteria) this;
        }

        public Criteria andMarketLabelNotIn(List<String> values) {
            addCriterion("MARKET_LABEL not in", values, "marketLabel");
            return (Criteria) this;
        }

        public Criteria andMarketLabelBetween(String value1, String value2) {
            addCriterion("MARKET_LABEL between", value1, value2, "marketLabel");
            return (Criteria) this;
        }

        public Criteria andMarketLabelNotBetween(String value1, String value2) {
            addCriterion("MARKET_LABEL not between", value1, value2, "marketLabel");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(String value) {
            addCriterion("PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(String value) {
            addCriterion("PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(String value) {
            addCriterion("PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(String value) {
            addCriterion("PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(String value) {
            addCriterion("PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLike(String value) {
            addCriterion("PRIORITY like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotLike(String value) {
            addCriterion("PRIORITY not like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<String> values) {
            addCriterion("PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<String> values) {
            addCriterion("PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(String value1, String value2) {
            addCriterion("PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(String value1, String value2) {
            addCriterion("PRIORITY not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andDelayDaysIsNull() {
            addCriterion("DELAY_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andDelayDaysIsNotNull() {
            addCriterion("DELAY_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andDelayDaysEqualTo(Integer value) {
            addCriterion("DELAY_DAYS =", value, "delayDays");
            return (Criteria) this;
        }

        public Criteria andDelayDaysNotEqualTo(Integer value) {
            addCriterion("DELAY_DAYS <>", value, "delayDays");
            return (Criteria) this;
        }

        public Criteria andDelayDaysGreaterThan(Integer value) {
            addCriterion("DELAY_DAYS >", value, "delayDays");
            return (Criteria) this;
        }

        public Criteria andDelayDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELAY_DAYS >=", value, "delayDays");
            return (Criteria) this;
        }

        public Criteria andDelayDaysLessThan(Integer value) {
            addCriterion("DELAY_DAYS <", value, "delayDays");
            return (Criteria) this;
        }

        public Criteria andDelayDaysLessThanOrEqualTo(Integer value) {
            addCriterion("DELAY_DAYS <=", value, "delayDays");
            return (Criteria) this;
        }

        public Criteria andDelayDaysIn(List<Integer> values) {
            addCriterion("DELAY_DAYS in", values, "delayDays");
            return (Criteria) this;
        }

        public Criteria andDelayDaysNotIn(List<Integer> values) {
            addCriterion("DELAY_DAYS not in", values, "delayDays");
            return (Criteria) this;
        }

        public Criteria andDelayDaysBetween(Integer value1, Integer value2) {
            addCriterion("DELAY_DAYS between", value1, value2, "delayDays");
            return (Criteria) this;
        }

        public Criteria andDelayDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("DELAY_DAYS not between", value1, value2, "delayDays");
            return (Criteria) this;
        }

        public Criteria andLoanStartTypeIsNull() {
            addCriterion("LOAN_START_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLoanStartTypeIsNotNull() {
            addCriterion("LOAN_START_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLoanStartTypeEqualTo(String value) {
            addCriterion("LOAN_START_TYPE =", value, "loanStartType");
            return (Criteria) this;
        }

        public Criteria andLoanStartTypeNotEqualTo(String value) {
            addCriterion("LOAN_START_TYPE <>", value, "loanStartType");
            return (Criteria) this;
        }

        public Criteria andLoanStartTypeGreaterThan(String value) {
            addCriterion("LOAN_START_TYPE >", value, "loanStartType");
            return (Criteria) this;
        }

        public Criteria andLoanStartTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOAN_START_TYPE >=", value, "loanStartType");
            return (Criteria) this;
        }

        public Criteria andLoanStartTypeLessThan(String value) {
            addCriterion("LOAN_START_TYPE <", value, "loanStartType");
            return (Criteria) this;
        }

        public Criteria andLoanStartTypeLessThanOrEqualTo(String value) {
            addCriterion("LOAN_START_TYPE <=", value, "loanStartType");
            return (Criteria) this;
        }

        public Criteria andLoanStartTypeLike(String value) {
            addCriterion("LOAN_START_TYPE like", value, "loanStartType");
            return (Criteria) this;
        }

        public Criteria andLoanStartTypeNotLike(String value) {
            addCriterion("LOAN_START_TYPE not like", value, "loanStartType");
            return (Criteria) this;
        }

        public Criteria andLoanStartTypeIn(List<String> values) {
            addCriterion("LOAN_START_TYPE in", values, "loanStartType");
            return (Criteria) this;
        }

        public Criteria andLoanStartTypeNotIn(List<String> values) {
            addCriterion("LOAN_START_TYPE not in", values, "loanStartType");
            return (Criteria) this;
        }

        public Criteria andLoanStartTypeBetween(String value1, String value2) {
            addCriterion("LOAN_START_TYPE between", value1, value2, "loanStartType");
            return (Criteria) this;
        }

        public Criteria andLoanStartTypeNotBetween(String value1, String value2) {
            addCriterion("LOAN_START_TYPE not between", value1, value2, "loanStartType");
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

        public Criteria andLesseeIdIsNull() {
            addCriterion("LESSEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLesseeIdIsNotNull() {
            addCriterion("LESSEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLesseeIdEqualTo(String value) {
            addCriterion("LESSEE_ID =", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotEqualTo(String value) {
            addCriterion("LESSEE_ID <>", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdGreaterThan(String value) {
            addCriterion("LESSEE_ID >", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdGreaterThanOrEqualTo(String value) {
            addCriterion("LESSEE_ID >=", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdLessThan(String value) {
            addCriterion("LESSEE_ID <", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdLessThanOrEqualTo(String value) {
            addCriterion("LESSEE_ID <=", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdLike(String value) {
            addCriterion("LESSEE_ID like", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotLike(String value) {
            addCriterion("LESSEE_ID not like", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdIn(List<String> values) {
            addCriterion("LESSEE_ID in", values, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotIn(List<String> values) {
            addCriterion("LESSEE_ID not in", values, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdBetween(String value1, String value2) {
            addCriterion("LESSEE_ID between", value1, value2, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotBetween(String value1, String value2) {
            addCriterion("LESSEE_ID not between", value1, value2, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andServiceRateIsNull() {
            addCriterion("SERVICE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andServiceRateIsNotNull() {
            addCriterion("SERVICE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceRateEqualTo(Float value) {
            addCriterion("SERVICE_RATE =", value, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateNotEqualTo(Float value) {
            addCriterion("SERVICE_RATE <>", value, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateGreaterThan(Float value) {
            addCriterion("SERVICE_RATE >", value, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateGreaterThanOrEqualTo(Float value) {
            addCriterion("SERVICE_RATE >=", value, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateLessThan(Float value) {
            addCriterion("SERVICE_RATE <", value, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateLessThanOrEqualTo(Float value) {
            addCriterion("SERVICE_RATE <=", value, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateIn(List<Float> values) {
            addCriterion("SERVICE_RATE in", values, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateNotIn(List<Float> values) {
            addCriterion("SERVICE_RATE not in", values, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateBetween(Float value1, Float value2) {
            addCriterion("SERVICE_RATE between", value1, value2, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andServiceRateNotBetween(Float value1, Float value2) {
            addCriterion("SERVICE_RATE not between", value1, value2, "serviceRate");
            return (Criteria) this;
        }

        public Criteria andPartRepayFlagIsNull() {
            addCriterion("part_repay_flag is null");
            return (Criteria) this;
        }

        public Criteria andPartRepayFlagIsNotNull() {
            addCriterion("part_repay_flag is not null");
            return (Criteria) this;
        }

        public Criteria andPartRepayFlagEqualTo(String value) {
            addCriterion("part_repay_flag =", value, "partRepayFlag");
            return (Criteria) this;
        }

        public Criteria andPartRepayFlagNotEqualTo(String value) {
            addCriterion("part_repay_flag <>", value, "partRepayFlag");
            return (Criteria) this;
        }

        public Criteria andPartRepayFlagGreaterThan(String value) {
            addCriterion("part_repay_flag >", value, "partRepayFlag");
            return (Criteria) this;
        }

        public Criteria andPartRepayFlagGreaterThanOrEqualTo(String value) {
            addCriterion("part_repay_flag >=", value, "partRepayFlag");
            return (Criteria) this;
        }

        public Criteria andPartRepayFlagLessThan(String value) {
            addCriterion("part_repay_flag <", value, "partRepayFlag");
            return (Criteria) this;
        }

        public Criteria andPartRepayFlagLessThanOrEqualTo(String value) {
            addCriterion("part_repay_flag <=", value, "partRepayFlag");
            return (Criteria) this;
        }

        public Criteria andPartRepayFlagLike(String value) {
            addCriterion("part_repay_flag like", value, "partRepayFlag");
            return (Criteria) this;
        }

        public Criteria andPartRepayFlagNotLike(String value) {
            addCriterion("part_repay_flag not like", value, "partRepayFlag");
            return (Criteria) this;
        }

        public Criteria andPartRepayFlagIn(List<String> values) {
            addCriterion("part_repay_flag in", values, "partRepayFlag");
            return (Criteria) this;
        }

        public Criteria andPartRepayFlagNotIn(List<String> values) {
            addCriterion("part_repay_flag not in", values, "partRepayFlag");
            return (Criteria) this;
        }

        public Criteria andPartRepayFlagBetween(String value1, String value2) {
            addCriterion("part_repay_flag between", value1, value2, "partRepayFlag");
            return (Criteria) this;
        }

        public Criteria andPartRepayFlagNotBetween(String value1, String value2) {
            addCriterion("part_repay_flag not between", value1, value2, "partRepayFlag");
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