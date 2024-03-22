package com.pineapplemenu.PineappleMenu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/portfolio")
    public String portfolio(Model model){
        return "portfolio";
    }
}
