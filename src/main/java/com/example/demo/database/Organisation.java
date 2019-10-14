package com.example.demo.database;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * com.example.demo.database.Organisation, created on 11/10/2019 15:25 <p>
 * @author AlessandroA
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Organisation extends Party {

  private String companyName;
}
