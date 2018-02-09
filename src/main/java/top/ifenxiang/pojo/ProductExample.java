package top.ifenxiang.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTaobaoPidIsNull() {
            addCriterion("taobao_pid is null");
            return (Criteria) this;
        }

        public Criteria andTaobaoPidIsNotNull() {
            addCriterion("taobao_pid is not null");
            return (Criteria) this;
        }

        public Criteria andTaobaoPidEqualTo(String value) {
            addCriterion("taobao_pid =", value, "taobaoPid");
            return (Criteria) this;
        }

        public Criteria andTaobaoPidNotEqualTo(String value) {
            addCriterion("taobao_pid <>", value, "taobaoPid");
            return (Criteria) this;
        }

        public Criteria andTaobaoPidGreaterThan(String value) {
            addCriterion("taobao_pid >", value, "taobaoPid");
            return (Criteria) this;
        }

        public Criteria andTaobaoPidGreaterThanOrEqualTo(String value) {
            addCriterion("taobao_pid >=", value, "taobaoPid");
            return (Criteria) this;
        }

        public Criteria andTaobaoPidLessThan(String value) {
            addCriterion("taobao_pid <", value, "taobaoPid");
            return (Criteria) this;
        }

        public Criteria andTaobaoPidLessThanOrEqualTo(String value) {
            addCriterion("taobao_pid <=", value, "taobaoPid");
            return (Criteria) this;
        }

        public Criteria andTaobaoPidLike(String value) {
            addCriterion("taobao_pid like", value, "taobaoPid");
            return (Criteria) this;
        }

        public Criteria andTaobaoPidNotLike(String value) {
            addCriterion("taobao_pid not like", value, "taobaoPid");
            return (Criteria) this;
        }

        public Criteria andTaobaoPidIn(List<String> values) {
            addCriterion("taobao_pid in", values, "taobaoPid");
            return (Criteria) this;
        }

        public Criteria andTaobaoPidNotIn(List<String> values) {
            addCriterion("taobao_pid not in", values, "taobaoPid");
            return (Criteria) this;
        }

        public Criteria andTaobaoPidBetween(String value1, String value2) {
            addCriterion("taobao_pid between", value1, value2, "taobaoPid");
            return (Criteria) this;
        }

        public Criteria andTaobaoPidNotBetween(String value1, String value2) {
            addCriterion("taobao_pid not between", value1, value2, "taobaoPid");
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

        public Criteria andProductIndexImageIsNull() {
            addCriterion("product_index_image is null");
            return (Criteria) this;
        }

        public Criteria andProductIndexImageIsNotNull() {
            addCriterion("product_index_image is not null");
            return (Criteria) this;
        }

        public Criteria andProductIndexImageEqualTo(String value) {
            addCriterion("product_index_image =", value, "productIndexImage");
            return (Criteria) this;
        }

        public Criteria andProductIndexImageNotEqualTo(String value) {
            addCriterion("product_index_image <>", value, "productIndexImage");
            return (Criteria) this;
        }

        public Criteria andProductIndexImageGreaterThan(String value) {
            addCriterion("product_index_image >", value, "productIndexImage");
            return (Criteria) this;
        }

        public Criteria andProductIndexImageGreaterThanOrEqualTo(String value) {
            addCriterion("product_index_image >=", value, "productIndexImage");
            return (Criteria) this;
        }

        public Criteria andProductIndexImageLessThan(String value) {
            addCriterion("product_index_image <", value, "productIndexImage");
            return (Criteria) this;
        }

        public Criteria andProductIndexImageLessThanOrEqualTo(String value) {
            addCriterion("product_index_image <=", value, "productIndexImage");
            return (Criteria) this;
        }

        public Criteria andProductIndexImageLike(String value) {
            addCriterion("product_index_image like", value, "productIndexImage");
            return (Criteria) this;
        }

        public Criteria andProductIndexImageNotLike(String value) {
            addCriterion("product_index_image not like", value, "productIndexImage");
            return (Criteria) this;
        }

        public Criteria andProductIndexImageIn(List<String> values) {
            addCriterion("product_index_image in", values, "productIndexImage");
            return (Criteria) this;
        }

        public Criteria andProductIndexImageNotIn(List<String> values) {
            addCriterion("product_index_image not in", values, "productIndexImage");
            return (Criteria) this;
        }

        public Criteria andProductIndexImageBetween(String value1, String value2) {
            addCriterion("product_index_image between", value1, value2, "productIndexImage");
            return (Criteria) this;
        }

        public Criteria andProductIndexImageNotBetween(String value1, String value2) {
            addCriterion("product_index_image not between", value1, value2, "productIndexImage");
            return (Criteria) this;
        }

        public Criteria andShopPriceIsNull() {
            addCriterion("shop_price is null");
            return (Criteria) this;
        }

        public Criteria andShopPriceIsNotNull() {
            addCriterion("shop_price is not null");
            return (Criteria) this;
        }

        public Criteria andShopPriceEqualTo(Double value) {
            addCriterion("shop_price =", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotEqualTo(Double value) {
            addCriterion("shop_price <>", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThan(Double value) {
            addCriterion("shop_price >", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("shop_price >=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThan(Double value) {
            addCriterion("shop_price <", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThanOrEqualTo(Double value) {
            addCriterion("shop_price <=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceIn(List<Double> values) {
            addCriterion("shop_price in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotIn(List<Double> values) {
            addCriterion("shop_price not in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceBetween(Double value1, Double value2) {
            addCriterion("shop_price between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotBetween(Double value1, Double value2) {
            addCriterion("shop_price not between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andSalesMonthIsNull() {
            addCriterion("sales_month is null");
            return (Criteria) this;
        }

        public Criteria andSalesMonthIsNotNull() {
            addCriterion("sales_month is not null");
            return (Criteria) this;
        }

        public Criteria andSalesMonthEqualTo(Integer value) {
            addCriterion("sales_month =", value, "salesMonth");
            return (Criteria) this;
        }

        public Criteria andSalesMonthNotEqualTo(Integer value) {
            addCriterion("sales_month <>", value, "salesMonth");
            return (Criteria) this;
        }

        public Criteria andSalesMonthGreaterThan(Integer value) {
            addCriterion("sales_month >", value, "salesMonth");
            return (Criteria) this;
        }

        public Criteria andSalesMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_month >=", value, "salesMonth");
            return (Criteria) this;
        }

        public Criteria andSalesMonthLessThan(Integer value) {
            addCriterion("sales_month <", value, "salesMonth");
            return (Criteria) this;
        }

        public Criteria andSalesMonthLessThanOrEqualTo(Integer value) {
            addCriterion("sales_month <=", value, "salesMonth");
            return (Criteria) this;
        }

        public Criteria andSalesMonthIn(List<Integer> values) {
            addCriterion("sales_month in", values, "salesMonth");
            return (Criteria) this;
        }

        public Criteria andSalesMonthNotIn(List<Integer> values) {
            addCriterion("sales_month not in", values, "salesMonth");
            return (Criteria) this;
        }

        public Criteria andSalesMonthBetween(Integer value1, Integer value2) {
            addCriterion("sales_month between", value1, value2, "salesMonth");
            return (Criteria) this;
        }

        public Criteria andSalesMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_month not between", value1, value2, "salesMonth");
            return (Criteria) this;
        }

        public Criteria andTkUrl1IsNull() {
            addCriterion("tk_url1 is null");
            return (Criteria) this;
        }

        public Criteria andTkUrl1IsNotNull() {
            addCriterion("tk_url1 is not null");
            return (Criteria) this;
        }

        public Criteria andTkUrl1EqualTo(String value) {
            addCriterion("tk_url1 =", value, "tkUrl1");
            return (Criteria) this;
        }

        public Criteria andTkUrl1NotEqualTo(String value) {
            addCriterion("tk_url1 <>", value, "tkUrl1");
            return (Criteria) this;
        }

        public Criteria andTkUrl1GreaterThan(String value) {
            addCriterion("tk_url1 >", value, "tkUrl1");
            return (Criteria) this;
        }

        public Criteria andTkUrl1GreaterThanOrEqualTo(String value) {
            addCriterion("tk_url1 >=", value, "tkUrl1");
            return (Criteria) this;
        }

        public Criteria andTkUrl1LessThan(String value) {
            addCriterion("tk_url1 <", value, "tkUrl1");
            return (Criteria) this;
        }

        public Criteria andTkUrl1LessThanOrEqualTo(String value) {
            addCriterion("tk_url1 <=", value, "tkUrl1");
            return (Criteria) this;
        }

        public Criteria andTkUrl1Like(String value) {
            addCriterion("tk_url1 like", value, "tkUrl1");
            return (Criteria) this;
        }

        public Criteria andTkUrl1NotLike(String value) {
            addCriterion("tk_url1 not like", value, "tkUrl1");
            return (Criteria) this;
        }

        public Criteria andTkUrl1In(List<String> values) {
            addCriterion("tk_url1 in", values, "tkUrl1");
            return (Criteria) this;
        }

        public Criteria andTkUrl1NotIn(List<String> values) {
            addCriterion("tk_url1 not in", values, "tkUrl1");
            return (Criteria) this;
        }

        public Criteria andTkUrl1Between(String value1, String value2) {
            addCriterion("tk_url1 between", value1, value2, "tkUrl1");
            return (Criteria) this;
        }

        public Criteria andTkUrl1NotBetween(String value1, String value2) {
            addCriterion("tk_url1 not between", value1, value2, "tkUrl1");
            return (Criteria) this;
        }

        public Criteria andTkUrl2IsNull() {
            addCriterion("tk_url2 is null");
            return (Criteria) this;
        }

        public Criteria andTkUrl2IsNotNull() {
            addCriterion("tk_url2 is not null");
            return (Criteria) this;
        }

        public Criteria andTkUrl2EqualTo(String value) {
            addCriterion("tk_url2 =", value, "tkUrl2");
            return (Criteria) this;
        }

        public Criteria andTkUrl2NotEqualTo(String value) {
            addCriterion("tk_url2 <>", value, "tkUrl2");
            return (Criteria) this;
        }

        public Criteria andTkUrl2GreaterThan(String value) {
            addCriterion("tk_url2 >", value, "tkUrl2");
            return (Criteria) this;
        }

        public Criteria andTkUrl2GreaterThanOrEqualTo(String value) {
            addCriterion("tk_url2 >=", value, "tkUrl2");
            return (Criteria) this;
        }

        public Criteria andTkUrl2LessThan(String value) {
            addCriterion("tk_url2 <", value, "tkUrl2");
            return (Criteria) this;
        }

        public Criteria andTkUrl2LessThanOrEqualTo(String value) {
            addCriterion("tk_url2 <=", value, "tkUrl2");
            return (Criteria) this;
        }

        public Criteria andTkUrl2Like(String value) {
            addCriterion("tk_url2 like", value, "tkUrl2");
            return (Criteria) this;
        }

        public Criteria andTkUrl2NotLike(String value) {
            addCriterion("tk_url2 not like", value, "tkUrl2");
            return (Criteria) this;
        }

        public Criteria andTkUrl2In(List<String> values) {
            addCriterion("tk_url2 in", values, "tkUrl2");
            return (Criteria) this;
        }

        public Criteria andTkUrl2NotIn(List<String> values) {
            addCriterion("tk_url2 not in", values, "tkUrl2");
            return (Criteria) this;
        }

        public Criteria andTkUrl2Between(String value1, String value2) {
            addCriterion("tk_url2 between", value1, value2, "tkUrl2");
            return (Criteria) this;
        }

        public Criteria andTkUrl2NotBetween(String value1, String value2) {
            addCriterion("tk_url2 not between", value1, value2, "tkUrl2");
            return (Criteria) this;
        }

        public Criteria andTkTokenIsNull() {
            addCriterion("tk_token is null");
            return (Criteria) this;
        }

        public Criteria andTkTokenIsNotNull() {
            addCriterion("tk_token is not null");
            return (Criteria) this;
        }

        public Criteria andTkTokenEqualTo(String value) {
            addCriterion("tk_token =", value, "tkToken");
            return (Criteria) this;
        }

        public Criteria andTkTokenNotEqualTo(String value) {
            addCriterion("tk_token <>", value, "tkToken");
            return (Criteria) this;
        }

        public Criteria andTkTokenGreaterThan(String value) {
            addCriterion("tk_token >", value, "tkToken");
            return (Criteria) this;
        }

        public Criteria andTkTokenGreaterThanOrEqualTo(String value) {
            addCriterion("tk_token >=", value, "tkToken");
            return (Criteria) this;
        }

        public Criteria andTkTokenLessThan(String value) {
            addCriterion("tk_token <", value, "tkToken");
            return (Criteria) this;
        }

        public Criteria andTkTokenLessThanOrEqualTo(String value) {
            addCriterion("tk_token <=", value, "tkToken");
            return (Criteria) this;
        }

        public Criteria andTkTokenLike(String value) {
            addCriterion("tk_token like", value, "tkToken");
            return (Criteria) this;
        }

        public Criteria andTkTokenNotLike(String value) {
            addCriterion("tk_token not like", value, "tkToken");
            return (Criteria) this;
        }

        public Criteria andTkTokenIn(List<String> values) {
            addCriterion("tk_token in", values, "tkToken");
            return (Criteria) this;
        }

        public Criteria andTkTokenNotIn(List<String> values) {
            addCriterion("tk_token not in", values, "tkToken");
            return (Criteria) this;
        }

        public Criteria andTkTokenBetween(String value1, String value2) {
            addCriterion("tk_token between", value1, value2, "tkToken");
            return (Criteria) this;
        }

        public Criteria andTkTokenNotBetween(String value1, String value2) {
            addCriterion("tk_token not between", value1, value2, "tkToken");
            return (Criteria) this;
        }

        public Criteria andDiscountTotalIsNull() {
            addCriterion("discount_total is null");
            return (Criteria) this;
        }

        public Criteria andDiscountTotalIsNotNull() {
            addCriterion("discount_total is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountTotalEqualTo(Integer value) {
            addCriterion("discount_total =", value, "discountTotal");
            return (Criteria) this;
        }

        public Criteria andDiscountTotalNotEqualTo(Integer value) {
            addCriterion("discount_total <>", value, "discountTotal");
            return (Criteria) this;
        }

        public Criteria andDiscountTotalGreaterThan(Integer value) {
            addCriterion("discount_total >", value, "discountTotal");
            return (Criteria) this;
        }

        public Criteria andDiscountTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount_total >=", value, "discountTotal");
            return (Criteria) this;
        }

        public Criteria andDiscountTotalLessThan(Integer value) {
            addCriterion("discount_total <", value, "discountTotal");
            return (Criteria) this;
        }

        public Criteria andDiscountTotalLessThanOrEqualTo(Integer value) {
            addCriterion("discount_total <=", value, "discountTotal");
            return (Criteria) this;
        }

        public Criteria andDiscountTotalIn(List<Integer> values) {
            addCriterion("discount_total in", values, "discountTotal");
            return (Criteria) this;
        }

        public Criteria andDiscountTotalNotIn(List<Integer> values) {
            addCriterion("discount_total not in", values, "discountTotal");
            return (Criteria) this;
        }

        public Criteria andDiscountTotalBetween(Integer value1, Integer value2) {
            addCriterion("discount_total between", value1, value2, "discountTotal");
            return (Criteria) this;
        }

        public Criteria andDiscountTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("discount_total not between", value1, value2, "discountTotal");
            return (Criteria) this;
        }

        public Criteria andDiscountResidueIsNull() {
            addCriterion("discount_residue is null");
            return (Criteria) this;
        }

        public Criteria andDiscountResidueIsNotNull() {
            addCriterion("discount_residue is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountResidueEqualTo(Integer value) {
            addCriterion("discount_residue =", value, "discountResidue");
            return (Criteria) this;
        }

        public Criteria andDiscountResidueNotEqualTo(Integer value) {
            addCriterion("discount_residue <>", value, "discountResidue");
            return (Criteria) this;
        }

        public Criteria andDiscountResidueGreaterThan(Integer value) {
            addCriterion("discount_residue >", value, "discountResidue");
            return (Criteria) this;
        }

        public Criteria andDiscountResidueGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount_residue >=", value, "discountResidue");
            return (Criteria) this;
        }

        public Criteria andDiscountResidueLessThan(Integer value) {
            addCriterion("discount_residue <", value, "discountResidue");
            return (Criteria) this;
        }

        public Criteria andDiscountResidueLessThanOrEqualTo(Integer value) {
            addCriterion("discount_residue <=", value, "discountResidue");
            return (Criteria) this;
        }

        public Criteria andDiscountResidueIn(List<Integer> values) {
            addCriterion("discount_residue in", values, "discountResidue");
            return (Criteria) this;
        }

        public Criteria andDiscountResidueNotIn(List<Integer> values) {
            addCriterion("discount_residue not in", values, "discountResidue");
            return (Criteria) this;
        }

        public Criteria andDiscountResidueBetween(Integer value1, Integer value2) {
            addCriterion("discount_residue between", value1, value2, "discountResidue");
            return (Criteria) this;
        }

        public Criteria andDiscountResidueNotBetween(Integer value1, Integer value2) {
            addCriterion("discount_residue not between", value1, value2, "discountResidue");
            return (Criteria) this;
        }

        public Criteria andDiscountDetailIsNull() {
            addCriterion("discount_detail is null");
            return (Criteria) this;
        }

        public Criteria andDiscountDetailIsNotNull() {
            addCriterion("discount_detail is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountDetailEqualTo(String value) {
            addCriterion("discount_detail =", value, "discountDetail");
            return (Criteria) this;
        }

        public Criteria andDiscountDetailNotEqualTo(String value) {
            addCriterion("discount_detail <>", value, "discountDetail");
            return (Criteria) this;
        }

        public Criteria andDiscountDetailGreaterThan(String value) {
            addCriterion("discount_detail >", value, "discountDetail");
            return (Criteria) this;
        }

        public Criteria andDiscountDetailGreaterThanOrEqualTo(String value) {
            addCriterion("discount_detail >=", value, "discountDetail");
            return (Criteria) this;
        }

        public Criteria andDiscountDetailLessThan(String value) {
            addCriterion("discount_detail <", value, "discountDetail");
            return (Criteria) this;
        }

        public Criteria andDiscountDetailLessThanOrEqualTo(String value) {
            addCriterion("discount_detail <=", value, "discountDetail");
            return (Criteria) this;
        }

        public Criteria andDiscountDetailLike(String value) {
            addCriterion("discount_detail like", value, "discountDetail");
            return (Criteria) this;
        }

        public Criteria andDiscountDetailNotLike(String value) {
            addCriterion("discount_detail not like", value, "discountDetail");
            return (Criteria) this;
        }

        public Criteria andDiscountDetailIn(List<String> values) {
            addCriterion("discount_detail in", values, "discountDetail");
            return (Criteria) this;
        }

        public Criteria andDiscountDetailNotIn(List<String> values) {
            addCriterion("discount_detail not in", values, "discountDetail");
            return (Criteria) this;
        }

        public Criteria andDiscountDetailBetween(String value1, String value2) {
            addCriterion("discount_detail between", value1, value2, "discountDetail");
            return (Criteria) this;
        }

        public Criteria andDiscountDetailNotBetween(String value1, String value2) {
            addCriterion("discount_detail not between", value1, value2, "discountDetail");
            return (Criteria) this;
        }

        public Criteria andDiscountStartIsNull() {
            addCriterion("discount_start is null");
            return (Criteria) this;
        }

        public Criteria andDiscountStartIsNotNull() {
            addCriterion("discount_start is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountStartEqualTo(Date value) {
            addCriterion("discount_start =", value, "discountStart");
            return (Criteria) this;
        }

        public Criteria andDiscountStartNotEqualTo(Date value) {
            addCriterion("discount_start <>", value, "discountStart");
            return (Criteria) this;
        }

        public Criteria andDiscountStartGreaterThan(Date value) {
            addCriterion("discount_start >", value, "discountStart");
            return (Criteria) this;
        }

        public Criteria andDiscountStartGreaterThanOrEqualTo(Date value) {
            addCriterion("discount_start >=", value, "discountStart");
            return (Criteria) this;
        }

        public Criteria andDiscountStartLessThan(Date value) {
            addCriterion("discount_start <", value, "discountStart");
            return (Criteria) this;
        }

        public Criteria andDiscountStartLessThanOrEqualTo(Date value) {
            addCriterion("discount_start <=", value, "discountStart");
            return (Criteria) this;
        }

        public Criteria andDiscountStartIn(List<Date> values) {
            addCriterion("discount_start in", values, "discountStart");
            return (Criteria) this;
        }

        public Criteria andDiscountStartNotIn(List<Date> values) {
            addCriterion("discount_start not in", values, "discountStart");
            return (Criteria) this;
        }

        public Criteria andDiscountStartBetween(Date value1, Date value2) {
            addCriterion("discount_start between", value1, value2, "discountStart");
            return (Criteria) this;
        }

        public Criteria andDiscountStartNotBetween(Date value1, Date value2) {
            addCriterion("discount_start not between", value1, value2, "discountStart");
            return (Criteria) this;
        }

        public Criteria andDiscountEndIsNull() {
            addCriterion("discount_end is null");
            return (Criteria) this;
        }

        public Criteria andDiscountEndIsNotNull() {
            addCriterion("discount_end is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEndEqualTo(Date value) {
            addCriterion("discount_end =", value, "discountEnd");
            return (Criteria) this;
        }

        public Criteria andDiscountEndNotEqualTo(Date value) {
            addCriterion("discount_end <>", value, "discountEnd");
            return (Criteria) this;
        }

        public Criteria andDiscountEndGreaterThan(Date value) {
            addCriterion("discount_end >", value, "discountEnd");
            return (Criteria) this;
        }

        public Criteria andDiscountEndGreaterThanOrEqualTo(Date value) {
            addCriterion("discount_end >=", value, "discountEnd");
            return (Criteria) this;
        }

        public Criteria andDiscountEndLessThan(Date value) {
            addCriterion("discount_end <", value, "discountEnd");
            return (Criteria) this;
        }

        public Criteria andDiscountEndLessThanOrEqualTo(Date value) {
            addCriterion("discount_end <=", value, "discountEnd");
            return (Criteria) this;
        }

        public Criteria andDiscountEndIn(List<Date> values) {
            addCriterion("discount_end in", values, "discountEnd");
            return (Criteria) this;
        }

        public Criteria andDiscountEndNotIn(List<Date> values) {
            addCriterion("discount_end not in", values, "discountEnd");
            return (Criteria) this;
        }

        public Criteria andDiscountEndBetween(Date value1, Date value2) {
            addCriterion("discount_end between", value1, value2, "discountEnd");
            return (Criteria) this;
        }

        public Criteria andDiscountEndNotBetween(Date value1, Date value2) {
            addCriterion("discount_end not between", value1, value2, "discountEnd");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl1IsNull() {
            addCriterion("discount_url1 is null");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl1IsNotNull() {
            addCriterion("discount_url1 is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl1EqualTo(String value) {
            addCriterion("discount_url1 =", value, "discountUrl1");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl1NotEqualTo(String value) {
            addCriterion("discount_url1 <>", value, "discountUrl1");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl1GreaterThan(String value) {
            addCriterion("discount_url1 >", value, "discountUrl1");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl1GreaterThanOrEqualTo(String value) {
            addCriterion("discount_url1 >=", value, "discountUrl1");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl1LessThan(String value) {
            addCriterion("discount_url1 <", value, "discountUrl1");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl1LessThanOrEqualTo(String value) {
            addCriterion("discount_url1 <=", value, "discountUrl1");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl1Like(String value) {
            addCriterion("discount_url1 like", value, "discountUrl1");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl1NotLike(String value) {
            addCriterion("discount_url1 not like", value, "discountUrl1");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl1In(List<String> values) {
            addCriterion("discount_url1 in", values, "discountUrl1");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl1NotIn(List<String> values) {
            addCriterion("discount_url1 not in", values, "discountUrl1");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl1Between(String value1, String value2) {
            addCriterion("discount_url1 between", value1, value2, "discountUrl1");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl1NotBetween(String value1, String value2) {
            addCriterion("discount_url1 not between", value1, value2, "discountUrl1");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl2IsNull() {
            addCriterion("discount_url2 is null");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl2IsNotNull() {
            addCriterion("discount_url2 is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl2EqualTo(String value) {
            addCriterion("discount_url2 =", value, "discountUrl2");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl2NotEqualTo(String value) {
            addCriterion("discount_url2 <>", value, "discountUrl2");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl2GreaterThan(String value) {
            addCriterion("discount_url2 >", value, "discountUrl2");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl2GreaterThanOrEqualTo(String value) {
            addCriterion("discount_url2 >=", value, "discountUrl2");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl2LessThan(String value) {
            addCriterion("discount_url2 <", value, "discountUrl2");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl2LessThanOrEqualTo(String value) {
            addCriterion("discount_url2 <=", value, "discountUrl2");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl2Like(String value) {
            addCriterion("discount_url2 like", value, "discountUrl2");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl2NotLike(String value) {
            addCriterion("discount_url2 not like", value, "discountUrl2");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl2In(List<String> values) {
            addCriterion("discount_url2 in", values, "discountUrl2");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl2NotIn(List<String> values) {
            addCriterion("discount_url2 not in", values, "discountUrl2");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl2Between(String value1, String value2) {
            addCriterion("discount_url2 between", value1, value2, "discountUrl2");
            return (Criteria) this;
        }

        public Criteria andDiscountUrl2NotBetween(String value1, String value2) {
            addCriterion("discount_url2 not between", value1, value2, "discountUrl2");
            return (Criteria) this;
        }

        public Criteria andDiscountTokenIsNull() {
            addCriterion("discount_token is null");
            return (Criteria) this;
        }

        public Criteria andDiscountTokenIsNotNull() {
            addCriterion("discount_token is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountTokenEqualTo(String value) {
            addCriterion("discount_token =", value, "discountToken");
            return (Criteria) this;
        }

        public Criteria andDiscountTokenNotEqualTo(String value) {
            addCriterion("discount_token <>", value, "discountToken");
            return (Criteria) this;
        }

        public Criteria andDiscountTokenGreaterThan(String value) {
            addCriterion("discount_token >", value, "discountToken");
            return (Criteria) this;
        }

        public Criteria andDiscountTokenGreaterThanOrEqualTo(String value) {
            addCriterion("discount_token >=", value, "discountToken");
            return (Criteria) this;
        }

        public Criteria andDiscountTokenLessThan(String value) {
            addCriterion("discount_token <", value, "discountToken");
            return (Criteria) this;
        }

        public Criteria andDiscountTokenLessThanOrEqualTo(String value) {
            addCriterion("discount_token <=", value, "discountToken");
            return (Criteria) this;
        }

        public Criteria andDiscountTokenLike(String value) {
            addCriterion("discount_token like", value, "discountToken");
            return (Criteria) this;
        }

        public Criteria andDiscountTokenNotLike(String value) {
            addCriterion("discount_token not like", value, "discountToken");
            return (Criteria) this;
        }

        public Criteria andDiscountTokenIn(List<String> values) {
            addCriterion("discount_token in", values, "discountToken");
            return (Criteria) this;
        }

        public Criteria andDiscountTokenNotIn(List<String> values) {
            addCriterion("discount_token not in", values, "discountToken");
            return (Criteria) this;
        }

        public Criteria andDiscountTokenBetween(String value1, String value2) {
            addCriterion("discount_token between", value1, value2, "discountToken");
            return (Criteria) this;
        }

        public Criteria andDiscountTokenNotBetween(String value1, String value2) {
            addCriterion("discount_token not between", value1, value2, "discountToken");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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