package com.wx1998.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HomeController {


    @Autowired
    JdbcTemplate template;

    @RequestMapping("/")
    public String index(){


        return "Hello";
    }
    @RequestMapping("/2")
    public List<Map<String, Object>> index2(){

        List<Map<String, Object>> list = template.queryForList("select * from test_table");

        return list;
    }


}
