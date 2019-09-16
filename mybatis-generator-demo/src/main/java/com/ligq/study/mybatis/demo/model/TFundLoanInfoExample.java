package com.ligq.study.mybatis.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TFundLoanInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TFundLoanInfoExample() {
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

        public Criteria andLoanIdIsNull() {
            addCriterion("loan_id is null");
            return (Criteria) this;
        }

        public Criteria andLoanIdIsNotNull() {
            addCriterion("loan_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoanIdEqualTo(String value) {
            addCriterion("loan_id =", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotEqualTo(String value) {
            addCriterion("loan_id <>", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThan(String value) {
            addCriterion("loan_id >", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdGreaterThanOrEqualTo(String value) {
            addCriterion("loan_id >=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThan(String value) {
            addCriterion("loan_id <", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLessThanOrEqualTo(String value) {
            addCriterion("loan_id <=", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdLike(String value) {
            addCriterion("loan_id like", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotLike(String value) {
            addCriterion("loan_id not like", value, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdIn(List<String> values) {
            addCriterion("loan_id in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotIn(List<String> values) {
            addCriterion("loan_id not in", values, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdBetween(String value1, String value2) {
            addCriterion("loan_id between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andLoanIdNotBetween(String value1, String value2) {
            addCriterion("loan_id not between", value1, value2, "loanId");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeIsNull() {
            addCriterion("fund_org_code is null");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeIsNotNull() {
            addCriterion("fund_org_code is not null");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeEqualTo(String value) {
            addCriterion("fund_org_code =", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeNotEqualTo(String value) {
            addCriterion("fund_org_code <>", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeGreaterThan(String value) {
            addCriterion("fund_org_code >", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fund_org_code >=", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeLessThan(String value) {
            addCriterion("fund_org_code <", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("fund_org_code <=", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeLike(String value) {
            addCriterion("fund_org_code like", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeNotLike(String value) {
            addCriterion("fund_org_code not like", value, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeIn(List<String> values) {
            addCriterion("fund_org_code in", values, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeNotIn(List<String> values) {
            addCriterion("fund_org_code not in", values, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeBetween(String value1, String value2) {
            addCriterion("fund_org_code between", value1, value2, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgCodeNotBetween(String value1, String value2) {
            addCriterion("fund_org_code not between", value1, value2, "fundOrgCode");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameIsNull() {
            addCriterion("fund_org_name is null");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameIsNotNull() {
            addCriterion("fund_org_name is not null");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameEqualTo(String value) {
            addCriterion("fund_org_name =", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameNotEqualTo(String value) {
            addCriterion("fund_org_name <>", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameGreaterThan(String value) {
            addCriterion("fund_org_name >", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("fund_org_name >=", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameLessThan(String value) {
            addCriterion("fund_org_name <", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameLessThanOrEqualTo(String value) {
            addCriterion("fund_org_name <=", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameLike(String value) {
            addCriterion("fund_org_name like", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameNotLike(String value) {
            addCriterion("fund_org_name not like", value, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameIn(List<String> values) {
            addCriterion("fund_org_name in", values, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameNotIn(List<String> values) {
            addCriterion("fund_org_name not in", values, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameBetween(String value1, String value2) {
            addCriterion("fund_org_name between", value1, value2, "fundOrgName");
            return (Criteria) this;
        }

        public Criteria andFundOrgNameNotBetween(String value1, String value2) {
            addCriterion("fund_org_name not between", value1, value2, "fundOrgName");
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

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("id_type is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("id_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("id_type =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("id_type <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("id_type >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("id_type >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("id_type <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("id_type <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("id_type like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("id_type not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("id_type in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("id_type not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("id_type between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("id_type not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNull() {
            addCriterion("id_no is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("id_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("id_no =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("id_no <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("id_no >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("id_no >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("id_no <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("id_no <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("id_no like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("id_no not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("id_no in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("id_no not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("id_no between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("id_no not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileIsNull() {
            addCriterion("customer_mobile is null");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileIsNotNull() {
            addCriterion("customer_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileEqualTo(String value) {
            addCriterion("customer_mobile =", value, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileNotEqualTo(String value) {
            addCriterion("customer_mobile <>", value, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileGreaterThan(String value) {
            addCriterion("customer_mobile >", value, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileGreaterThanOrEqualTo(String value) {
            addCriterion("customer_mobile >=", value, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileLessThan(String value) {
            addCriterion("customer_mobile <", value, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileLessThanOrEqualTo(String value) {
            addCriterion("customer_mobile <=", value, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileLike(String value) {
            addCriterion("customer_mobile like", value, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileNotLike(String value) {
            addCriterion("customer_mobile not like", value, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileIn(List<String> values) {
            addCriterion("customer_mobile in", values, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileNotIn(List<String> values) {
            addCriterion("customer_mobile not in", values, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileBetween(String value1, String value2) {
            addCriterion("customer_mobile between", value1, value2, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andCustomerMobileNotBetween(String value1, String value2) {
            addCriterion("customer_mobile not between", value1, value2, "customerMobile");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelIsNull() {
            addCriterion("customer_label is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelIsNotNull() {
            addCriterion("customer_label is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelEqualTo(String value) {
            addCriterion("customer_label =", value, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelNotEqualTo(String value) {
            addCriterion("customer_label <>", value, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelGreaterThan(String value) {
            addCriterion("customer_label >", value, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelGreaterThanOrEqualTo(String value) {
            addCriterion("customer_label >=", value, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelLessThan(String value) {
            addCriterion("customer_label <", value, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelLessThanOrEqualTo(String value) {
            addCriterion("customer_label <=", value, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelLike(String value) {
            addCriterion("customer_label like", value, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelNotLike(String value) {
            addCriterion("customer_label not like", value, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelIn(List<String> values) {
            addCriterion("customer_label in", values, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelNotIn(List<String> values) {
            addCriterion("customer_label not in", values, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelBetween(String value1, String value2) {
            addCriterion("customer_label between", value1, value2, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andCustomerLabelNotBetween(String value1, String value2) {
            addCriterion("customer_label not between", value1, value2, "customerLabel");
            return (Criteria) this;
        }

        public Criteria andLoanAmtIsNull() {
            addCriterion("loan_amt is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmtIsNotNull() {
            addCriterion("loan_amt is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmtEqualTo(Long value) {
            addCriterion("loan_amt =", value, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtNotEqualTo(Long value) {
            addCriterion("loan_amt <>", value, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtGreaterThan(Long value) {
            addCriterion("loan_amt >", value, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("loan_amt >=", value, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtLessThan(Long value) {
            addCriterion("loan_amt <", value, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtLessThanOrEqualTo(Long value) {
            addCriterion("loan_amt <=", value, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtIn(List<Long> values) {
            addCriterion("loan_amt in", values, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtNotIn(List<Long> values) {
            addCriterion("loan_amt not in", values, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtBetween(Long value1, Long value2) {
            addCriterion("loan_amt between", value1, value2, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanAmtNotBetween(Long value1, Long value2) {
            addCriterion("loan_amt not between", value1, value2, "loanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIsNull() {
            addCriterion("loan_purpose is null");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIsNotNull() {
            addCriterion("loan_purpose is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeEqualTo(String value) {
            addCriterion("loan_purpose =", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeNotEqualTo(String value) {
            addCriterion("loan_purpose <>", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeGreaterThan(String value) {
            addCriterion("loan_purpose >", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("loan_purpose >=", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeLessThan(String value) {
            addCriterion("loan_purpose <", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeLessThanOrEqualTo(String value) {
            addCriterion("loan_purpose <=", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeLike(String value) {
            addCriterion("loan_purpose like", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeNotLike(String value) {
            addCriterion("loan_purpose not like", value, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeIn(List<String> values) {
            addCriterion("loan_purpose in", values, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeNotIn(List<String> values) {
            addCriterion("loan_purpose not in", values, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeBetween(String value1, String value2) {
            addCriterion("loan_purpose between", value1, value2, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andLoanPurposeNotBetween(String value1, String value2) {
            addCriterion("loan_purpose not between", value1, value2, "loanPurpose");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodIsNull() {
            addCriterion("total_period is null");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodIsNotNull() {
            addCriterion("total_period is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodEqualTo(Integer value) {
            addCriterion("total_period =", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodNotEqualTo(Integer value) {
            addCriterion("total_period <>", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodGreaterThan(Integer value) {
            addCriterion("total_period >", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_period >=", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodLessThan(Integer value) {
            addCriterion("total_period <", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("total_period <=", value, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodIn(List<Integer> values) {
            addCriterion("total_period in", values, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodNotIn(List<Integer> values) {
            addCriterion("total_period not in", values, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodBetween(Integer value1, Integer value2) {
            addCriterion("total_period between", value1, value2, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andTotalPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("total_period not between", value1, value2, "totalPeriod");
            return (Criteria) this;
        }

        public Criteria andRateTypeIsNull() {
            addCriterion("rate_type is null");
            return (Criteria) this;
        }

        public Criteria andRateTypeIsNotNull() {
            addCriterion("rate_type is not null");
            return (Criteria) this;
        }

        public Criteria andRateTypeEqualTo(String value) {
            addCriterion("rate_type =", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotEqualTo(String value) {
            addCriterion("rate_type <>", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeGreaterThan(String value) {
            addCriterion("rate_type >", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rate_type >=", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLessThan(String value) {
            addCriterion("rate_type <", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLessThanOrEqualTo(String value) {
            addCriterion("rate_type <=", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLike(String value) {
            addCriterion("rate_type like", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotLike(String value) {
            addCriterion("rate_type not like", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeIn(List<String> values) {
            addCriterion("rate_type in", values, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotIn(List<String> values) {
            addCriterion("rate_type not in", values, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeBetween(String value1, String value2) {
            addCriterion("rate_type between", value1, value2, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotBetween(String value1, String value2) {
            addCriterion("rate_type not between", value1, value2, "rateType");
            return (Criteria) this;
        }

        public Criteria andYearDaysIsNull() {
            addCriterion("year_days is null");
            return (Criteria) this;
        }

        public Criteria andYearDaysIsNotNull() {
            addCriterion("year_days is not null");
            return (Criteria) this;
        }

        public Criteria andYearDaysEqualTo(Integer value) {
            addCriterion("year_days =", value, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysNotEqualTo(Integer value) {
            addCriterion("year_days <>", value, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysGreaterThan(Integer value) {
            addCriterion("year_days >", value, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("year_days >=", value, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysLessThan(Integer value) {
            addCriterion("year_days <", value, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysLessThanOrEqualTo(Integer value) {
            addCriterion("year_days <=", value, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysIn(List<Integer> values) {
            addCriterion("year_days in", values, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysNotIn(List<Integer> values) {
            addCriterion("year_days not in", values, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysBetween(Integer value1, Integer value2) {
            addCriterion("year_days between", value1, value2, "yearDays");
            return (Criteria) this;
        }

        public Criteria andYearDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("year_days not between", value1, value2, "yearDays");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(Float value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Float value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Float value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Float value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Float value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Float value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Float> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Float> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Float value1, Float value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Float value1, Float value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRepayTypeIsNull() {
            addCriterion("repay_type is null");
            return (Criteria) this;
        }

        public Criteria andRepayTypeIsNotNull() {
            addCriterion("repay_type is not null");
            return (Criteria) this;
        }

        public Criteria andRepayTypeEqualTo(String value) {
            addCriterion("repay_type =", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeNotEqualTo(String value) {
            addCriterion("repay_type <>", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeGreaterThan(String value) {
            addCriterion("repay_type >", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("repay_type >=", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeLessThan(String value) {
            addCriterion("repay_type <", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeLessThanOrEqualTo(String value) {
            addCriterion("repay_type <=", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeLike(String value) {
            addCriterion("repay_type like", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeNotLike(String value) {
            addCriterion("repay_type not like", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeIn(List<String> values) {
            addCriterion("repay_type in", values, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeNotIn(List<String> values) {
            addCriterion("repay_type not in", values, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeBetween(String value1, String value2) {
            addCriterion("repay_type between", value1, value2, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeNotBetween(String value1, String value2) {
            addCriterion("repay_type not between", value1, value2, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeIsNull() {
            addCriterion("repay_cycle_type is null");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeIsNotNull() {
            addCriterion("repay_cycle_type is not null");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeEqualTo(String value) {
            addCriterion("repay_cycle_type =", value, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeNotEqualTo(String value) {
            addCriterion("repay_cycle_type <>", value, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeGreaterThan(String value) {
            addCriterion("repay_cycle_type >", value, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("repay_cycle_type >=", value, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeLessThan(String value) {
            addCriterion("repay_cycle_type <", value, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeLessThanOrEqualTo(String value) {
            addCriterion("repay_cycle_type <=", value, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeLike(String value) {
            addCriterion("repay_cycle_type like", value, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeNotLike(String value) {
            addCriterion("repay_cycle_type not like", value, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeIn(List<String> values) {
            addCriterion("repay_cycle_type in", values, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeNotIn(List<String> values) {
            addCriterion("repay_cycle_type not in", values, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeBetween(String value1, String value2) {
            addCriterion("repay_cycle_type between", value1, value2, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleTypeNotBetween(String value1, String value2) {
            addCriterion("repay_cycle_type not between", value1, value2, "repayCycleType");
            return (Criteria) this;
        }

        public Criteria andRepayCycleIsNull() {
            addCriterion("repay_cycle is null");
            return (Criteria) this;
        }

        public Criteria andRepayCycleIsNotNull() {
            addCriterion("repay_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andRepayCycleEqualTo(Integer value) {
            addCriterion("repay_cycle =", value, "repayCycle");
            return (Criteria) this;
        }

        public Criteria andRepayCycleNotEqualTo(Integer value) {
            addCriterion("repay_cycle <>", value, "repayCycle");
            return (Criteria) this;
        }

        public Criteria andRepayCycleGreaterThan(Integer value) {
            addCriterion("repay_cycle >", value, "repayCycle");
            return (Criteria) this;
        }

        public Criteria andRepayCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("repay_cycle >=", value, "repayCycle");
            return (Criteria) this;
        }

        public Criteria andRepayCycleLessThan(Integer value) {
            addCriterion("repay_cycle <", value, "repayCycle");
            return (Criteria) this;
        }

        public Criteria andRepayCycleLessThanOrEqualTo(Integer value) {
            addCriterion("repay_cycle <=", value, "repayCycle");
            return (Criteria) this;
        }

        public Criteria andRepayCycleIn(List<Integer> values) {
            addCriterion("repay_cycle in", values, "repayCycle");
            return (Criteria) this;
        }

        public Criteria andRepayCycleNotIn(List<Integer> values) {
            addCriterion("repay_cycle not in", values, "repayCycle");
            return (Criteria) this;
        }

        public Criteria andRepayCycleBetween(Integer value1, Integer value2) {
            addCriterion("repay_cycle between", value1, value2, "repayCycle");
            return (Criteria) this;
        }

        public Criteria andRepayCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("repay_cycle not between", value1, value2, "repayCycle");
            return (Criteria) this;
        }

        public Criteria andDuebillIdIsNull() {
            addCriterion("duebill_id is null");
            return (Criteria) this;
        }

        public Criteria andDuebillIdIsNotNull() {
            addCriterion("duebill_id is not null");
            return (Criteria) this;
        }

        public Criteria andDuebillIdEqualTo(String value) {
            addCriterion("duebill_id =", value, "duebillId");
            return (Criteria) this;
        }

        public Criteria andDuebillIdNotEqualTo(String value) {
            addCriterion("duebill_id <>", value, "duebillId");
            return (Criteria) this;
        }

        public Criteria andDuebillIdGreaterThan(String value) {
            addCriterion("duebill_id >", value, "duebillId");
            return (Criteria) this;
        }

        public Criteria andDuebillIdGreaterThanOrEqualTo(String value) {
            addCriterion("duebill_id >=", value, "duebillId");
            return (Criteria) this;
        }

        public Criteria andDuebillIdLessThan(String value) {
            addCriterion("duebill_id <", value, "duebillId");
            return (Criteria) this;
        }

        public Criteria andDuebillIdLessThanOrEqualTo(String value) {
            addCriterion("duebill_id <=", value, "duebillId");
            return (Criteria) this;
        }

        public Criteria andDuebillIdLike(String value) {
            addCriterion("duebill_id like", value, "duebillId");
            return (Criteria) this;
        }

        public Criteria andDuebillIdNotLike(String value) {
            addCriterion("duebill_id not like", value, "duebillId");
            return (Criteria) this;
        }

        public Criteria andDuebillIdIn(List<String> values) {
            addCriterion("duebill_id in", values, "duebillId");
            return (Criteria) this;
        }

        public Criteria andDuebillIdNotIn(List<String> values) {
            addCriterion("duebill_id not in", values, "duebillId");
            return (Criteria) this;
        }

        public Criteria andDuebillIdBetween(String value1, String value2) {
            addCriterion("duebill_id between", value1, value2, "duebillId");
            return (Criteria) this;
        }

        public Criteria andDuebillIdNotBetween(String value1, String value2) {
            addCriterion("duebill_id not between", value1, value2, "duebillId");
            return (Criteria) this;
        }

        public Criteria andOutDuebillIdIsNull() {
            addCriterion("out_duebill_id is null");
            return (Criteria) this;
        }

        public Criteria andOutDuebillIdIsNotNull() {
            addCriterion("out_duebill_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutDuebillIdEqualTo(String value) {
            addCriterion("out_duebill_id =", value, "outDuebillId");
            return (Criteria) this;
        }

        public Criteria andOutDuebillIdNotEqualTo(String value) {
            addCriterion("out_duebill_id <>", value, "outDuebillId");
            return (Criteria) this;
        }

        public Criteria andOutDuebillIdGreaterThan(String value) {
            addCriterion("out_duebill_id >", value, "outDuebillId");
            return (Criteria) this;
        }

        public Criteria andOutDuebillIdGreaterThanOrEqualTo(String value) {
            addCriterion("out_duebill_id >=", value, "outDuebillId");
            return (Criteria) this;
        }

        public Criteria andOutDuebillIdLessThan(String value) {
            addCriterion("out_duebill_id <", value, "outDuebillId");
            return (Criteria) this;
        }

        public Criteria andOutDuebillIdLessThanOrEqualTo(String value) {
            addCriterion("out_duebill_id <=", value, "outDuebillId");
            return (Criteria) this;
        }

        public Criteria andOutDuebillIdLike(String value) {
            addCriterion("out_duebill_id like", value, "outDuebillId");
            return (Criteria) this;
        }

        public Criteria andOutDuebillIdNotLike(String value) {
            addCriterion("out_duebill_id not like", value, "outDuebillId");
            return (Criteria) this;
        }

        public Criteria andOutDuebillIdIn(List<String> values) {
            addCriterion("out_duebill_id in", values, "outDuebillId");
            return (Criteria) this;
        }

        public Criteria andOutDuebillIdNotIn(List<String> values) {
            addCriterion("out_duebill_id not in", values, "outDuebillId");
            return (Criteria) this;
        }

        public Criteria andOutDuebillIdBetween(String value1, String value2) {
            addCriterion("out_duebill_id between", value1, value2, "outDuebillId");
            return (Criteria) this;
        }

        public Criteria andOutDuebillIdNotBetween(String value1, String value2) {
            addCriterion("out_duebill_id not between", value1, value2, "outDuebillId");
            return (Criteria) this;
        }

        public Criteria andBizIdIsNull() {
            addCriterion("biz_id is null");
            return (Criteria) this;
        }

        public Criteria andBizIdIsNotNull() {
            addCriterion("biz_id is not null");
            return (Criteria) this;
        }

        public Criteria andBizIdEqualTo(String value) {
            addCriterion("biz_id =", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotEqualTo(String value) {
            addCriterion("biz_id <>", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdGreaterThan(String value) {
            addCriterion("biz_id >", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdGreaterThanOrEqualTo(String value) {
            addCriterion("biz_id >=", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLessThan(String value) {
            addCriterion("biz_id <", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLessThanOrEqualTo(String value) {
            addCriterion("biz_id <=", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdLike(String value) {
            addCriterion("biz_id like", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotLike(String value) {
            addCriterion("biz_id not like", value, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdIn(List<String> values) {
            addCriterion("biz_id in", values, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotIn(List<String> values) {
            addCriterion("biz_id not in", values, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdBetween(String value1, String value2) {
            addCriterion("biz_id between", value1, value2, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizIdNotBetween(String value1, String value2) {
            addCriterion("biz_id not between", value1, value2, "bizId");
            return (Criteria) this;
        }

        public Criteria andBizStatusIsNull() {
            addCriterion("biz_status is null");
            return (Criteria) this;
        }

        public Criteria andBizStatusIsNotNull() {
            addCriterion("biz_status is not null");
            return (Criteria) this;
        }

        public Criteria andBizStatusEqualTo(String value) {
            addCriterion("biz_status =", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusNotEqualTo(String value) {
            addCriterion("biz_status <>", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusGreaterThan(String value) {
            addCriterion("biz_status >", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusGreaterThanOrEqualTo(String value) {
            addCriterion("biz_status >=", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusLessThan(String value) {
            addCriterion("biz_status <", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusLessThanOrEqualTo(String value) {
            addCriterion("biz_status <=", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusLike(String value) {
            addCriterion("biz_status like", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusNotLike(String value) {
            addCriterion("biz_status not like", value, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusIn(List<String> values) {
            addCriterion("biz_status in", values, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusNotIn(List<String> values) {
            addCriterion("biz_status not in", values, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusBetween(String value1, String value2) {
            addCriterion("biz_status between", value1, value2, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andBizStatusNotBetween(String value1, String value2) {
            addCriterion("biz_status not between", value1, value2, "bizStatus");
            return (Criteria) this;
        }

        public Criteria andErrorDescIsNull() {
            addCriterion("error_desc is null");
            return (Criteria) this;
        }

        public Criteria andErrorDescIsNotNull() {
            addCriterion("error_desc is not null");
            return (Criteria) this;
        }

        public Criteria andErrorDescEqualTo(String value) {
            addCriterion("error_desc =", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescNotEqualTo(String value) {
            addCriterion("error_desc <>", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescGreaterThan(String value) {
            addCriterion("error_desc >", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescGreaterThanOrEqualTo(String value) {
            addCriterion("error_desc >=", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescLessThan(String value) {
            addCriterion("error_desc <", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescLessThanOrEqualTo(String value) {
            addCriterion("error_desc <=", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescLike(String value) {
            addCriterion("error_desc like", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescNotLike(String value) {
            addCriterion("error_desc not like", value, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescIn(List<String> values) {
            addCriterion("error_desc in", values, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescNotIn(List<String> values) {
            addCriterion("error_desc not in", values, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescBetween(String value1, String value2) {
            addCriterion("error_desc between", value1, value2, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andErrorDescNotBetween(String value1, String value2) {
            addCriterion("error_desc not between", value1, value2, "errorDesc");
            return (Criteria) this;
        }

        public Criteria andLesseeIdIsNull() {
            addCriterion("lessee_id is null");
            return (Criteria) this;
        }

        public Criteria andLesseeIdIsNotNull() {
            addCriterion("lessee_id is not null");
            return (Criteria) this;
        }

        public Criteria andLesseeIdEqualTo(String value) {
            addCriterion("lessee_id =", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotEqualTo(String value) {
            addCriterion("lessee_id <>", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdGreaterThan(String value) {
            addCriterion("lessee_id >", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdGreaterThanOrEqualTo(String value) {
            addCriterion("lessee_id >=", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdLessThan(String value) {
            addCriterion("lessee_id <", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdLessThanOrEqualTo(String value) {
            addCriterion("lessee_id <=", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdLike(String value) {
            addCriterion("lessee_id like", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotLike(String value) {
            addCriterion("lessee_id not like", value, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdIn(List<String> values) {
            addCriterion("lessee_id in", values, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotIn(List<String> values) {
            addCriterion("lessee_id not in", values, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdBetween(String value1, String value2) {
            addCriterion("lessee_id between", value1, value2, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andLesseeIdNotBetween(String value1, String value2) {
            addCriterion("lessee_id not between", value1, value2, "lesseeId");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(String value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(String value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(String value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(String value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(String value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLike(String value) {
            addCriterion("start_date like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotLike(String value) {
            addCriterion("start_date not like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<String> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<String> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(String value1, String value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(String value1, String value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andDueDateIsNull() {
            addCriterion("due_date is null");
            return (Criteria) this;
        }

        public Criteria andDueDateIsNotNull() {
            addCriterion("due_date is not null");
            return (Criteria) this;
        }

        public Criteria andDueDateEqualTo(String value) {
            addCriterion("due_date =", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotEqualTo(String value) {
            addCriterion("due_date <>", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateGreaterThan(String value) {
            addCriterion("due_date >", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateGreaterThanOrEqualTo(String value) {
            addCriterion("due_date >=", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLessThan(String value) {
            addCriterion("due_date <", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLessThanOrEqualTo(String value) {
            addCriterion("due_date <=", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLike(String value) {
            addCriterion("due_date like", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotLike(String value) {
            addCriterion("due_date not like", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateIn(List<String> values) {
            addCriterion("due_date in", values, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotIn(List<String> values) {
            addCriterion("due_date not in", values, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateBetween(String value1, String value2) {
            addCriterion("due_date between", value1, value2, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotBetween(String value1, String value2) {
            addCriterion("due_date not between", value1, value2, "dueDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateIsNull() {
            addCriterion("first_repay_date is null");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateIsNotNull() {
            addCriterion("first_repay_date is not null");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateEqualTo(String value) {
            addCriterion("first_repay_date =", value, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateNotEqualTo(String value) {
            addCriterion("first_repay_date <>", value, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateGreaterThan(String value) {
            addCriterion("first_repay_date >", value, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateGreaterThanOrEqualTo(String value) {
            addCriterion("first_repay_date >=", value, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateLessThan(String value) {
            addCriterion("first_repay_date <", value, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateLessThanOrEqualTo(String value) {
            addCriterion("first_repay_date <=", value, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateLike(String value) {
            addCriterion("first_repay_date like", value, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateNotLike(String value) {
            addCriterion("first_repay_date not like", value, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateIn(List<String> values) {
            addCriterion("first_repay_date in", values, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateNotIn(List<String> values) {
            addCriterion("first_repay_date not in", values, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateBetween(String value1, String value2) {
            addCriterion("first_repay_date between", value1, value2, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andFirstRepayDateNotBetween(String value1, String value2) {
            addCriterion("first_repay_date not between", value1, value2, "firstRepayDate");
            return (Criteria) this;
        }

        public Criteria andLoanAccBankCodeIsNull() {
            addCriterion("loan_acc_bank_code is null");
            return (Criteria) this;
        }

        public Criteria andLoanAccBankCodeIsNotNull() {
            addCriterion("loan_acc_bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAccBankCodeEqualTo(String value) {
            addCriterion("loan_acc_bank_code =", value, "loanAccBankCode");
            return (Criteria) this;
        }

        public Criteria andLoanAccBankCodeNotEqualTo(String value) {
            addCriterion("loan_acc_bank_code <>", value, "loanAccBankCode");
            return (Criteria) this;
        }

        public Criteria andLoanAccBankCodeGreaterThan(String value) {
            addCriterion("loan_acc_bank_code >", value, "loanAccBankCode");
            return (Criteria) this;
        }

        public Criteria andLoanAccBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("loan_acc_bank_code >=", value, "loanAccBankCode");
            return (Criteria) this;
        }

        public Criteria andLoanAccBankCodeLessThan(String value) {
            addCriterion("loan_acc_bank_code <", value, "loanAccBankCode");
            return (Criteria) this;
        }

        public Criteria andLoanAccBankCodeLessThanOrEqualTo(String value) {
            addCriterion("loan_acc_bank_code <=", value, "loanAccBankCode");
            return (Criteria) this;
        }

        public Criteria andLoanAccBankCodeLike(String value) {
            addCriterion("loan_acc_bank_code like", value, "loanAccBankCode");
            return (Criteria) this;
        }

        public Criteria andLoanAccBankCodeNotLike(String value) {
            addCriterion("loan_acc_bank_code not like", value, "loanAccBankCode");
            return (Criteria) this;
        }

        public Criteria andLoanAccBankCodeIn(List<String> values) {
            addCriterion("loan_acc_bank_code in", values, "loanAccBankCode");
            return (Criteria) this;
        }

        public Criteria andLoanAccBankCodeNotIn(List<String> values) {
            addCriterion("loan_acc_bank_code not in", values, "loanAccBankCode");
            return (Criteria) this;
        }

        public Criteria andLoanAccBankCodeBetween(String value1, String value2) {
            addCriterion("loan_acc_bank_code between", value1, value2, "loanAccBankCode");
            return (Criteria) this;
        }

        public Criteria andLoanAccBankCodeNotBetween(String value1, String value2) {
            addCriterion("loan_acc_bank_code not between", value1, value2, "loanAccBankCode");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoIsNull() {
            addCriterion("loan_card_no is null");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoIsNotNull() {
            addCriterion("loan_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoEqualTo(String value) {
            addCriterion("loan_card_no =", value, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoNotEqualTo(String value) {
            addCriterion("loan_card_no <>", value, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoGreaterThan(String value) {
            addCriterion("loan_card_no >", value, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("loan_card_no >=", value, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoLessThan(String value) {
            addCriterion("loan_card_no <", value, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoLessThanOrEqualTo(String value) {
            addCriterion("loan_card_no <=", value, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoLike(String value) {
            addCriterion("loan_card_no like", value, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoNotLike(String value) {
            addCriterion("loan_card_no not like", value, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoIn(List<String> values) {
            addCriterion("loan_card_no in", values, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoNotIn(List<String> values) {
            addCriterion("loan_card_no not in", values, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoBetween(String value1, String value2) {
            addCriterion("loan_card_no between", value1, value2, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanCardNoNotBetween(String value1, String value2) {
            addCriterion("loan_card_no not between", value1, value2, "loanCardNo");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNameIsNull() {
            addCriterion("loan_account_name is null");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNameIsNotNull() {
            addCriterion("loan_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNameEqualTo(String value) {
            addCriterion("loan_account_name =", value, "loanAccountName");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNameNotEqualTo(String value) {
            addCriterion("loan_account_name <>", value, "loanAccountName");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNameGreaterThan(String value) {
            addCriterion("loan_account_name >", value, "loanAccountName");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("loan_account_name >=", value, "loanAccountName");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNameLessThan(String value) {
            addCriterion("loan_account_name <", value, "loanAccountName");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNameLessThanOrEqualTo(String value) {
            addCriterion("loan_account_name <=", value, "loanAccountName");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNameLike(String value) {
            addCriterion("loan_account_name like", value, "loanAccountName");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNameNotLike(String value) {
            addCriterion("loan_account_name not like", value, "loanAccountName");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNameIn(List<String> values) {
            addCriterion("loan_account_name in", values, "loanAccountName");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNameNotIn(List<String> values) {
            addCriterion("loan_account_name not in", values, "loanAccountName");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNameBetween(String value1, String value2) {
            addCriterion("loan_account_name between", value1, value2, "loanAccountName");
            return (Criteria) this;
        }

        public Criteria andLoanAccountNameNotBetween(String value1, String value2) {
            addCriterion("loan_account_name not between", value1, value2, "loanAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccBankCodeIsNull() {
            addCriterion("repay_acc_bank_code is null");
            return (Criteria) this;
        }

        public Criteria andRepayAccBankCodeIsNotNull() {
            addCriterion("repay_acc_bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andRepayAccBankCodeEqualTo(String value) {
            addCriterion("repay_acc_bank_code =", value, "repayAccBankCode");
            return (Criteria) this;
        }

        public Criteria andRepayAccBankCodeNotEqualTo(String value) {
            addCriterion("repay_acc_bank_code <>", value, "repayAccBankCode");
            return (Criteria) this;
        }

        public Criteria andRepayAccBankCodeGreaterThan(String value) {
            addCriterion("repay_acc_bank_code >", value, "repayAccBankCode");
            return (Criteria) this;
        }

        public Criteria andRepayAccBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("repay_acc_bank_code >=", value, "repayAccBankCode");
            return (Criteria) this;
        }

        public Criteria andRepayAccBankCodeLessThan(String value) {
            addCriterion("repay_acc_bank_code <", value, "repayAccBankCode");
            return (Criteria) this;
        }

        public Criteria andRepayAccBankCodeLessThanOrEqualTo(String value) {
            addCriterion("repay_acc_bank_code <=", value, "repayAccBankCode");
            return (Criteria) this;
        }

        public Criteria andRepayAccBankCodeLike(String value) {
            addCriterion("repay_acc_bank_code like", value, "repayAccBankCode");
            return (Criteria) this;
        }

        public Criteria andRepayAccBankCodeNotLike(String value) {
            addCriterion("repay_acc_bank_code not like", value, "repayAccBankCode");
            return (Criteria) this;
        }

        public Criteria andRepayAccBankCodeIn(List<String> values) {
            addCriterion("repay_acc_bank_code in", values, "repayAccBankCode");
            return (Criteria) this;
        }

        public Criteria andRepayAccBankCodeNotIn(List<String> values) {
            addCriterion("repay_acc_bank_code not in", values, "repayAccBankCode");
            return (Criteria) this;
        }

        public Criteria andRepayAccBankCodeBetween(String value1, String value2) {
            addCriterion("repay_acc_bank_code between", value1, value2, "repayAccBankCode");
            return (Criteria) this;
        }

        public Criteria andRepayAccBankCodeNotBetween(String value1, String value2) {
            addCriterion("repay_acc_bank_code not between", value1, value2, "repayAccBankCode");
            return (Criteria) this;
        }

        public Criteria andRepayCardNoIsNull() {
            addCriterion("repay_card_no is null");
            return (Criteria) this;
        }

        public Criteria andRepayCardNoIsNotNull() {
            addCriterion("repay_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andRepayCardNoEqualTo(String value) {
            addCriterion("repay_card_no =", value, "repayCardNo");
            return (Criteria) this;
        }

        public Criteria andRepayCardNoNotEqualTo(String value) {
            addCriterion("repay_card_no <>", value, "repayCardNo");
            return (Criteria) this;
        }

        public Criteria andRepayCardNoGreaterThan(String value) {
            addCriterion("repay_card_no >", value, "repayCardNo");
            return (Criteria) this;
        }

        public Criteria andRepayCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("repay_card_no >=", value, "repayCardNo");
            return (Criteria) this;
        }

        public Criteria andRepayCardNoLessThan(String value) {
            addCriterion("repay_card_no <", value, "repayCardNo");
            return (Criteria) this;
        }

        public Criteria andRepayCardNoLessThanOrEqualTo(String value) {
            addCriterion("repay_card_no <=", value, "repayCardNo");
            return (Criteria) this;
        }

        public Criteria andRepayCardNoLike(String value) {
            addCriterion("repay_card_no like", value, "repayCardNo");
            return (Criteria) this;
        }

        public Criteria andRepayCardNoNotLike(String value) {
            addCriterion("repay_card_no not like", value, "repayCardNo");
            return (Criteria) this;
        }

        public Criteria andRepayCardNoIn(List<String> values) {
            addCriterion("repay_card_no in", values, "repayCardNo");
            return (Criteria) this;
        }

        public Criteria andRepayCardNoNotIn(List<String> values) {
            addCriterion("repay_card_no not in", values, "repayCardNo");
            return (Criteria) this;
        }

        public Criteria andRepayCardNoBetween(String value1, String value2) {
            addCriterion("repay_card_no between", value1, value2, "repayCardNo");
            return (Criteria) this;
        }

        public Criteria andRepayCardNoNotBetween(String value1, String value2) {
            addCriterion("repay_card_no not between", value1, value2, "repayCardNo");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameIsNull() {
            addCriterion("repay_account_name is null");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameIsNotNull() {
            addCriterion("repay_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameEqualTo(String value) {
            addCriterion("repay_account_name =", value, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameNotEqualTo(String value) {
            addCriterion("repay_account_name <>", value, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameGreaterThan(String value) {
            addCriterion("repay_account_name >", value, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("repay_account_name >=", value, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameLessThan(String value) {
            addCriterion("repay_account_name <", value, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameLessThanOrEqualTo(String value) {
            addCriterion("repay_account_name <=", value, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameLike(String value) {
            addCriterion("repay_account_name like", value, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameNotLike(String value) {
            addCriterion("repay_account_name not like", value, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameIn(List<String> values) {
            addCriterion("repay_account_name in", values, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameNotIn(List<String> values) {
            addCriterion("repay_account_name not in", values, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameBetween(String value1, String value2) {
            addCriterion("repay_account_name between", value1, value2, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andRepayAccountNameNotBetween(String value1, String value2) {
            addCriterion("repay_account_name not between", value1, value2, "repayAccountName");
            return (Criteria) this;
        }

        public Criteria andInterestTypeIsNull() {
            addCriterion("interest_type is null");
            return (Criteria) this;
        }

        public Criteria andInterestTypeIsNotNull() {
            addCriterion("interest_type is not null");
            return (Criteria) this;
        }

        public Criteria andInterestTypeEqualTo(String value) {
            addCriterion("interest_type =", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeNotEqualTo(String value) {
            addCriterion("interest_type <>", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeGreaterThan(String value) {
            addCriterion("interest_type >", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeGreaterThanOrEqualTo(String value) {
            addCriterion("interest_type >=", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeLessThan(String value) {
            addCriterion("interest_type <", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeLessThanOrEqualTo(String value) {
            addCriterion("interest_type <=", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeLike(String value) {
            addCriterion("interest_type like", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeNotLike(String value) {
            addCriterion("interest_type not like", value, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeIn(List<String> values) {
            addCriterion("interest_type in", values, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeNotIn(List<String> values) {
            addCriterion("interest_type not in", values, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeBetween(String value1, String value2) {
            addCriterion("interest_type between", value1, value2, "interestType");
            return (Criteria) this;
        }

        public Criteria andInterestTypeNotBetween(String value1, String value2) {
            addCriterion("interest_type not between", value1, value2, "interestType");
            return (Criteria) this;
        }

        public Criteria andDisburseIdIsNull() {
            addCriterion("disburse_id is null");
            return (Criteria) this;
        }

        public Criteria andDisburseIdIsNotNull() {
            addCriterion("disburse_id is not null");
            return (Criteria) this;
        }

        public Criteria andDisburseIdEqualTo(String value) {
            addCriterion("disburse_id =", value, "disburseId");
            return (Criteria) this;
        }

        public Criteria andDisburseIdNotEqualTo(String value) {
            addCriterion("disburse_id <>", value, "disburseId");
            return (Criteria) this;
        }

        public Criteria andDisburseIdGreaterThan(String value) {
            addCriterion("disburse_id >", value, "disburseId");
            return (Criteria) this;
        }

        public Criteria andDisburseIdGreaterThanOrEqualTo(String value) {
            addCriterion("disburse_id >=", value, "disburseId");
            return (Criteria) this;
        }

        public Criteria andDisburseIdLessThan(String value) {
            addCriterion("disburse_id <", value, "disburseId");
            return (Criteria) this;
        }

        public Criteria andDisburseIdLessThanOrEqualTo(String value) {
            addCriterion("disburse_id <=", value, "disburseId");
            return (Criteria) this;
        }

        public Criteria andDisburseIdLike(String value) {
            addCriterion("disburse_id like", value, "disburseId");
            return (Criteria) this;
        }

        public Criteria andDisburseIdNotLike(String value) {
            addCriterion("disburse_id not like", value, "disburseId");
            return (Criteria) this;
        }

        public Criteria andDisburseIdIn(List<String> values) {
            addCriterion("disburse_id in", values, "disburseId");
            return (Criteria) this;
        }

        public Criteria andDisburseIdNotIn(List<String> values) {
            addCriterion("disburse_id not in", values, "disburseId");
            return (Criteria) this;
        }

        public Criteria andDisburseIdBetween(String value1, String value2) {
            addCriterion("disburse_id between", value1, value2, "disburseId");
            return (Criteria) this;
        }

        public Criteria andDisburseIdNotBetween(String value1, String value2) {
            addCriterion("disburse_id not between", value1, value2, "disburseId");
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

        public Criteria andClearDateIsNull() {
            addCriterion("clear_date is null");
            return (Criteria) this;
        }

        public Criteria andClearDateIsNotNull() {
            addCriterion("clear_date is not null");
            return (Criteria) this;
        }

        public Criteria andClearDateEqualTo(String value) {
            addCriterion("clear_date =", value, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateNotEqualTo(String value) {
            addCriterion("clear_date <>", value, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateGreaterThan(String value) {
            addCriterion("clear_date >", value, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateGreaterThanOrEqualTo(String value) {
            addCriterion("clear_date >=", value, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateLessThan(String value) {
            addCriterion("clear_date <", value, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateLessThanOrEqualTo(String value) {
            addCriterion("clear_date <=", value, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateLike(String value) {
            addCriterion("clear_date like", value, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateNotLike(String value) {
            addCriterion("clear_date not like", value, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateIn(List<String> values) {
            addCriterion("clear_date in", values, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateNotIn(List<String> values) {
            addCriterion("clear_date not in", values, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateBetween(String value1, String value2) {
            addCriterion("clear_date between", value1, value2, "clearDate");
            return (Criteria) this;
        }

        public Criteria andClearDateNotBetween(String value1, String value2) {
            addCriterion("clear_date not between", value1, value2, "clearDate");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlIsNull() {
            addCriterion("callback_url is null");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlIsNotNull() {
            addCriterion("callback_url is not null");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlEqualTo(String value) {
            addCriterion("callback_url =", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotEqualTo(String value) {
            addCriterion("callback_url <>", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlGreaterThan(String value) {
            addCriterion("callback_url >", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlGreaterThanOrEqualTo(String value) {
            addCriterion("callback_url >=", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlLessThan(String value) {
            addCriterion("callback_url <", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlLessThanOrEqualTo(String value) {
            addCriterion("callback_url <=", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlLike(String value) {
            addCriterion("callback_url like", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotLike(String value) {
            addCriterion("callback_url not like", value, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlIn(List<String> values) {
            addCriterion("callback_url in", values, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotIn(List<String> values) {
            addCriterion("callback_url not in", values, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlBetween(String value1, String value2) {
            addCriterion("callback_url between", value1, value2, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andCallbackUrlNotBetween(String value1, String value2) {
            addCriterion("callback_url not between", value1, value2, "callbackUrl");
            return (Criteria) this;
        }

        public Criteria andIsFixRepayIsNull() {
            addCriterion("is_fix_repay is null");
            return (Criteria) this;
        }

        public Criteria andIsFixRepayIsNotNull() {
            addCriterion("is_fix_repay is not null");
            return (Criteria) this;
        }

        public Criteria andIsFixRepayEqualTo(String value) {
            addCriterion("is_fix_repay =", value, "isFixRepay");
            return (Criteria) this;
        }

        public Criteria andIsFixRepayNotEqualTo(String value) {
            addCriterion("is_fix_repay <>", value, "isFixRepay");
            return (Criteria) this;
        }

        public Criteria andIsFixRepayGreaterThan(String value) {
            addCriterion("is_fix_repay >", value, "isFixRepay");
            return (Criteria) this;
        }

        public Criteria andIsFixRepayGreaterThanOrEqualTo(String value) {
            addCriterion("is_fix_repay >=", value, "isFixRepay");
            return (Criteria) this;
        }

        public Criteria andIsFixRepayLessThan(String value) {
            addCriterion("is_fix_repay <", value, "isFixRepay");
            return (Criteria) this;
        }

        public Criteria andIsFixRepayLessThanOrEqualTo(String value) {
            addCriterion("is_fix_repay <=", value, "isFixRepay");
            return (Criteria) this;
        }

        public Criteria andIsFixRepayLike(String value) {
            addCriterion("is_fix_repay like", value, "isFixRepay");
            return (Criteria) this;
        }

        public Criteria andIsFixRepayNotLike(String value) {
            addCriterion("is_fix_repay not like", value, "isFixRepay");
            return (Criteria) this;
        }

        public Criteria andIsFixRepayIn(List<String> values) {
            addCriterion("is_fix_repay in", values, "isFixRepay");
            return (Criteria) this;
        }

        public Criteria andIsFixRepayNotIn(List<String> values) {
            addCriterion("is_fix_repay not in", values, "isFixRepay");
            return (Criteria) this;
        }

        public Criteria andIsFixRepayBetween(String value1, String value2) {
            addCriterion("is_fix_repay between", value1, value2, "isFixRepay");
            return (Criteria) this;
        }

        public Criteria andIsFixRepayNotBetween(String value1, String value2) {
            addCriterion("is_fix_repay not between", value1, value2, "isFixRepay");
            return (Criteria) this;
        }

        public Criteria andRepayDateIsNull() {
            addCriterion("repay_date is null");
            return (Criteria) this;
        }

        public Criteria andRepayDateIsNotNull() {
            addCriterion("repay_date is not null");
            return (Criteria) this;
        }

        public Criteria andRepayDateEqualTo(String value) {
            addCriterion("repay_date =", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateNotEqualTo(String value) {
            addCriterion("repay_date <>", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateGreaterThan(String value) {
            addCriterion("repay_date >", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateGreaterThanOrEqualTo(String value) {
            addCriterion("repay_date >=", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateLessThan(String value) {
            addCriterion("repay_date <", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateLessThanOrEqualTo(String value) {
            addCriterion("repay_date <=", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateLike(String value) {
            addCriterion("repay_date like", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateNotLike(String value) {
            addCriterion("repay_date not like", value, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateIn(List<String> values) {
            addCriterion("repay_date in", values, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateNotIn(List<String> values) {
            addCriterion("repay_date not in", values, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateBetween(String value1, String value2) {
            addCriterion("repay_date between", value1, value2, "repayDate");
            return (Criteria) this;
        }

        public Criteria andRepayDateNotBetween(String value1, String value2) {
            addCriterion("repay_date not between", value1, value2, "repayDate");
            return (Criteria) this;
        }

        public Criteria andContractIdsIsNull() {
            addCriterion("contract_ids is null");
            return (Criteria) this;
        }

        public Criteria andContractIdsIsNotNull() {
            addCriterion("contract_ids is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdsEqualTo(String value) {
            addCriterion("contract_ids =", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsNotEqualTo(String value) {
            addCriterion("contract_ids <>", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsGreaterThan(String value) {
            addCriterion("contract_ids >", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsGreaterThanOrEqualTo(String value) {
            addCriterion("contract_ids >=", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsLessThan(String value) {
            addCriterion("contract_ids <", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsLessThanOrEqualTo(String value) {
            addCriterion("contract_ids <=", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsLike(String value) {
            addCriterion("contract_ids like", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsNotLike(String value) {
            addCriterion("contract_ids not like", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsIn(List<String> values) {
            addCriterion("contract_ids in", values, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsNotIn(List<String> values) {
            addCriterion("contract_ids not in", values, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsBetween(String value1, String value2) {
            addCriterion("contract_ids between", value1, value2, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsNotBetween(String value1, String value2) {
            addCriterion("contract_ids not between", value1, value2, "contractIds");
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