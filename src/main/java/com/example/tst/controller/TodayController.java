package com.example.tst.controller;

import com.example.tst.model.Thu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.Column;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
public class TodayController {

    @GetMapping("/today")
    public String tuesTodayController(Model model) {
        Date currentTime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("E");
        String format = sdf.format(currentTime);
//        System.out.println(format);
        if (format.equals("Mon")){
            return "redirect:/blog";
        }else if (format.equals("Tue")) {
            return "redirect:/tue";
        }else if (format.equals("Wed")) {
            return "redirect:/wed";
        }else if (format.equals("Thu")) {
            return "redirect:/thu";
        }else if (format.equals("Fri")) {
            return "redirect:/fri";
        }else if (format.equals("Sat")||format.equals("Sun")) {
            return "redirect:/oops";
        }
        return "";
    }


}
