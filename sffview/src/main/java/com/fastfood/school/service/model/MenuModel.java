package com.fastfood.school.service.model;

import java.math.BigDecimal;
import java.util.Date;

public class MenuModel {
    private Integer id;

    private Integer foottypeid;

    private String name;

    private String logo;

    private BigDecimal price;

    private Integer lunchbox;

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

    public Integer getFoottypeid() {
        return foottypeid;
    }

    public void setFoottypeid(Integer foottypeid) {
        this.foottypeid = foottypeid;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getLunchbox() {
        return lunchbox;
    }

    public void setLunchbox(Integer lunchbox) {
        this.lunchbox = lunchbox;
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