package org.oop.composition;

public class ShoppingMain {

  public static void main(String[] args) {
    final var creditCardPayment = new CreditCardPayment("John Due", "1234567890", "123", "12/24");
    final var cart = new ShoppingCart(creditCardPayment);
    cart.checkout(100);

    final var visaPayment = new VisaPayment("john.due@gmail.com");
    final  var cart2 = new ShoppingCart(visaPayment);//Changed behavior at runtime
    cart2.checkout(200);
  }

}
