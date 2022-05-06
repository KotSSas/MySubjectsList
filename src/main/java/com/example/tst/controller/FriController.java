package com.example.tst.controller;

import com.example.tst.model.Fri;
import com.example.tst.repository.FridayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;


@Controller
public class FriController {
    @Autowired
    private FridayRepository repo;
    @GetMapping("/fri")
    public String  tuesd(Model model){
        model.addAttribute("fri", repo.findAll());
        return "fri";
    }
    @PostMapping("/fri")
    public Fri create(@RequestBody Map<String, String> body){
        String title = body.get("title");
        String content = body.get("content");
        String link = body.get("link");
        return repo.save(new Fri(title,content,link));
    }
}
