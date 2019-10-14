package com.example.demo.service;

import com.example.demo.database.OrganisationTypeB;
import com.example.demo.repository.OrgTypeBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * com.example.demo.service.TypeBService, created on 11/10/2019 16:30 <p>
 * @author AlessandroA
 */
@Service
public class TypeBService {

  @Autowired
  private OrgTypeBRepository repository;

  public OrganisationTypeB save(OrganisationTypeB orgB) {
    return repository.save(orgB);
  }
}
