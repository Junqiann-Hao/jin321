package com.jin321.wx.controller;

import com.jin321.pl.model.Aboutus;
import com.jin321.pl.model.Chart;
import com.jin321.wx.service.AboutUsService;
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
 * @Author: hao
 * @Date: 2018/3/25 20:47
 * @Description: *
 */
@Controller
@RequestMapping("/wx")
public class AboutUsController {
    private static final Log log = LogFactory.getLog(AboutUsController.class);
    @Autowired
    AboutUsService aboutUsService;
    @RequestMapping("/aboutUs")
    @ResponseBody
    public Aboutus aboutUs(@RequestBody Chart chart) throws Exception {
        log.info("关于我们");
        return aboutUsService.findfirstboutUs();
    }
}
