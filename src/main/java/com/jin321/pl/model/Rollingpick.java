package com.jin321.pl.model;

import java.io.Serializable;

public class Rollingpick implements Serializable {
    private Integer rpid;

    private Integer pid;

    private String rpicurl;

    private Boolean isDeleted;

    public Integer getRpid() {
        return rpid;
    }

    public void setRpid(Integer rpid) {
        this.rpid = rpid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getRpicurl() {
        return rpicurl;
    }

    public void setRpicurl(String rpicurl) {
        this.rpicurl = rpicurl == null ? null : rpicurl.trim();
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "com.jin321.pl.model.Rollingpick{" +
                "rpid=" + rpid +
                ", pid=" + pid +
                ", rpicurl='" + rpicurl + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }
}