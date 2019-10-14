package com.example.demo.repository;

import com.example.demo.database.PartyRole;
import com.example.demo.database.roles.CustomerRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * com.example.demo.repository.PartyRoleRepository, created on 14/10/2019 10:55 <p>
 * @author AlessandroA
 */
public interface PartyRoleRepository extends JpaRepository<PartyRole, Integer> {
}
