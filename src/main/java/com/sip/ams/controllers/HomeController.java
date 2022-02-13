package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/info")
    public String info(Model model){
        String training = "Fullstack";
        model.addAttribute("workshop", training);
        return "home/info";
    }
    @RequestMapping("/display")
    public String display(){
        return "home/display";
    }
}
