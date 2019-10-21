package com.example.demo.dto;

import com.example.demo.database.PartyRole;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * com.example.demo.dto.PartyDTO, created on 17/10/2019 09:23 <p>
 * @author AlessandroA
 */
@Data
public class PartyDTO {

  private Integer id;
  private String fullName;
  private String title;
  private String firstName;
  private String middleName;
  private String lastName;
  private String website;
  private String businessKey;
  private List<PartyRole> roles = new ArrayList<>();
}
