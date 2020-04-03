package com.youzhi.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmsOrderReturnApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsOrderReturnApplyExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(String value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(String value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(String value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(String value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(String value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLike(String value) {
            addCriterion("order_num like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotLike(String value) {
            addCriterion("order_num not like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<String> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<String> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(String value1, String value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(String value1, String value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdIsNull() {
            addCriterion("company_address_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdIsNotNull() {
            addCriterion("company_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdEqualTo(Integer value) {
            addCriterion("company_address_id =", value, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdNotEqualTo(Integer value) {
            addCriterion("company_address_id <>", value, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdGreaterThan(Integer value) {
            addCriterion("company_address_id >", value, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_address_id >=", value, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdLessThan(Integer value) {
            addCriterion("company_address_id <", value, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_address_id <=", value, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdIn(List<Integer> values) {
            addCriterion("company_address_id in", values, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdNotIn(List<Integer> values) {
            addCriterion("company_address_id not in", values, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("company_address_id between", value1, value2, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_address_id not between", value1, value2, "companyAddressId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNull() {
            addCriterion("good_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNotNull() {
            addCriterion("good_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIdEqualTo(Integer value) {
            addCriterion("good_id =", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotEqualTo(Integer value) {
            addCriterion("good_id <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThan(Integer value) {
            addCriterion("good_id >", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_id >=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThan(Integer value) {
            addCriterion("good_id <", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("good_id <=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIn(List<Integer> values) {
            addCriterion("good_id in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotIn(List<Integer> values) {
            addCriterion("good_id not in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdBetween(Integer value1, Integer value2) {
            addCriterion("good_id between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("good_id not between", value1, value2, "goodId");
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

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNull() {
            addCriterion("user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIsNotNull() {
            addCriterion("user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUserNicknameEqualTo(String value) {
            addCriterion("user_nickname =", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotEqualTo(String value) {
            addCriterion("user_nickname <>", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThan(String value) {
            addCriterion("user_nickname >", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nickname >=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThan(String value) {
            addCriterion("user_nickname <", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLessThanOrEqualTo(String value) {
            addCriterion("user_nickname <=", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameLike(String value) {
            addCriterion("user_nickname like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotLike(String value) {
            addCriterion("user_nickname not like", value, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameIn(List<String> values) {
            addCriterion("user_nickname in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotIn(List<String> values) {
            addCriterion("user_nickname not in", values, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameBetween(String value1, String value2) {
            addCriterion("user_nickname between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andUserNicknameNotBetween(String value1, String value2) {
            addCriterion("user_nickname not between", value1, value2, "userNickname");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIsNull() {
            addCriterion("return_amount is null");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIsNotNull() {
            addCriterion("return_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReturnAmountEqualTo(BigDecimal value) {
            addCriterion("return_amount =", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotEqualTo(BigDecimal value) {
            addCriterion("return_amount <>", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountGreaterThan(BigDecimal value) {
            addCriterion("return_amount >", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("return_amount >=", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountLessThan(BigDecimal value) {
            addCriterion("return_amount <", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("return_amount <=", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIn(List<BigDecimal> values) {
            addCriterion("return_amount in", values, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotIn(List<BigDecimal> values) {
            addCriterion("return_amount not in", values, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_amount between", value1, value2, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_amount not between", value1, value2, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnNameIsNull() {
            addCriterion("return_name is null");
            return (Criteria) this;
        }

        public Criteria andReturnNameIsNotNull() {
            addCriterion("return_name is not null");
            return (Criteria) this;
        }

        public Criteria andReturnNameEqualTo(String value) {
            addCriterion("return_name =", value, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameNotEqualTo(String value) {
            addCriterion("return_name <>", value, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameGreaterThan(String value) {
            addCriterion("return_name >", value, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameGreaterThanOrEqualTo(String value) {
            addCriterion("return_name >=", value, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameLessThan(String value) {
            addCriterion("return_name <", value, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameLessThanOrEqualTo(String value) {
            addCriterion("return_name <=", value, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameLike(String value) {
            addCriterion("return_name like", value, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameNotLike(String value) {
            addCriterion("return_name not like", value, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameIn(List<String> values) {
            addCriterion("return_name in", values, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameNotIn(List<String> values) {
            addCriterion("return_name not in", values, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameBetween(String value1, String value2) {
            addCriterion("return_name between", value1, value2, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnNameNotBetween(String value1, String value2) {
            addCriterion("return_name not between", value1, value2, "returnName");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneIsNull() {
            addCriterion("return_phone is null");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneIsNotNull() {
            addCriterion("return_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneEqualTo(String value) {
            addCriterion("return_phone =", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneNotEqualTo(String value) {
            addCriterion("return_phone <>", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneGreaterThan(String value) {
            addCriterion("return_phone >", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("return_phone >=", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneLessThan(String value) {
            addCriterion("return_phone <", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneLessThanOrEqualTo(String value) {
            addCriterion("return_phone <=", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneLike(String value) {
            addCriterion("return_phone like", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneNotLike(String value) {
            addCriterion("return_phone not like", value, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneIn(List<String> values) {
            addCriterion("return_phone in", values, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneNotIn(List<String> values) {
            addCriterion("return_phone not in", values, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneBetween(String value1, String value2) {
            addCriterion("return_phone between", value1, value2, "returnPhone");
            return (Criteria) this;
        }

        public Criteria andReturnPhoneNotBetween(String value1, String value2) {
            addCriterion("return_phone not between", value1, value2, "returnPhone");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andHandleManIsNull() {
            addCriterion("handle_man is null");
            return (Criteria) this;
        }

        public Criteria andHandleManIsNotNull() {
            addCriterion("handle_man is not null");
            return (Criteria) this;
        }

        public Criteria andHandleManEqualTo(String value) {
            addCriterion("handle_man =", value, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManNotEqualTo(String value) {
            addCriterion("handle_man <>", value, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManGreaterThan(String value) {
            addCriterion("handle_man >", value, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManGreaterThanOrEqualTo(String value) {
            addCriterion("handle_man >=", value, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManLessThan(String value) {
            addCriterion("handle_man <", value, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManLessThanOrEqualTo(String value) {
            addCriterion("handle_man <=", value, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManLike(String value) {
            addCriterion("handle_man like", value, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManNotLike(String value) {
            addCriterion("handle_man not like", value, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManIn(List<String> values) {
            addCriterion("handle_man in", values, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManNotIn(List<String> values) {
            addCriterion("handle_man not in", values, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManBetween(String value1, String value2) {
            addCriterion("handle_man between", value1, value2, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleManNotBetween(String value1, String value2) {
            addCriterion("handle_man not between", value1, value2, "handleMan");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNull() {
            addCriterion("handle_time is null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIsNotNull() {
            addCriterion("handle_time is not null");
            return (Criteria) this;
        }

        public Criteria andHandleTimeEqualTo(Date value) {
            addCriterion("handle_time =", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotEqualTo(Date value) {
            addCriterion("handle_time <>", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThan(Date value) {
            addCriterion("handle_time >", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("handle_time >=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThan(Date value) {
            addCriterion("handle_time <", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeLessThanOrEqualTo(Date value) {
            addCriterion("handle_time <=", value, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeIn(List<Date> values) {
            addCriterion("handle_time in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotIn(List<Date> values) {
            addCriterion("handle_time not in", values, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeBetween(Date value1, Date value2) {
            addCriterion("handle_time between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andHandleTimeNotBetween(Date value1, Date value2) {
            addCriterion("handle_time not between", value1, value2, "handleTime");
            return (Criteria) this;
        }

        public Criteria andGoodPicIsNull() {
            addCriterion("good_pic is null");
            return (Criteria) this;
        }

        public Criteria andGoodPicIsNotNull() {
            addCriterion("good_pic is not null");
            return (Criteria) this;
        }

        public Criteria andGoodPicEqualTo(String value) {
            addCriterion("good_pic =", value, "goodPic");
            return (Criteria) this;
        }

        public Criteria andGoodPicNotEqualTo(String value) {
            addCriterion("good_pic <>", value, "goodPic");
            return (Criteria) this;
        }

        public Criteria andGoodPicGreaterThan(String value) {
            addCriterion("good_pic >", value, "goodPic");
            return (Criteria) this;
        }

        public Criteria andGoodPicGreaterThanOrEqualTo(String value) {
            addCriterion("good_pic >=", value, "goodPic");
            return (Criteria) this;
        }

        public Criteria andGoodPicLessThan(String value) {
            addCriterion("good_pic <", value, "goodPic");
            return (Criteria) this;
        }

        public Criteria andGoodPicLessThanOrEqualTo(String value) {
            addCriterion("good_pic <=", value, "goodPic");
            return (Criteria) this;
        }

        public Criteria andGoodPicLike(String value) {
            addCriterion("good_pic like", value, "goodPic");
            return (Criteria) this;
        }

        public Criteria andGoodPicNotLike(String value) {
            addCriterion("good_pic not like", value, "goodPic");
            return (Criteria) this;
        }

        public Criteria andGoodPicIn(List<String> values) {
            addCriterion("good_pic in", values, "goodPic");
            return (Criteria) this;
        }

        public Criteria andGoodPicNotIn(List<String> values) {
            addCriterion("good_pic not in", values, "goodPic");
            return (Criteria) this;
        }

        public Criteria andGoodPicBetween(String value1, String value2) {
            addCriterion("good_pic between", value1, value2, "goodPic");
            return (Criteria) this;
        }

        public Criteria andGoodPicNotBetween(String value1, String value2) {
            addCriterion("good_pic not between", value1, value2, "goodPic");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNull() {
            addCriterion("good_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("good_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("good_name =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("good_name <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("good_name >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("good_name >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("good_name <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("good_name <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("good_name like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("good_name not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("good_name in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("good_name not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("good_name between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("good_name not between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodCountIsNull() {
            addCriterion("good_count is null");
            return (Criteria) this;
        }

        public Criteria andGoodCountIsNotNull() {
            addCriterion("good_count is not null");
            return (Criteria) this;
        }

        public Criteria andGoodCountEqualTo(Integer value) {
            addCriterion("good_count =", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountNotEqualTo(Integer value) {
            addCriterion("good_count <>", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountGreaterThan(Integer value) {
            addCriterion("good_count >", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_count >=", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountLessThan(Integer value) {
            addCriterion("good_count <", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountLessThanOrEqualTo(Integer value) {
            addCriterion("good_count <=", value, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountIn(List<Integer> values) {
            addCriterion("good_count in", values, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountNotIn(List<Integer> values) {
            addCriterion("good_count not in", values, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountBetween(Integer value1, Integer value2) {
            addCriterion("good_count between", value1, value2, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodCountNotBetween(Integer value1, Integer value2) {
            addCriterion("good_count not between", value1, value2, "goodCount");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNull() {
            addCriterion("good_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNotNull() {
            addCriterion("good_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceEqualTo(BigDecimal value) {
            addCriterion("good_price =", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotEqualTo(BigDecimal value) {
            addCriterion("good_price <>", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThan(BigDecimal value) {
            addCriterion("good_price >", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("good_price >=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThan(BigDecimal value) {
            addCriterion("good_price <", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("good_price <=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIn(List<BigDecimal> values) {
            addCriterion("good_price in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotIn(List<BigDecimal> values) {
            addCriterion("good_price not in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_price between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_price not between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodRealPriceIsNull() {
            addCriterion("good_real_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodRealPriceIsNotNull() {
            addCriterion("good_real_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodRealPriceEqualTo(BigDecimal value) {
            addCriterion("good_real_price =", value, "goodRealPrice");
            return (Criteria) this;
        }

        public Criteria andGoodRealPriceNotEqualTo(BigDecimal value) {
            addCriterion("good_real_price <>", value, "goodRealPrice");
            return (Criteria) this;
        }

        public Criteria andGoodRealPriceGreaterThan(BigDecimal value) {
            addCriterion("good_real_price >", value, "goodRealPrice");
            return (Criteria) this;
        }

        public Criteria andGoodRealPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("good_real_price >=", value, "goodRealPrice");
            return (Criteria) this;
        }

        public Criteria andGoodRealPriceLessThan(BigDecimal value) {
            addCriterion("good_real_price <", value, "goodRealPrice");
            return (Criteria) this;
        }

        public Criteria andGoodRealPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("good_real_price <=", value, "goodRealPrice");
            return (Criteria) this;
        }

        public Criteria andGoodRealPriceIn(List<BigDecimal> values) {
            addCriterion("good_real_price in", values, "goodRealPrice");
            return (Criteria) this;
        }

        public Criteria andGoodRealPriceNotIn(List<BigDecimal> values) {
            addCriterion("good_real_price not in", values, "goodRealPrice");
            return (Criteria) this;
        }

        public Criteria andGoodRealPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_real_price between", value1, value2, "goodRealPrice");
            return (Criteria) this;
        }

        public Criteria andGoodRealPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_real_price not between", value1, value2, "goodRealPrice");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andProofPicsIsNull() {
            addCriterion("proof_pics is null");
            return (Criteria) this;
        }

        public Criteria andProofPicsIsNotNull() {
            addCriterion("proof_pics is not null");
            return (Criteria) this;
        }

        public Criteria andProofPicsEqualTo(String value) {
            addCriterion("proof_pics =", value, "proofPics");
            return (Criteria) this;
        }

        public Criteria andProofPicsNotEqualTo(String value) {
            addCriterion("proof_pics <>", value, "proofPics");
            return (Criteria) this;
        }

        public Criteria andProofPicsGreaterThan(String value) {
            addCriterion("proof_pics >", value, "proofPics");
            return (Criteria) this;
        }

        public Criteria andProofPicsGreaterThanOrEqualTo(String value) {
            addCriterion("proof_pics >=", value, "proofPics");
            return (Criteria) this;
        }

        public Criteria andProofPicsLessThan(String value) {
            addCriterion("proof_pics <", value, "proofPics");
            return (Criteria) this;
        }

        public Criteria andProofPicsLessThanOrEqualTo(String value) {
            addCriterion("proof_pics <=", value, "proofPics");
            return (Criteria) this;
        }

        public Criteria andProofPicsLike(String value) {
            addCriterion("proof_pics like", value, "proofPics");
            return (Criteria) this;
        }

        public Criteria andProofPicsNotLike(String value) {
            addCriterion("proof_pics not like", value, "proofPics");
            return (Criteria) this;
        }

        public Criteria andProofPicsIn(List<String> values) {
            addCriterion("proof_pics in", values, "proofPics");
            return (Criteria) this;
        }

        public Criteria andProofPicsNotIn(List<String> values) {
            addCriterion("proof_pics not in", values, "proofPics");
            return (Criteria) this;
        }

        public Criteria andProofPicsBetween(String value1, String value2) {
            addCriterion("proof_pics between", value1, value2, "proofPics");
            return (Criteria) this;
        }

        public Criteria andProofPicsNotBetween(String value1, String value2) {
            addCriterion("proof_pics not between", value1, value2, "proofPics");
            return (Criteria) this;
        }

        public Criteria andHandleRemarkIsNull() {
            addCriterion("handle_remark is null");
            return (Criteria) this;
        }

        public Criteria andHandleRemarkIsNotNull() {
            addCriterion("handle_remark is not null");
            return (Criteria) this;
        }

        public Criteria andHandleRemarkEqualTo(String value) {
            addCriterion("handle_remark =", value, "handleRemark");
            return (Criteria) this;
        }

        public Criteria andHandleRemarkNotEqualTo(String value) {
            addCriterion("handle_remark <>", value, "handleRemark");
            return (Criteria) this;
        }

        public Criteria andHandleRemarkGreaterThan(String value) {
            addCriterion("handle_remark >", value, "handleRemark");
            return (Criteria) this;
        }

        public Criteria andHandleRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("handle_remark >=", value, "handleRemark");
            return (Criteria) this;
        }

        public Criteria andHandleRemarkLessThan(String value) {
            addCriterion("handle_remark <", value, "handleRemark");
            return (Criteria) this;
        }

        public Criteria andHandleRemarkLessThanOrEqualTo(String value) {
            addCriterion("handle_remark <=", value, "handleRemark");
            return (Criteria) this;
        }

        public Criteria andHandleRemarkLike(String value) {
            addCriterion("handle_remark like", value, "handleRemark");
            return (Criteria) this;
        }

        public Criteria andHandleRemarkNotLike(String value) {
            addCriterion("handle_remark not like", value, "handleRemark");
            return (Criteria) this;
        }

        public Criteria andHandleRemarkIn(List<String> values) {
            addCriterion("handle_remark in", values, "handleRemark");
            return (Criteria) this;
        }

        public Criteria andHandleRemarkNotIn(List<String> values) {
            addCriterion("handle_remark not in", values, "handleRemark");
            return (Criteria) this;
        }

        public Criteria andHandleRemarkBetween(String value1, String value2) {
            addCriterion("handle_remark between", value1, value2, "handleRemark");
            return (Criteria) this;
        }

        public Criteria andHandleRemarkNotBetween(String value1, String value2) {
            addCriterion("handle_remark not between", value1, value2, "handleRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveManIsNull() {
            addCriterion("receive_man is null");
            return (Criteria) this;
        }

        public Criteria andReceiveManIsNotNull() {
            addCriterion("receive_man is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveManEqualTo(String value) {
            addCriterion("receive_man =", value, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManNotEqualTo(String value) {
            addCriterion("receive_man <>", value, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManGreaterThan(String value) {
            addCriterion("receive_man >", value, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManGreaterThanOrEqualTo(String value) {
            addCriterion("receive_man >=", value, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManLessThan(String value) {
            addCriterion("receive_man <", value, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManLessThanOrEqualTo(String value) {
            addCriterion("receive_man <=", value, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManLike(String value) {
            addCriterion("receive_man like", value, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManNotLike(String value) {
            addCriterion("receive_man not like", value, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManIn(List<String> values) {
            addCriterion("receive_man in", values, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManNotIn(List<String> values) {
            addCriterion("receive_man not in", values, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManBetween(String value1, String value2) {
            addCriterion("receive_man between", value1, value2, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveManNotBetween(String value1, String value2) {
            addCriterion("receive_man not between", value1, value2, "receiveMan");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("receive_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Date value) {
            addCriterion("receive_time =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Date value) {
            addCriterion("receive_time <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Date value) {
            addCriterion("receive_time >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_time >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Date value) {
            addCriterion("receive_time <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("receive_time <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Date> values) {
            addCriterion("receive_time in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Date> values) {
            addCriterion("receive_time not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("receive_time between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("receive_time not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkIsNull() {
            addCriterion("receive_remark is null");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkIsNotNull() {
            addCriterion("receive_remark is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkEqualTo(String value) {
            addCriterion("receive_remark =", value, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkNotEqualTo(String value) {
            addCriterion("receive_remark <>", value, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkGreaterThan(String value) {
            addCriterion("receive_remark >", value, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("receive_remark >=", value, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkLessThan(String value) {
            addCriterion("receive_remark <", value, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkLessThanOrEqualTo(String value) {
            addCriterion("receive_remark <=", value, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkLike(String value) {
            addCriterion("receive_remark like", value, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkNotLike(String value) {
            addCriterion("receive_remark not like", value, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkIn(List<String> values) {
            addCriterion("receive_remark in", values, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkNotIn(List<String> values) {
            addCriterion("receive_remark not in", values, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkBetween(String value1, String value2) {
            addCriterion("receive_remark between", value1, value2, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkNotBetween(String value1, String value2) {
            addCriterion("receive_remark not between", value1, value2, "receiveRemark");
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