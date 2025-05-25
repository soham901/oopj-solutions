// 1. The abstract Vegetable class has three subclasses named Potato, Brinjal
// and Tomato. Write a program that demonstrates how to establish this class
// hierarchy. Declare one instance variable of type String that indicates the
// color of a vegetable. Create and display instances of these objects. Override
// the toString() method of object to return a string with the name of vegetable
// and its color. (A)

abstract class Vegetable {
    protected String color;

    public Vegetable(String color) {
        this.color = color;
    }

    public abstract String toString();
}

class Potato extends Vegetable {
    public Potato(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Potato is " + color;
    }
}

class Brinjal extends Vegetable {
    public Brinjal(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Brinjal is " + color;
    }
}

class Tomato extends Vegetable {
    public Tomato(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Tomato is " + color;
    }
}

public class P1 {
    public static void main(String[] args) {
        Potato potato = new Potato("brown");
        Brinjal brinjal = new Brinjal("purple");
        Tomato tomato = new Tomato("red");

        System.out.println(potato);
        System.out.println(brinjal);
        System.out.println(tomato);
    }
}
