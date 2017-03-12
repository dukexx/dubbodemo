package com.dubbodemo.pri.service;

import com.dubbodemo.domain.TestBean;
import com.dubbodemo.service.TestService;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

/**
 * Created by xiayishun on 2017/3/11.
 */
@Service
public class TestServiceImpl implements TestService {


    @Override
    public TestBean getTestBean() {
        TestBean testBean = new TestBean();
        testBean.setName("hello world dubbo");
        return testBean;
    }

    @Override
    public void save(String save) {

    }
}
