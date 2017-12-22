package com.fastfood.school.service.model;

import java.math.BigDecimal;
import java.util.Date;

public class OrderModel {
    private Integer id;

    private String orderno;

    private Integer shopid;

    private String sendeeperpson;

    private String telephone;

    private String address;

    private BigDecimal totalprice;

    private Integer over;

    private String remark;

    private String creator;

    private Integer creatorid;

    private Date creatordate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getSendeeperpson() {
        return sendeeperpson;
    }

    public void setSendeeperpson(String sendeeperpson) {
        this.sendeeperpson = sendeeperpson == null ? null : sendeeperpson.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    public Integer getOver() {
        return over;
    }

    public void setOver(Integer over) {
        this.over = over;
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
}