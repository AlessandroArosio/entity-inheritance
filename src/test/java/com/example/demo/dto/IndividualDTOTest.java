package com.example.demo.dto;

import com.example.demo.database.Individual;
import org.junit.Before;
import org.junit.Test;
import org.modelmapper.ModelMapper;

import static org.junit.Assert.*;

/**
 * com.example.demo.dto.IndividualDTOTest, created on 17/10/2019 09:26 <p>
 * @author AlessandroA
 */
public class IndividualDTOTest {

  private ModelMapper modelMapper;

  @Before
  public void setUp() throws Exception {
    modelMapper = new ModelMapper();
  }

  @Test
  public void testMapperInheritanceConversionToDTO() {
    Individual individual = new Individual();
    individual.setTitle("PartyProperty");
    individual.setCurrency("IndividualProperty");

    IndividualDTO dto = modelMapper.map(individual, IndividualDTO.class);

    assertEquals(individual.getTitle(), dto.getTitle());
    assertEquals(individual.getCurrency(), dto.getCurrency());
  }
}