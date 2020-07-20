package com.ligq.study.mybatis.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TCustomerRelatedEntInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCustomerRelatedEntInfoExample() {
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
            addCriterion("seq_id is null");
            return (Criteria) this;
        }

        public Criteria andSeqIdIsNotNull() {
            addCriterion("seq_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeqIdEqualTo(String value) {
            addCriterion("seq_id =", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotEqualTo(String value) {
            addCriterion("seq_id <>", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThan(String value) {
            addCriterion("seq_id >", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("seq_id >=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThan(String value) {
            addCriterion("seq_id <", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLessThanOrEqualTo(String value) {
            addCriterion("seq_id <=", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdLike(String value) {
            addCriterion("seq_id like", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotLike(String value) {
            addCriterion("seq_id not like", value, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdIn(List<String> values) {
            addCriterion("seq_id in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotIn(List<String> values) {
            addCriterion("seq_id not in", values, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdBetween(String value1, String value2) {
            addCriterion("seq_id between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andSeqIdNotBetween(String value1, String value2) {
            addCriterion("seq_id not between", value1, value2, "seqId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andEntNameIsNull() {
            addCriterion("ent_name is null");
            return (Criteria) this;
        }

        public Criteria andEntNameIsNotNull() {
            addCriterion("ent_name is not null");
            return (Criteria) this;
        }

        public Criteria andEntNameEqualTo(String value) {
            addCriterion("ent_name =", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameNotEqualTo(String value) {
            addCriterion("ent_name <>", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameGreaterThan(String value) {
            addCriterion("ent_name >", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameGreaterThanOrEqualTo(String value) {
            addCriterion("ent_name >=", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameLessThan(String value) {
            addCriterion("ent_name <", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameLessThanOrEqualTo(String value) {
            addCriterion("ent_name <=", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameLike(String value) {
            addCriterion("ent_name like", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameNotLike(String value) {
            addCriterion("ent_name not like", value, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameIn(List<String> values) {
            addCriterion("ent_name in", values, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameNotIn(List<String> values) {
            addCriterion("ent_name not in", values, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameBetween(String value1, String value2) {
            addCriterion("ent_name between", value1, value2, "entName");
            return (Criteria) this;
        }

        public Criteria andEntNameNotBetween(String value1, String value2) {
            addCriterion("ent_name not between", value1, value2, "entName");
            return (Criteria) this;
        }

        public Criteria andEntIdTypeIsNull() {
            addCriterion("ent_id_type is null");
            return (Criteria) this;
        }

        public Criteria andEntIdTypeIsNotNull() {
            addCriterion("ent_id_type is not null");
            return (Criteria) this;
        }

        public Criteria andEntIdTypeEqualTo(String value) {
            addCriterion("ent_id_type =", value, "entIdType");
            return (Criteria) this;
        }

        public Criteria andEntIdTypeNotEqualTo(String value) {
            addCriterion("ent_id_type <>", value, "entIdType");
            return (Criteria) this;
        }

        public Criteria andEntIdTypeGreaterThan(String value) {
            addCriterion("ent_id_type >", value, "entIdType");
            return (Criteria) this;
        }

        public Criteria andEntIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ent_id_type >=", value, "entIdType");
            return (Criteria) this;
        }

        public Criteria andEntIdTypeLessThan(String value) {
            addCriterion("ent_id_type <", value, "entIdType");
            return (Criteria) this;
        }

        public Criteria andEntIdTypeLessThanOrEqualTo(String value) {
            addCriterion("ent_id_type <=", value, "entIdType");
            return (Criteria) this;
        }

        public Criteria andEntIdTypeLike(String value) {
            addCriterion("ent_id_type like", value, "entIdType");
            return (Criteria) this;
        }

        public Criteria andEntIdTypeNotLike(String value) {
            addCriterion("ent_id_type not like", value, "entIdType");
            return (Criteria) this;
        }

        public Criteria andEntIdTypeIn(List<String> values) {
            addCriterion("ent_id_type in", values, "entIdType");
            return (Criteria) this;
        }

        public Criteria andEntIdTypeNotIn(List<String> values) {
            addCriterion("ent_id_type not in", values, "entIdType");
            return (Criteria) this;
        }

        public Criteria andEntIdTypeBetween(String value1, String value2) {
            addCriterion("ent_id_type between", value1, value2, "entIdType");
            return (Criteria) this;
        }

        public Criteria andEntIdTypeNotBetween(String value1, String value2) {
            addCriterion("ent_id_type not between", value1, value2, "entIdType");
            return (Criteria) this;
        }

        public Criteria andEntIdNoIsNull() {
            addCriterion("ent_id_no is null");
            return (Criteria) this;
        }

        public Criteria andEntIdNoIsNotNull() {
            addCriterion("ent_id_no is not null");
            return (Criteria) this;
        }

        public Criteria andEntIdNoEqualTo(String value) {
            addCriterion("ent_id_no =", value, "entIdNo");
            return (Criteria) this;
        }

        public Criteria andEntIdNoNotEqualTo(String value) {
            addCriterion("ent_id_no <>", value, "entIdNo");
            return (Criteria) this;
        }

        public Criteria andEntIdNoGreaterThan(String value) {
            addCriterion("ent_id_no >", value, "entIdNo");
            return (Criteria) this;
        }

        public Criteria andEntIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ent_id_no >=", value, "entIdNo");
            return (Criteria) this;
        }

        public Criteria andEntIdNoLessThan(String value) {
            addCriterion("ent_id_no <", value, "entIdNo");
            return (Criteria) this;
        }

        public Criteria andEntIdNoLessThanOrEqualTo(String value) {
            addCriterion("ent_id_no <=", value, "entIdNo");
            return (Criteria) this;
        }

        public Criteria andEntIdNoLike(String value) {
            addCriterion("ent_id_no like", value, "entIdNo");
            return (Criteria) this;
        }

        public Criteria andEntIdNoNotLike(String value) {
            addCriterion("ent_id_no not like", value, "entIdNo");
            return (Criteria) this;
        }

        public Criteria andEntIdNoIn(List<String> values) {
            addCriterion("ent_id_no in", values, "entIdNo");
            return (Criteria) this;
        }

        public Criteria andEntIdNoNotIn(List<String> values) {
            addCriterion("ent_id_no not in", values, "entIdNo");
            return (Criteria) this;
        }

        public Criteria andEntIdNoBetween(String value1, String value2) {
            addCriterion("ent_id_no between", value1, value2, "entIdNo");
            return (Criteria) this;
        }

        public Criteria andEntIdNoNotBetween(String value1, String value2) {
            addCriterion("ent_id_no not between", value1, value2, "entIdNo");
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

        public Criteria andCreateRemarkIsNull() {
            addCriterion("create_remark is null");
            return (Criteria) this;
        }

        public Criteria andCreateRemarkIsNotNull() {
            addCriterion("create_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCreateRemarkEqualTo(String value) {
            addCriterion("create_remark =", value, "createRemark");
            return (Criteria) this;
        }

        public Criteria andCreateRemarkNotEqualTo(String value) {
            addCriterion("create_remark <>", value, "createRemark");
            return (Criteria) this;
        }

        public Criteria andCreateRemarkGreaterThan(String value) {
            addCriterion("create_remark >", value, "createRemark");
            return (Criteria) this;
        }

        public Criteria andCreateRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("create_remark >=", value, "createRemark");
            return (Criteria) this;
        }

        public Criteria andCreateRemarkLessThan(String value) {
            addCriterion("create_remark <", value, "createRemark");
            return (Criteria) this;
        }

        public Criteria andCreateRemarkLessThanOrEqualTo(String value) {
            addCriterion("create_remark <=", value, "createRemark");
            return (Criteria) this;
        }

        public Criteria andCreateRemarkLike(String value) {
            addCriterion("create_remark like", value, "createRemark");
            return (Criteria) this;
        }

        public Criteria andCreateRemarkNotLike(String value) {
            addCriterion("create_remark not like", value, "createRemark");
            return (Criteria) this;
        }

        public Criteria andCreateRemarkIn(List<String> values) {
            addCriterion("create_remark in", values, "createRemark");
            return (Criteria) this;
        }

        public Criteria andCreateRemarkNotIn(List<String> values) {
            addCriterion("create_remark not in", values, "createRemark");
            return (Criteria) this;
        }

        public Criteria andCreateRemarkBetween(String value1, String value2) {
            addCriterion("create_remark between", value1, value2, "createRemark");
            return (Criteria) this;
        }

        public Criteria andCreateRemarkNotBetween(String value1, String value2) {
            addCriterion("create_remark not between", value1, value2, "createRemark");
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

        public Criteria andUpdateRemarkIsNull() {
            addCriterion("update_remark is null");
            return (Criteria) this;
        }

        public Criteria andUpdateRemarkIsNotNull() {
            addCriterion("update_remark is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateRemarkEqualTo(String value) {
            addCriterion("update_remark =", value, "updateRemark");
            return (Criteria) this;
        }

        public Criteria andUpdateRemarkNotEqualTo(String value) {
            addCriterion("update_remark <>", value, "updateRemark");
            return (Criteria) this;
        }

        public Criteria andUpdateRemarkGreaterThan(String value) {
            addCriterion("update_remark >", value, "updateRemark");
            return (Criteria) this;
        }

        public Criteria andUpdateRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("update_remark >=", value, "updateRemark");
            return (Criteria) this;
        }

        public Criteria andUpdateRemarkLessThan(String value) {
            addCriterion("update_remark <", value, "updateRemark");
            return (Criteria) this;
        }

        public Criteria andUpdateRemarkLessThanOrEqualTo(String value) {
            addCriterion("update_remark <=", value, "updateRemark");
            return (Criteria) this;
        }

        public Criteria andUpdateRemarkLike(String value) {
            addCriterion("update_remark like", value, "updateRemark");
            return (Criteria) this;
        }

        public Criteria andUpdateRemarkNotLike(String value) {
            addCriterion("update_remark not like", value, "updateRemark");
            return (Criteria) this;
        }

        public Criteria andUpdateRemarkIn(List<String> values) {
            addCriterion("update_remark in", values, "updateRemark");
            return (Criteria) this;
        }

        public Criteria andUpdateRemarkNotIn(List<String> values) {
            addCriterion("update_remark not in", values, "updateRemark");
            return (Criteria) this;
        }

        public Criteria andUpdateRemarkBetween(String value1, String value2) {
            addCriterion("update_remark between", value1, value2, "updateRemark");
            return (Criteria) this;
        }

        public Criteria andUpdateRemarkNotBetween(String value1, String value2) {
            addCriterion("update_remark not between", value1, value2, "updateRemark");
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