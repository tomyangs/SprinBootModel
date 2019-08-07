package com.tomyang.common;

public enum CodeEnum {
    SUCESS(200,"成功"),
    USERINFO_FAIL(50001,"用户id为空");
    private int code;
    private String msg;

    public String getMsg(){
        return msg;
    }

    public int getCode(){
        return code;
    }

    CodeEnum(int code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
