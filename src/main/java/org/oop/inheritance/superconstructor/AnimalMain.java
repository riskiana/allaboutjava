package org.oop.inheritance.superconstructor;

public class AnimalMain {

  public static void main(String[] args) {
    final var cat = new Cat("Meow");
    cat.makeSound();
    final var dog = new Dog("Woof");
    dog.makeSound();
  }

}
