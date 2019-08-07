package com.tomyang.common;

public class CommUtils {

    public static CommUtil getSuccessComm(){
        CommUtil commUtil = new CommUtil();
        commUtil.setCode(CodeEnum.SUCESS.getCode());
        commUtil.setMsg(CodeEnum.SUCESS.getMsg());
        return commUtil;
    }
}
