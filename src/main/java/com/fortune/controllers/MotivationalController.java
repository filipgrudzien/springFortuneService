package com.fortune.controllers;

import com.fortune.entities.DailyQuote;
import com.fortune.entities.MotivationalQuote;
import com.fortune.repositories.DailyRepository;
import com.fortune.repositories.MotivationalRepository;
import com.fortune.services.MoneyService;
import com.fortune.services.MotivationalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/motivational")
public class MotivationalController {

    @Autowired
    private MotivationalService motivationalService;

    @RequestMapping("/random")
    public String showRandomMotivationalQuotes(Model model){
        model.addAttribute("fortunes", motivationalService.getRandomMotivationalQuote());
        return "motivation";
    }

    @RequestMapping("/all")
    public String showAllMotivationalQuotes(Model model){
        model.addAttribute("fortunes", motivationalService.getAllMotivationalQuotes());
        return "motivation";
    }


}
