package com.example.tst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OopsController {
    @GetMapping("/oops")
    public String handler(Model model){
        return "oops";
    }
}
