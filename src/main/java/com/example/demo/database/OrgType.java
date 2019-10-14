package com.example.demo.database;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;

/**
 * com.example.demo.database.OrgType, created on 11/10/2019 15:47 <p>
 * @author AlessandroA
 */
@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class OrgType extends Organisation {

  private String vatNumber;
}
