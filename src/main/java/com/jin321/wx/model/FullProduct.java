package com.jin321.wx.model;

import com.jin321.pl.model.Product;
import com.jin321.pl.model.Productdetail;
import com.jin321.pl.model.Productpics;
import com.jin321.pl.model.Productsize;

import java.io.Serializable;
import java.util.List;

/**
 * @Author hao
 * @Date 2017/10/1 21:48
 * @Description :完整的商品信息
 */
public class FullProduct extends Product implements Serializable {
    //商品型号
    List<Productsize> productsizeList;
    //商品相关图片
    List<Productpics> productpicsList;
    //货物详细介绍
    List<Productdetail> productdetailList;
    //商品图片的绝对路径不带端口
    String basePathNoPort;
    //商家名字
    String dname;

    public String getBasePathNoPort() {
        return basePathNoPort;
    }

    public void setBasePathNoPort(String basePathNoPort) {
        this.basePathNoPort = basePathNoPort;
    }

    public List<Productsize> getProductsizeList() {
        return productsizeList;
    }

    public void setProductsizeList(List<Productsize> productsizeList) {
        this.productsizeList = productsizeList;
    }

    public List<Productpics> getProductpicsList() {
        return productpicsList;
    }

    public void setProductpicsList(List<Productpics> productpicsList) {
        this.productpicsList = productpicsList;
    }

    public List<Productdetail> getProductdetailList() {
        return productdetailList;
    }

    public void setProductdetailList(List<Productdetail> productdetailList) {
        this.productdetailList = productdetailList;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "com.jin321.wx.model.FullProduct{" +
                "productsizeList=" + productsizeList +
                ", productpicsList=" + productpicsList +
                ", productdetailList=" + productdetailList +
                ", basePathNoPort='" + basePathNoPort + '\'' +
                ", dname='" + dname + '\'' +
                "} " + super.toString();
    }
}
