package com.fortune.services;

import com.fortune.entities.MoneyQuote;
import com.fortune.entities.MotivationalQuote;
import com.fortune.repositories.MoneyRepository;
import com.fortune.repositories.MotivationalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class MotivationalService {

    @Autowired
    private MotivationalRepository motivationalRepo;

    public List<MotivationalQuote> getAllMotivationalQuotes(){
        return motivationalRepo.findAll();
    }

    public List<MotivationalQuote> getRandomMotivationalQuote(){

        List<MotivationalQuote> allRecords= motivationalRepo.findAll();
        Random randomId = new Random();
        List<MotivationalQuote> singleRecordList = new ArrayList<>();
        singleRecordList.add(allRecords.get(randomId.nextInt(allRecords.size())));

        return singleRecordList;
    }
}
