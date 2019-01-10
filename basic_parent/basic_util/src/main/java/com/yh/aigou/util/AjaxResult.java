package com.yh.aigou.util;

/**
 * AjaxResult
 */
public class AjaxResult {
    private Boolean success=true;
    private String message="操作成功";
    private Object resultObj;
    public Boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public static AjaxResult me() {
        return new AjaxResult();
    }
}