package org.oop.composition;

class VisaPayment implements PaymentStrategy {
  private final String email;

  public VisaPayment(String email) {
    this.email = email;
  }

  @Override
  public void pay(int amount) {
    System.out.println("Paying " + amount + " using Visa");
  }
}
