package com.tomyang.ssm.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-07-16
 */
@RestController
@RequestMapping("/ssm/company")
public class CompanyController {

    public String sayHello(){
        List listData = new ArrayList();
        ConcurrentHashMap<String,String>  concurrentHashMap = new ConcurrentHashMap<>();
        return null;
    }
}
