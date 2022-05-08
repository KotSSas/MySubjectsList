package com.example.tst.controller;

import com.example.tst.model.Tue;
import com.example.tst.repository.TuesdayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;


@Controller
public class TueController {
    @Autowired
    private TuesdayRepository repo;
    @GetMapping("/tue")
    public String  tuesd(Model model){
        model.addAttribute("tue", repo.findAll());
        return "tue";
    }
    @PostMapping("/tue")
    public Tue create(@RequestBody Map<String, String> body){
        String title = body.get("title");
        String content = body.get("content");
        String l = body.get("link");
        String c = body.get("clink");
        String u = body.get("used");
        return repo.save(new Tue(title,content,l,c,u));
    }
}
