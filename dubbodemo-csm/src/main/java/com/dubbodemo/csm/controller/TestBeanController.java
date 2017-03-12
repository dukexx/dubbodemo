package com.dubbodemo.csm.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbodemo.domain.TestBean;
import com.dubbodemo.service.AnnotationTestService;
import com.dubbodemo.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by xiayishun on 2017/3/11.
 */
@Controller
public class TestBeanController {

    //使用该dubbo注解可以自动注入该接口的代理，调用时通过dubbo调用远程服务，可以配置和reference标签一样的配置
    @Reference(version = "1.0.0",url = "dubbo://localhost:20880",validation = "true",cache = "lru")
    private AnnotationTestService annotationTestService;

    @Resource
    private TestService testService;

    @RequestMapping("getTestBean")
    @ResponseBody
    public TestBean getTestBean() {
        testService.save(null);
        return testService.getTestBean();
    }
}
