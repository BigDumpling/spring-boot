package com.ligq.study.mybatis.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TCreditLimitLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCreditLimitLogExample() {
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

        public Criteria andCreditLimitIdIsNull() {
            addCriterion("CREDIT_LIMIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIdIsNotNull() {
            addCriterion("CREDIT_LIMIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIdEqualTo(String value) {
            addCriterion("CREDIT_LIMIT_ID =", value, "creditLimitId");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIdNotEqualTo(String value) {
            addCriterion("CREDIT_LIMIT_ID <>", value, "creditLimitId");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIdGreaterThan(String value) {
            addCriterion("CREDIT_LIMIT_ID >", value, "creditLimitId");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_LIMIT_ID >=", value, "creditLimitId");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIdLessThan(String value) {
            addCriterion("CREDIT_LIMIT_ID <", value, "creditLimitId");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIdLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_LIMIT_ID <=", value, "creditLimitId");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIdLike(String value) {
            addCriterion("CREDIT_LIMIT_ID like", value, "creditLimitId");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIdNotLike(String value) {
            addCriterion("CREDIT_LIMIT_ID not like", value, "creditLimitId");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIdIn(List<String> values) {
            addCriterion("CREDIT_LIMIT_ID in", values, "creditLimitId");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIdNotIn(List<String> values) {
            addCriterion("CREDIT_LIMIT_ID not in", values, "creditLimitId");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIdBetween(String value1, String value2) {
            addCriterion("CREDIT_LIMIT_ID between", value1, value2, "creditLimitId");
            return (Criteria) this;
        }

        public Criteria andCreditLimitIdNotBetween(String value1, String value2) {
            addCriterion("CREDIT_LIMIT_ID not between", value1, value2, "creditLimitId");
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

        public Criteria andBizIdIsNull() {
            addCriterion("BIZ_ID is null");
            return (Criteria) this;
        }

        public Criteria andBizIdIsNotNull() {
            addCriterion("BIZ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBizIdEqualTo(String value) {
            addCriterion("BIZ_ID =", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotEqualTo(String value) {
            addCriterion("BIZ_ID <>", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdGreaterThan(String value) {
            addCriterion("BIZ_ID >", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ_ID >=", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLessThan(String value) {
            addCriterion("BIZ_ID <", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLessThanOrEqualTo(String value) {
            addCriterion("BIZ_ID <=", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLike(String value) {
            addCriterion("BIZ_ID like", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotLike(String value) {
            addCriterion("BIZ_ID not like", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdIn(List<String> values) {
            addCriterion("BIZ_ID in", values, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotIn(List<String> values) {
            addCriterion("BIZ_ID not in", values, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdBetween(String value1, String value2) {
            addCriterion("BIZ_ID between", value1, value2, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotBetween(String value1, String value2) {
            addCriterion("BIZ_ID not between", value1, value2, "bizId");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNull() {
            addCriterion("OP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNotNull() {
            addCriterion("OP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpTypeEqualTo(String value) {
            addCriterion("OP_TYPE =", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotEqualTo(String value) {
            addCriterion("OP_TYPE <>", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThan(String value) {
            addCriterion("OP_TYPE >", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OP_TYPE >=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThan(String value) {
            addCriterion("OP_TYPE <", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThanOrEqualTo(String value) {
            addCriterion("OP_TYPE <=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLike(String value) {
            addCriterion("OP_TYPE like", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotLike(String value) {
            addCriterion("OP_TYPE not like", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeIn(List<String> values) {
            addCriterion("OP_TYPE in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotIn(List<String> values) {
            addCriterion("OP_TYPE not in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeBetween(String value1, String value2) {
            addCriterion("OP_TYPE between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotBetween(String value1, String value2) {
            addCriterion("OP_TYPE not between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andOpAmtIsNull() {
            addCriterion("OP_AMT is null");
            return (Criteria) this;
        }

        public Criteria andOpAmtIsNotNull() {
            addCriterion("OP_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andOpAmtEqualTo(Long value) {
            addCriterion("OP_AMT =", value, "opAmt");
            return (Criteria) this;
        }

        public Criteria andOpAmtNotEqualTo(Long value) {
            addCriterion("OP_AMT <>", value, "opAmt");
            return (Criteria) this;
        }

        public Criteria andOpAmtGreaterThan(Long value) {
            addCriterion("OP_AMT >", value, "opAmt");
            return (Criteria) this;
        }

        public Criteria andOpAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("OP_AMT >=", value, "opAmt");
            return (Criteria) this;
        }

        public Criteria andOpAmtLessThan(Long value) {
            addCriterion("OP_AMT <", value, "opAmt");
            return (Criteria) this;
        }

        public Criteria andOpAmtLessThanOrEqualTo(Long value) {
            addCriterion("OP_AMT <=", value, "opAmt");
            return (Criteria) this;
        }

        public Criteria andOpAmtIn(List<Long> values) {
            addCriterion("OP_AMT in", values, "opAmt");
            return (Criteria) this;
        }

        public Criteria andOpAmtNotIn(List<Long> values) {
            addCriterion("OP_AMT not in", values, "opAmt");
            return (Criteria) this;
        }

        public Criteria andOpAmtBetween(Long value1, Long value2) {
            addCriterion("OP_AMT between", value1, value2, "opAmt");
            return (Criteria) this;
        }

        public Criteria andOpAmtNotBetween(Long value1, Long value2) {
            addCriterion("OP_AMT not between", value1, value2, "opAmt");
            return (Criteria) this;
        }

        public Criteria andOldLimitAmtIsNull() {
            addCriterion("OLD_LIMIT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andOldLimitAmtIsNotNull() {
            addCriterion("OLD_LIMIT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andOldLimitAmtEqualTo(Long value) {
            addCriterion("OLD_LIMIT_AMT =", value, "oldLimitAmt");
            return (Criteria) this;
        }

        public Criteria andOldLimitAmtNotEqualTo(Long value) {
            addCriterion("OLD_LIMIT_AMT <>", value, "oldLimitAmt");
            return (Criteria) this;
        }

        public Criteria andOldLimitAmtGreaterThan(Long value) {
            addCriterion("OLD_LIMIT_AMT >", value, "oldLimitAmt");
            return (Criteria) this;
        }

        public Criteria andOldLimitAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("OLD_LIMIT_AMT >=", value, "oldLimitAmt");
            return (Criteria) this;
        }

        public Criteria andOldLimitAmtLessThan(Long value) {
            addCriterion("OLD_LIMIT_AMT <", value, "oldLimitAmt");
            return (Criteria) this;
        }

        public Criteria andOldLimitAmtLessThanOrEqualTo(Long value) {
            addCriterion("OLD_LIMIT_AMT <=", value, "oldLimitAmt");
            return (Criteria) this;
        }

        public Criteria andOldLimitAmtIn(List<Long> values) {
            addCriterion("OLD_LIMIT_AMT in", values, "oldLimitAmt");
            return (Criteria) this;
        }

        public Criteria andOldLimitAmtNotIn(List<Long> values) {
            addCriterion("OLD_LIMIT_AMT not in", values, "oldLimitAmt");
            return (Criteria) this;
        }

        public Criteria andOldLimitAmtBetween(Long value1, Long value2) {
            addCriterion("OLD_LIMIT_AMT between", value1, value2, "oldLimitAmt");
            return (Criteria) this;
        }

        public Criteria andOldLimitAmtNotBetween(Long value1, Long value2) {
            addCriterion("OLD_LIMIT_AMT not between", value1, value2, "oldLimitAmt");
            return (Criteria) this;
        }

        public Criteria andNewLimitAmtIsNull() {
            addCriterion("NEW_LIMIT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andNewLimitAmtIsNotNull() {
            addCriterion("NEW_LIMIT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andNewLimitAmtEqualTo(Long value) {
            addCriterion("NEW_LIMIT_AMT =", value, "newLimitAmt");
            return (Criteria) this;
        }

        public Criteria andNewLimitAmtNotEqualTo(Long value) {
            addCriterion("NEW_LIMIT_AMT <>", value, "newLimitAmt");
            return (Criteria) this;
        }

        public Criteria andNewLimitAmtGreaterThan(Long value) {
            addCriterion("NEW_LIMIT_AMT >", value, "newLimitAmt");
            return (Criteria) this;
        }

        public Criteria andNewLimitAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("NEW_LIMIT_AMT >=", value, "newLimitAmt");
            return (Criteria) this;
        }

        public Criteria andNewLimitAmtLessThan(Long value) {
            addCriterion("NEW_LIMIT_AMT <", value, "newLimitAmt");
            return (Criteria) this;
        }

        public Criteria andNewLimitAmtLessThanOrEqualTo(Long value) {
            addCriterion("NEW_LIMIT_AMT <=", value, "newLimitAmt");
            return (Criteria) this;
        }

        public Criteria andNewLimitAmtIn(List<Long> values) {
            addCriterion("NEW_LIMIT_AMT in", values, "newLimitAmt");
            return (Criteria) this;
        }

        public Criteria andNewLimitAmtNotIn(List<Long> values) {
            addCriterion("NEW_LIMIT_AMT not in", values, "newLimitAmt");
            return (Criteria) this;
        }

        public Criteria andNewLimitAmtBetween(Long value1, Long value2) {
            addCriterion("NEW_LIMIT_AMT between", value1, value2, "newLimitAmt");
            return (Criteria) this;
        }

        public Criteria andNewLimitAmtNotBetween(Long value1, Long value2) {
            addCriterion("NEW_LIMIT_AMT not between", value1, value2, "newLimitAmt");
            return (Criteria) this;
        }

        public Criteria andDueDayIsNull() {
            addCriterion("DUE_DAY is null");
            return (Criteria) this;
        }

        public Criteria andDueDayIsNotNull() {
            addCriterion("DUE_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andDueDayEqualTo(Long value) {
            addCriterion("DUE_DAY =", value, "dueDay");
            return (Criteria) this;
        }

        public Criteria andDueDayNotEqualTo(Long value) {
            addCriterion("DUE_DAY <>", value, "dueDay");
            return (Criteria) this;
        }

        public Criteria andDueDayGreaterThan(Long value) {
            addCriterion("DUE_DAY >", value, "dueDay");
            return (Criteria) this;
        }

        public Criteria andDueDayGreaterThanOrEqualTo(Long value) {
            addCriterion("DUE_DAY >=", value, "dueDay");
            return (Criteria) this;
        }

        public Criteria andDueDayLessThan(Long value) {
            addCriterion("DUE_DAY <", value, "dueDay");
            return (Criteria) this;
        }

        public Criteria andDueDayLessThanOrEqualTo(Long value) {
            addCriterion("DUE_DAY <=", value, "dueDay");
            return (Criteria) this;
        }

        public Criteria andDueDayIn(List<Long> values) {
            addCriterion("DUE_DAY in", values, "dueDay");
            return (Criteria) this;
        }

        public Criteria andDueDayNotIn(List<Long> values) {
            addCriterion("DUE_DAY not in", values, "dueDay");
            return (Criteria) this;
        }

        public Criteria andDueDayBetween(Long value1, Long value2) {
            addCriterion("DUE_DAY between", value1, value2, "dueDay");
            return (Criteria) this;
        }

        public Criteria andDueDayNotBetween(Long value1, Long value2) {
            addCriterion("DUE_DAY not between", value1, value2, "dueDay");
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

        public Criteria andHandleNumberIsNull() {
            addCriterion("HANDLE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andHandleNumberIsNotNull() {
            addCriterion("HANDLE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andHandleNumberEqualTo(Integer value) {
            addCriterion("HANDLE_NUMBER =", value, "handleNumber");
            return (Criteria) this;
        }

        public Criteria andHandleNumberNotEqualTo(Integer value) {
            addCriterion("HANDLE_NUMBER <>", value, "handleNumber");
            return (Criteria) this;
        }

        public Criteria andHandleNumberGreaterThan(Integer value) {
            addCriterion("HANDLE_NUMBER >", value, "handleNumber");
            return (Criteria) this;
        }

        public Criteria andHandleNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("HANDLE_NUMBER >=", value, "handleNumber");
            return (Criteria) this;
        }

        public Criteria andHandleNumberLessThan(Integer value) {
            addCriterion("HANDLE_NUMBER <", value, "handleNumber");
            return (Criteria) this;
        }

        public Criteria andHandleNumberLessThanOrEqualTo(Integer value) {
            addCriterion("HANDLE_NUMBER <=", value, "handleNumber");
            return (Criteria) this;
        }

        public Criteria andHandleNumberIn(List<Integer> values) {
            addCriterion("HANDLE_NUMBER in", values, "handleNumber");
            return (Criteria) this;
        }

        public Criteria andHandleNumberNotIn(List<Integer> values) {
            addCriterion("HANDLE_NUMBER not in", values, "handleNumber");
            return (Criteria) this;
        }

        public Criteria andHandleNumberBetween(Integer value1, Integer value2) {
            addCriterion("HANDLE_NUMBER between", value1, value2, "handleNumber");
            return (Criteria) this;
        }

        public Criteria andHandleNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("HANDLE_NUMBER not between", value1, value2, "handleNumber");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeIsNull() {
            addCriterion("OPERATOR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeIsNotNull() {
            addCriterion("OPERATOR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeEqualTo(String value) {
            addCriterion("OPERATOR_TYPE =", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeNotEqualTo(String value) {
            addCriterion("OPERATOR_TYPE <>", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeGreaterThan(String value) {
            addCriterion("OPERATOR_TYPE >", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR_TYPE >=", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeLessThan(String value) {
            addCriterion("OPERATOR_TYPE <", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR_TYPE <=", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeLike(String value) {
            addCriterion("OPERATOR_TYPE like", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeNotLike(String value) {
            addCriterion("OPERATOR_TYPE not like", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeIn(List<String> values) {
            addCriterion("OPERATOR_TYPE in", values, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeNotIn(List<String> values) {
            addCriterion("OPERATOR_TYPE not in", values, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeBetween(String value1, String value2) {
            addCriterion("OPERATOR_TYPE between", value1, value2, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeNotBetween(String value1, String value2) {
            addCriterion("OPERATOR_TYPE not between", value1, value2, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOldDueDayIsNull() {
            addCriterion("OLD_DUE_DAY is null");
            return (Criteria) this;
        }

        public Criteria andOldDueDayIsNotNull() {
            addCriterion("OLD_DUE_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andOldDueDayEqualTo(Long value) {
            addCriterion("OLD_DUE_DAY =", value, "oldDueDay");
            return (Criteria) this;
        }

        public Criteria andOldDueDayNotEqualTo(Long value) {
            addCriterion("OLD_DUE_DAY <>", value, "oldDueDay");
            return (Criteria) this;
        }

        public Criteria andOldDueDayGreaterThan(Long value) {
            addCriterion("OLD_DUE_DAY >", value, "oldDueDay");
            return (Criteria) this;
        }

        public Criteria andOldDueDayGreaterThanOrEqualTo(Long value) {
            addCriterion("OLD_DUE_DAY >=", value, "oldDueDay");
            return (Criteria) this;
        }

        public Criteria andOldDueDayLessThan(Long value) {
            addCriterion("OLD_DUE_DAY <", value, "oldDueDay");
            return (Criteria) this;
        }

        public Criteria andOldDueDayLessThanOrEqualTo(Long value) {
            addCriterion("OLD_DUE_DAY <=", value, "oldDueDay");
            return (Criteria) this;
        }

        public Criteria andOldDueDayIn(List<Long> values) {
            addCriterion("OLD_DUE_DAY in", values, "oldDueDay");
            return (Criteria) this;
        }

        public Criteria andOldDueDayNotIn(List<Long> values) {
            addCriterion("OLD_DUE_DAY not in", values, "oldDueDay");
            return (Criteria) this;
        }

        public Criteria andOldDueDayBetween(Long value1, Long value2) {
            addCriterion("OLD_DUE_DAY between", value1, value2, "oldDueDay");
            return (Criteria) this;
        }

        public Criteria andOldDueDayNotBetween(Long value1, Long value2) {
            addCriterion("OLD_DUE_DAY not between", value1, value2, "oldDueDay");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateDayIsNull() {
            addCriterion("OLD_MARKET_INTEREST_RATE_DAY is null");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateDayIsNotNull() {
            addCriterion("OLD_MARKET_INTEREST_RATE_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateDayEqualTo(BigDecimal value) {
            addCriterion("OLD_MARKET_INTEREST_RATE_DAY =", value, "oldMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateDayNotEqualTo(BigDecimal value) {
            addCriterion("OLD_MARKET_INTEREST_RATE_DAY <>", value, "oldMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateDayGreaterThan(BigDecimal value) {
            addCriterion("OLD_MARKET_INTEREST_RATE_DAY >", value, "oldMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateDayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OLD_MARKET_INTEREST_RATE_DAY >=", value, "oldMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateDayLessThan(BigDecimal value) {
            addCriterion("OLD_MARKET_INTEREST_RATE_DAY <", value, "oldMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateDayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OLD_MARKET_INTEREST_RATE_DAY <=", value, "oldMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateDayIn(List<BigDecimal> values) {
            addCriterion("OLD_MARKET_INTEREST_RATE_DAY in", values, "oldMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateDayNotIn(List<BigDecimal> values) {
            addCriterion("OLD_MARKET_INTEREST_RATE_DAY not in", values, "oldMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateDayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OLD_MARKET_INTEREST_RATE_DAY between", value1, value2, "oldMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateDayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OLD_MARKET_INTEREST_RATE_DAY not between", value1, value2, "oldMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateDayIsNull() {
            addCriterion("NEW_MARKET_INTEREST_RATE_DAY is null");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateDayIsNotNull() {
            addCriterion("NEW_MARKET_INTEREST_RATE_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateDayEqualTo(BigDecimal value) {
            addCriterion("NEW_MARKET_INTEREST_RATE_DAY =", value, "newMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateDayNotEqualTo(BigDecimal value) {
            addCriterion("NEW_MARKET_INTEREST_RATE_DAY <>", value, "newMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateDayGreaterThan(BigDecimal value) {
            addCriterion("NEW_MARKET_INTEREST_RATE_DAY >", value, "newMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateDayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NEW_MARKET_INTEREST_RATE_DAY >=", value, "newMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateDayLessThan(BigDecimal value) {
            addCriterion("NEW_MARKET_INTEREST_RATE_DAY <", value, "newMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateDayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NEW_MARKET_INTEREST_RATE_DAY <=", value, "newMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateDayIn(List<BigDecimal> values) {
            addCriterion("NEW_MARKET_INTEREST_RATE_DAY in", values, "newMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateDayNotIn(List<BigDecimal> values) {
            addCriterion("NEW_MARKET_INTEREST_RATE_DAY not in", values, "newMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateDayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEW_MARKET_INTEREST_RATE_DAY between", value1, value2, "newMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateDayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEW_MARKET_INTEREST_RATE_DAY not between", value1, value2, "newMarketInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateYearIsNull() {
            addCriterion("OLD_MARKET_INTEREST_RATE_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateYearIsNotNull() {
            addCriterion("OLD_MARKET_INTEREST_RATE_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateYearEqualTo(BigDecimal value) {
            addCriterion("OLD_MARKET_INTEREST_RATE_YEAR =", value, "oldMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateYearNotEqualTo(BigDecimal value) {
            addCriterion("OLD_MARKET_INTEREST_RATE_YEAR <>", value, "oldMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateYearGreaterThan(BigDecimal value) {
            addCriterion("OLD_MARKET_INTEREST_RATE_YEAR >", value, "oldMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateYearGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OLD_MARKET_INTEREST_RATE_YEAR >=", value, "oldMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateYearLessThan(BigDecimal value) {
            addCriterion("OLD_MARKET_INTEREST_RATE_YEAR <", value, "oldMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateYearLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OLD_MARKET_INTEREST_RATE_YEAR <=", value, "oldMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateYearIn(List<BigDecimal> values) {
            addCriterion("OLD_MARKET_INTEREST_RATE_YEAR in", values, "oldMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateYearNotIn(List<BigDecimal> values) {
            addCriterion("OLD_MARKET_INTEREST_RATE_YEAR not in", values, "oldMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateYearBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OLD_MARKET_INTEREST_RATE_YEAR between", value1, value2, "oldMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andOldMarketInterestRateYearNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OLD_MARKET_INTEREST_RATE_YEAR not between", value1, value2, "oldMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateYearIsNull() {
            addCriterion("NEW_MARKET_INTEREST_RATE_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateYearIsNotNull() {
            addCriterion("NEW_MARKET_INTEREST_RATE_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateYearEqualTo(BigDecimal value) {
            addCriterion("NEW_MARKET_INTEREST_RATE_YEAR =", value, "newMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateYearNotEqualTo(BigDecimal value) {
            addCriterion("NEW_MARKET_INTEREST_RATE_YEAR <>", value, "newMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateYearGreaterThan(BigDecimal value) {
            addCriterion("NEW_MARKET_INTEREST_RATE_YEAR >", value, "newMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateYearGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NEW_MARKET_INTEREST_RATE_YEAR >=", value, "newMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateYearLessThan(BigDecimal value) {
            addCriterion("NEW_MARKET_INTEREST_RATE_YEAR <", value, "newMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateYearLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NEW_MARKET_INTEREST_RATE_YEAR <=", value, "newMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateYearIn(List<BigDecimal> values) {
            addCriterion("NEW_MARKET_INTEREST_RATE_YEAR in", values, "newMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateYearNotIn(List<BigDecimal> values) {
            addCriterion("NEW_MARKET_INTEREST_RATE_YEAR not in", values, "newMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateYearBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEW_MARKET_INTEREST_RATE_YEAR between", value1, value2, "newMarketInterestRateYear");
            return (Criteria) this;
        }

        public Criteria andNewMarketInterestRateYearNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEW_MARKET_INTEREST_RATE_YEAR not between", value1, value2, "newMarketInterestRateYear");
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