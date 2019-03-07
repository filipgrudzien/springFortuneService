package com.fortune.controllers;

import com.fortune.services.DailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/daily")
public class DailyController {

    @Autowired
    private DailyService dailyService;

    @RequestMapping("/random")
    public String showRandomDailyQuotes(Model model){
        model.addAttribute("fortunes", dailyService.getRandomDailyQuote());
        return "daily";
    }

    @RequestMapping("/all")
    public String showAllDailyQuotes(Model model){
        model.addAttribute("fortunes", dailyService.getAllDailyQuotes());
        return "daily";
    }

    @RequestMapping("/viewRandomDaily")
    public ModelAndView showRandomDailyQuotes(ModelMap model){
        model.addAttribute("fortunes", dailyService.getRandomDailyQuote());
        return new ModelAndView("redirect:/daily/random", model);
    }

    @RequestMapping("/viewAllDaily")
    public ModelAndView showAllDailyQuotes(ModelMap model){
        model.addAttribute("fortunes", dailyService.getAllDailyQuotes());
        return new ModelAndView("redirect:/daily/all", model);
    }

}
