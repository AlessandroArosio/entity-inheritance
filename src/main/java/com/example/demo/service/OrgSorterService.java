package com.example.demo.service;

import com.example.demo.database.Organisation;
import com.example.demo.database.OrganisationTypeA;
import com.example.demo.database.OrganisationTypeB;
import com.example.demo.repository.OrgRepository;
import com.example.demo.repository.OrgTypeARepository;
import com.example.demo.repository.OrgTypeBRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * com.example.demo.service.OrgService, created on 11/10/2019 15:54 <p>
 * @author AlessandroA
 */
@Component
@Slf4j
public class OrgSorterService {

  @Autowired OrgRepository orgRepository;
  @Autowired OrgTypeARepository typeARepository;
  @Autowired OrgTypeBRepository typeBRepository;

  private static final String ORGANISATION = "Organisation";
  private static final String TYPE_A = "OrganisationTypeA";
  private static final String TYPE_B = "OrganisationTypeB";

  public Organisation saveForwarder(Organisation org) {
    log.info("Type passed to method: {}", org.getClass().getSimpleName());
    return switch(org.getClass().getSimpleName()) {
      case ORGANISATION -> orgRepository.save(org);
      case TYPE_A -> typeARepository.save((OrganisationTypeA) org);
      case TYPE_B -> typeBRepository.save((OrganisationTypeB) org);
      default -> throw new RuntimeException("class not valid");
    };
  }

  public List<Organisation> fetchOrgs() {
    List<Organisation> orgs = new ArrayList<>();
    orgs.addAll(orgRepository.findAll());

    /**
     * no need to invoke typeA and typeB repositories, as they are extending Organisation.
     * Technically they extend OrgType, but this is NOT an entity and it is unknown to JPA repository,
     * hence, their base class is Organisation.
     */

//    orgs.addAll(typeARepository.findAll());
//    orgs.addAll(typeBRepository.findAll());

    return orgs;
  }
}
