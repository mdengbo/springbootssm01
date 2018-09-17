package com.example.springbootssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author madengbo
 * @create 2018-09-17 17:25
 * @desc
 * @Version 1.0
 **/
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String doLogin(String name, ModelMap modelMap ){
        modelMap.put("name",name);
        return "index";
    }

}
