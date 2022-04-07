package com.wu.controller;

import com.wu.service.StuinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StuinfoController {
    @Autowired
    private StuinfoService stuinfoService;

    @GetMapping("/inset")
    public String insert(){
        stuinfoService.insertStu();
    }
}
