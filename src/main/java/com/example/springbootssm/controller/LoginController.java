package com.example.springbootssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author madengbo
 * @create 2018-09-17 17:25
 * @desc
 * @Version 1.0
 **/
@Controller
public class LoginController {

    @RequestMapping("login")
    public String doLogin(@RequestParam(value = "name",required = false) String name, Map map ){
        map.put("name",name);
        return "index";
    }

}
