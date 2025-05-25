// 3. WAP to accept N integer numbers from the command line. Raise and handle exceptions for following cases : (B)
// - when a number is negative
// - when a number is evenly divisible by 10
// - when a number is greater than 1000 and less than 2000
// - when a number is greater than 7000
// Skip the number if an exception is raised for it, otherwise add it to find total sum.

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class DivisibleBy10Exception extends Exception {
    public DivisibleBy10Exception(String message) {
        super(message);
    }
}

class Between1000And2000Exception extends Exception {
    public Between1000And2000Exception(String message) {
        super(message);
    }
}

class GreaterThan7000Exception extends Exception {
    public GreaterThan7000Exception(String message) {
        super(message);
    }
}

public class P3 {
    public static void main(String[] args) {
        int sum = 0;

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);

                if (num < 0) {
                    throw new NegativeNumberException("Negative number found: " + num);
                }
                if (num % 10 == 0) {
                    throw new DivisibleBy10Exception("Number divisible by 10: " + num);
                }
                if (num > 1000 && num < 2000) {
                    throw new Between1000And2000Exception("Number between 1000 and 2000: " + num);
                }
                if (num > 7000) {
                    throw new GreaterThan7000Exception("Number greater than 7000: " + num);
                }

                sum += num;

            } catch (NegativeNumberException | DivisibleBy10Exception | Between1000And2000Exception
                    | GreaterThan7000Exception e) {
                System.out.println("Skipping: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input (not an integer): " + arg);
            }
        }

        System.out.println("Total sum of valid numbers: " + sum);
    }
}
