package com.ligq.study.mybatis.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TCreditLimitInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCreditLimitInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("CUSTOMER_ID like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("CUSTOMER_ID not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("ID_NO =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("ID_NO <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("ID_NO >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("ID_NO <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("ID_NO <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("ID_NO like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("ID_NO not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("ID_NO in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("ID_NO not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("ID_NO between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("ID_NO not between", value1, value2, "idNo");
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

        public Criteria andLimitAmtIsNull() {
            addCriterion("LIMIT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andLimitAmtIsNotNull() {
            addCriterion("LIMIT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andLimitAmtEqualTo(Long value) {
            addCriterion("LIMIT_AMT =", value, "limitAmt");
            return (Criteria) this;
        }

        public Criteria andLimitAmtNotEqualTo(Long value) {
            addCriterion("LIMIT_AMT <>", value, "limitAmt");
            return (Criteria) this;
        }

        public Criteria andLimitAmtGreaterThan(Long value) {
            addCriterion("LIMIT_AMT >", value, "limitAmt");
            return (Criteria) this;
        }

        public Criteria andLimitAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("LIMIT_AMT >=", value, "limitAmt");
            return (Criteria) this;
        }

        public Criteria andLimitAmtLessThan(Long value) {
            addCriterion("LIMIT_AMT <", value, "limitAmt");
            return (Criteria) this;
        }

        public Criteria andLimitAmtLessThanOrEqualTo(Long value) {
            addCriterion("LIMIT_AMT <=", value, "limitAmt");
            return (Criteria) this;
        }

        public Criteria andLimitAmtIn(List<Long> values) {
            addCriterion("LIMIT_AMT in", values, "limitAmt");
            return (Criteria) this;
        }

        public Criteria andLimitAmtNotIn(List<Long> values) {
            addCriterion("LIMIT_AMT not in", values, "limitAmt");
            return (Criteria) this;
        }

        public Criteria andLimitAmtBetween(Long value1, Long value2) {
            addCriterion("LIMIT_AMT between", value1, value2, "limitAmt");
            return (Criteria) this;
        }

        public Criteria andLimitAmtNotBetween(Long value1, Long value2) {
            addCriterion("LIMIT_AMT not between", value1, value2, "limitAmt");
            return (Criteria) this;
        }

        public Criteria andLoanLimitAmtIsNull() {
            addCriterion("LOAN_LIMIT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andLoanLimitAmtIsNotNull() {
            addCriterion("LOAN_LIMIT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanLimitAmtEqualTo(Long value) {
            addCriterion("LOAN_LIMIT_AMT =", value, "loanLimitAmt");
            return (Criteria) this;
        }

        public Criteria andLoanLimitAmtNotEqualTo(Long value) {
            addCriterion("LOAN_LIMIT_AMT <>", value, "loanLimitAmt");
            return (Criteria) this;
        }

        public Criteria andLoanLimitAmtGreaterThan(Long value) {
            addCriterion("LOAN_LIMIT_AMT >", value, "loanLimitAmt");
            return (Criteria) this;
        }

        public Criteria andLoanLimitAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("LOAN_LIMIT_AMT >=", value, "loanLimitAmt");
            return (Criteria) this;
        }

        public Criteria andLoanLimitAmtLessThan(Long value) {
            addCriterion("LOAN_LIMIT_AMT <", value, "loanLimitAmt");
            return (Criteria) this;
        }

        public Criteria andLoanLimitAmtLessThanOrEqualTo(Long value) {
            addCriterion("LOAN_LIMIT_AMT <=", value, "loanLimitAmt");
            return (Criteria) this;
        }

        public Criteria andLoanLimitAmtIn(List<Long> values) {
            addCriterion("LOAN_LIMIT_AMT in", values, "loanLimitAmt");
            return (Criteria) this;
        }

        public Criteria andLoanLimitAmtNotIn(List<Long> values) {
            addCriterion("LOAN_LIMIT_AMT not in", values, "loanLimitAmt");
            return (Criteria) this;
        }

        public Criteria andLoanLimitAmtBetween(Long value1, Long value2) {
            addCriterion("LOAN_LIMIT_AMT between", value1, value2, "loanLimitAmt");
            return (Criteria) this;
        }

        public Criteria andLoanLimitAmtNotBetween(Long value1, Long value2) {
            addCriterion("LOAN_LIMIT_AMT not between", value1, value2, "loanLimitAmt");
            return (Criteria) this;
        }

        public Criteria andUnavailableLimitAmtIsNull() {
            addCriterion("UNAVAILABLE_LIMIT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andUnavailableLimitAmtIsNotNull() {
            addCriterion("UNAVAILABLE_LIMIT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andUnavailableLimitAmtEqualTo(Long value) {
            addCriterion("UNAVAILABLE_LIMIT_AMT =", value, "unavailableLimitAmt");
            return (Criteria) this;
        }

        public Criteria andUnavailableLimitAmtNotEqualTo(Long value) {
            addCriterion("UNAVAILABLE_LIMIT_AMT <>", value, "unavailableLimitAmt");
            return (Criteria) this;
        }

        public Criteria andUnavailableLimitAmtGreaterThan(Long value) {
            addCriterion("UNAVAILABLE_LIMIT_AMT >", value, "unavailableLimitAmt");
            return (Criteria) this;
        }

        public Criteria andUnavailableLimitAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("UNAVAILABLE_LIMIT_AMT >=", value, "unavailableLimitAmt");
            return (Criteria) this;
        }

        public Criteria andUnavailableLimitAmtLessThan(Long value) {
            addCriterion("UNAVAILABLE_LIMIT_AMT <", value, "unavailableLimitAmt");
            return (Criteria) this;
        }

        public Criteria andUnavailableLimitAmtLessThanOrEqualTo(Long value) {
            addCriterion("UNAVAILABLE_LIMIT_AMT <=", value, "unavailableLimitAmt");
            return (Criteria) this;
        }

        public Criteria andUnavailableLimitAmtIn(List<Long> values) {
            addCriterion("UNAVAILABLE_LIMIT_AMT in", values, "unavailableLimitAmt");
            return (Criteria) this;
        }

        public Criteria andUnavailableLimitAmtNotIn(List<Long> values) {
            addCriterion("UNAVAILABLE_LIMIT_AMT not in", values, "unavailableLimitAmt");
            return (Criteria) this;
        }

        public Criteria andUnavailableLimitAmtBetween(Long value1, Long value2) {
            addCriterion("UNAVAILABLE_LIMIT_AMT between", value1, value2, "unavailableLimitAmt");
            return (Criteria) this;
        }

        public Criteria andUnavailableLimitAmtNotBetween(Long value1, Long value2) {
            addCriterion("UNAVAILABLE_LIMIT_AMT not between", value1, value2, "unavailableLimitAmt");
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

        public Criteria andDueDayEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_DAY =", value, "dueDay");
            return (Criteria) this;
        }

        public Criteria andDueDayNotEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_DAY <>", value, "dueDay");
            return (Criteria) this;
        }

        public Criteria andDueDayGreaterThan(Date value) {
            addCriterionForJDBCDate("DUE_DAY >", value, "dueDay");
            return (Criteria) this;
        }

        public Criteria andDueDayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_DAY >=", value, "dueDay");
            return (Criteria) this;
        }

        public Criteria andDueDayLessThan(Date value) {
            addCriterionForJDBCDate("DUE_DAY <", value, "dueDay");
            return (Criteria) this;
        }

        public Criteria andDueDayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DUE_DAY <=", value, "dueDay");
            return (Criteria) this;
        }

        public Criteria andDueDayIn(List<Date> values) {
            addCriterionForJDBCDate("DUE_DAY in", values, "dueDay");
            return (Criteria) this;
        }

        public Criteria andDueDayNotIn(List<Date> values) {
            addCriterionForJDBCDate("DUE_DAY not in", values, "dueDay");
            return (Criteria) this;
        }

        public Criteria andDueDayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DUE_DAY between", value1, value2, "dueDay");
            return (Criteria) this;
        }

        public Criteria andDueDayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DUE_DAY not between", value1, value2, "dueDay");
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

        public Criteria andFeeRateIsNull() {
            addCriterion("FEE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andFeeRateIsNotNull() {
            addCriterion("FEE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeRateEqualTo(BigDecimal value) {
            addCriterion("FEE_RATE =", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateNotEqualTo(BigDecimal value) {
            addCriterion("FEE_RATE <>", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateGreaterThan(BigDecimal value) {
            addCriterion("FEE_RATE >", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_RATE >=", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateLessThan(BigDecimal value) {
            addCriterion("FEE_RATE <", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_RATE <=", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateIn(List<BigDecimal> values) {
            addCriterion("FEE_RATE in", values, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateNotIn(List<BigDecimal> values) {
            addCriterion("FEE_RATE not in", values, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_RATE between", value1, value2, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_RATE not between", value1, value2, "feeRate");
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

        public Criteria andLoopFlagIsNull() {
            addCriterion("LOOP_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andLoopFlagIsNotNull() {
            addCriterion("LOOP_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andLoopFlagEqualTo(String value) {
            addCriterion("LOOP_FLAG =", value, "loopFlag");
            return (Criteria) this;
        }

        public Criteria andLoopFlagNotEqualTo(String value) {
            addCriterion("LOOP_FLAG <>", value, "loopFlag");
            return (Criteria) this;
        }

        public Criteria andLoopFlagGreaterThan(String value) {
            addCriterion("LOOP_FLAG >", value, "loopFlag");
            return (Criteria) this;
        }

        public Criteria andLoopFlagGreaterThanOrEqualTo(String value) {
            addCriterion("LOOP_FLAG >=", value, "loopFlag");
            return (Criteria) this;
        }

        public Criteria andLoopFlagLessThan(String value) {
            addCriterion("LOOP_FLAG <", value, "loopFlag");
            return (Criteria) this;
        }

        public Criteria andLoopFlagLessThanOrEqualTo(String value) {
            addCriterion("LOOP_FLAG <=", value, "loopFlag");
            return (Criteria) this;
        }

        public Criteria andLoopFlagLike(String value) {
            addCriterion("LOOP_FLAG like", value, "loopFlag");
            return (Criteria) this;
        }

        public Criteria andLoopFlagNotLike(String value) {
            addCriterion("LOOP_FLAG not like", value, "loopFlag");
            return (Criteria) this;
        }

        public Criteria andLoopFlagIn(List<String> values) {
            addCriterion("LOOP_FLAG in", values, "loopFlag");
            return (Criteria) this;
        }

        public Criteria andLoopFlagNotIn(List<String> values) {
            addCriterion("LOOP_FLAG not in", values, "loopFlag");
            return (Criteria) this;
        }

        public Criteria andLoopFlagBetween(String value1, String value2) {
            addCriterion("LOOP_FLAG between", value1, value2, "loopFlag");
            return (Criteria) this;
        }

        public Criteria andLoopFlagNotBetween(String value1, String value2) {
            addCriterion("LOOP_FLAG not between", value1, value2, "loopFlag");
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

        public Criteria andOutBizIdIsNull() {
            addCriterion("OUT_BIZ_ID is null");
            return (Criteria) this;
        }

        public Criteria andOutBizIdIsNotNull() {
            addCriterion("OUT_BIZ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOutBizIdEqualTo(String value) {
            addCriterion("OUT_BIZ_ID =", value, "outBizId");
            return (Criteria) this;
        }

        public Criteria andOutBizIdNotEqualTo(String value) {
            addCriterion("OUT_BIZ_ID <>", value, "outBizId");
            return (Criteria) this;
        }

        public Criteria andOutBizIdGreaterThan(String value) {
            addCriterion("OUT_BIZ_ID >", value, "outBizId");
            return (Criteria) this;
        }

        public Criteria andOutBizIdGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_BIZ_ID >=", value, "outBizId");
            return (Criteria) this;
        }

        public Criteria andOutBizIdLessThan(String value) {
            addCriterion("OUT_BIZ_ID <", value, "outBizId");
            return (Criteria) this;
        }

        public Criteria andOutBizIdLessThanOrEqualTo(String value) {
            addCriterion("OUT_BIZ_ID <=", value, "outBizId");
            return (Criteria) this;
        }

        public Criteria andOutBizIdLike(String value) {
            addCriterion("OUT_BIZ_ID like", value, "outBizId");
            return (Criteria) this;
        }

        public Criteria andOutBizIdNotLike(String value) {
            addCriterion("OUT_BIZ_ID not like", value, "outBizId");
            return (Criteria) this;
        }

        public Criteria andOutBizIdIn(List<String> values) {
            addCriterion("OUT_BIZ_ID in", values, "outBizId");
            return (Criteria) this;
        }

        public Criteria andOutBizIdNotIn(List<String> values) {
            addCriterion("OUT_BIZ_ID not in", values, "outBizId");
            return (Criteria) this;
        }

        public Criteria andOutBizIdBetween(String value1, String value2) {
            addCriterion("OUT_BIZ_ID between", value1, value2, "outBizId");
            return (Criteria) this;
        }

        public Criteria andOutBizIdNotBetween(String value1, String value2) {
            addCriterion("OUT_BIZ_ID not between", value1, value2, "outBizId");
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