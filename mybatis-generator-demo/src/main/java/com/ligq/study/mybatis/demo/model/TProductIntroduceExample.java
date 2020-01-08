package com.ligq.study.mybatis.demo.model;

import java.util.ArrayList;
import java.util.List;

public class TProductIntroduceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TProductIntroduceExample() {
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

        public Criteria andH5AdFileIdIsNull() {
            addCriterion("H5_AD_FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andH5AdFileIdIsNotNull() {
            addCriterion("H5_AD_FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andH5AdFileIdEqualTo(String value) {
            addCriterion("H5_AD_FILE_ID =", value, "h5AdFileId");
            return (Criteria) this;
        }

        public Criteria andH5AdFileIdNotEqualTo(String value) {
            addCriterion("H5_AD_FILE_ID <>", value, "h5AdFileId");
            return (Criteria) this;
        }

        public Criteria andH5AdFileIdGreaterThan(String value) {
            addCriterion("H5_AD_FILE_ID >", value, "h5AdFileId");
            return (Criteria) this;
        }

        public Criteria andH5AdFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("H5_AD_FILE_ID >=", value, "h5AdFileId");
            return (Criteria) this;
        }

        public Criteria andH5AdFileIdLessThan(String value) {
            addCriterion("H5_AD_FILE_ID <", value, "h5AdFileId");
            return (Criteria) this;
        }

        public Criteria andH5AdFileIdLessThanOrEqualTo(String value) {
            addCriterion("H5_AD_FILE_ID <=", value, "h5AdFileId");
            return (Criteria) this;
        }

        public Criteria andH5AdFileIdLike(String value) {
            addCriterion("H5_AD_FILE_ID like", value, "h5AdFileId");
            return (Criteria) this;
        }

        public Criteria andH5AdFileIdNotLike(String value) {
            addCriterion("H5_AD_FILE_ID not like", value, "h5AdFileId");
            return (Criteria) this;
        }

        public Criteria andH5AdFileIdIn(List<String> values) {
            addCriterion("H5_AD_FILE_ID in", values, "h5AdFileId");
            return (Criteria) this;
        }

        public Criteria andH5AdFileIdNotIn(List<String> values) {
            addCriterion("H5_AD_FILE_ID not in", values, "h5AdFileId");
            return (Criteria) this;
        }

        public Criteria andH5AdFileIdBetween(String value1, String value2) {
            addCriterion("H5_AD_FILE_ID between", value1, value2, "h5AdFileId");
            return (Criteria) this;
        }

        public Criteria andH5AdFileIdNotBetween(String value1, String value2) {
            addCriterion("H5_AD_FILE_ID not between", value1, value2, "h5AdFileId");
            return (Criteria) this;
        }

        public Criteria andPcAdFileIdIsNull() {
            addCriterion("PC_AD_FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPcAdFileIdIsNotNull() {
            addCriterion("PC_AD_FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPcAdFileIdEqualTo(String value) {
            addCriterion("PC_AD_FILE_ID =", value, "pcAdFileId");
            return (Criteria) this;
        }

        public Criteria andPcAdFileIdNotEqualTo(String value) {
            addCriterion("PC_AD_FILE_ID <>", value, "pcAdFileId");
            return (Criteria) this;
        }

        public Criteria andPcAdFileIdGreaterThan(String value) {
            addCriterion("PC_AD_FILE_ID >", value, "pcAdFileId");
            return (Criteria) this;
        }

        public Criteria andPcAdFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("PC_AD_FILE_ID >=", value, "pcAdFileId");
            return (Criteria) this;
        }

        public Criteria andPcAdFileIdLessThan(String value) {
            addCriterion("PC_AD_FILE_ID <", value, "pcAdFileId");
            return (Criteria) this;
        }

        public Criteria andPcAdFileIdLessThanOrEqualTo(String value) {
            addCriterion("PC_AD_FILE_ID <=", value, "pcAdFileId");
            return (Criteria) this;
        }

        public Criteria andPcAdFileIdLike(String value) {
            addCriterion("PC_AD_FILE_ID like", value, "pcAdFileId");
            return (Criteria) this;
        }

        public Criteria andPcAdFileIdNotLike(String value) {
            addCriterion("PC_AD_FILE_ID not like", value, "pcAdFileId");
            return (Criteria) this;
        }

        public Criteria andPcAdFileIdIn(List<String> values) {
            addCriterion("PC_AD_FILE_ID in", values, "pcAdFileId");
            return (Criteria) this;
        }

        public Criteria andPcAdFileIdNotIn(List<String> values) {
            addCriterion("PC_AD_FILE_ID not in", values, "pcAdFileId");
            return (Criteria) this;
        }

        public Criteria andPcAdFileIdBetween(String value1, String value2) {
            addCriterion("PC_AD_FILE_ID between", value1, value2, "pcAdFileId");
            return (Criteria) this;
        }

        public Criteria andPcAdFileIdNotBetween(String value1, String value2) {
            addCriterion("PC_AD_FILE_ID not between", value1, value2, "pcAdFileId");
            return (Criteria) this;
        }

        public Criteria andH5BgFileIdIsNull() {
            addCriterion("H5_BG_FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andH5BgFileIdIsNotNull() {
            addCriterion("H5_BG_FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andH5BgFileIdEqualTo(String value) {
            addCriterion("H5_BG_FILE_ID =", value, "h5BgFileId");
            return (Criteria) this;
        }

        public Criteria andH5BgFileIdNotEqualTo(String value) {
            addCriterion("H5_BG_FILE_ID <>", value, "h5BgFileId");
            return (Criteria) this;
        }

        public Criteria andH5BgFileIdGreaterThan(String value) {
            addCriterion("H5_BG_FILE_ID >", value, "h5BgFileId");
            return (Criteria) this;
        }

        public Criteria andH5BgFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("H5_BG_FILE_ID >=", value, "h5BgFileId");
            return (Criteria) this;
        }

        public Criteria andH5BgFileIdLessThan(String value) {
            addCriterion("H5_BG_FILE_ID <", value, "h5BgFileId");
            return (Criteria) this;
        }

        public Criteria andH5BgFileIdLessThanOrEqualTo(String value) {
            addCriterion("H5_BG_FILE_ID <=", value, "h5BgFileId");
            return (Criteria) this;
        }

        public Criteria andH5BgFileIdLike(String value) {
            addCriterion("H5_BG_FILE_ID like", value, "h5BgFileId");
            return (Criteria) this;
        }

        public Criteria andH5BgFileIdNotLike(String value) {
            addCriterion("H5_BG_FILE_ID not like", value, "h5BgFileId");
            return (Criteria) this;
        }

        public Criteria andH5BgFileIdIn(List<String> values) {
            addCriterion("H5_BG_FILE_ID in", values, "h5BgFileId");
            return (Criteria) this;
        }

        public Criteria andH5BgFileIdNotIn(List<String> values) {
            addCriterion("H5_BG_FILE_ID not in", values, "h5BgFileId");
            return (Criteria) this;
        }

        public Criteria andH5BgFileIdBetween(String value1, String value2) {
            addCriterion("H5_BG_FILE_ID between", value1, value2, "h5BgFileId");
            return (Criteria) this;
        }

        public Criteria andH5BgFileIdNotBetween(String value1, String value2) {
            addCriterion("H5_BG_FILE_ID not between", value1, value2, "h5BgFileId");
            return (Criteria) this;
        }

        public Criteria andPcBgFileIdIsNull() {
            addCriterion("PC_BG_FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPcBgFileIdIsNotNull() {
            addCriterion("PC_BG_FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPcBgFileIdEqualTo(String value) {
            addCriterion("PC_BG_FILE_ID =", value, "pcBgFileId");
            return (Criteria) this;
        }

        public Criteria andPcBgFileIdNotEqualTo(String value) {
            addCriterion("PC_BG_FILE_ID <>", value, "pcBgFileId");
            return (Criteria) this;
        }

        public Criteria andPcBgFileIdGreaterThan(String value) {
            addCriterion("PC_BG_FILE_ID >", value, "pcBgFileId");
            return (Criteria) this;
        }

        public Criteria andPcBgFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("PC_BG_FILE_ID >=", value, "pcBgFileId");
            return (Criteria) this;
        }

        public Criteria andPcBgFileIdLessThan(String value) {
            addCriterion("PC_BG_FILE_ID <", value, "pcBgFileId");
            return (Criteria) this;
        }

        public Criteria andPcBgFileIdLessThanOrEqualTo(String value) {
            addCriterion("PC_BG_FILE_ID <=", value, "pcBgFileId");
            return (Criteria) this;
        }

        public Criteria andPcBgFileIdLike(String value) {
            addCriterion("PC_BG_FILE_ID like", value, "pcBgFileId");
            return (Criteria) this;
        }

        public Criteria andPcBgFileIdNotLike(String value) {
            addCriterion("PC_BG_FILE_ID not like", value, "pcBgFileId");
            return (Criteria) this;
        }

        public Criteria andPcBgFileIdIn(List<String> values) {
            addCriterion("PC_BG_FILE_ID in", values, "pcBgFileId");
            return (Criteria) this;
        }

        public Criteria andPcBgFileIdNotIn(List<String> values) {
            addCriterion("PC_BG_FILE_ID not in", values, "pcBgFileId");
            return (Criteria) this;
        }

        public Criteria andPcBgFileIdBetween(String value1, String value2) {
            addCriterion("PC_BG_FILE_ID between", value1, value2, "pcBgFileId");
            return (Criteria) this;
        }

        public Criteria andPcBgFileIdNotBetween(String value1, String value2) {
            addCriterion("PC_BG_FILE_ID not between", value1, value2, "pcBgFileId");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeIsNull() {
            addCriterion("TEMPLATE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeIsNotNull() {
            addCriterion("TEMPLATE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeEqualTo(String value) {
            addCriterion("TEMPLATE_CODE =", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeNotEqualTo(String value) {
            addCriterion("TEMPLATE_CODE <>", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeGreaterThan(String value) {
            addCriterion("TEMPLATE_CODE >", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_CODE >=", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeLessThan(String value) {
            addCriterion("TEMPLATE_CODE <", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_CODE <=", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeLike(String value) {
            addCriterion("TEMPLATE_CODE like", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeNotLike(String value) {
            addCriterion("TEMPLATE_CODE not like", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeIn(List<String> values) {
            addCriterion("TEMPLATE_CODE in", values, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeNotIn(List<String> values) {
            addCriterion("TEMPLATE_CODE not in", values, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeBetween(String value1, String value2) {
            addCriterion("TEMPLATE_CODE between", value1, value2, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_CODE not between", value1, value2, "templateCode");
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