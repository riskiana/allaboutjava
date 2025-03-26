package org.oop.inheritance.superconstructor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Animal {
  String sound;
  String name;

  Animal(String s) {
    this.sound = s;
    System.out.println("Animal constructor: " + sound);
  }

  void makeSound() {
    System.out.println(sound);
  }


}
