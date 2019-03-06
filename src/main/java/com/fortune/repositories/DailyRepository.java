package com.fortune.repositories;

import com.fortune.entities.DailyQuote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyRepository extends JpaRepository<DailyQuote, Long> {

}
