package com.example.demo.database;

import com.example.demo.database.roles.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * com.example.demo.database.PartyRole, created on 14/10/2019 10:11 <p>
 * @author AlessandroA
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "pt_role")
@Inheritance(strategy = InheritanceType.JOINED)
public class PartyRole {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;

  @Column(name = "role", nullable = false)
  @Enumerated(EnumType.STRING)
  private Role role;

  @ManyToOne
  private Party party;
}
