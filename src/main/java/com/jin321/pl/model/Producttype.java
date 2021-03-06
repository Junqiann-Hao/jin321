package com.jin321.pl.model;

import java.io.Serializable;

public class Producttype implements Serializable {
    private Integer tid;

    private String typename;

    private Integer typeclass;

    private String picurl;

    private Integer highertid;

    private Boolean isDelete;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getTypeclass() {
        return typeclass;
    }

    public void setTypeclass(Integer typeclass) {
        this.typeclass = typeclass;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl == null ? null : picurl.trim();
    }

    public Integer getHighertid() {
        return highertid;
    }

    public void setHighertid(Integer highertid) {
        this.highertid = highertid;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}