package com.example.demo.repository;

import com.example.demo.database.OrganisationTypeA;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * com.example.demo.repository.OrgTypeARepository, created on 11/10/2019 15:55 <p>
 * @author AlessandroA
 */
public interface OrgTypeARepository extends JpaRepository<OrganisationTypeA, Integer> {
}
