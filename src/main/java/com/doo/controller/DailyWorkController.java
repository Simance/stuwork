package com.doo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DailyWorkController {

    @RequestMapping(value = "/work")
    public String getStudents(Model model){

        model.addAllAttributes();
        return  "hello";
    }
}
