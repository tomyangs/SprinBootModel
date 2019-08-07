package com.tomyang.ssm.controller;


import com.tomyang.common.CodeEnum;
import com.tomyang.common.CommUtil;
import com.tomyang.common.CommUtils;
import com.tomyang.ssm.entity.User;
import com.tomyang.ssm.service.impl.UserServiceImpl;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-07-16
 */
@RestController
@RequestMapping("/ssm/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @ApiOperation(value = "通过id获取用户信息")
    @ApiImplicitParam(paramType="query", name = "id", value = "用户id", required = true, dataType = "int")
    @RequestMapping(value = "/userinfo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public CommUtil userInfo(@RequestParam int id){
        CommUtil commUtil = new CommUtil();
        //对请求的数据进行判断
        if(id <= 0){
            commUtil.setMsg(CodeEnum.USERINFO_FAIL.getMsg());
            commUtil.setCode(CodeEnum.USERINFO_FAIL.getCode());
        }
        User user = userService.getById(id);
        if(user != null){
            commUtil = CommUtils.getSuccessComm();
            commUtil.setData(user);
        }
        return commUtil;
    }
}
