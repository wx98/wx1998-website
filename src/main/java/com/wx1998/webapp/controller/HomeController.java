package com.wx1998.webapp.controller;

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


    final
    JdbcTemplate template;

    public HomeController(JdbcTemplate template) {
        this.template = template;
    }

    @GetMapping(value = "/")
    public String index(Model model){
        model.addAttribute("uid","123123");
        model.addAttribute("name","wxwxwx");
        return "index";
    }


    @RequestMapping("/2")
    @ResponseBody
    public List<Map<String, Object>> index2(){

        return template.queryForList("select * from test_table");
    }


}
