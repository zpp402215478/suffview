package com.fastfood.school.service.model;

import java.util.Date;
import java.util.List;

public class FoodTypeModel {
    private Integer id;

    private Integer shopid;

    private String name;

    private String remark;

    private String creator;

    private Integer creatorid;

    private Date creatordate;
    
    private List<MenuModel> menulist;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

	public List<MenuModel> getMenulist() {
		return menulist;
	}

	public void setMenulist(List<MenuModel> menulist) {
		this.menulist = menulist;
	}
}