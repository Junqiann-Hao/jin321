package com.jin321.ms.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jin321.ms.Service.ProductService;
import com.jin321.pl.model.Product;
import com.jin321.pl.model.Productsize;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tyranitarx on 2017/10/5.
 *
 * @Description : 添加货物接口
 */
@Controller
@RequestMapping("/ms")
public class InsertProductController {
    private static final Log log = LogFactory.getLog(InsertProductController.class);
    @Autowired
    private ProductService productService;
    private Map<String,String> returnMap;
    private Product product;
    private List<Productsize> productsizes;
    private int sign;

    /**
     *
     * @param json 样例json：
     * {
        "product":{"pname":"郝俊谦最牛逼","psummary":"郝俊谦牛逼","ptypea":"1","ptypeb":"1","is_together":"1","is_delete":"0"},
        "productsizes":[{"pscost":"12.2","psoriprice":"12.2","pssellprice":"12.2","sizename":"郝俊谦牛逼","snumber":"123","is_delete":"0"}]
     *｝
     * @return
     */
    @RequestMapping("/insertProduct")
    @ResponseBody
    public Map<String,String> insertProduct(@RequestBody String json, HttpServletRequest request){
        returnMap=new HashMap<String, String>();
        JSONObject obj= JSON.parseObject(json);
        //product
        log.info("添加商品传来的json为:"+json);
        product=JSON.parseObject(obj.get("product").toString(),Product.class);
        product.setDid((Integer) request.getSession().getAttribute("did"));
        //productsize
        productsizes=JSON.parseArray(obj.get("productsizes").toString(),Productsize.class);
        sign=productService.insertProduct(product,productsizes);
        if (sign==1){
            returnMap.put("code","1");
            returnMap.put("msg","插入成功");
            return  returnMap;
        }
        else if(sign==-1){
            returnMap.put("code","-1");
            returnMap.put("msg","商品已存在");
            return  returnMap;
        }
        else {
            returnMap.put("code","0");
            returnMap.put("msg","插入失败");
            return  returnMap;
        }
    }
}
