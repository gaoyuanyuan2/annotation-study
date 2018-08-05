package com.demo.service;

import com.myspringframework.annotation.MyService;

@MyService
public class DemoService {

    public String getName(String name){
        return  "My Name is:"+name;
    }
}
