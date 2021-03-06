package com.jin321.pl.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Orderform implements Serializable {
    private Long oid;

    private String uid;

    private Integer uaid;

    private Integer did;

    private Long dbfid;

    private Date odate;

    private Date opaydate;

    private Date osenddate;

    private Date oconfirmdate;

    private BigDecimal ototalmoney;

    private Date orepaytime;

    private Integer opayed;

    private Integer ostate;

    private String omessage;

    private String osendmethod;

    private String osendnumber;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
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

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Long getDbfid() {
        return dbfid;
    }

    public void setDbfid(Long dbfid) {
        this.dbfid = dbfid;
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

    public BigDecimal getOtotalmoney() {
        return ototalmoney;
    }

    public void setOtotalmoney(BigDecimal ototalmoney) {
        this.ototalmoney = ototalmoney;
    }

    public Date getOrepaytime() {
        return orepaytime;
    }

    public void setOrepaytime(Date orepaytime) {
        this.orepaytime = orepaytime;
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

    public String getOsendmethod() {
        return osendmethod;
    }

    public void setOsendmethod(String osendmethod) {
        this.osendmethod = osendmethod == null ? null : osendmethod.trim();
    }

    public String getOsendnumber() {
        return osendnumber;
    }

    public void setOsendnumber(String osendnumber) {
        this.osendnumber = osendnumber == null ? null : osendnumber.trim();
    }
}