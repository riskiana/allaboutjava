package org.oop.composition;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ShoppingCart {
  //Dependency Injection
  private final PaymentStrategy paymentStrategy;

  public void checkout(int amount) {
    paymentStrategy.pay(amount);
  }

}
