package com.tomyang.user.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-07-16
 */
@Api("用于测试")
@RestController
@RequestMapping("/user/ty-user")
public class TyUserController {

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    @ApiOperation(value = "sayHello")
    public String sayHello(@RequestParam @ApiParam(value = "s") int s){
        return s+"";
    }
}
