package com.dubbodemo.pri.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbodemo.service.AnnotationTestService;

/**
 * Created by xiayishun on 2017/3/11.
 * 服务方使用注解配置
 */
@Service(version = "1.0.0")
public class AnnotationTestServiceImpl implements AnnotationTestService {
}
