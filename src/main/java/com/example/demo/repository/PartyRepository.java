package com.example.demo.repository;

import com.example.demo.database.Party;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * com.example.demo.repository.PartyRepository, created on 11/10/2019 14:27 <p>
 * @author AlessandroA
 */
public interface PartyRepository extends JpaRepository<Party,Integer> {
}
