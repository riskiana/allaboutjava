package org.oop.inheritance.superconstructor;

public class Cat extends Animal {
  Cat(String s) {
    super("Meow");
    System.out.println("Cat constructor: " + s);
  }

  @Override
  void makeSound() {
    System.out.println("Meow meow!");
  }

}
