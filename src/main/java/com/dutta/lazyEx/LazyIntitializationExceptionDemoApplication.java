package com.dutta.lazyEx;

import com.dutta.lazyEx.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LazyIntitializationExceptionDemoApplication implements CommandLineRunner {

    @Autowired
    private CommonService commonService;

    public static void main(String[] args) {
        SpringApplication.run(LazyIntitializationExceptionDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        commonService.save();
        commonService.find();

    }
}
