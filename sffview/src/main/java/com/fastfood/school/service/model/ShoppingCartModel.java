package com.fastfood.school.service.model;

import java.util.Date;

public class ShoppingCartModel {
    private Integer id;

    private Integer shopid;

    private Integer menuid;

    private Integer number;

    private String creator;

    private Integer creatorid;

    private Date creatordate;

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

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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
}