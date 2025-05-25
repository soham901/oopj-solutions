// 2. WAP to demonstrate anonymous inner class. (B)

public class P2 {
    interface Greeting {
        void sayHello();
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from anonymous inner class");
            }
        };

        greeting.sayHello();
    }
}
