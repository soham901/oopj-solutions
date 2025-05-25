// 4. The Transport interface declares a deliver () method. The abstract class Animal is the super class of the Tiger, Camel, Deer and Donkey classes. The Transport interface is implemented by the Camel and Donkey classes. Write a test program that initialize an array of four Animal objects. If the object implements the Transport interface, the deliver() method is invoked. (B)

interface Transport {
    void deliver();
}

abstract class Animal {
    abstract void makeSound();
}

class Tiger extends Animal {
    @Override
    void makeSound() {
        System.out.println("Tiger roars.");
    }
}

class Camel extends Animal implements Transport {
    @Override
    void makeSound() {
        System.out.println("Camel grunts.");
    }

    @Override
    public void deliver() {
        System.out.println("Camel is delivering goods.");
    }
}

class Deer extends Animal {
    @Override
    void makeSound() {
        System.out.println("Deer bleats.");
    }
}

class Donkey extends Animal implements Transport {
    @Override
    void makeSound() {
        System.out.println("Donkey brays.");
    }

    @Override
    public void deliver() {
        System.out.println("Donkey is delivering goods.");
    }
}

public class P4 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Tiger(),
                new Camel(),
                new Deer(),
                new Donkey()
        };

        for (Animal animal : animals) {
            animal.makeSound();

            if (animal instanceof Transport) {
                ((Transport) animal).deliver();
            }

            System.out.println();
        }
    }
}
