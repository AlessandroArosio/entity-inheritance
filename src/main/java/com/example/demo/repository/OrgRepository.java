package com.example.demo.repository;

import com.example.demo.database.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * com.example.demo.repository.OrgRepository, created on 11/10/2019 15:27 <p>
 * @author AlessandroA
 */
public interface OrgRepository extends JpaRepository<Organisation, Integer> {
}
