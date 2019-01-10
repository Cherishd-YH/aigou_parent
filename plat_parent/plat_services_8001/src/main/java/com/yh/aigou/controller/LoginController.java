package com.yh.aigou.controller;

import com.yh.aigou.domain.Employee;
import com.yh.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    //前台传  RequestBody接收的是一个Json对象的字符串
    public AjaxResult ajaxResult(@RequestBody Employee employee){
        if("admin".equals(employee.getUsername())&&"admin".equals(employee.getPassword())){
            return new AjaxResult();
        }
        return new AjaxResult().setSuccess(false).setMessage("用户名或密码错误");
    }
}
