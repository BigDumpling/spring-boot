package com.ligq.study.mybatis.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TBaseAreaCityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBaseAreaCityExample() {
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

        public Criteria andCurrentCodeIsNull() {
            addCriterion("CURRENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCodeIsNotNull() {
            addCriterion("CURRENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCodeEqualTo(String value) {
            addCriterion("CURRENT_CODE =", value, "currentCode");
            return (Criteria) this;
        }

        public Criteria andCurrentCodeNotEqualTo(String value) {
            addCriterion("CURRENT_CODE <>", value, "currentCode");
            return (Criteria) this;
        }

        public Criteria andCurrentCodeGreaterThan(String value) {
            addCriterion("CURRENT_CODE >", value, "currentCode");
            return (Criteria) this;
        }

        public Criteria andCurrentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_CODE >=", value, "currentCode");
            return (Criteria) this;
        }

        public Criteria andCurrentCodeLessThan(String value) {
            addCriterion("CURRENT_CODE <", value, "currentCode");
            return (Criteria) this;
        }

        public Criteria andCurrentCodeLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_CODE <=", value, "currentCode");
            return (Criteria) this;
        }

        public Criteria andCurrentCodeLike(String value) {
            addCriterion("CURRENT_CODE like", value, "currentCode");
            return (Criteria) this;
        }

        public Criteria andCurrentCodeNotLike(String value) {
            addCriterion("CURRENT_CODE not like", value, "currentCode");
            return (Criteria) this;
        }

        public Criteria andCurrentCodeIn(List<String> values) {
            addCriterion("CURRENT_CODE in", values, "currentCode");
            return (Criteria) this;
        }

        public Criteria andCurrentCodeNotIn(List<String> values) {
            addCriterion("CURRENT_CODE not in", values, "currentCode");
            return (Criteria) this;
        }

        public Criteria andCurrentCodeBetween(String value1, String value2) {
            addCriterion("CURRENT_CODE between", value1, value2, "currentCode");
            return (Criteria) this;
        }

        public Criteria andCurrentCodeNotBetween(String value1, String value2) {
            addCriterion("CURRENT_CODE not between", value1, value2, "currentCode");
            return (Criteria) this;
        }

        public Criteria andCodeFlagIsNull() {
            addCriterion("CODE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCodeFlagIsNotNull() {
            addCriterion("CODE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCodeFlagEqualTo(String value) {
            addCriterion("CODE_FLAG =", value, "codeFlag");
            return (Criteria) this;
        }

        public Criteria andCodeFlagNotEqualTo(String value) {
            addCriterion("CODE_FLAG <>", value, "codeFlag");
            return (Criteria) this;
        }

        public Criteria andCodeFlagGreaterThan(String value) {
            addCriterion("CODE_FLAG >", value, "codeFlag");
            return (Criteria) this;
        }

        public Criteria andCodeFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CODE_FLAG >=", value, "codeFlag");
            return (Criteria) this;
        }

        public Criteria andCodeFlagLessThan(String value) {
            addCriterion("CODE_FLAG <", value, "codeFlag");
            return (Criteria) this;
        }

        public Criteria andCodeFlagLessThanOrEqualTo(String value) {
            addCriterion("CODE_FLAG <=", value, "codeFlag");
            return (Criteria) this;
        }

        public Criteria andCodeFlagLike(String value) {
            addCriterion("CODE_FLAG like", value, "codeFlag");
            return (Criteria) this;
        }

        public Criteria andCodeFlagNotLike(String value) {
            addCriterion("CODE_FLAG not like", value, "codeFlag");
            return (Criteria) this;
        }

        public Criteria andCodeFlagIn(List<String> values) {
            addCriterion("CODE_FLAG in", values, "codeFlag");
            return (Criteria) this;
        }

        public Criteria andCodeFlagNotIn(List<String> values) {
            addCriterion("CODE_FLAG not in", values, "codeFlag");
            return (Criteria) this;
        }

        public Criteria andCodeFlagBetween(String value1, String value2) {
            addCriterion("CODE_FLAG between", value1, value2, "codeFlag");
            return (Criteria) this;
        }

        public Criteria andCodeFlagNotBetween(String value1, String value2) {
            addCriterion("CODE_FLAG not between", value1, value2, "codeFlag");
            return (Criteria) this;
        }

        public Criteria andTeleCodeIsNull() {
            addCriterion("TELE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTeleCodeIsNotNull() {
            addCriterion("TELE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTeleCodeEqualTo(String value) {
            addCriterion("TELE_CODE =", value, "teleCode");
            return (Criteria) this;
        }

        public Criteria andTeleCodeNotEqualTo(String value) {
            addCriterion("TELE_CODE <>", value, "teleCode");
            return (Criteria) this;
        }

        public Criteria andTeleCodeGreaterThan(String value) {
            addCriterion("TELE_CODE >", value, "teleCode");
            return (Criteria) this;
        }

        public Criteria andTeleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TELE_CODE >=", value, "teleCode");
            return (Criteria) this;
        }

        public Criteria andTeleCodeLessThan(String value) {
            addCriterion("TELE_CODE <", value, "teleCode");
            return (Criteria) this;
        }

        public Criteria andTeleCodeLessThanOrEqualTo(String value) {
            addCriterion("TELE_CODE <=", value, "teleCode");
            return (Criteria) this;
        }

        public Criteria andTeleCodeLike(String value) {
            addCriterion("TELE_CODE like", value, "teleCode");
            return (Criteria) this;
        }

        public Criteria andTeleCodeNotLike(String value) {
            addCriterion("TELE_CODE not like", value, "teleCode");
            return (Criteria) this;
        }

        public Criteria andTeleCodeIn(List<String> values) {
            addCriterion("TELE_CODE in", values, "teleCode");
            return (Criteria) this;
        }

        public Criteria andTeleCodeNotIn(List<String> values) {
            addCriterion("TELE_CODE not in", values, "teleCode");
            return (Criteria) this;
        }

        public Criteria andTeleCodeBetween(String value1, String value2) {
            addCriterion("TELE_CODE between", value1, value2, "teleCode");
            return (Criteria) this;
        }

        public Criteria andTeleCodeNotBetween(String value1, String value2) {
            addCriterion("TELE_CODE not between", value1, value2, "teleCode");
            return (Criteria) this;
        }

        public Criteria andCurrentNameIsNull() {
            addCriterion("CURRENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCurrentNameIsNotNull() {
            addCriterion("CURRENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentNameEqualTo(String value) {
            addCriterion("CURRENT_NAME =", value, "currentName");
            return (Criteria) this;
        }

        public Criteria andCurrentNameNotEqualTo(String value) {
            addCriterion("CURRENT_NAME <>", value, "currentName");
            return (Criteria) this;
        }

        public Criteria andCurrentNameGreaterThan(String value) {
            addCriterion("CURRENT_NAME >", value, "currentName");
            return (Criteria) this;
        }

        public Criteria andCurrentNameGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_NAME >=", value, "currentName");
            return (Criteria) this;
        }

        public Criteria andCurrentNameLessThan(String value) {
            addCriterion("CURRENT_NAME <", value, "currentName");
            return (Criteria) this;
        }

        public Criteria andCurrentNameLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_NAME <=", value, "currentName");
            return (Criteria) this;
        }

        public Criteria andCurrentNameLike(String value) {
            addCriterion("CURRENT_NAME like", value, "currentName");
            return (Criteria) this;
        }

        public Criteria andCurrentNameNotLike(String value) {
            addCriterion("CURRENT_NAME not like", value, "currentName");
            return (Criteria) this;
        }

        public Criteria andCurrentNameIn(List<String> values) {
            addCriterion("CURRENT_NAME in", values, "currentName");
            return (Criteria) this;
        }

        public Criteria andCurrentNameNotIn(List<String> values) {
            addCriterion("CURRENT_NAME not in", values, "currentName");
            return (Criteria) this;
        }

        public Criteria andCurrentNameBetween(String value1, String value2) {
            addCriterion("CURRENT_NAME between", value1, value2, "currentName");
            return (Criteria) this;
        }

        public Criteria andCurrentNameNotBetween(String value1, String value2) {
            addCriterion("CURRENT_NAME not between", value1, value2, "currentName");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNull() {
            addCriterion("PARENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andParentCodeIsNotNull() {
            addCriterion("PARENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andParentCodeEqualTo(String value) {
            addCriterion("PARENT_CODE =", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotEqualTo(String value) {
            addCriterion("PARENT_CODE <>", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThan(String value) {
            addCriterion("PARENT_CODE >", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_CODE >=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThan(String value) {
            addCriterion("PARENT_CODE <", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLessThanOrEqualTo(String value) {
            addCriterion("PARENT_CODE <=", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeLike(String value) {
            addCriterion("PARENT_CODE like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotLike(String value) {
            addCriterion("PARENT_CODE not like", value, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeIn(List<String> values) {
            addCriterion("PARENT_CODE in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotIn(List<String> values) {
            addCriterion("PARENT_CODE not in", values, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeBetween(String value1, String value2) {
            addCriterion("PARENT_CODE between", value1, value2, "parentCode");
            return (Criteria) this;
        }

        public Criteria andParentCodeNotBetween(String value1, String value2) {
            addCriterion("PARENT_CODE not between", value1, value2, "parentCode");
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