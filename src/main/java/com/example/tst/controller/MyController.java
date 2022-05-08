package com.example.tst.controller;


import com.example.tst.model.MyUser;
import com.example.tst.repository.MyRepository;
import com.example.tst.repository.TuesdayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class MyController {
    @Autowired
    MyRepository myRepository;

    @GetMapping("/blog")
    public String  index(Model model){
        model.addAttribute("blog", myRepository.findAll());
        return "blog";
    }


    @PostMapping("/blog")
    public MyUser create(@RequestBody Map<String, String> body){
        String title = body.get("title");
        String content = body.get("content");
        String l = body.get("content");
        String c = body.get("clink");
        return myRepository.save(new MyUser(title,content,l,c));
    }
}
