package com.example.demo.repository;

import com.example.demo.database.Individual;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * com.example.demo.repository.IndividualRepository, created on 11/10/2019 14:00 <p>
 * @author AlessandroA
 */
public interface IndividualRepository extends JpaRepository<Individual, Integer> {
}
