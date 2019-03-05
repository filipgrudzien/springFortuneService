package com.fortune.controllers;

import com.fortune.entities.Quote;
import com.fortune.repositories.DBrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.awt.image.DataBuffer;

@RestController
public class QuoteController {

    @Autowired
    private DBrepository dbrepo;

    @GetMapping("/all")
    public List<Quote> showMainPage(){
        return dbrepo.findAll();
    }
}
