package com.example.tst.controller;

import com.example.tst.model.Wed;
import com.example.tst.repository.WednesdayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;


@Controller
public class WedController {
    @Autowired
    private WednesdayRepository repo;
    @GetMapping("/wed")
    public String  tuesd(Model model){
        model.addAttribute("wed", repo.findAll());
        return "wed";
    }
    @PostMapping("/wed")
    public Wed create(@RequestBody Map<String, String> body){
        String title = body.get("title");
        String content = body.get("content");
        String link = body.get("link");
        return repo.save(new Wed(title,content,link));
    }
}
