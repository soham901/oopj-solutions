// 3. Implement the structure of multilevel inheritance using class and
// interface in java. (B)

interface LivingBeing {
    void breathe();
}

class Animal implements LivingBeing {
    @Override
    public void breathe() {
        System.out.println("Animal breathes through lungs.");
    }

    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

public class P3 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.breathe(); // From LivingBeing via Animal
        dog.sound(); // From Animal
        dog.bark(); // From Dog
    }
}
