package org.oop.polymorphism.overloading;

public class Main {

  public static void main(String[] args) {
    MathOperations mathOperations = new MathOperations();
    // compile-time polymorphism
    System.out.println(mathOperations.add(1, 2));
    System.out.println(mathOperations.add(1, 2, 3));
    System.out.println(mathOperations.add(1.0, 2.0));
  }

}
