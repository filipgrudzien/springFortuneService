package com.fortune.repositories;

import com.fortune.entities.DailyQuote;
import com.fortune.entities.MotivationalQuote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotivationalRepository extends JpaRepository<MotivationalQuote, Long> {

}
