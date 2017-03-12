package com.dubbodemo.service;

import com.dubbodemo.annotation.Save;
import com.dubbodemo.domain.TestBean;

import javax.validation.constraints.NotNull;

/**
 * Created by xiayishun on 2017/3/11.
 */
public interface TestService {
    TestBean getTestBean();

    @interface Save{}
    void save(@NotNull String save);
}
