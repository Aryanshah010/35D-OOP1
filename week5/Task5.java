import java.util.Scanner;

public class Task5 {
    // Make a method to check if a number is prime or not.
    public static void primeOrNot(int number) {

        if (number <= 1) {
            System.out.println("Please enter the number greater then 1!");
            return;

        }
        if (number == 2 && number == 3) {
            System.out.println("Prime number!");

        }
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime number!");
        } else {
            System.out.println("Not a prime number!");
        }

    }

    // // Make a method to check if a given number n is even or not.
    public static void evenOrNot(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");

        } else {
            System.out.println("Not Even");
        }
    }

    // // Make a method to print the table of a given number n.

    public static void table(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + num * i);

        }
    }

    // // Write a program for multiplying 3 numbers using a method and return the
    // // result and print the result from the main method.
    public static double mul(double num1, double num2, double num3) {

        double multiple = num1 * num2 * num3;
        return multiple;
    }

    // Write a program for calculating Simple Interest using a method and print the
    // result from the method itself
    public static void simpleInterest(double principle, double time, double rate) {
        double si = (principle * time * rate) / 100;
        System.out.println("The simple interest is: " + si);
    }

    // Write a program to calculate the area of a rectangle using a method of your
    // choice.
    public static float rectangle(float length, float breadth) {
        float rec = length * breadth;
        return rec;
    }

    // Calculates the factorial of a given number using the Java method.

    public static void fact(int num) {
        if (num < 0) {
            System.out.println("Enter the number greater or equal to then 0");
        } else {
            long result = 1;
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            System.out.println("The factorial of the given number is: " + result);
        }
    }

    // Calculate the nth Fibonacci number using the method.
    public static void fibo(int fibNumber) {

        if (fibNumber <= 1) {
            System.out.println("Please enter greater number then one");
        } else {

            int a, b, c;
            a = 1;
            b = 1;
            c = 1;

            System.out.println(a);
            System.out.println(b);
            for (int i = 1; i <= fibNumber; i++) {
                a = b;
                b = c;
                c = a + b;
                System.out.println(c);

            }
        }

    }

    // Write a Java program to find the greatest common divisor (GCD) of two
    // numbers.
    public static void gcd(int numberOne, int numberTwo) {
        while (numberTwo != 0) {
            int temp = numberTwo;
            numberTwo = numberOne % numberTwo;
            numberOne = temp;
        }
        System.out.println(numberOne);
    }

    // Write a Java program to display all prime numbers less than a given number
    // and count all the prime numbers less than that number using functions.

    // Your program should contain two functions:

    // a. print_prime_less_than that takes a number as a parameter and prints the
    // prime number less than that number

    // b. is_prime that takes a number as a parameter and then returns whether that
    // number is prime.
    public static void print_prime_less_than(int n) {
        int count = 0;
        if (n <= 1) {
            System.out.println("Please enter the number greater then 1");
        } else {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    count++;

                }
                if (count == 2) {
                    System.out.println(i);

                }

            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        primeOrNot(number);
        System.out.println();

        System.out.println("Enter a number!");

        int n = scan.nextInt();

        evenOrNot(n);
        System.out.println();

        System.out.println("Enter a number for multiple table");
        int numb = scan.nextInt();
        table(numb);

        System.out.println("Enter three numbers");
        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();
        double number3 = scan.nextDouble();

        double result = mul(number1, number2, number3);
        System.out.println("The multiplication of three numbers is: " + result);

        System.out.println();

        System.out.println("Enter the principle,rate and time");
        double p = scan.nextDouble();
        double t = scan.nextDouble();
        double r = scan.nextDouble();

        simpleInterest(p, t, r);
        System.out.println();
        System.out.println("Enter the length and breadth of a rectangle");

        float len = scan.nextFloat();
        float bre = scan.nextFloat();

        float res = rectangle(len, bre);
        System.out.println("The araa of the rectangle is: " + res);
        System.out.println();
        System.out.println("Enter the number for factorial");
        int numForFactorial = scan.nextInt();

        fact(numForFactorial);

        System.out.println();
        System.out.println("Enter the number for fibonacci series: ");
        int fibnum = scan.nextInt();
        fibo(fibnum);
        System.out.println();
        System.out.println("Enter two numbers");
        int numOne = scan.nextInt();
        int numTwo = scan.nextInt();

        gcd(numOne, numTwo);

        System.out.println();

        System.out.println("Enter a number");

        int Prime = scan.nextInt();

        print_prime_less_than(Prime);

        scan.close();

    }

}