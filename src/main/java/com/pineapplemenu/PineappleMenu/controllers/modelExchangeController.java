package com.pineapplemenu.PineappleMenu.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class modelExchangeController {

    @GetMapping("modelExchange")
    public String slideshow(Model model){
        return "modelExchange";
    }

}
