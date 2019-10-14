package com.example.demo;

import com.example.demo.database.Individual;
import com.example.demo.database.Organisation;
import com.example.demo.database.OrganisationTypeB;
import com.example.demo.database.Party;
import com.example.demo.repository.IndividualRepository;
import com.example.demo.repository.OrgRepository;
import com.example.demo.repository.OrgTypeBRepository;
import com.example.demo.repository.PartyRepository;
import com.example.demo.service.OrgSorterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Slf4j
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired IndividualRepository customerPartyRepository;
	@Autowired PartyRepository partyRepository;

	@Autowired OrgSorterService orgSorterService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override public void run(String... args) throws Exception {
		Individual party = new Individual();

		party.setFirstName("Alessandro");
		party.setCurrency("GBP");

		customerPartyRepository.save(party);

		party.setPartyType("nice party");
		customerPartyRepository.save(party);

		Party simpleParty = new Party();
		simpleParty.setTitle("Lord");

		partyRepository.save(simpleParty);

		Organisation org = new Organisation();
		org.setTitle("Mr");
		org.setCompanyName("Tesco");

		orgSorterService.saveForwarder(org);

		OrganisationTypeB typeB = new OrganisationTypeB();
		typeB.setOtherField("random");
		typeB.setBusinessKey("Org-B");

		orgSorterService.saveForwarder(typeB);

		List<Party> parties = partyRepository.findAll();
		parties.forEach(e -> log.info("Class type in Party list: Element -> {}", (e.getClass().getSimpleName())));

		List<Organisation> organisations = orgSorterService.fetchOrgs();
		organisations.forEach(o -> log.info("Org type in Organisation list: {}", (o.getClass().getSimpleName())));
	}
}
