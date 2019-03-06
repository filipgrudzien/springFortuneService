package com.fortune.services;

import com.fortune.entities.DailyQuote;
import com.fortune.entities.MoneyQuote;
import com.fortune.repositories.MoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class MoneyService {

    @Autowired
    private MoneyRepository moneyRepo;

    public List<MoneyQuote> getAllMoneyQuotes(){
        return moneyRepo.findAll();
    }

    public List<MoneyQuote> getRandomMoneyQuote(){

        List<MoneyQuote> allRecords= moneyRepo.findAll();
        Random randomId = new Random();
        List<MoneyQuote> singleRecordList = new ArrayList<>();
        singleRecordList.add(allRecords.get(randomId.nextInt()%allRecords.size()));

        return singleRecordList;
    }
}
