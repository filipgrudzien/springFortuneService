package com.fortune.controllers;

import com.fortune.entities.DailyQuote;
import com.fortune.entities.MotivationalQuote;
import com.fortune.repositories.DailyRepository;
import com.fortune.repositories.MotivationalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/motivational")
public class MotivationalController {

    @Autowired
    private MotivationalRepository motivationalRepo;

    @RequestMapping("/all")
    public String showAllMotivationalQuotes(){
        return "motivation";
    }
}
