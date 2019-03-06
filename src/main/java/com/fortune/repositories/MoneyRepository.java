package com.fortune.repositories;

import com.fortune.entities.MoneyQuote;
import com.fortune.entities.MotivationalQuote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoneyRepository extends JpaRepository<MoneyQuote, Long> {

}
