package org.oop.polymorphism.overloading;

public class MathOperations {
  // Method to add two integers
  public int add(int a, int b) {
    return a + b;
  }

  // Method to add three integers (overloaded)
  public int add(int a, int b, int c) {
    return a + b + c;
  }

  // Method to add two double values (overloaded)
  public double add(double a, double b) {
    return a + b;
  }
}
