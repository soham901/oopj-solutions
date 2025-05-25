// 2. Define class for Complex number with real and imaginary part. Describe its constructor, overload the constructors and instantiate its object. Also define addition method to add two Complex objects. (B)

public class Complex {
    private double real;
    private double imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImg = this.imaginary + other.imaginary;
        return new Complex(newReal, newImg);
    }

    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1.5, 2.5);

        System.out.print("First complex number: ");
        c1.display();

        System.out.print("Second complex number: ");
        c2.display();

        Complex sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.display();
    }
}
