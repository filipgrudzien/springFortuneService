package com.fortune.repositories;

import com.fortune.entities.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBrepository extends JpaRepository<Quote, Long> {


}
