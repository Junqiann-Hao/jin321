package com.jin321.wx.model;

import com.jin321.pl.model.Orderform;
import com.jin321.pl.model.Orderformproduct;

import java.io.Serializable;
import java.util.List;

/**
 * @Author hao
 * @Date 2017/9/27 16:38
 * @Description :订单表
 */
public class OrderformDetail extends Orderform implements Serializable {
    //订单商品信息
    List<Orderformproduct> orderformproducts;
    //用户session
    String session;

    public List<Orderformproduct> getOrderformproducts() {
        return orderformproducts;
    }

    public void setOrderformproducts(List<Orderformproduct> orderformproducts) {
        this.orderformproducts = orderformproducts;
    }

    @Override
    public String toString() {
        return "com.jin321.wx.model.OrderformDetail{" +
                "orderformproducts=" + orderformproducts +
                "} " + super.toString();
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }
}
