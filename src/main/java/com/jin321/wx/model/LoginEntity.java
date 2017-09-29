package com.jin321.wx.model;

/**
 * @Author hao
 * @Date 2017/9/27 22:08
 * @Description : 存储用户登录信息
 */
public class LoginEntity {
    String sessionKey;
    String openid;
    long tim;

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public long getTim() {
        return tim;
    }

    public void setTim(long tim) {
        this.tim = tim;
    }
}
