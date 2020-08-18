package com.ligq.study.mybatis.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TCreditApplyLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCreditApplyLogExample() {
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

        public Criteria andOutApplyIdIsNull() {
            addCriterion("OUT_APPLY_ID is null");
            return (Criteria) this;
        }

        public Criteria andOutApplyIdIsNotNull() {
            addCriterion("OUT_APPLY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOutApplyIdEqualTo(String value) {
            addCriterion("OUT_APPLY_ID =", value, "outApplyId");
            return (Criteria) this;
        }

        public Criteria andOutApplyIdNotEqualTo(String value) {
            addCriterion("OUT_APPLY_ID <>", value, "outApplyId");
            return (Criteria) this;
        }

        public Criteria andOutApplyIdGreaterThan(String value) {
            addCriterion("OUT_APPLY_ID >", value, "outApplyId");
            return (Criteria) this;
        }

        public Criteria andOutApplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_APPLY_ID >=", value, "outApplyId");
            return (Criteria) this;
        }

        public Criteria andOutApplyIdLessThan(String value) {
            addCriterion("OUT_APPLY_ID <", value, "outApplyId");
            return (Criteria) this;
        }

        public Criteria andOutApplyIdLessThanOrEqualTo(String value) {
            addCriterion("OUT_APPLY_ID <=", value, "outApplyId");
            return (Criteria) this;
        }

        public Criteria andOutApplyIdLike(String value) {
            addCriterion("OUT_APPLY_ID like", value, "outApplyId");
            return (Criteria) this;
        }

        public Criteria andOutApplyIdNotLike(String value) {
            addCriterion("OUT_APPLY_ID not like", value, "outApplyId");
            return (Criteria) this;
        }

        public Criteria andOutApplyIdIn(List<String> values) {
            addCriterion("OUT_APPLY_ID in", values, "outApplyId");
            return (Criteria) this;
        }

        public Criteria andOutApplyIdNotIn(List<String> values) {
            addCriterion("OUT_APPLY_ID not in", values, "outApplyId");
            return (Criteria) this;
        }

        public Criteria andOutApplyIdBetween(String value1, String value2) {
            addCriterion("OUT_APPLY_ID between", value1, value2, "outApplyId");
            return (Criteria) this;
        }

        public Criteria andOutApplyIdNotBetween(String value1, String value2) {
            addCriterion("OUT_APPLY_ID not between", value1, value2, "outApplyId");
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

        public Criteria andLoginNoIsNull() {
            addCriterion("LOGIN_NO is null");
            return (Criteria) this;
        }

        public Criteria andLoginNoIsNotNull() {
            addCriterion("LOGIN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNoEqualTo(String value) {
            addCriterion("LOGIN_NO =", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoNotEqualTo(String value) {
            addCriterion("LOGIN_NO <>", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoGreaterThan(String value) {
            addCriterion("LOGIN_NO >", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_NO >=", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoLessThan(String value) {
            addCriterion("LOGIN_NO <", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_NO <=", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoLike(String value) {
            addCriterion("LOGIN_NO like", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoNotLike(String value) {
            addCriterion("LOGIN_NO not like", value, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoIn(List<String> values) {
            addCriterion("LOGIN_NO in", values, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoNotIn(List<String> values) {
            addCriterion("LOGIN_NO not in", values, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoBetween(String value1, String value2) {
            addCriterion("LOGIN_NO between", value1, value2, "loginNo");
            return (Criteria) this;
        }

        public Criteria andLoginNoNotBetween(String value1, String value2) {
            addCriterion("LOGIN_NO not between", value1, value2, "loginNo");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelIsNull() {
            addCriterion("CUSTOMER_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelIsNotNull() {
            addCriterion("CUSTOMER_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelEqualTo(String value) {
            addCriterion("CUSTOMER_LABEL =", value, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelNotEqualTo(String value) {
            addCriterion("CUSTOMER_LABEL <>", value, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelGreaterThan(String value) {
            addCriterion("CUSTOMER_LABEL >", value, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_LABEL >=", value, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelLessThan(String value) {
            addCriterion("CUSTOMER_LABEL <", value, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_LABEL <=", value, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelLike(String value) {
            addCriterion("CUSTOMER_LABEL like", value, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelNotLike(String value) {
            addCriterion("CUSTOMER_LABEL not like", value, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelIn(List<String> values) {
            addCriterion("CUSTOMER_LABEL in", values, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelNotIn(List<String> values) {
            addCriterion("CUSTOMER_LABEL not in", values, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelBetween(String value1, String value2) {
            addCriterion("CUSTOMER_LABEL between", value1, value2, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_LABEL not between", value1, value2, "customerLabel");
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

        public Criteria andContractIdIsNull() {
            addCriterion("CONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("CONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("CONTRACT_ID =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("CONTRACT_ID <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("CONTRACT_ID >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("CONTRACT_ID <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("CONTRACT_ID like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("CONTRACT_ID not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("CONTRACT_ID in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("CONTRACT_ID not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNull() {
            addCriterion("CONTRACT_NO is null");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNotNull() {
            addCriterion("CONTRACT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andContractNoEqualTo(String value) {
            addCriterion("CONTRACT_NO =", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotEqualTo(String value) {
            addCriterion("CONTRACT_NO <>", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThan(String value) {
            addCriterion("CONTRACT_NO >", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_NO >=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThan(String value) {
            addCriterion("CONTRACT_NO <", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_NO <=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLike(String value) {
            addCriterion("CONTRACT_NO like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotLike(String value) {
            addCriterion("CONTRACT_NO not like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoIn(List<String> values) {
            addCriterion("CONTRACT_NO in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotIn(List<String> values) {
            addCriterion("CONTRACT_NO not in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoBetween(String value1, String value2) {
            addCriterion("CONTRACT_NO between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_NO not between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNameIsNull() {
            addCriterion("CONTRACT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andContractNameIsNotNull() {
            addCriterion("CONTRACT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andContractNameEqualTo(String value) {
            addCriterion("CONTRACT_NAME =", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotEqualTo(String value) {
            addCriterion("CONTRACT_NAME <>", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameGreaterThan(String value) {
            addCriterion("CONTRACT_NAME >", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_NAME >=", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLessThan(String value) {
            addCriterion("CONTRACT_NAME <", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_NAME <=", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLike(String value) {
            addCriterion("CONTRACT_NAME like", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotLike(String value) {
            addCriterion("CONTRACT_NAME not like", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameIn(List<String> values) {
            addCriterion("CONTRACT_NAME in", values, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotIn(List<String> values) {
            addCriterion("CONTRACT_NAME not in", values, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameBetween(String value1, String value2) {
            addCriterion("CONTRACT_NAME between", value1, value2, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_NAME not between", value1, value2, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractFileIdIsNull() {
            addCriterion("CONTRACT_FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractFileIdIsNotNull() {
            addCriterion("CONTRACT_FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractFileIdEqualTo(String value) {
            addCriterion("CONTRACT_FILE_ID =", value, "contractFileId");
            return (Criteria) this;
        }

        public Criteria andContractFileIdNotEqualTo(String value) {
            addCriterion("CONTRACT_FILE_ID <>", value, "contractFileId");
            return (Criteria) this;
        }

        public Criteria andContractFileIdGreaterThan(String value) {
            addCriterion("CONTRACT_FILE_ID >", value, "contractFileId");
            return (Criteria) this;
        }

        public Criteria andContractFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_FILE_ID >=", value, "contractFileId");
            return (Criteria) this;
        }

        public Criteria andContractFileIdLessThan(String value) {
            addCriterion("CONTRACT_FILE_ID <", value, "contractFileId");
            return (Criteria) this;
        }

        public Criteria andContractFileIdLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_FILE_ID <=", value, "contractFileId");
            return (Criteria) this;
        }

        public Criteria andContractFileIdLike(String value) {
            addCriterion("CONTRACT_FILE_ID like", value, "contractFileId");
            return (Criteria) this;
        }

        public Criteria andContractFileIdNotLike(String value) {
            addCriterion("CONTRACT_FILE_ID not like", value, "contractFileId");
            return (Criteria) this;
        }

        public Criteria andContractFileIdIn(List<String> values) {
            addCriterion("CONTRACT_FILE_ID in", values, "contractFileId");
            return (Criteria) this;
        }

        public Criteria andContractFileIdNotIn(List<String> values) {
            addCriterion("CONTRACT_FILE_ID not in", values, "contractFileId");
            return (Criteria) this;
        }

        public Criteria andContractFileIdBetween(String value1, String value2) {
            addCriterion("CONTRACT_FILE_ID between", value1, value2, "contractFileId");
            return (Criteria) this;
        }

        public Criteria andContractFileIdNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_FILE_ID not between", value1, value2, "contractFileId");
            return (Criteria) this;
        }

        public Criteria andFundContractIdsIsNull() {
            addCriterion("FUND_CONTRACT_IDS is null");
            return (Criteria) this;
        }

        public Criteria andFundContractIdsIsNotNull() {
            addCriterion("FUND_CONTRACT_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andFundContractIdsEqualTo(String value) {
            addCriterion("FUND_CONTRACT_IDS =", value, "fundContractIds");
            return (Criteria) this;
        }

        public Criteria andFundContractIdsNotEqualTo(String value) {
            addCriterion("FUND_CONTRACT_IDS <>", value, "fundContractIds");
            return (Criteria) this;
        }

        public Criteria andFundContractIdsGreaterThan(String value) {
            addCriterion("FUND_CONTRACT_IDS >", value, "fundContractIds");
            return (Criteria) this;
        }

        public Criteria andFundContractIdsGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_CONTRACT_IDS >=", value, "fundContractIds");
            return (Criteria) this;
        }

        public Criteria andFundContractIdsLessThan(String value) {
            addCriterion("FUND_CONTRACT_IDS <", value, "fundContractIds");
            return (Criteria) this;
        }

        public Criteria andFundContractIdsLessThanOrEqualTo(String value) {
            addCriterion("FUND_CONTRACT_IDS <=", value, "fundContractIds");
            return (Criteria) this;
        }

        public Criteria andFundContractIdsLike(String value) {
            addCriterion("FUND_CONTRACT_IDS like", value, "fundContractIds");
            return (Criteria) this;
        }

        public Criteria andFundContractIdsNotLike(String value) {
            addCriterion("FUND_CONTRACT_IDS not like", value, "fundContractIds");
            return (Criteria) this;
        }

        public Criteria andFundContractIdsIn(List<String> values) {
            addCriterion("FUND_CONTRACT_IDS in", values, "fundContractIds");
            return (Criteria) this;
        }

        public Criteria andFundContractIdsNotIn(List<String> values) {
            addCriterion("FUND_CONTRACT_IDS not in", values, "fundContractIds");
            return (Criteria) this;
        }

        public Criteria andFundContractIdsBetween(String value1, String value2) {
            addCriterion("FUND_CONTRACT_IDS between", value1, value2, "fundContractIds");
            return (Criteria) this;
        }

        public Criteria andFundContractIdsNotBetween(String value1, String value2) {
            addCriterion("FUND_CONTRACT_IDS not between", value1, value2, "fundContractIds");
            return (Criteria) this;
        }

        public Criteria andFundContractNosIsNull() {
            addCriterion("FUND_CONTRACT_NOS is null");
            return (Criteria) this;
        }

        public Criteria andFundContractNosIsNotNull() {
            addCriterion("FUND_CONTRACT_NOS is not null");
            return (Criteria) this;
        }

        public Criteria andFundContractNosEqualTo(String value) {
            addCriterion("FUND_CONTRACT_NOS =", value, "fundContractNos");
            return (Criteria) this;
        }

        public Criteria andFundContractNosNotEqualTo(String value) {
            addCriterion("FUND_CONTRACT_NOS <>", value, "fundContractNos");
            return (Criteria) this;
        }

        public Criteria andFundContractNosGreaterThan(String value) {
            addCriterion("FUND_CONTRACT_NOS >", value, "fundContractNos");
            return (Criteria) this;
        }

        public Criteria andFundContractNosGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_CONTRACT_NOS >=", value, "fundContractNos");
            return (Criteria) this;
        }

        public Criteria andFundContractNosLessThan(String value) {
            addCriterion("FUND_CONTRACT_NOS <", value, "fundContractNos");
            return (Criteria) this;
        }

        public Criteria andFundContractNosLessThanOrEqualTo(String value) {
            addCriterion("FUND_CONTRACT_NOS <=", value, "fundContractNos");
            return (Criteria) this;
        }

        public Criteria andFundContractNosLike(String value) {
            addCriterion("FUND_CONTRACT_NOS like", value, "fundContractNos");
            return (Criteria) this;
        }

        public Criteria andFundContractNosNotLike(String value) {
            addCriterion("FUND_CONTRACT_NOS not like", value, "fundContractNos");
            return (Criteria) this;
        }

        public Criteria andFundContractNosIn(List<String> values) {
            addCriterion("FUND_CONTRACT_NOS in", values, "fundContractNos");
            return (Criteria) this;
        }

        public Criteria andFundContractNosNotIn(List<String> values) {
            addCriterion("FUND_CONTRACT_NOS not in", values, "fundContractNos");
            return (Criteria) this;
        }

        public Criteria andFundContractNosBetween(String value1, String value2) {
            addCriterion("FUND_CONTRACT_NOS between", value1, value2, "fundContractNos");
            return (Criteria) this;
        }

        public Criteria andFundContractNosNotBetween(String value1, String value2) {
            addCriterion("FUND_CONTRACT_NOS not between", value1, value2, "fundContractNos");
            return (Criteria) this;
        }

        public Criteria andFundContractNamesIsNull() {
            addCriterion("FUND_CONTRACT_NAMES is null");
            return (Criteria) this;
        }

        public Criteria andFundContractNamesIsNotNull() {
            addCriterion("FUND_CONTRACT_NAMES is not null");
            return (Criteria) this;
        }

        public Criteria andFundContractNamesEqualTo(String value) {
            addCriterion("FUND_CONTRACT_NAMES =", value, "fundContractNames");
            return (Criteria) this;
        }

        public Criteria andFundContractNamesNotEqualTo(String value) {
            addCriterion("FUND_CONTRACT_NAMES <>", value, "fundContractNames");
            return (Criteria) this;
        }

        public Criteria andFundContractNamesGreaterThan(String value) {
            addCriterion("FUND_CONTRACT_NAMES >", value, "fundContractNames");
            return (Criteria) this;
        }

        public Criteria andFundContractNamesGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_CONTRACT_NAMES >=", value, "fundContractNames");
            return (Criteria) this;
        }

        public Criteria andFundContractNamesLessThan(String value) {
            addCriterion("FUND_CONTRACT_NAMES <", value, "fundContractNames");
            return (Criteria) this;
        }

        public Criteria andFundContractNamesLessThanOrEqualTo(String value) {
            addCriterion("FUND_CONTRACT_NAMES <=", value, "fundContractNames");
            return (Criteria) this;
        }

        public Criteria andFundContractNamesLike(String value) {
            addCriterion("FUND_CONTRACT_NAMES like", value, "fundContractNames");
            return (Criteria) this;
        }

        public Criteria andFundContractNamesNotLike(String value) {
            addCriterion("FUND_CONTRACT_NAMES not like", value, "fundContractNames");
            return (Criteria) this;
        }

        public Criteria andFundContractNamesIn(List<String> values) {
            addCriterion("FUND_CONTRACT_NAMES in", values, "fundContractNames");
            return (Criteria) this;
        }

        public Criteria andFundContractNamesNotIn(List<String> values) {
            addCriterion("FUND_CONTRACT_NAMES not in", values, "fundContractNames");
            return (Criteria) this;
        }

        public Criteria andFundContractNamesBetween(String value1, String value2) {
            addCriterion("FUND_CONTRACT_NAMES between", value1, value2, "fundContractNames");
            return (Criteria) this;
        }

        public Criteria andFundContractNamesNotBetween(String value1, String value2) {
            addCriterion("FUND_CONTRACT_NAMES not between", value1, value2, "fundContractNames");
            return (Criteria) this;
        }

        public Criteria andFundContractFileIdsIsNull() {
            addCriterion("FUND_CONTRACT_FILE_IDS is null");
            return (Criteria) this;
        }

        public Criteria andFundContractFileIdsIsNotNull() {
            addCriterion("FUND_CONTRACT_FILE_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andFundContractFileIdsEqualTo(String value) {
            addCriterion("FUND_CONTRACT_FILE_IDS =", value, "fundContractFileIds");
            return (Criteria) this;
        }

        public Criteria andFundContractFileIdsNotEqualTo(String value) {
            addCriterion("FUND_CONTRACT_FILE_IDS <>", value, "fundContractFileIds");
            return (Criteria) this;
        }

        public Criteria andFundContractFileIdsGreaterThan(String value) {
            addCriterion("FUND_CONTRACT_FILE_IDS >", value, "fundContractFileIds");
            return (Criteria) this;
        }

        public Criteria andFundContractFileIdsGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_CONTRACT_FILE_IDS >=", value, "fundContractFileIds");
            return (Criteria) this;
        }

        public Criteria andFundContractFileIdsLessThan(String value) {
            addCriterion("FUND_CONTRACT_FILE_IDS <", value, "fundContractFileIds");
            return (Criteria) this;
        }

        public Criteria andFundContractFileIdsLessThanOrEqualTo(String value) {
            addCriterion("FUND_CONTRACT_FILE_IDS <=", value, "fundContractFileIds");
            return (Criteria) this;
        }

        public Criteria andFundContractFileIdsLike(String value) {
            addCriterion("FUND_CONTRACT_FILE_IDS like", value, "fundContractFileIds");
            return (Criteria) this;
        }

        public Criteria andFundContractFileIdsNotLike(String value) {
            addCriterion("FUND_CONTRACT_FILE_IDS not like", value, "fundContractFileIds");
            return (Criteria) this;
        }

        public Criteria andFundContractFileIdsIn(List<String> values) {
            addCriterion("FUND_CONTRACT_FILE_IDS in", values, "fundContractFileIds");
            return (Criteria) this;
        }

        public Criteria andFundContractFileIdsNotIn(List<String> values) {
            addCriterion("FUND_CONTRACT_FILE_IDS not in", values, "fundContractFileIds");
            return (Criteria) this;
        }

        public Criteria andFundContractFileIdsBetween(String value1, String value2) {
            addCriterion("FUND_CONTRACT_FILE_IDS between", value1, value2, "fundContractFileIds");
            return (Criteria) this;
        }

        public Criteria andFundContractFileIdsNotBetween(String value1, String value2) {
            addCriterion("FUND_CONTRACT_FILE_IDS not between", value1, value2, "fundContractFileIds");
            return (Criteria) this;
        }

        public Criteria andCreditStatusIsNull() {
            addCriterion("CREDIT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCreditStatusIsNotNull() {
            addCriterion("CREDIT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCreditStatusEqualTo(String value) {
            addCriterion("CREDIT_STATUS =", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusNotEqualTo(String value) {
            addCriterion("CREDIT_STATUS <>", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusGreaterThan(String value) {
            addCriterion("CREDIT_STATUS >", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_STATUS >=", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusLessThan(String value) {
            addCriterion("CREDIT_STATUS <", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_STATUS <=", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusLike(String value) {
            addCriterion("CREDIT_STATUS like", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusNotLike(String value) {
            addCriterion("CREDIT_STATUS not like", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusIn(List<String> values) {
            addCriterion("CREDIT_STATUS in", values, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusNotIn(List<String> values) {
            addCriterion("CREDIT_STATUS not in", values, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusBetween(String value1, String value2) {
            addCriterion("CREDIT_STATUS between", value1, value2, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusNotBetween(String value1, String value2) {
            addCriterion("CREDIT_STATUS not between", value1, value2, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditNodeIsNull() {
            addCriterion("CREDIT_NODE is null");
            return (Criteria) this;
        }

        public Criteria andCreditNodeIsNotNull() {
            addCriterion("CREDIT_NODE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditNodeEqualTo(String value) {
            addCriterion("CREDIT_NODE =", value, "creditNode");
            return (Criteria) this;
        }

        public Criteria andCreditNodeNotEqualTo(String value) {
            addCriterion("CREDIT_NODE <>", value, "creditNode");
            return (Criteria) this;
        }

        public Criteria andCreditNodeGreaterThan(String value) {
            addCriterion("CREDIT_NODE >", value, "creditNode");
            return (Criteria) this;
        }

        public Criteria andCreditNodeGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_NODE >=", value, "creditNode");
            return (Criteria) this;
        }

        public Criteria andCreditNodeLessThan(String value) {
            addCriterion("CREDIT_NODE <", value, "creditNode");
            return (Criteria) this;
        }

        public Criteria andCreditNodeLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_NODE <=", value, "creditNode");
            return (Criteria) this;
        }

        public Criteria andCreditNodeLike(String value) {
            addCriterion("CREDIT_NODE like", value, "creditNode");
            return (Criteria) this;
        }

        public Criteria andCreditNodeNotLike(String value) {
            addCriterion("CREDIT_NODE not like", value, "creditNode");
            return (Criteria) this;
        }

        public Criteria andCreditNodeIn(List<String> values) {
            addCriterion("CREDIT_NODE in", values, "creditNode");
            return (Criteria) this;
        }

        public Criteria andCreditNodeNotIn(List<String> values) {
            addCriterion("CREDIT_NODE not in", values, "creditNode");
            return (Criteria) this;
        }

        public Criteria andCreditNodeBetween(String value1, String value2) {
            addCriterion("CREDIT_NODE between", value1, value2, "creditNode");
            return (Criteria) this;
        }

        public Criteria andCreditNodeNotBetween(String value1, String value2) {
            addCriterion("CREDIT_NODE not between", value1, value2, "creditNode");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIsNull() {
            addCriterion("NODE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIsNotNull() {
            addCriterion("NODE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNodeTypeEqualTo(String value) {
            addCriterion("NODE_TYPE =", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotEqualTo(String value) {
            addCriterion("NODE_TYPE <>", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeGreaterThan(String value) {
            addCriterion("NODE_TYPE >", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("NODE_TYPE >=", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLessThan(String value) {
            addCriterion("NODE_TYPE <", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLessThanOrEqualTo(String value) {
            addCriterion("NODE_TYPE <=", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLike(String value) {
            addCriterion("NODE_TYPE like", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotLike(String value) {
            addCriterion("NODE_TYPE not like", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIn(List<String> values) {
            addCriterion("NODE_TYPE in", values, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotIn(List<String> values) {
            addCriterion("NODE_TYPE not in", values, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeBetween(String value1, String value2) {
            addCriterion("NODE_TYPE between", value1, value2, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotBetween(String value1, String value2) {
            addCriterion("NODE_TYPE not between", value1, value2, "nodeType");
            return (Criteria) this;
        }

        public Criteria andCreditMgmIsNull() {
            addCriterion("CREDIT_MGM is null");
            return (Criteria) this;
        }

        public Criteria andCreditMgmIsNotNull() {
            addCriterion("CREDIT_MGM is not null");
            return (Criteria) this;
        }

        public Criteria andCreditMgmEqualTo(String value) {
            addCriterion("CREDIT_MGM =", value, "creditMgm");
            return (Criteria) this;
        }

        public Criteria andCreditMgmNotEqualTo(String value) {
            addCriterion("CREDIT_MGM <>", value, "creditMgm");
            return (Criteria) this;
        }

        public Criteria andCreditMgmGreaterThan(String value) {
            addCriterion("CREDIT_MGM >", value, "creditMgm");
            return (Criteria) this;
        }

        public Criteria andCreditMgmGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_MGM >=", value, "creditMgm");
            return (Criteria) this;
        }

        public Criteria andCreditMgmLessThan(String value) {
            addCriterion("CREDIT_MGM <", value, "creditMgm");
            return (Criteria) this;
        }

        public Criteria andCreditMgmLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_MGM <=", value, "creditMgm");
            return (Criteria) this;
        }

        public Criteria andCreditMgmLike(String value) {
            addCriterion("CREDIT_MGM like", value, "creditMgm");
            return (Criteria) this;
        }

        public Criteria andCreditMgmNotLike(String value) {
            addCriterion("CREDIT_MGM not like", value, "creditMgm");
            return (Criteria) this;
        }

        public Criteria andCreditMgmIn(List<String> values) {
            addCriterion("CREDIT_MGM in", values, "creditMgm");
            return (Criteria) this;
        }

        public Criteria andCreditMgmNotIn(List<String> values) {
            addCriterion("CREDIT_MGM not in", values, "creditMgm");
            return (Criteria) this;
        }

        public Criteria andCreditMgmBetween(String value1, String value2) {
            addCriterion("CREDIT_MGM between", value1, value2, "creditMgm");
            return (Criteria) this;
        }

        public Criteria andCreditMgmNotBetween(String value1, String value2) {
            addCriterion("CREDIT_MGM not between", value1, value2, "creditMgm");
            return (Criteria) this;
        }

        public Criteria andRejectCodeIsNull() {
            addCriterion("REJECT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRejectCodeIsNotNull() {
            addCriterion("REJECT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRejectCodeEqualTo(String value) {
            addCriterion("REJECT_CODE =", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeNotEqualTo(String value) {
            addCriterion("REJECT_CODE <>", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeGreaterThan(String value) {
            addCriterion("REJECT_CODE >", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REJECT_CODE >=", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeLessThan(String value) {
            addCriterion("REJECT_CODE <", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeLessThanOrEqualTo(String value) {
            addCriterion("REJECT_CODE <=", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeLike(String value) {
            addCriterion("REJECT_CODE like", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeNotLike(String value) {
            addCriterion("REJECT_CODE not like", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeIn(List<String> values) {
            addCriterion("REJECT_CODE in", values, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeNotIn(List<String> values) {
            addCriterion("REJECT_CODE not in", values, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeBetween(String value1, String value2) {
            addCriterion("REJECT_CODE between", value1, value2, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeNotBetween(String value1, String value2) {
            addCriterion("REJECT_CODE not between", value1, value2, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andAllCreditNodeIsNull() {
            addCriterion("ALL_CREDIT_NODE is null");
            return (Criteria) this;
        }

        public Criteria andAllCreditNodeIsNotNull() {
            addCriterion("ALL_CREDIT_NODE is not null");
            return (Criteria) this;
        }

        public Criteria andAllCreditNodeEqualTo(String value) {
            addCriterion("ALL_CREDIT_NODE =", value, "allCreditNode");
            return (Criteria) this;
        }

        public Criteria andAllCreditNodeNotEqualTo(String value) {
            addCriterion("ALL_CREDIT_NODE <>", value, "allCreditNode");
            return (Criteria) this;
        }

        public Criteria andAllCreditNodeGreaterThan(String value) {
            addCriterion("ALL_CREDIT_NODE >", value, "allCreditNode");
            return (Criteria) this;
        }

        public Criteria andAllCreditNodeGreaterThanOrEqualTo(String value) {
            addCriterion("ALL_CREDIT_NODE >=", value, "allCreditNode");
            return (Criteria) this;
        }

        public Criteria andAllCreditNodeLessThan(String value) {
            addCriterion("ALL_CREDIT_NODE <", value, "allCreditNode");
            return (Criteria) this;
        }

        public Criteria andAllCreditNodeLessThanOrEqualTo(String value) {
            addCriterion("ALL_CREDIT_NODE <=", value, "allCreditNode");
            return (Criteria) this;
        }

        public Criteria andAllCreditNodeLike(String value) {
            addCriterion("ALL_CREDIT_NODE like", value, "allCreditNode");
            return (Criteria) this;
        }

        public Criteria andAllCreditNodeNotLike(String value) {
            addCriterion("ALL_CREDIT_NODE not like", value, "allCreditNode");
            return (Criteria) this;
        }

        public Criteria andAllCreditNodeIn(List<String> values) {
            addCriterion("ALL_CREDIT_NODE in", values, "allCreditNode");
            return (Criteria) this;
        }

        public Criteria andAllCreditNodeNotIn(List<String> values) {
            addCriterion("ALL_CREDIT_NODE not in", values, "allCreditNode");
            return (Criteria) this;
        }

        public Criteria andAllCreditNodeBetween(String value1, String value2) {
            addCriterion("ALL_CREDIT_NODE between", value1, value2, "allCreditNode");
            return (Criteria) this;
        }

        public Criteria andAllCreditNodeNotBetween(String value1, String value2) {
            addCriterion("ALL_CREDIT_NODE not between", value1, value2, "allCreditNode");
            return (Criteria) this;
        }

        public Criteria andCreditNodeStatusIsNull() {
            addCriterion("CREDIT_NODE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCreditNodeStatusIsNotNull() {
            addCriterion("CREDIT_NODE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCreditNodeStatusEqualTo(String value) {
            addCriterion("CREDIT_NODE_STATUS =", value, "creditNodeStatus");
            return (Criteria) this;
        }

        public Criteria andCreditNodeStatusNotEqualTo(String value) {
            addCriterion("CREDIT_NODE_STATUS <>", value, "creditNodeStatus");
            return (Criteria) this;
        }

        public Criteria andCreditNodeStatusGreaterThan(String value) {
            addCriterion("CREDIT_NODE_STATUS >", value, "creditNodeStatus");
            return (Criteria) this;
        }

        public Criteria andCreditNodeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CREDIT_NODE_STATUS >=", value, "creditNodeStatus");
            return (Criteria) this;
        }

        public Criteria andCreditNodeStatusLessThan(String value) {
            addCriterion("CREDIT_NODE_STATUS <", value, "creditNodeStatus");
            return (Criteria) this;
        }

        public Criteria andCreditNodeStatusLessThanOrEqualTo(String value) {
            addCriterion("CREDIT_NODE_STATUS <=", value, "creditNodeStatus");
            return (Criteria) this;
        }

        public Criteria andCreditNodeStatusLike(String value) {
            addCriterion("CREDIT_NODE_STATUS like", value, "creditNodeStatus");
            return (Criteria) this;
        }

        public Criteria andCreditNodeStatusNotLike(String value) {
            addCriterion("CREDIT_NODE_STATUS not like", value, "creditNodeStatus");
            return (Criteria) this;
        }

        public Criteria andCreditNodeStatusIn(List<String> values) {
            addCriterion("CREDIT_NODE_STATUS in", values, "creditNodeStatus");
            return (Criteria) this;
        }

        public Criteria andCreditNodeStatusNotIn(List<String> values) {
            addCriterion("CREDIT_NODE_STATUS not in", values, "creditNodeStatus");
            return (Criteria) this;
        }

        public Criteria andCreditNodeStatusBetween(String value1, String value2) {
            addCriterion("CREDIT_NODE_STATUS between", value1, value2, "creditNodeStatus");
            return (Criteria) this;
        }

        public Criteria andCreditNodeStatusNotBetween(String value1, String value2) {
            addCriterion("CREDIT_NODE_STATUS not between", value1, value2, "creditNodeStatus");
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

        public Criteria andApplyTypeIsNull() {
            addCriterion("APPLY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNotNull() {
            addCriterion("APPLY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeEqualTo(String value) {
            addCriterion("APPLY_TYPE =", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotEqualTo(String value) {
            addCriterion("APPLY_TYPE <>", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThan(String value) {
            addCriterion("APPLY_TYPE >", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_TYPE >=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThan(String value) {
            addCriterion("APPLY_TYPE <", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_TYPE <=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLike(String value) {
            addCriterion("APPLY_TYPE like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotLike(String value) {
            addCriterion("APPLY_TYPE not like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIn(List<String> values) {
            addCriterion("APPLY_TYPE in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotIn(List<String> values) {
            addCriterion("APPLY_TYPE not in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeBetween(String value1, String value2) {
            addCriterion("APPLY_TYPE between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotBetween(String value1, String value2) {
            addCriterion("APPLY_TYPE not between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andReopenFlagIsNull() {
            addCriterion("REOPEN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andReopenFlagIsNotNull() {
            addCriterion("REOPEN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andReopenFlagEqualTo(String value) {
            addCriterion("REOPEN_FLAG =", value, "reopenFlag");
            return (Criteria) this;
        }

        public Criteria andReopenFlagNotEqualTo(String value) {
            addCriterion("REOPEN_FLAG <>", value, "reopenFlag");
            return (Criteria) this;
        }

        public Criteria andReopenFlagGreaterThan(String value) {
            addCriterion("REOPEN_FLAG >", value, "reopenFlag");
            return (Criteria) this;
        }

        public Criteria andReopenFlagGreaterThanOrEqualTo(String value) {
            addCriterion("REOPEN_FLAG >=", value, "reopenFlag");
            return (Criteria) this;
        }

        public Criteria andReopenFlagLessThan(String value) {
            addCriterion("REOPEN_FLAG <", value, "reopenFlag");
            return (Criteria) this;
        }

        public Criteria andReopenFlagLessThanOrEqualTo(String value) {
            addCriterion("REOPEN_FLAG <=", value, "reopenFlag");
            return (Criteria) this;
        }

        public Criteria andReopenFlagLike(String value) {
            addCriterion("REOPEN_FLAG like", value, "reopenFlag");
            return (Criteria) this;
        }

        public Criteria andReopenFlagNotLike(String value) {
            addCriterion("REOPEN_FLAG not like", value, "reopenFlag");
            return (Criteria) this;
        }

        public Criteria andReopenFlagIn(List<String> values) {
            addCriterion("REOPEN_FLAG in", values, "reopenFlag");
            return (Criteria) this;
        }

        public Criteria andReopenFlagNotIn(List<String> values) {
            addCriterion("REOPEN_FLAG not in", values, "reopenFlag");
            return (Criteria) this;
        }

        public Criteria andReopenFlagBetween(String value1, String value2) {
            addCriterion("REOPEN_FLAG between", value1, value2, "reopenFlag");
            return (Criteria) this;
        }

        public Criteria andReopenFlagNotBetween(String value1, String value2) {
            addCriterion("REOPEN_FLAG not between", value1, value2, "reopenFlag");
            return (Criteria) this;
        }

        public Criteria andReopenDateIsNull() {
            addCriterion("REOPEN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReopenDateIsNotNull() {
            addCriterion("REOPEN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReopenDateEqualTo(Date value) {
            addCriterionForJDBCDate("REOPEN_DATE =", value, "reopenDate");
            return (Criteria) this;
        }

        public Criteria andReopenDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("REOPEN_DATE <>", value, "reopenDate");
            return (Criteria) this;
        }

        public Criteria andReopenDateGreaterThan(Date value) {
            addCriterionForJDBCDate("REOPEN_DATE >", value, "reopenDate");
            return (Criteria) this;
        }

        public Criteria andReopenDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REOPEN_DATE >=", value, "reopenDate");
            return (Criteria) this;
        }

        public Criteria andReopenDateLessThan(Date value) {
            addCriterionForJDBCDate("REOPEN_DATE <", value, "reopenDate");
            return (Criteria) this;
        }

        public Criteria andReopenDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REOPEN_DATE <=", value, "reopenDate");
            return (Criteria) this;
        }

        public Criteria andReopenDateIn(List<Date> values) {
            addCriterionForJDBCDate("REOPEN_DATE in", values, "reopenDate");
            return (Criteria) this;
        }

        public Criteria andReopenDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("REOPEN_DATE not in", values, "reopenDate");
            return (Criteria) this;
        }

        public Criteria andReopenDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REOPEN_DATE between", value1, value2, "reopenDate");
            return (Criteria) this;
        }

        public Criteria andReopenDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REOPEN_DATE not between", value1, value2, "reopenDate");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNull() {
            addCriterion("ERROR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNotNull() {
            addCriterion("ERROR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeEqualTo(String value) {
            addCriterion("ERROR_CODE =", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotEqualTo(String value) {
            addCriterion("ERROR_CODE <>", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThan(String value) {
            addCriterion("ERROR_CODE >", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_CODE >=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThan(String value) {
            addCriterion("ERROR_CODE <", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThanOrEqualTo(String value) {
            addCriterion("ERROR_CODE <=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLike(String value) {
            addCriterion("ERROR_CODE like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotLike(String value) {
            addCriterion("ERROR_CODE not like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIn(List<String> values) {
            addCriterion("ERROR_CODE in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotIn(List<String> values) {
            addCriterion("ERROR_CODE not in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeBetween(String value1, String value2) {
            addCriterion("ERROR_CODE between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotBetween(String value1, String value2) {
            addCriterion("ERROR_CODE not between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorDescIsNull() {
            addCriterion("ERROR_DESC is null");
            return (Criteria) this;
        }

        public Criteria andErrorDescIsNotNull() {
            addCriterion("ERROR_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andErrorDescEqualTo(String value) {
            addCriterion("ERROR_DESC =", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescNotEqualTo(String value) {
            addCriterion("ERROR_DESC <>", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescGreaterThan(String value) {
            addCriterion("ERROR_DESC >", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_DESC >=", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescLessThan(String value) {
            addCriterion("ERROR_DESC <", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescLessThanOrEqualTo(String value) {
            addCriterion("ERROR_DESC <=", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescLike(String value) {
            addCriterion("ERROR_DESC like", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescNotLike(String value) {
            addCriterion("ERROR_DESC not like", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescIn(List<String> values) {
            addCriterion("ERROR_DESC in", values, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescNotIn(List<String> values) {
            addCriterion("ERROR_DESC not in", values, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescBetween(String value1, String value2) {
            addCriterion("ERROR_DESC between", value1, value2, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescNotBetween(String value1, String value2) {
            addCriterion("ERROR_DESC not between", value1, value2, "errorDesc");
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