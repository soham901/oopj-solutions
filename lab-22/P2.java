// 2. Demonstrate the use of Super Keyword to access constructor, function and variable of immediate parent class from the subclass . (A)

class Parent {
    int num = 100;

    Parent() {
        System.out.println("Parent class constructor called");
    }

    void display() {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent {
    int num = 200;

    Child() {
        super();
        System.out.println("Child class constructor called");
    }

    void display() {
        super.display();
        System.out.println("Child class display method");
    }

    void show() {
        System.out.println("Parent class variable num: " + super.num);
        System.out.println("Child class variable num: " + num);
    }
}

public class P2 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.show();
    }
}
