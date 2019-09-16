package com.ligq.study.spring.demo.mybatis;

public class Product {
    private Long id;
    private String productName;
    private String productNamePinYin;
    private String productType;
    private Integer salePrice;
    private Integer purchasePrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductNamePinYin() {
        return productNamePinYin;
    }

    public void setProductNamePinYin(String productNamePinYin) {
        this.productNamePinYin = productNamePinYin;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Integer salePrice) {
        this.salePrice = salePrice;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
