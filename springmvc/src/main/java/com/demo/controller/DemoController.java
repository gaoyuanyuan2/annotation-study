package com.demo.controller;


import com.demo.service.DemoService;
import com.myspringframework.annotation.MyAutowired;
import com.myspringframework.annotation.MyController;
import com.myspringframework.annotation.MyRequestMapping;
import com.myspringframework.annotation.MyRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@MyController
@MyRequestMapping("/demo")
public class DemoController {

    @MyAutowired
    private DemoService demoService;

    @MyRequestMapping("/query.json")
    public void query(HttpServletRequest req, HttpServletResponse resp, @MyRequestParam("name") String name) {
        String result = demoService.getName(name);
        try {
            resp.getWriter().write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
