package com.fastfood.school.service.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class FastShopModel {
    private Integer id;

    private String name;

    private String logo;

    private BigDecimal startprice;

    private BigDecimal deliverprice;

    private String waittime;

    private String telphone;

    private Integer startdate;

    private Integer enddate;

    private Integer business;

    private String remark;

    private String creator;

    private Integer creatorid;

    private Date creatordate;

    private List<FoodTypeModel> foodtypeList;
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public BigDecimal getStartprice() {
        return startprice;
    }

    public void setStartprice(BigDecimal startprice) {
        this.startprice = startprice;
    }

    public BigDecimal getDeliverprice() {
        return deliverprice;
    }

    public void setDeliverprice(BigDecimal deliverprice) {
        this.deliverprice = deliverprice;
    }

    public String getWaittime() {
        return waittime;
    }

    public void setWaittime(String waittime) {
        this.waittime = waittime == null ? null : waittime.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public Integer getStartdate() {
        return startdate;
    }

    public void setStartdate(Integer startdate) {
        this.startdate = startdate;
    }

    public Integer getEnddate() {
        return enddate;
    }

    public void setEnddate(Integer enddate) {
        this.enddate = enddate;
    }

    public Integer getBusiness() {
        return business;
    }

    public void setBusiness(Integer business) {
        this.business = business;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Integer getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(Integer creatorid) {
        this.creatorid = creatorid;
    }

    public Date getCreatordate() {
        return creatordate;
    }

    public void setCreatordate(Date creatordate) {
        this.creatordate = creatordate;
    }

	public List<FoodTypeModel> getFoodtypeList() {
		return foodtypeList;
	}

	public void setFoodtypeList(List<FoodTypeModel> foodtypeList) {
		this.foodtypeList = foodtypeList;
	}
}