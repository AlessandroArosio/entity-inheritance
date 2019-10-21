package com.example.demo.database;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * com.example.demo.database.Party, created on 11/10/2019 13:48 <p>
 * @author AlessandroA
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Party {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name = "id_custom", unique = true, nullable = false)
  private Integer id;
  private String fullName;
  private String title;
  private String firstName;
  private String middleName;
  private String lastName;
  private String website;
//  private List<String> roles = new ArrayList<>();
//  private List<String> addressList = new ArrayList<>();
  private String businessKey;

  @OneToMany(cascade = CascadeType.ALL)
  private List<PartyRole> roles = new ArrayList<>();

  public void addRole(PartyRole role) {
    role.setParty(this);
    this.roles.add(role);
  }
}
