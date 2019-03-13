//: c08:CatsAndDogs.java
// From Thinking in Java, 2nd Edition
// Available at http://www.BruceEckel.com
// (c) Bruce Eckel 1999
// Copyright notice in Copyright.txt
// Simple collection example
import java.util.*;

abstract class Animal 
{
 abstract void print();
  
}

class Cat extends Animal {
  private int catNumber;
  Cat(int i) {
    catNumber = i;
  }
  void print() {
    System.out.println("Cat #" + catNumber);
  }
}

class Dog extends Animal{
  private int dogNumber;
  Dog(int i) {
    dogNumber = i;
  }
  void print() {
    System.out.println("Dog #" + dogNumber);
  }
}

public class CatsAndDogsV2 {
  public static void main(String[] args) {
    ArrayList animals = new ArrayList();
    for(int i = 0; i < 7; i++)
      animals.add(new Cat(i));
    // Not a problem to add a dog to cats:
    animals.add(new Dog(7));
    for(int i = 0; i < animals.size(); i++)
	    ((Animal)animals.get(i)).print();
  }
} ///:~
