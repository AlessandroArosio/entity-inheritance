package com.example.demo.database.roles;

import com.example.demo.database.Party;
import com.example.demo.database.PartyRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * com.example.demo.database.roles.FinCoRole, created on 14/10/2019 10:17 <p>
 * @author AlessandroA
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class FinCoRole extends PartyRole {

  private String finCoProperty;
}
