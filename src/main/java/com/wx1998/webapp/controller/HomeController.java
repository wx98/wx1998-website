package com.wx1998.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class HomeController {


    @Autowired
    JdbcTemplate template;

    @GetMapping(value = "/")
    public String index(Model model){
        model.addAttribute("uid","123123");
        model.addAttribute("name","wxwxwx");
        return "index";
    }


    @RequestMapping("/2")
    @ResponseBody
    public List<Map<String, Object>> index2(){

        List<Map<String, Object>> list = template.queryForList("select * from test_table");

        return list;
    }


}
