package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.mapper.TestMapper;
import org.springframework.ui.Model;

@Controller
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @GetMapping("/dbtest")
    public String testDB(Model model) {
        String now = testMapper.getCurrentTime();
        model.addAttribute("dbTime", now);
        return "test";  
    }
}
