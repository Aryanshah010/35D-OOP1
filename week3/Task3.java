import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /* Write a JAVA program to find the maximum between three numbers. */

        System.out.println("Enter three numbers: ");

        Scanner task = new Scanner(System.in);
        int num1 = task.nextInt();
        int num2 = task.nextInt();
        int num3 = task.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the maximun number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the maximun number");
        } else {
            System.out.println(num3 + " is the maximun number");
        }

        // /*
        // * Write a JAVA program to check whether a number is negative, positive, or
        // * zero.
        // */

        System.out.print("Enter a number: ");
        int number = task.nextInt();

        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("Zero");
        }

        // /*
        // * Write a JAVA program to check whether a number is divisible by 5 and 11 or
        // * not.
        // */

        System.out.print("Enter a number: ");

        int num = task.nextInt();
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("The number is divisible by 5 and 11");
        } else {
            System.out.println("The number is not divisible by 5 and 11");
        }

        // /* Write a JAVA program to check whether a number is even or odd. */

        System.out.println("Enter a number: ");
        int ooe = task.nextInt();
        if (ooe % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        // /* Write a JAVA program to check whether a year is a leap year or not. */

        System.out.println("Enter a year: ");

        int year = task.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("The year is leap year");
        } else {
            System.out.println("The year is not a leap year");
        }

        /*
         * Write a JAVA program to input any alphabet and check whether it is vowel or
         * consonant.
         */

        System.out.print("Enter a alphabet: ");

        char ch = task.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if ((ch >= 'a' && ch <= 'z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }

        /*
         * Write a Java program that takes a student's grade as input (A, B, C, D, or F)
         * and converts it to the corresponding GPA value. Use a switch case statement
         * to handle different grades.
         */

        System.out.print("Enter your grade (A,B,C,D or F): ");

        char grade = task.next().charAt(0);

        grade = Character.toUpperCase(grade);

        switch (grade) {
            case 'A':
                System.out.println("4.0");
                break;
            case 'B':
                System.out.println("3.0");
            case 'C':
                System.out.println("2.6");
            case 'D':
                System.out.println("2.0");
            case 'F':
                System.out.println("1.0");
            default:
                System.out.println("Invalid,Enter valid grade!");
                break;
        }

        /*
         * Create a Java program that takes two numbers and an operator (+, -, *, /) as
         * inputs and performs the corresponding arithmetic operation using a switch
         * case statement.
         */

        System.out.println("Enter two numbers:");

        float number1 = task.nextFloat();
        float number2 = task.nextFloat();

        System.out.print("Enter an operator (+, -, *, /): ");

        char ope = task.next().charAt(0);

        switch (ope) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;

            default:
                System.out.println("Invalid operator");
                break;
        }

        /*
         * Write a Java program that takes an integer input (1 to 12) representing a
         * month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring,
         * 7-9: Summer, 10-12: Fall) using a switch case.
         */

        System.out.print("Enter the month in integer number (1 to 12): ");

        int mon = task.nextInt();

        switch (mon) {
            case 1, 2, 3:
                System.out.println("Winter");
                break;
            case 4, 5, 6:
                System.out.println("Spring");
                break;
            case 7, 8, 9:
                System.out.println("Summer");
                break;
            case 10, 11, 12:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }

        /*
         * Implement a Java program that calculates the area of different shapes
         * (circle, rectangle, square, triangle) based on the user's choice using a
         * switch case.
         */

        System.out.print("Enter the shape (circle, rectangle, square,triangle): ");

        String shape = task.next();

        String sh = shape.toLowerCase();

        switch (sh) {

            case "circle":

                System.out.print("Enter the radius: ");
                double rad = task.nextDouble();
                double AOC = 3.14 * rad * rad;
                System.out.println("The area of circle is " + AOC);
                break;

            case "rectangle":

                System.out.println("Enter the length and breadth of rectangle:");
                float len = task.nextFloat();
                float bre = task.nextFloat();
                float AOR = len * bre;
                System.out.println("The area of rectangle is " + AOR);
                break;

            case "square":

                System.out.print("Enter the length: ");
                float length = task.nextFloat();
                float square = length * length;
                System.out.println("The area of square is " + square);
                break;

            case "triangle":

                System.out.println("Enter the base and height of the triangle:");
                double base = task.nextDouble();
                double height = task.nextDouble();
                double AOT = 0.5 * base * height;
                System.out.println("The area of triangle is " + AOT);
                break;

            default:

                System.out.println("Invalid shape");
                break;

        }
        task.close();
    }
}
