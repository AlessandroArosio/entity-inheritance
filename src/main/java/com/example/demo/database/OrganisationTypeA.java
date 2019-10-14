package com.example.demo.database;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * com.example.demo.database.OrganisationTypeA, created on 11/10/2019 15:48 <p>
 * @author AlessandroA
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class OrganisationTypeA extends OrgType {

  private String fieldTypeA;
}
