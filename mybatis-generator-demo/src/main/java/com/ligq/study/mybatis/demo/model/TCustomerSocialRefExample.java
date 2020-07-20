package com.ligq.study.mybatis.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TCustomerSocialRefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCustomerSocialRefExample() {
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

        public Criteria andCustomerSocialRefIdIsNull() {
            addCriterion("CUSTOMER_SOCIAL_REF_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSocialRefIdIsNotNull() {
            addCriterion("CUSTOMER_SOCIAL_REF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSocialRefIdEqualTo(String value) {
            addCriterion("CUSTOMER_SOCIAL_REF_ID =", value, "customerSocialRefId");
            return (Criteria) this;
        }

        public Criteria andCustomerSocialRefIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_SOCIAL_REF_ID <>", value, "customerSocialRefId");
            return (Criteria) this;
        }

        public Criteria andCustomerSocialRefIdGreaterThan(String value) {
            addCriterion("CUSTOMER_SOCIAL_REF_ID >", value, "customerSocialRefId");
            return (Criteria) this;
        }

        public Criteria andCustomerSocialRefIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_SOCIAL_REF_ID >=", value, "customerSocialRefId");
            return (Criteria) this;
        }

        public Criteria andCustomerSocialRefIdLessThan(String value) {
            addCriterion("CUSTOMER_SOCIAL_REF_ID <", value, "customerSocialRefId");
            return (Criteria) this;
        }

        public Criteria andCustomerSocialRefIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_SOCIAL_REF_ID <=", value, "customerSocialRefId");
            return (Criteria) this;
        }

        public Criteria andCustomerSocialRefIdLike(String value) {
            addCriterion("CUSTOMER_SOCIAL_REF_ID like", value, "customerSocialRefId");
            return (Criteria) this;
        }

        public Criteria andCustomerSocialRefIdNotLike(String value) {
            addCriterion("CUSTOMER_SOCIAL_REF_ID not like", value, "customerSocialRefId");
            return (Criteria) this;
        }

        public Criteria andCustomerSocialRefIdIn(List<String> values) {
            addCriterion("CUSTOMER_SOCIAL_REF_ID in", values, "customerSocialRefId");
            return (Criteria) this;
        }

        public Criteria andCustomerSocialRefIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_SOCIAL_REF_ID not in", values, "customerSocialRefId");
            return (Criteria) this;
        }

        public Criteria andCustomerSocialRefIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_SOCIAL_REF_ID between", value1, value2, "customerSocialRefId");
            return (Criteria) this;
        }

        public Criteria andCustomerSocialRefIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_SOCIAL_REF_ID not between", value1, value2, "customerSocialRefId");
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

        public Criteria andRefTypeIsNull() {
            addCriterion("REF_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRefTypeIsNotNull() {
            addCriterion("REF_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRefTypeEqualTo(String value) {
            addCriterion("REF_TYPE =", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeNotEqualTo(String value) {
            addCriterion("REF_TYPE <>", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeGreaterThan(String value) {
            addCriterion("REF_TYPE >", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REF_TYPE >=", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeLessThan(String value) {
            addCriterion("REF_TYPE <", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeLessThanOrEqualTo(String value) {
            addCriterion("REF_TYPE <=", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeLike(String value) {
            addCriterion("REF_TYPE like", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeNotLike(String value) {
            addCriterion("REF_TYPE not like", value, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeIn(List<String> values) {
            addCriterion("REF_TYPE in", values, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeNotIn(List<String> values) {
            addCriterion("REF_TYPE not in", values, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeBetween(String value1, String value2) {
            addCriterion("REF_TYPE between", value1, value2, "refType");
            return (Criteria) this;
        }

        public Criteria andRefTypeNotBetween(String value1, String value2) {
            addCriterion("REF_TYPE not between", value1, value2, "refType");
            return (Criteria) this;
        }

        public Criteria andRefPersonNameIsNull() {
            addCriterion("REF_PERSON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRefPersonNameIsNotNull() {
            addCriterion("REF_PERSON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRefPersonNameEqualTo(String value) {
            addCriterion("REF_PERSON_NAME =", value, "refPersonName");
            return (Criteria) this;
        }

        public Criteria andRefPersonNameNotEqualTo(String value) {
            addCriterion("REF_PERSON_NAME <>", value, "refPersonName");
            return (Criteria) this;
        }

        public Criteria andRefPersonNameGreaterThan(String value) {
            addCriterion("REF_PERSON_NAME >", value, "refPersonName");
            return (Criteria) this;
        }

        public Criteria andRefPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("REF_PERSON_NAME >=", value, "refPersonName");
            return (Criteria) this;
        }

        public Criteria andRefPersonNameLessThan(String value) {
            addCriterion("REF_PERSON_NAME <", value, "refPersonName");
            return (Criteria) this;
        }

        public Criteria andRefPersonNameLessThanOrEqualTo(String value) {
            addCriterion("REF_PERSON_NAME <=", value, "refPersonName");
            return (Criteria) this;
        }

        public Criteria andRefPersonNameLike(String value) {
            addCriterion("REF_PERSON_NAME like", value, "refPersonName");
            return (Criteria) this;
        }

        public Criteria andRefPersonNameNotLike(String value) {
            addCriterion("REF_PERSON_NAME not like", value, "refPersonName");
            return (Criteria) this;
        }

        public Criteria andRefPersonNameIn(List<String> values) {
            addCriterion("REF_PERSON_NAME in", values, "refPersonName");
            return (Criteria) this;
        }

        public Criteria andRefPersonNameNotIn(List<String> values) {
            addCriterion("REF_PERSON_NAME not in", values, "refPersonName");
            return (Criteria) this;
        }

        public Criteria andRefPersonNameBetween(String value1, String value2) {
            addCriterion("REF_PERSON_NAME between", value1, value2, "refPersonName");
            return (Criteria) this;
        }

        public Criteria andRefPersonNameNotBetween(String value1, String value2) {
            addCriterion("REF_PERSON_NAME not between", value1, value2, "refPersonName");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNull() {
            addCriterion("MOBILE_NO is null");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNotNull() {
            addCriterion("MOBILE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNoEqualTo(String value) {
            addCriterion("MOBILE_NO =", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotEqualTo(String value) {
            addCriterion("MOBILE_NO <>", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThan(String value) {
            addCriterion("MOBILE_NO >", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_NO >=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThan(String value) {
            addCriterion("MOBILE_NO <", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_NO <=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLike(String value) {
            addCriterion("MOBILE_NO like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotLike(String value) {
            addCriterion("MOBILE_NO not like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoIn(List<String> values) {
            addCriterion("MOBILE_NO in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotIn(List<String> values) {
            addCriterion("MOBILE_NO not in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoBetween(String value1, String value2) {
            addCriterion("MOBILE_NO between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotBetween(String value1, String value2) {
            addCriterion("MOBILE_NO not between", value1, value2, "mobileNo");
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

        public Criteria andIdTypeIsNull() {
            addCriterion("ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("ID_TYPE =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("ID_TYPE <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("ID_TYPE >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_TYPE >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("ID_TYPE <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("ID_TYPE <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("ID_TYPE like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("ID_TYPE not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("ID_TYPE in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("ID_TYPE not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("ID_TYPE between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("ID_TYPE not between", value1, value2, "idType");
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