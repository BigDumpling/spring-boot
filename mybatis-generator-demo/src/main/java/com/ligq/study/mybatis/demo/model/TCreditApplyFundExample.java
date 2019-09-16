package com.ligq.study.mybatis.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TCreditApplyFundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCreditApplyFundExample() {
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

        public Criteria andCreditApplyLogIdIsNull() {
            addCriterion("CREDIT_APPLY_LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLogIdIsNotNull() {
            addCriterion("CREDIT_APPLY_LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLogIdEqualTo(String value) {
            addCriterion("CREDIT_APPLY_LOG_ID =", value, "creditApplyLogId");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLogIdNotEqualTo(String value) {
            addCriterion("CREDIT_APPLY_LOG_ID <>", value, "creditApplyLogId");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLogIdGreaterThan(String value) {
            addCriterion("CREDIT_APPLY_LOG_ID >", value, "creditApplyLogId");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLogIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_APPLY_LOG_ID >=", value, "creditApplyLogId");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLogIdLessThan(String value) {
            addCriterion("CREDIT_APPLY_LOG_ID <", value, "creditApplyLogId");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLogIdLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_APPLY_LOG_ID <=", value, "creditApplyLogId");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLogIdLike(String value) {
            addCriterion("CREDIT_APPLY_LOG_ID like", value, "creditApplyLogId");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLogIdNotLike(String value) {
            addCriterion("CREDIT_APPLY_LOG_ID not like", value, "creditApplyLogId");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLogIdIn(List<String> values) {
            addCriterion("CREDIT_APPLY_LOG_ID in", values, "creditApplyLogId");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLogIdNotIn(List<String> values) {
            addCriterion("CREDIT_APPLY_LOG_ID not in", values, "creditApplyLogId");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLogIdBetween(String value1, String value2) {
            addCriterion("CREDIT_APPLY_LOG_ID between", value1, value2, "creditApplyLogId");
            return (Criteria) this;
        }

        public Criteria andCreditApplyLogIdNotBetween(String value1, String value2) {
            addCriterion("CREDIT_APPLY_LOG_ID not between", value1, value2, "creditApplyLogId");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeIsNull() {
            addCriterion("FUND_ORG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeIsNotNull() {
            addCriterion("FUND_ORG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeEqualTo(String value) {
            addCriterion("FUND_ORG_CODE =", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeNotEqualTo(String value) {
            addCriterion("FUND_ORG_CODE <>", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeGreaterThan(String value) {
            addCriterion("FUND_ORG_CODE >", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_ORG_CODE >=", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeLessThan(String value) {
            addCriterion("FUND_ORG_CODE <", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("FUND_ORG_CODE <=", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeLike(String value) {
            addCriterion("FUND_ORG_CODE like", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeNotLike(String value) {
            addCriterion("FUND_ORG_CODE not like", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeIn(List<String> values) {
            addCriterion("FUND_ORG_CODE in", values, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeNotIn(List<String> values) {
            addCriterion("FUND_ORG_CODE not in", values, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeBetween(String value1, String value2) {
            addCriterion("FUND_ORG_CODE between", value1, value2, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeNotBetween(String value1, String value2) {
            addCriterion("FUND_ORG_CODE not between", value1, value2, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameIsNull() {
            addCriterion("FUND_ORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameIsNotNull() {
            addCriterion("FUND_ORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameEqualTo(String value) {
            addCriterion("FUND_ORG_NAME =", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameNotEqualTo(String value) {
            addCriterion("FUND_ORG_NAME <>", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameGreaterThan(String value) {
            addCriterion("FUND_ORG_NAME >", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_ORG_NAME >=", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameLessThan(String value) {
            addCriterion("FUND_ORG_NAME <", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameLessThanOrEqualTo(String value) {
            addCriterion("FUND_ORG_NAME <=", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameLike(String value) {
            addCriterion("FUND_ORG_NAME like", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameNotLike(String value) {
            addCriterion("FUND_ORG_NAME not like", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameIn(List<String> values) {
            addCriterion("FUND_ORG_NAME in", values, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameNotIn(List<String> values) {
            addCriterion("FUND_ORG_NAME not in", values, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameBetween(String value1, String value2) {
            addCriterion("FUND_ORG_NAME between", value1, value2, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameNotBetween(String value1, String value2) {
            addCriterion("FUND_ORG_NAME not between", value1, value2, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundTypeIsNull() {
            addCriterion("FUND_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFundTypeIsNotNull() {
            addCriterion("FUND_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFundTypeEqualTo(String value) {
            addCriterion("FUND_TYPE =", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotEqualTo(String value) {
            addCriterion("FUND_TYPE <>", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeGreaterThan(String value) {
            addCriterion("FUND_TYPE >", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_TYPE >=", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeLessThan(String value) {
            addCriterion("FUND_TYPE <", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeLessThanOrEqualTo(String value) {
            addCriterion("FUND_TYPE <=", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeLike(String value) {
            addCriterion("FUND_TYPE like", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotLike(String value) {
            addCriterion("FUND_TYPE not like", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeIn(List<String> values) {
            addCriterion("FUND_TYPE in", values, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotIn(List<String> values) {
            addCriterion("FUND_TYPE not in", values, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeBetween(String value1, String value2) {
            addCriterion("FUND_TYPE between", value1, value2, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotBetween(String value1, String value2) {
            addCriterion("FUND_TYPE not between", value1, value2, "fundType");
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