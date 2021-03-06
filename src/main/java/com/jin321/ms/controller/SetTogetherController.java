package com.jin321.ms.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jin321.ms.Service.ProductService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tyranitarx on 2017/10/30.
 *
 * @Description : 设置合伙商品控制器
 *
 * 请求样例json:["11","22","333"]
 */
@Controller
@RequestMapping("/ms")
public class SetTogetherController {
    private static final Log log = LogFactory.getLog(SetTogetherController.class);
    @Autowired
    private ProductService productService;
    private List<String> pids;
    private Map<String,String> returnMap;
    private int sign;
    @RequestMapping("/setTogether")
    @ResponseBody
    public Map<String,String> setTogether(@RequestBody String json){
        log.info("设置合伙人商品");
        returnMap=new HashMap<String, String>();
        JSONObject object=JSON.parseObject(json);
        pids=(List<String>)object.get("pid");
        sign=productService.setTogetherProduct(pids);
        if(sign==1){
            returnMap.put("code","1");
            returnMap.put("msg","设置成功");
            return returnMap;
        }
        else if(sign==-1){
            returnMap.put("code","-1");
            returnMap.put("msg","不存在的商品");
            return returnMap;
        }
        else {
            returnMap.put("code","0");
            returnMap.put("msg","设置失败");
            return returnMap;
        }
    }
}
