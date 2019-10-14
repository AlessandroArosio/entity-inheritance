package com.example.demo.database.roles;

import com.example.demo.database.Party;
import com.example.demo.database.PartyRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * com.example.demo.database.roles.DealerRole, created on 14/10/2019 10:17 <p>
 * @author AlessandroA
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class DealerRole extends PartyRole {

  private String dealerProperty;
}
