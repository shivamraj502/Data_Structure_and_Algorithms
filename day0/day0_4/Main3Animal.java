package day0_4;
/**Use inheritance chain (3 levels): e.g., Animal → Mammal → Dog. Each adds something. 
 * Use super() constructor call. 
 */

class Animal {
    String type;

    public Animal(String type) {
        this.type = type;
    }

    public void eat() {
        System.out.println(type + " eats food.");
    }
}

class Mammal extends Animal {
    String category;

    public Mammal(String type, String category) {
        super(type);
        this.category = category;
    }

    public void walk() {
        System.out.println(type + " (a " + category + ") walks on land.");
    }
}

class Dog extends Mammal {
    String breed;

    public Dog(String type, String category, String breed) {
        super(type, category);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("The " + breed + " dog is barking.");
    }
}

public class Main3Animal {
    public static void main(String[] args) {
        Dog d = new Dog("Animal", "Mammal", "German Shepherd");

        d.eat();    // from Animal
        d.walk();   // from Mammal
        d.bark();   // from Dog
    }
}
