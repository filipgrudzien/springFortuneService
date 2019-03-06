package com.fortune.services;

import com.fortune.entities.DailyQuote;
import com.fortune.repositories.DailyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class DailyService {

    @Autowired
    private DailyRepository dailyRepo;

    public List<DailyQuote> getAllDailyQuotes(){
        return dailyRepo.findAll();
    }

    public List<DailyQuote> getRandomDailyQuote(){

        List<DailyQuote> allRecords= dailyRepo.findAll();
        Random randomId = new Random();
        List<DailyQuote> singleRecordList = new ArrayList<>();
        singleRecordList.add(allRecords.get(randomId.nextInt(allRecords.size())));

        return singleRecordList;
    }

}
