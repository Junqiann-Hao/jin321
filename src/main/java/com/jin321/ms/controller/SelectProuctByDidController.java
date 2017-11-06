package com.jin321.ms.controller;

import com.jin321.ms.Service.ProductService;
import com.jin321.ms.model.TrueProduct;
import com.jin321.pl.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Tyranitarx on 2017/11/6.
 *
 * @Description : 根据session中登录存放的did获取商家所上架的商品
 */
@Controller
@RequestMapping("/ms")
public class SelectProuctByDidController {
    @Autowired
    private ProductService productService;
    private int did;
    private List<TrueProduct> trueProductList;
    @ResponseBody
    @RequestMapping("/selectProdutByDid")
    public List<TrueProduct> selectProductByDid(HttpServletRequest request){
        did=(Integer)request.getSession().getAttribute("did");
        trueProductList=productService.selectProductByDealer(did);
        return trueProductList;
    }
}