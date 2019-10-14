package com.example.demo.database.roles;

/**
 * com.example.demo.Role, created on 14/10/2019 09:05 <p>
 * @author AlessandroA
 */
public enum Role {

  CUSTOMER("customer"),
  GUARANTOR("Guarantor"),
  FINCO("Finance Company"),
  DEALER("DealerRole"),
  MANUFACTURER("Manufacturer"),
  SUPPLIER("supplier"),
  REPURCHASER("Repurchaser"),
  INSURER("Insurer"),
  MAINTAINOR("Maintainor");

  private String role;

  Role(String role) {
    this.role = role;
  }

  public String getRole() {
    return role;
  }

}
