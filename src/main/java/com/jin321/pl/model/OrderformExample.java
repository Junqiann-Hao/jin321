package com.jin321.pl.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderformExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Long value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Long value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Long value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Long value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Long value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Long value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Long> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Long> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Long value1, Long value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Long value1, Long value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUaidIsNull() {
            addCriterion("uaid is null");
            return (Criteria) this;
        }

        public Criteria andUaidIsNotNull() {
            addCriterion("uaid is not null");
            return (Criteria) this;
        }

        public Criteria andUaidEqualTo(Integer value) {
            addCriterion("uaid =", value, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidNotEqualTo(Integer value) {
            addCriterion("uaid <>", value, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidGreaterThan(Integer value) {
            addCriterion("uaid >", value, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uaid >=", value, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidLessThan(Integer value) {
            addCriterion("uaid <", value, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidLessThanOrEqualTo(Integer value) {
            addCriterion("uaid <=", value, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidIn(List<Integer> values) {
            addCriterion("uaid in", values, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidNotIn(List<Integer> values) {
            addCriterion("uaid not in", values, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidBetween(Integer value1, Integer value2) {
            addCriterion("uaid between", value1, value2, "uaid");
            return (Criteria) this;
        }

        public Criteria andUaidNotBetween(Integer value1, Integer value2) {
            addCriterion("uaid not between", value1, value2, "uaid");
            return (Criteria) this;
        }

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDbfidIsNull() {
            addCriterion("dbfid is null");
            return (Criteria) this;
        }

        public Criteria andDbfidIsNotNull() {
            addCriterion("dbfid is not null");
            return (Criteria) this;
        }

        public Criteria andDbfidEqualTo(Long value) {
            addCriterion("dbfid =", value, "dbfid");
            return (Criteria) this;
        }

        public Criteria andDbfidNotEqualTo(Long value) {
            addCriterion("dbfid <>", value, "dbfid");
            return (Criteria) this;
        }

        public Criteria andDbfidGreaterThan(Long value) {
            addCriterion("dbfid >", value, "dbfid");
            return (Criteria) this;
        }

        public Criteria andDbfidGreaterThanOrEqualTo(Long value) {
            addCriterion("dbfid >=", value, "dbfid");
            return (Criteria) this;
        }

        public Criteria andDbfidLessThan(Long value) {
            addCriterion("dbfid <", value, "dbfid");
            return (Criteria) this;
        }

        public Criteria andDbfidLessThanOrEqualTo(Long value) {
            addCriterion("dbfid <=", value, "dbfid");
            return (Criteria) this;
        }

        public Criteria andDbfidIn(List<Long> values) {
            addCriterion("dbfid in", values, "dbfid");
            return (Criteria) this;
        }

        public Criteria andDbfidNotIn(List<Long> values) {
            addCriterion("dbfid not in", values, "dbfid");
            return (Criteria) this;
        }

        public Criteria andDbfidBetween(Long value1, Long value2) {
            addCriterion("dbfid between", value1, value2, "dbfid");
            return (Criteria) this;
        }

        public Criteria andDbfidNotBetween(Long value1, Long value2) {
            addCriterion("dbfid not between", value1, value2, "dbfid");
            return (Criteria) this;
        }

        public Criteria andOdateIsNull() {
            addCriterion("odate is null");
            return (Criteria) this;
        }

        public Criteria andOdateIsNotNull() {
            addCriterion("odate is not null");
            return (Criteria) this;
        }

        public Criteria andOdateEqualTo(Date value) {
            addCriterion("odate =", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotEqualTo(Date value) {
            addCriterion("odate <>", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateGreaterThan(Date value) {
            addCriterion("odate >", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateGreaterThanOrEqualTo(Date value) {
            addCriterion("odate >=", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateLessThan(Date value) {
            addCriterion("odate <", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateLessThanOrEqualTo(Date value) {
            addCriterion("odate <=", value, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateIn(List<Date> values) {
            addCriterion("odate in", values, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotIn(List<Date> values) {
            addCriterion("odate not in", values, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateBetween(Date value1, Date value2) {
            addCriterion("odate between", value1, value2, "odate");
            return (Criteria) this;
        }

        public Criteria andOdateNotBetween(Date value1, Date value2) {
            addCriterion("odate not between", value1, value2, "odate");
            return (Criteria) this;
        }

        public Criteria andOpaydateIsNull() {
            addCriterion("opaydate is null");
            return (Criteria) this;
        }

        public Criteria andOpaydateIsNotNull() {
            addCriterion("opaydate is not null");
            return (Criteria) this;
        }

        public Criteria andOpaydateEqualTo(Date value) {
            addCriterion("opaydate =", value, "opaydate");
            return (Criteria) this;
        }

        public Criteria andOpaydateNotEqualTo(Date value) {
            addCriterion("opaydate <>", value, "opaydate");
            return (Criteria) this;
        }

        public Criteria andOpaydateGreaterThan(Date value) {
            addCriterion("opaydate >", value, "opaydate");
            return (Criteria) this;
        }

        public Criteria andOpaydateGreaterThanOrEqualTo(Date value) {
            addCriterion("opaydate >=", value, "opaydate");
            return (Criteria) this;
        }

        public Criteria andOpaydateLessThan(Date value) {
            addCriterion("opaydate <", value, "opaydate");
            return (Criteria) this;
        }

        public Criteria andOpaydateLessThanOrEqualTo(Date value) {
            addCriterion("opaydate <=", value, "opaydate");
            return (Criteria) this;
        }

        public Criteria andOpaydateIn(List<Date> values) {
            addCriterion("opaydate in", values, "opaydate");
            return (Criteria) this;
        }

        public Criteria andOpaydateNotIn(List<Date> values) {
            addCriterion("opaydate not in", values, "opaydate");
            return (Criteria) this;
        }

        public Criteria andOpaydateBetween(Date value1, Date value2) {
            addCriterion("opaydate between", value1, value2, "opaydate");
            return (Criteria) this;
        }

        public Criteria andOpaydateNotBetween(Date value1, Date value2) {
            addCriterion("opaydate not between", value1, value2, "opaydate");
            return (Criteria) this;
        }

        public Criteria andOsenddateIsNull() {
            addCriterion("osenddate is null");
            return (Criteria) this;
        }

        public Criteria andOsenddateIsNotNull() {
            addCriterion("osenddate is not null");
            return (Criteria) this;
        }

        public Criteria andOsenddateEqualTo(Date value) {
            addCriterion("osenddate =", value, "osenddate");
            return (Criteria) this;
        }

        public Criteria andOsenddateNotEqualTo(Date value) {
            addCriterion("osenddate <>", value, "osenddate");
            return (Criteria) this;
        }

        public Criteria andOsenddateGreaterThan(Date value) {
            addCriterion("osenddate >", value, "osenddate");
            return (Criteria) this;
        }

        public Criteria andOsenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("osenddate >=", value, "osenddate");
            return (Criteria) this;
        }

        public Criteria andOsenddateLessThan(Date value) {
            addCriterion("osenddate <", value, "osenddate");
            return (Criteria) this;
        }

        public Criteria andOsenddateLessThanOrEqualTo(Date value) {
            addCriterion("osenddate <=", value, "osenddate");
            return (Criteria) this;
        }

        public Criteria andOsenddateIn(List<Date> values) {
            addCriterion("osenddate in", values, "osenddate");
            return (Criteria) this;
        }

        public Criteria andOsenddateNotIn(List<Date> values) {
            addCriterion("osenddate not in", values, "osenddate");
            return (Criteria) this;
        }

        public Criteria andOsenddateBetween(Date value1, Date value2) {
            addCriterion("osenddate between", value1, value2, "osenddate");
            return (Criteria) this;
        }

        public Criteria andOsenddateNotBetween(Date value1, Date value2) {
            addCriterion("osenddate not between", value1, value2, "osenddate");
            return (Criteria) this;
        }

        public Criteria andOconfirmdateIsNull() {
            addCriterion("oconfirmdate is null");
            return (Criteria) this;
        }

        public Criteria andOconfirmdateIsNotNull() {
            addCriterion("oconfirmdate is not null");
            return (Criteria) this;
        }

        public Criteria andOconfirmdateEqualTo(Date value) {
            addCriterion("oconfirmdate =", value, "oconfirmdate");
            return (Criteria) this;
        }

        public Criteria andOconfirmdateNotEqualTo(Date value) {
            addCriterion("oconfirmdate <>", value, "oconfirmdate");
            return (Criteria) this;
        }

        public Criteria andOconfirmdateGreaterThan(Date value) {
            addCriterion("oconfirmdate >", value, "oconfirmdate");
            return (Criteria) this;
        }

        public Criteria andOconfirmdateGreaterThanOrEqualTo(Date value) {
            addCriterion("oconfirmdate >=", value, "oconfirmdate");
            return (Criteria) this;
        }

        public Criteria andOconfirmdateLessThan(Date value) {
            addCriterion("oconfirmdate <", value, "oconfirmdate");
            return (Criteria) this;
        }

        public Criteria andOconfirmdateLessThanOrEqualTo(Date value) {
            addCriterion("oconfirmdate <=", value, "oconfirmdate");
            return (Criteria) this;
        }

        public Criteria andOconfirmdateIn(List<Date> values) {
            addCriterion("oconfirmdate in", values, "oconfirmdate");
            return (Criteria) this;
        }

        public Criteria andOconfirmdateNotIn(List<Date> values) {
            addCriterion("oconfirmdate not in", values, "oconfirmdate");
            return (Criteria) this;
        }

        public Criteria andOconfirmdateBetween(Date value1, Date value2) {
            addCriterion("oconfirmdate between", value1, value2, "oconfirmdate");
            return (Criteria) this;
        }

        public Criteria andOconfirmdateNotBetween(Date value1, Date value2) {
            addCriterion("oconfirmdate not between", value1, value2, "oconfirmdate");
            return (Criteria) this;
        }

        public Criteria andOtotalmoneyIsNull() {
            addCriterion("ototalmoney is null");
            return (Criteria) this;
        }

        public Criteria andOtotalmoneyIsNotNull() {
            addCriterion("ototalmoney is not null");
            return (Criteria) this;
        }

        public Criteria andOtotalmoneyEqualTo(BigDecimal value) {
            addCriterion("ototalmoney =", value, "ototalmoney");
            return (Criteria) this;
        }

        public Criteria andOtotalmoneyNotEqualTo(BigDecimal value) {
            addCriterion("ototalmoney <>", value, "ototalmoney");
            return (Criteria) this;
        }

        public Criteria andOtotalmoneyGreaterThan(BigDecimal value) {
            addCriterion("ototalmoney >", value, "ototalmoney");
            return (Criteria) this;
        }

        public Criteria andOtotalmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ototalmoney >=", value, "ototalmoney");
            return (Criteria) this;
        }

        public Criteria andOtotalmoneyLessThan(BigDecimal value) {
            addCriterion("ototalmoney <", value, "ototalmoney");
            return (Criteria) this;
        }

        public Criteria andOtotalmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ototalmoney <=", value, "ototalmoney");
            return (Criteria) this;
        }

        public Criteria andOtotalmoneyIn(List<BigDecimal> values) {
            addCriterion("ototalmoney in", values, "ototalmoney");
            return (Criteria) this;
        }

        public Criteria andOtotalmoneyNotIn(List<BigDecimal> values) {
            addCriterion("ototalmoney not in", values, "ototalmoney");
            return (Criteria) this;
        }

        public Criteria andOtotalmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ototalmoney between", value1, value2, "ototalmoney");
            return (Criteria) this;
        }

        public Criteria andOtotalmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ototalmoney not between", value1, value2, "ototalmoney");
            return (Criteria) this;
        }

        public Criteria andOrepaytimeIsNull() {
            addCriterion("orepaytime is null");
            return (Criteria) this;
        }

        public Criteria andOrepaytimeIsNotNull() {
            addCriterion("orepaytime is not null");
            return (Criteria) this;
        }

        public Criteria andOrepaytimeEqualTo(Date value) {
            addCriterion("orepaytime =", value, "orepaytime");
            return (Criteria) this;
        }

        public Criteria andOrepaytimeNotEqualTo(Date value) {
            addCriterion("orepaytime <>", value, "orepaytime");
            return (Criteria) this;
        }

        public Criteria andOrepaytimeGreaterThan(Date value) {
            addCriterion("orepaytime >", value, "orepaytime");
            return (Criteria) this;
        }

        public Criteria andOrepaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orepaytime >=", value, "orepaytime");
            return (Criteria) this;
        }

        public Criteria andOrepaytimeLessThan(Date value) {
            addCriterion("orepaytime <", value, "orepaytime");
            return (Criteria) this;
        }

        public Criteria andOrepaytimeLessThanOrEqualTo(Date value) {
            addCriterion("orepaytime <=", value, "orepaytime");
            return (Criteria) this;
        }

        public Criteria andOrepaytimeIn(List<Date> values) {
            addCriterion("orepaytime in", values, "orepaytime");
            return (Criteria) this;
        }

        public Criteria andOrepaytimeNotIn(List<Date> values) {
            addCriterion("orepaytime not in", values, "orepaytime");
            return (Criteria) this;
        }

        public Criteria andOrepaytimeBetween(Date value1, Date value2) {
            addCriterion("orepaytime between", value1, value2, "orepaytime");
            return (Criteria) this;
        }

        public Criteria andOrepaytimeNotBetween(Date value1, Date value2) {
            addCriterion("orepaytime not between", value1, value2, "orepaytime");
            return (Criteria) this;
        }

        public Criteria andOpayedIsNull() {
            addCriterion("opayed is null");
            return (Criteria) this;
        }

        public Criteria andOpayedIsNotNull() {
            addCriterion("opayed is not null");
            return (Criteria) this;
        }

        public Criteria andOpayedEqualTo(Integer value) {
            addCriterion("opayed =", value, "opayed");
            return (Criteria) this;
        }

        public Criteria andOpayedNotEqualTo(Integer value) {
            addCriterion("opayed <>", value, "opayed");
            return (Criteria) this;
        }

        public Criteria andOpayedGreaterThan(Integer value) {
            addCriterion("opayed >", value, "opayed");
            return (Criteria) this;
        }

        public Criteria andOpayedGreaterThanOrEqualTo(Integer value) {
            addCriterion("opayed >=", value, "opayed");
            return (Criteria) this;
        }

        public Criteria andOpayedLessThan(Integer value) {
            addCriterion("opayed <", value, "opayed");
            return (Criteria) this;
        }

        public Criteria andOpayedLessThanOrEqualTo(Integer value) {
            addCriterion("opayed <=", value, "opayed");
            return (Criteria) this;
        }

        public Criteria andOpayedIn(List<Integer> values) {
            addCriterion("opayed in", values, "opayed");
            return (Criteria) this;
        }

        public Criteria andOpayedNotIn(List<Integer> values) {
            addCriterion("opayed not in", values, "opayed");
            return (Criteria) this;
        }

        public Criteria andOpayedBetween(Integer value1, Integer value2) {
            addCriterion("opayed between", value1, value2, "opayed");
            return (Criteria) this;
        }

        public Criteria andOpayedNotBetween(Integer value1, Integer value2) {
            addCriterion("opayed not between", value1, value2, "opayed");
            return (Criteria) this;
        }

        public Criteria andOstateIsNull() {
            addCriterion("ostate is null");
            return (Criteria) this;
        }

        public Criteria andOstateIsNotNull() {
            addCriterion("ostate is not null");
            return (Criteria) this;
        }

        public Criteria andOstateEqualTo(Integer value) {
            addCriterion("ostate =", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateNotEqualTo(Integer value) {
            addCriterion("ostate <>", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateGreaterThan(Integer value) {
            addCriterion("ostate >", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ostate >=", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateLessThan(Integer value) {
            addCriterion("ostate <", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateLessThanOrEqualTo(Integer value) {
            addCriterion("ostate <=", value, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateIn(List<Integer> values) {
            addCriterion("ostate in", values, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateNotIn(List<Integer> values) {
            addCriterion("ostate not in", values, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateBetween(Integer value1, Integer value2) {
            addCriterion("ostate between", value1, value2, "ostate");
            return (Criteria) this;
        }

        public Criteria andOstateNotBetween(Integer value1, Integer value2) {
            addCriterion("ostate not between", value1, value2, "ostate");
            return (Criteria) this;
        }

        public Criteria andOmessageIsNull() {
            addCriterion("omessage is null");
            return (Criteria) this;
        }

        public Criteria andOmessageIsNotNull() {
            addCriterion("omessage is not null");
            return (Criteria) this;
        }

        public Criteria andOmessageEqualTo(String value) {
            addCriterion("omessage =", value, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageNotEqualTo(String value) {
            addCriterion("omessage <>", value, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageGreaterThan(String value) {
            addCriterion("omessage >", value, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageGreaterThanOrEqualTo(String value) {
            addCriterion("omessage >=", value, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageLessThan(String value) {
            addCriterion("omessage <", value, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageLessThanOrEqualTo(String value) {
            addCriterion("omessage <=", value, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageLike(String value) {
            addCriterion("omessage like", value, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageNotLike(String value) {
            addCriterion("omessage not like", value, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageIn(List<String> values) {
            addCriterion("omessage in", values, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageNotIn(List<String> values) {
            addCriterion("omessage not in", values, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageBetween(String value1, String value2) {
            addCriterion("omessage between", value1, value2, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageNotBetween(String value1, String value2) {
            addCriterion("omessage not between", value1, value2, "omessage");
            return (Criteria) this;
        }

        public Criteria andOsendmethodIsNull() {
            addCriterion("osendmethod is null");
            return (Criteria) this;
        }

        public Criteria andOsendmethodIsNotNull() {
            addCriterion("osendmethod is not null");
            return (Criteria) this;
        }

        public Criteria andOsendmethodEqualTo(String value) {
            addCriterion("osendmethod =", value, "osendmethod");
            return (Criteria) this;
        }

        public Criteria andOsendmethodNotEqualTo(String value) {
            addCriterion("osendmethod <>", value, "osendmethod");
            return (Criteria) this;
        }

        public Criteria andOsendmethodGreaterThan(String value) {
            addCriterion("osendmethod >", value, "osendmethod");
            return (Criteria) this;
        }

        public Criteria andOsendmethodGreaterThanOrEqualTo(String value) {
            addCriterion("osendmethod >=", value, "osendmethod");
            return (Criteria) this;
        }

        public Criteria andOsendmethodLessThan(String value) {
            addCriterion("osendmethod <", value, "osendmethod");
            return (Criteria) this;
        }

        public Criteria andOsendmethodLessThanOrEqualTo(String value) {
            addCriterion("osendmethod <=", value, "osendmethod");
            return (Criteria) this;
        }

        public Criteria andOsendmethodLike(String value) {
            addCriterion("osendmethod like", value, "osendmethod");
            return (Criteria) this;
        }

        public Criteria andOsendmethodNotLike(String value) {
            addCriterion("osendmethod not like", value, "osendmethod");
            return (Criteria) this;
        }

        public Criteria andOsendmethodIn(List<String> values) {
            addCriterion("osendmethod in", values, "osendmethod");
            return (Criteria) this;
        }

        public Criteria andOsendmethodNotIn(List<String> values) {
            addCriterion("osendmethod not in", values, "osendmethod");
            return (Criteria) this;
        }

        public Criteria andOsendmethodBetween(String value1, String value2) {
            addCriterion("osendmethod between", value1, value2, "osendmethod");
            return (Criteria) this;
        }

        public Criteria andOsendmethodNotBetween(String value1, String value2) {
            addCriterion("osendmethod not between", value1, value2, "osendmethod");
            return (Criteria) this;
        }

        public Criteria andOsendnumberIsNull() {
            addCriterion("osendnumber is null");
            return (Criteria) this;
        }

        public Criteria andOsendnumberIsNotNull() {
            addCriterion("osendnumber is not null");
            return (Criteria) this;
        }

        public Criteria andOsendnumberEqualTo(String value) {
            addCriterion("osendnumber =", value, "osendnumber");
            return (Criteria) this;
        }

        public Criteria andOsendnumberNotEqualTo(String value) {
            addCriterion("osendnumber <>", value, "osendnumber");
            return (Criteria) this;
        }

        public Criteria andOsendnumberGreaterThan(String value) {
            addCriterion("osendnumber >", value, "osendnumber");
            return (Criteria) this;
        }

        public Criteria andOsendnumberGreaterThanOrEqualTo(String value) {
            addCriterion("osendnumber >=", value, "osendnumber");
            return (Criteria) this;
        }

        public Criteria andOsendnumberLessThan(String value) {
            addCriterion("osendnumber <", value, "osendnumber");
            return (Criteria) this;
        }

        public Criteria andOsendnumberLessThanOrEqualTo(String value) {
            addCriterion("osendnumber <=", value, "osendnumber");
            return (Criteria) this;
        }

        public Criteria andOsendnumberLike(String value) {
            addCriterion("osendnumber like", value, "osendnumber");
            return (Criteria) this;
        }

        public Criteria andOsendnumberNotLike(String value) {
            addCriterion("osendnumber not like", value, "osendnumber");
            return (Criteria) this;
        }

        public Criteria andOsendnumberIn(List<String> values) {
            addCriterion("osendnumber in", values, "osendnumber");
            return (Criteria) this;
        }

        public Criteria andOsendnumberNotIn(List<String> values) {
            addCriterion("osendnumber not in", values, "osendnumber");
            return (Criteria) this;
        }

        public Criteria andOsendnumberBetween(String value1, String value2) {
            addCriterion("osendnumber between", value1, value2, "osendnumber");
            return (Criteria) this;
        }

        public Criteria andOsendnumberNotBetween(String value1, String value2) {
            addCriterion("osendnumber not between", value1, value2, "osendnumber");
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