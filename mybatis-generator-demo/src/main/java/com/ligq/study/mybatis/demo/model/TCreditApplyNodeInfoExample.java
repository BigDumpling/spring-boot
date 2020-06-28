package com.ligq.study.mybatis.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TCreditApplyNodeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCreditApplyNodeInfoExample() {
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

        public Criteria andCreditNodeSortIsNull() {
            addCriterion("CREDIT_NODE_SORT is null");
            return (Criteria) this;
        }

        public Criteria andCreditNodeSortIsNotNull() {
            addCriterion("CREDIT_NODE_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andCreditNodeSortEqualTo(Integer value) {
            addCriterion("CREDIT_NODE_SORT =", value, "creditNodeSort");
            return (Criteria) this;
        }

        public Criteria andCreditNodeSortNotEqualTo(Integer value) {
            addCriterion("CREDIT_NODE_SORT <>", value, "creditNodeSort");
            return (Criteria) this;
        }

        public Criteria andCreditNodeSortGreaterThan(Integer value) {
            addCriterion("CREDIT_NODE_SORT >", value, "creditNodeSort");
            return (Criteria) this;
        }

        public Criteria andCreditNodeSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREDIT_NODE_SORT >=", value, "creditNodeSort");
            return (Criteria) this;
        }

        public Criteria andCreditNodeSortLessThan(Integer value) {
            addCriterion("CREDIT_NODE_SORT <", value, "creditNodeSort");
            return (Criteria) this;
        }

        public Criteria andCreditNodeSortLessThanOrEqualTo(Integer value) {
            addCriterion("CREDIT_NODE_SORT <=", value, "creditNodeSort");
            return (Criteria) this;
        }

        public Criteria andCreditNodeSortIn(List<Integer> values) {
            addCriterion("CREDIT_NODE_SORT in", values, "creditNodeSort");
            return (Criteria) this;
        }

        public Criteria andCreditNodeSortNotIn(List<Integer> values) {
            addCriterion("CREDIT_NODE_SORT not in", values, "creditNodeSort");
            return (Criteria) this;
        }

        public Criteria andCreditNodeSortBetween(Integer value1, Integer value2) {
            addCriterion("CREDIT_NODE_SORT between", value1, value2, "creditNodeSort");
            return (Criteria) this;
        }

        public Criteria andCreditNodeSortNotBetween(Integer value1, Integer value2) {
            addCriterion("CREDIT_NODE_SORT not between", value1, value2, "creditNodeSort");
            return (Criteria) this;
        }

        public Criteria andFundNodeSeqIsNull() {
            addCriterion("FUND_NODE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andFundNodeSeqIsNotNull() {
            addCriterion("FUND_NODE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFundNodeSeqEqualTo(String value) {
            addCriterion("FUND_NODE_SEQ =", value, "fundNodeSeq");
            return (Criteria) this;
        }

        public Criteria andFundNodeSeqNotEqualTo(String value) {
            addCriterion("FUND_NODE_SEQ <>", value, "fundNodeSeq");
            return (Criteria) this;
        }

        public Criteria andFundNodeSeqGreaterThan(String value) {
            addCriterion("FUND_NODE_SEQ >", value, "fundNodeSeq");
            return (Criteria) this;
        }

        public Criteria andFundNodeSeqGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_NODE_SEQ >=", value, "fundNodeSeq");
            return (Criteria) this;
        }

        public Criteria andFundNodeSeqLessThan(String value) {
            addCriterion("FUND_NODE_SEQ <", value, "fundNodeSeq");
            return (Criteria) this;
        }

        public Criteria andFundNodeSeqLessThanOrEqualTo(String value) {
            addCriterion("FUND_NODE_SEQ <=", value, "fundNodeSeq");
            return (Criteria) this;
        }

        public Criteria andFundNodeSeqLike(String value) {
            addCriterion("FUND_NODE_SEQ like", value, "fundNodeSeq");
            return (Criteria) this;
        }

        public Criteria andFundNodeSeqNotLike(String value) {
            addCriterion("FUND_NODE_SEQ not like", value, "fundNodeSeq");
            return (Criteria) this;
        }

        public Criteria andFundNodeSeqIn(List<String> values) {
            addCriterion("FUND_NODE_SEQ in", values, "fundNodeSeq");
            return (Criteria) this;
        }

        public Criteria andFundNodeSeqNotIn(List<String> values) {
            addCriterion("FUND_NODE_SEQ not in", values, "fundNodeSeq");
            return (Criteria) this;
        }

        public Criteria andFundNodeSeqBetween(String value1, String value2) {
            addCriterion("FUND_NODE_SEQ between", value1, value2, "fundNodeSeq");
            return (Criteria) this;
        }

        public Criteria andFundNodeSeqNotBetween(String value1, String value2) {
            addCriterion("FUND_NODE_SEQ not between", value1, value2, "fundNodeSeq");
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