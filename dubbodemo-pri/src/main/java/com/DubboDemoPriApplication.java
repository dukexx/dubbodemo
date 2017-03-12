package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by xiayishun on 2017/3/10.
 */
@SpringBootApplication
@ImportResource(locations = "classpath:spring/*.xml")
public class DubboDemoPriApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DubboDemoPriApplication.class);
        application.run(args);
    }
}
