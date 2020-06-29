package com.ligq.study.mybatis.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TCreditRejectCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCreditRejectCodeExample() {
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

        public Criteria andRejectDescIsNull() {
            addCriterion("REJECT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andRejectDescIsNotNull() {
            addCriterion("REJECT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andRejectDescEqualTo(String value) {
            addCriterion("REJECT_DESC =", value, "rejectDesc");
            return (Criteria) this;
        }

        public Criteria andRejectDescNotEqualTo(String value) {
            addCriterion("REJECT_DESC <>", value, "rejectDesc");
            return (Criteria) this;
        }

        public Criteria andRejectDescGreaterThan(String value) {
            addCriterion("REJECT_DESC >", value, "rejectDesc");
            return (Criteria) this;
        }

        public Criteria andRejectDescGreaterThanOrEqualTo(String value) {
            addCriterion("REJECT_DESC >=", value, "rejectDesc");
            return (Criteria) this;
        }

        public Criteria andRejectDescLessThan(String value) {
            addCriterion("REJECT_DESC <", value, "rejectDesc");
            return (Criteria) this;
        }

        public Criteria andRejectDescLessThanOrEqualTo(String value) {
            addCriterion("REJECT_DESC <=", value, "rejectDesc");
            return (Criteria) this;
        }

        public Criteria andRejectDescLike(String value) {
            addCriterion("REJECT_DESC like", value, "rejectDesc");
            return (Criteria) this;
        }

        public Criteria andRejectDescNotLike(String value) {
            addCriterion("REJECT_DESC not like", value, "rejectDesc");
            return (Criteria) this;
        }

        public Criteria andRejectDescIn(List<String> values) {
            addCriterion("REJECT_DESC in", values, "rejectDesc");
            return (Criteria) this;
        }

        public Criteria andRejectDescNotIn(List<String> values) {
            addCriterion("REJECT_DESC not in", values, "rejectDesc");
            return (Criteria) this;
        }

        public Criteria andRejectDescBetween(String value1, String value2) {
            addCriterion("REJECT_DESC between", value1, value2, "rejectDesc");
            return (Criteria) this;
        }

        public Criteria andRejectDescNotBetween(String value1, String value2) {
            addCriterion("REJECT_DESC not between", value1, value2, "rejectDesc");
            return (Criteria) this;
        }

        public Criteria andRejectDescFrontIsNull() {
            addCriterion("REJECT_DESC_FRONT is null");
            return (Criteria) this;
        }

        public Criteria andRejectDescFrontIsNotNull() {
            addCriterion("REJECT_DESC_FRONT is not null");
            return (Criteria) this;
        }

        public Criteria andRejectDescFrontEqualTo(String value) {
            addCriterion("REJECT_DESC_FRONT =", value, "rejectDescFront");
            return (Criteria) this;
        }

        public Criteria andRejectDescFrontNotEqualTo(String value) {
            addCriterion("REJECT_DESC_FRONT <>", value, "rejectDescFront");
            return (Criteria) this;
        }

        public Criteria andRejectDescFrontGreaterThan(String value) {
            addCriterion("REJECT_DESC_FRONT >", value, "rejectDescFront");
            return (Criteria) this;
        }

        public Criteria andRejectDescFrontGreaterThanOrEqualTo(String value) {
            addCriterion("REJECT_DESC_FRONT >=", value, "rejectDescFront");
            return (Criteria) this;
        }

        public Criteria andRejectDescFrontLessThan(String value) {
            addCriterion("REJECT_DESC_FRONT <", value, "rejectDescFront");
            return (Criteria) this;
        }

        public Criteria andRejectDescFrontLessThanOrEqualTo(String value) {
            addCriterion("REJECT_DESC_FRONT <=", value, "rejectDescFront");
            return (Criteria) this;
        }

        public Criteria andRejectDescFrontLike(String value) {
            addCriterion("REJECT_DESC_FRONT like", value, "rejectDescFront");
            return (Criteria) this;
        }

        public Criteria andRejectDescFrontNotLike(String value) {
            addCriterion("REJECT_DESC_FRONT not like", value, "rejectDescFront");
            return (Criteria) this;
        }

        public Criteria andRejectDescFrontIn(List<String> values) {
            addCriterion("REJECT_DESC_FRONT in", values, "rejectDescFront");
            return (Criteria) this;
        }

        public Criteria andRejectDescFrontNotIn(List<String> values) {
            addCriterion("REJECT_DESC_FRONT not in", values, "rejectDescFront");
            return (Criteria) this;
        }

        public Criteria andRejectDescFrontBetween(String value1, String value2) {
            addCriterion("REJECT_DESC_FRONT between", value1, value2, "rejectDescFront");
            return (Criteria) this;
        }

        public Criteria andRejectDescFrontNotBetween(String value1, String value2) {
            addCriterion("REJECT_DESC_FRONT not between", value1, value2, "rejectDescFront");
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