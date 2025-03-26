package org.oop.polymorphism;

import org.oop.inheritance.superconstructor.Animal;
import org.oop.inheritance.superconstructor.Dog;

public class PolymorphismInAction  {

  public static void main(String[] args) {
    Animal animal = new Dog("dog"); //Upcasting
    animal.setName("Mike");

    System.out.println(animal.getName());
    //Animal class cannot access Dog-specific methods
   // animal.getBreed();
  }

}
