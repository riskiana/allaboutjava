package org.oop.inheritance.superconstructor;

public class Dog extends Animal {
  private String breed;

  public Dog(String s) {
    super(s);
  }

  @Override
  void makeSound() {
    System.out.println("Bark bark!");
  }


}
