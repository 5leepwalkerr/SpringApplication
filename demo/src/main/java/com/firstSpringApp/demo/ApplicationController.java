package com.firstSpringApp.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class ApplicationController {

    @GetMapping("hello")
    public String hello(
            @RequestParam(name = "name",required = false,defaultValue = "hello") String name,
            Map<String,Object> model
    ){
        model.put("name",name);
        return "hello";
    }
}
