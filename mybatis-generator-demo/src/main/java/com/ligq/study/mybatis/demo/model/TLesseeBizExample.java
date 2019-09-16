package com.ligq.study.mybatis.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TLesseeBizExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLesseeBizExample() {
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

        public Criteria andBizModeIsNull() {
            addCriterion("biz_mode is null");
            return (Criteria) this;
        }

        public Criteria andBizModeIsNotNull() {
            addCriterion("biz_mode is not null");
            return (Criteria) this;
        }

        public Criteria andBizModeEqualTo(String value) {
            addCriterion("biz_mode =", value, "bizMode");
            return (Criteria) this;
        }

        public Criteria andBizModeNotEqualTo(String value) {
            addCriterion("biz_mode <>", value, "bizMode");
            return (Criteria) this;
        }

        public Criteria andBizModeGreaterThan(String value) {
            addCriterion("biz_mode >", value, "bizMode");
            return (Criteria) this;
        }

        public Criteria andBizModeGreaterThanOrEqualTo(String value) {
            addCriterion("biz_mode >=", value, "bizMode");
            return (Criteria) this;
        }

        public Criteria andBizModeLessThan(String value) {
            addCriterion("biz_mode <", value, "bizMode");
            return (Criteria) this;
        }

        public Criteria andBizModeLessThanOrEqualTo(String value) {
            addCriterion("biz_mode <=", value, "bizMode");
            return (Criteria) this;
        }

        public Criteria andBizModeLike(String value) {
            addCriterion("biz_mode like", value, "bizMode");
            return (Criteria) this;
        }

        public Criteria andBizModeNotLike(String value) {
            addCriterion("biz_mode not like", value, "bizMode");
            return (Criteria) this;
        }

        public Criteria andBizModeIn(List<String> values) {
            addCriterion("biz_mode in", values, "bizMode");
            return (Criteria) this;
        }

        public Criteria andBizModeNotIn(List<String> values) {
            addCriterion("biz_mode not in", values, "bizMode");
            return (Criteria) this;
        }

        public Criteria andBizModeBetween(String value1, String value2) {
            addCriterion("biz_mode between", value1, value2, "bizMode");
            return (Criteria) this;
        }

        public Criteria andBizModeNotBetween(String value1, String value2) {
            addCriterion("biz_mode not between", value1, value2, "bizMode");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("product_type like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("product_type not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andUseMisIsNull() {
            addCriterion("use_mis is null");
            return (Criteria) this;
        }

        public Criteria andUseMisIsNotNull() {
            addCriterion("use_mis is not null");
            return (Criteria) this;
        }

        public Criteria andUseMisEqualTo(String value) {
            addCriterion("use_mis =", value, "useMis");
            return (Criteria) this;
        }

        public Criteria andUseMisNotEqualTo(String value) {
            addCriterion("use_mis <>", value, "useMis");
            return (Criteria) this;
        }

        public Criteria andUseMisGreaterThan(String value) {
            addCriterion("use_mis >", value, "useMis");
            return (Criteria) this;
        }

        public Criteria andUseMisGreaterThanOrEqualTo(String value) {
            addCriterion("use_mis >=", value, "useMis");
            return (Criteria) this;
        }

        public Criteria andUseMisLessThan(String value) {
            addCriterion("use_mis <", value, "useMis");
            return (Criteria) this;
        }

        public Criteria andUseMisLessThanOrEqualTo(String value) {
            addCriterion("use_mis <=", value, "useMis");
            return (Criteria) this;
        }

        public Criteria andUseMisLike(String value) {
            addCriterion("use_mis like", value, "useMis");
            return (Criteria) this;
        }

        public Criteria andUseMisNotLike(String value) {
            addCriterion("use_mis not like", value, "useMis");
            return (Criteria) this;
        }

        public Criteria andUseMisIn(List<String> values) {
            addCriterion("use_mis in", values, "useMis");
            return (Criteria) this;
        }

        public Criteria andUseMisNotIn(List<String> values) {
            addCriterion("use_mis not in", values, "useMis");
            return (Criteria) this;
        }

        public Criteria andUseMisBetween(String value1, String value2) {
            addCriterion("use_mis between", value1, value2, "useMis");
            return (Criteria) this;
        }

        public Criteria andUseMisNotBetween(String value1, String value2) {
            addCriterion("use_mis not between", value1, value2, "useMis");
            return (Criteria) this;
        }

        public Criteria andUseSellIsNull() {
            addCriterion("use_sell is null");
            return (Criteria) this;
        }

        public Criteria andUseSellIsNotNull() {
            addCriterion("use_sell is not null");
            return (Criteria) this;
        }

        public Criteria andUseSellEqualTo(String value) {
            addCriterion("use_sell =", value, "useSell");
            return (Criteria) this;
        }

        public Criteria andUseSellNotEqualTo(String value) {
            addCriterion("use_sell <>", value, "useSell");
            return (Criteria) this;
        }

        public Criteria andUseSellGreaterThan(String value) {
            addCriterion("use_sell >", value, "useSell");
            return (Criteria) this;
        }

        public Criteria andUseSellGreaterThanOrEqualTo(String value) {
            addCriterion("use_sell >=", value, "useSell");
            return (Criteria) this;
        }

        public Criteria andUseSellLessThan(String value) {
            addCriterion("use_sell <", value, "useSell");
            return (Criteria) this;
        }

        public Criteria andUseSellLessThanOrEqualTo(String value) {
            addCriterion("use_sell <=", value, "useSell");
            return (Criteria) this;
        }

        public Criteria andUseSellLike(String value) {
            addCriterion("use_sell like", value, "useSell");
            return (Criteria) this;
        }

        public Criteria andUseSellNotLike(String value) {
            addCriterion("use_sell not like", value, "useSell");
            return (Criteria) this;
        }

        public Criteria andUseSellIn(List<String> values) {
            addCriterion("use_sell in", values, "useSell");
            return (Criteria) this;
        }

        public Criteria andUseSellNotIn(List<String> values) {
            addCriterion("use_sell not in", values, "useSell");
            return (Criteria) this;
        }

        public Criteria andUseSellBetween(String value1, String value2) {
            addCriterion("use_sell between", value1, value2, "useSell");
            return (Criteria) this;
        }

        public Criteria andUseSellNotBetween(String value1, String value2) {
            addCriterion("use_sell not between", value1, value2, "useSell");
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