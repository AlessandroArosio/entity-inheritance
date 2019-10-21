package com.example.demo.dto;

import lombok.Data;

/**
 * com.example.demo.dto.IndividualDTO, created on 17/10/2019 09:24 <p>
 * @author AlessandroA
 */
@Data
public class IndividualDTO extends PartyDTO {

  private String email;
  private String phoneNumber;
  private String altPhoneNumber;
  private String partyType;
  private String currency;
}
