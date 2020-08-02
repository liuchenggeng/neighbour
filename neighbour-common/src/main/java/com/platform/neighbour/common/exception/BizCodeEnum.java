package com.platform.neighbour.common.exception;

/**
 * 提交人：刘承耿
 * 创建时间：2020/7/24 21:50
 * 项目名称：gulimall
 */
public enum BizCodeEnum {

    SYSTEM_UNKNOWN_EXCEPTION(10000, "系统未知错误"),
    VALIDATE_EXCEPTION(10010, "数据验证错误");

    private int code;
    private String message;

    BizCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
