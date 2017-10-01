package com.jin321.pl.model;

import java.util.Date;

public class Orderform {
    private Integer oid;

    private String uid;

    private Integer uaid;

    private Date odate;

    private Date opaydate;

    private Date osenddate;

    private Date oconfirmdate;

    private Integer opayed;

    private Integer ostate;

    private String omessage;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Integer getUaid() {
        return uaid;
    }

    public void setUaid(Integer uaid) {
        this.uaid = uaid;
    }

    public Date getOdate() {
        return odate;
    }

    public void setOdate(Date odate) {
        this.odate = odate;
    }

    public Date getOpaydate() {
        return opaydate;
    }

    public void setOpaydate(Date opaydate) {
        this.opaydate = opaydate;
    }

    public Date getOsenddate() {
        return osenddate;
    }

    public void setOsenddate(Date osenddate) {
        this.osenddate = osenddate;
    }

    public Date getOconfirmdate() {
        return oconfirmdate;
    }

    public void setOconfirmdate(Date oconfirmdate) {
        this.oconfirmdate = oconfirmdate;
    }

    public Integer getOpayed() {
        return opayed;
    }

    public void setOpayed(Integer opayed) {
        this.opayed = opayed;
    }

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }

    public String getOmessage() {
        return omessage;
    }

    public void setOmessage(String omessage) {
        this.omessage = omessage == null ? null : omessage.trim();
    }
}