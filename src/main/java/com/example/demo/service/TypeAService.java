package com.example.demo.service;

import com.example.demo.database.Organisation;
import com.example.demo.database.OrganisationTypeA;
import com.example.demo.repository.OrgTypeARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * com.example.demo.service.TypeAService, created on 11/10/2019 16:29 <p>
 * @author AlessandroA
 */
@Service
public class TypeAService {

  @Autowired
  private OrgTypeARepository repository;

  public Organisation save(OrganisationTypeA orgA) {
    return repository.save(orgA);
  }
}
