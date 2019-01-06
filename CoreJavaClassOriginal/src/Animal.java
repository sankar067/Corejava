// the keyword extends is used to determine that a class is subtype of another class.
class Animal {
    public void eat() {
      System.out.println(this + " is eating");
    }
    public String toString () {
      return "Animal";
    }
  }
  class Mammal extends Animal {
    public void suckMilk() {
      System.out.println(this + " is sucking");
    }
    public void eat() {
      suckMilk();
    }
  }
  class Dog extends Mammal {
    public void bark() {
      System.out.println(this + " is barking");
    }
    public String toString () {
      return "Dog";
    }
  }
