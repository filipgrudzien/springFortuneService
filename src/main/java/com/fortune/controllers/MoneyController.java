package com.fortune.controllers;

import com.fortune.entities.DailyQuote;
import com.fortune.entities.MoneyQuote;
import com.fortune.repositories.DailyRepository;
import com.fortune.repositories.MoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/money")
public class MoneyController {

    @Autowired
    private MoneyRepository moneyRepo;

    @RequestMapping("/all")
    public String showAllMoneyQuotes(){
        return "money";
    }
}
