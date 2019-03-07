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
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("/viewRandomMotivational")
    public ModelAndView showRandomDailyQuotes(ModelMap model){
        model.addAttribute("fortunes", motivationalService.getRandomMotivationalQuote());
        return new ModelAndView("redirect:/daily/random", model);
    }

    @RequestMapping("/viewAllMotivational")
    public ModelAndView showAllDailyQuotes(ModelMap model){
        model.addAttribute("fortunes", motivationalService.getAllMotivationalQuotes());
        return new ModelAndView("redirect:/daily/all", model);
    }
}
