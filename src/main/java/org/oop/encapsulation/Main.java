package org.oop.encapsulation;

public class Main {

  public static void main(String[] args) {
    final var customer = new Customer();
    customer.setCustomerNumber("C0001")
            .setFullName(null);
    System.out.println(customer);
  }

}
