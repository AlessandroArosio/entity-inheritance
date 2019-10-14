package com.example.demo.database;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * com.example.demo.database.OrganisationTypeB, created on 11/10/2019 15:49 <p>
 * @author AlessandroA
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class OrganisationTypeB extends OrgType {

  private String otherField;
}
