package top.ifenxiang.pojo;

import java.util.Date;

public class Product {
    private Long id;

    private String taobaoPid;

    private String productName;

    private String productIndexImage;

    private Double shopPrice;

    private Integer salesMonth;

    private String tkUrl1;

    private String tkUrl2;

    private String tkToken;

    private Integer discountTotal;

    private Integer discountResidue;

    private String discountDetail;

    private Date discountStart;

    private Date discountEnd;

    private String discountUrl1;

    private String discountUrl2;

    private String discountToken;

    private String type;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaobaoPid() {
        return taobaoPid;
    }

    public void setTaobaoPid(String taobaoPid) {
        this.taobaoPid = taobaoPid == null ? null : taobaoPid.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductIndexImage() {
        return productIndexImage;
    }

    public void setProductIndexImage(String productIndexImage) {
        this.productIndexImage = productIndexImage == null ? null : productIndexImage.trim();
    }

    public Double getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(Double shopPrice) {
        this.shopPrice = shopPrice;
    }

    public Integer getSalesMonth() {
        return salesMonth;
    }

    public void setSalesMonth(Integer salesMonth) {
        this.salesMonth = salesMonth;
    }

    public String getTkUrl1() {
        return tkUrl1;
    }

    public void setTkUrl1(String tkUrl1) {
        this.tkUrl1 = tkUrl1 == null ? null : tkUrl1.trim();
    }

    public String getTkUrl2() {
        return tkUrl2;
    }

    public void setTkUrl2(String tkUrl2) {
        this.tkUrl2 = tkUrl2 == null ? null : tkUrl2.trim();
    }

    public String getTkToken() {
        return tkToken;
    }

    public void setTkToken(String tkToken) {
        this.tkToken = tkToken == null ? null : tkToken.trim();
    }

    public Integer getDiscountTotal() {
        return discountTotal;
    }

    public void setDiscountTotal(Integer discountTotal) {
        this.discountTotal = discountTotal;
    }

    public Integer getDiscountResidue() {
        return discountResidue;
    }

    public void setDiscountResidue(Integer discountResidue) {
        this.discountResidue = discountResidue;
    }

    public String getDiscountDetail() {
        return discountDetail;
    }

    public void setDiscountDetail(String discountDetail) {
        this.discountDetail = discountDetail == null ? null : discountDetail.trim();
    }

    public Date getDiscountStart() {
        return discountStart;
    }

    public void setDiscountStart(Date discountStart) {
        this.discountStart = discountStart;
    }

    public Date getDiscountEnd() {
        return discountEnd;
    }

    public void setDiscountEnd(Date discountEnd) {
        this.discountEnd = discountEnd;
    }

    public String getDiscountUrl1() {
        return discountUrl1;
    }

    public void setDiscountUrl1(String discountUrl1) {
        this.discountUrl1 = discountUrl1 == null ? null : discountUrl1.trim();
    }

    public String getDiscountUrl2() {
        return discountUrl2;
    }

    public void setDiscountUrl2(String discountUrl2) {
        this.discountUrl2 = discountUrl2 == null ? null : discountUrl2.trim();
    }

    public String getDiscountToken() {
        return discountToken;
    }

    public void setDiscountToken(String discountToken) {
        this.discountToken = discountToken == null ? null : discountToken.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	public Product() {
	}

	public Product(Long id, String taobaoPid, String productName, String productIndexImage, Double shopPrice,
			Integer salesMonth, String tkUrl1, String tkUrl2, String tkToken, Integer discountTotal,
			Integer discountResidue, String discountDetail, Date discountStart, Date discountEnd, String discountUrl1,
			String discountUrl2, String discountToken, Date createTime, Date updateTime, String type) {
		super();
		this.id = id;
		this.taobaoPid = taobaoPid;
		this.productName = productName;
		this.productIndexImage = productIndexImage;
		this.shopPrice = shopPrice;
		this.salesMonth = salesMonth;
		this.tkUrl1 = tkUrl1;
		this.tkUrl2 = tkUrl2;
		this.tkToken = tkToken;
		this.discountTotal = discountTotal;
		this.discountResidue = discountResidue;
		this.discountDetail = discountDetail;
		this.discountStart = discountStart;
		this.discountEnd = discountEnd;
		this.discountUrl1 = discountUrl1;
		this.discountUrl2 = discountUrl2;
		this.discountToken = discountToken;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.type = type;
	}
    
}