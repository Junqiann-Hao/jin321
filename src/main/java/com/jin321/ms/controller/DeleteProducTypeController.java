package com.jin321.ms.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jin321.ms.Service.ProductTypeService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tyranitarx on 2017/11/5.
 *
 * @Description :删除分类接口
 *              样例json{"tid":"xxx"}
 */
@Controller
@RequestMapping("/ms")
public class DeleteProducTypeController {
    private static final Log log = LogFactory.getLog(DeleteProducTypeController.class);
    @Autowired
    private ProductTypeService productTypeService;
    private Map<String,String> returnMap;
    private int tid;
    private int sign;
    @ResponseBody
    @RequestMapping("/deleteFirstProductType")
    public Map<String,String> deleteFirstProductType(@RequestBody String json){
        log.info("删除一级分类");
        returnMap=new HashMap<String, String>();
        JSONObject object=JSON.parseObject(json);
        tid=object.getInteger("tid");
        sign=productTypeService.deleteFirstType(tid);
        if(sign==-1){
            returnMap.put("code","-1");
            returnMap.put("msg","不存在此分类1");
            return returnMap;
        }
        else if(sign==0){
            returnMap.put("code","0");
            returnMap.put("msg","分类删除失败1");
            return returnMap;
        }
        else {
            returnMap.put("code","1");
            returnMap.put("msg","删除成功1");
            return returnMap;
        }
    }
    @ResponseBody
    @RequestMapping("/deleteSecondProductType")
    public Map<String,String> deleteSecondProdcutType(@RequestBody String json){
        log.info("删除二级分类");
        returnMap=new HashMap<String, String>();
        JSONObject object= JSON.parseObject(json);
        tid=object.getInteger("tid");
        sign=productTypeService.deleteSecondType(tid);
        if(sign==-1){
            returnMap.put("code","-1");
            returnMap.put("msg","不存在此分类2");
            return returnMap;
        }
        else if(sign==0){
            returnMap.put("code","0");
            returnMap.put("msg","品牌删除失败2");
            return returnMap;
        }
        else {
            returnMap.put("code","1");
            returnMap.put("msg","删除成功2");
            return returnMap;
        }
    }
    @ResponseBody
    @RequestMapping("/deleteThridProductType")
    public Map<String,String> deleteThirdProdcutType(@RequestBody String json){
        log.info("删除三级分类");
        returnMap=new HashMap<String, String>();
        JSONObject object= JSON.parseObject(json);
        tid=object.getInteger("tid");
        sign=productTypeService.deleteThridType(tid);
        if(sign==-1){
            returnMap.put("code","-1");
            returnMap.put("msg","不存在分类3");
            return returnMap;
        }
        else if(sign==0){
            returnMap.put("code","0");
            returnMap.put("msg","删除失败3");
            return returnMap;
        }
        else {
            returnMap.put("code","1");
            returnMap.put("msg","删除成功3");
            return returnMap;
        }
    }
}
