package com.dubbodemo.pri.controller;

import com.dubbodemo.domain.TestBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xiayishun on 2017/3/11.
 */
@Controller
@ConfigurationProperties("testcontroller")
public class TestController {

//    @Value("${testcontroller.testProperties}")
    private String testProperties;

    public String getTestProperties() {
        return testProperties;
    }

    public void setTestProperties(String testProperties) {
        this.testProperties = testProperties;
    }

    @RequestMapping("/testBean/get")
    @ResponseBody
    public TestBean getTestBean() {
        TestBean testBean= new TestBean();
        testBean.setName(testProperties);
        return testBean;
    }
}
