package com.example.tst.controller;

import com.example.tst.model.Thu;
import com.example.tst.repository.ThursdayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;


@Controller
public class ThuController {
    @Autowired
    private ThursdayRepository repo;
    @GetMapping("/thu")
    public String thursday(Model model){
        model.addAttribute("thu", repo.findAll());
        return "thu";
    }
    @PostMapping("/thu")
    public Thu create(@RequestBody Map<String, String> body){
        String title = body.get("title");
        String content = body.get("content");
        String l = body.get("link");
        String cls = body.get("clink");
        return repo.save(new Thu(title,content,l,cls));
    }
}
