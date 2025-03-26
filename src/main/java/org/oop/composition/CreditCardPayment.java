package org.oop.composition;

class CreditCardPayment implements PaymentStrategy {
  private final String name;
  private final String cardNumber;
  private final String cvv;
  private final String dateOfExpiry;

  public CreditCardPayment(String name, String cardNumber, String cvv, String dateOfExpiry) {
    this.name = name;
    this.cardNumber = cardNumber;
    this.cvv = cvv;
    this.dateOfExpiry = dateOfExpiry;
  }

  @Override
  public void pay(int amount) {
    System.out.println("Paying " + amount + " using credit card");
  }
}