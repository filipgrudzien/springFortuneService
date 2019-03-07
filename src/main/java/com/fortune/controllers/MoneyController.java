package com.fortune.controllers;

import com.fortune.entities.DailyQuote;
import com.fortune.entities.MoneyQuote;
import com.fortune.repositories.DailyRepository;
import com.fortune.repositories.MoneyRepository;
import com.fortune.services.DailyService;
import com.fortune.services.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/money")
public class MoneyController {

    @Autowired
    private MoneyService moneyService;

    @RequestMapping("/random")
    public String showRandomMoneyQuotes(Model model){
        model.addAttribute("fortunes", moneyService.getRandomMoneyQuote());
        return "money";
    }

    @RequestMapping("/all")
    public String showAllMoneyQuotes(Model model){
        model.addAttribute("fortunes", moneyService.getAllMoneyQuotes());
        return "money";
    }
}
