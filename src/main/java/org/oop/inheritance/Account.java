package org.oop.inheritance;

import lombok.Getter;
import org.oop.encapsulation.Customer;

@Getter
public class Account {
  protected double balance;
  protected String accountNumber;
  protected Customer customer;

  public Account(Customer customer, String accountNumber) {
    this.customer = customer;
    this.accountNumber = accountNumber;
  }

}
