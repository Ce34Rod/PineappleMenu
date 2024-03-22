package com.pineapplemenu.PineappleMenu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String slideshow(Model model){
        return "home";
    }

    @GetMapping("/jessica-lauren")
    public String jessicalauren(Model model){
        return "jessica-lauren";
    }

    @GetMapping("/slidingWindow")
    public String slidingWindow (Model model) {
        return "slidingWindow";
    }
}
