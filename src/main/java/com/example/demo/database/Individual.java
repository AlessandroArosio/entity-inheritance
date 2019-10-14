package com.example.demo.database;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * com.example.demo.database.Individual, created on 11/10/2019 13:56 <p>
 * @author AlessandroA
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Individual extends Party {

  private String email;
  private String phoneNumber;
  private String altPhoneNumber;
  private String partyType;
  private String currency;
}
