package week4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        // 1. Write a program that asks your name and prints “Hello your name” five
        // times. Use a loop.

        System.out.print("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        for (int index = 0; index < 5; index++) {
            System.out.println(name);
        }
        System.out.println();
        // // Write a program that displays the following table (note that 1 mile is
        // 1.609
        // // kilometers):

        float kilo = 1.609f;
        for (int mile = 1; mile <= 10; mile++) {
            System.out.println("mile " + mile + " kilometer " + (mile * kilo));

        }
        System.out.println();

        // Write a program that generates the following table:
        // Number Square

        for (int index = 10; index >= 1; index--) {
            System.out.println("Number " + index + " Square " + index * index);
        }

        // /*
        // * Write a program that reads the width and generates a corresponding square
        // of
        // * *.
        // */

        System.out.println("Enter the width: ");
        int width = scan.nextInt();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

        // using a do..while loop so that it provides the user with the option to
        // continue running the program and enter more inputs.

        char continueRunning = 'y';
        do {
            System.out.print("Enter a positive non-zero integer: ");
            int num = scan.nextInt();
            if (num <= 0) {
                System.out.println("Invalid input. Please enter a positive non-zero integer.");
                continue;
            }

            int calc = (num * (num + 1) / 2);
            System.out.println("Sum of 1 to " + num + " is " + calc);

            System.out.println("Do you want to continue? Enter y for yes or any other character for no.");
            continueRunning = scan.next().charAt(0);
            scan.nextLine();

        } while (continueRunning == 'y' || continueRunning == 'Y');
        System.out.println("Program terminated.");

        // Write a program that reads the width and generates a corresponding triangle
        // of *.

        System.out.println("Enter the width: ");
        int wid = scan.nextInt();

        for (int i = 1; i <= wid; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Write a program that prompts the user to input an integer and then outputs
        // the number with the digits reversed. For example, if the input is 12345, the
        // output should be 54321.

        System.out.println("Enter any integer digits: ");

        int digit = scan.nextInt();
        int s = 0;
        while (digit != 0) {
            int n = digit % 10;
            s = s * 10 + n;
            digit /= 10;
        }
        System.out.print(s);

        // // Write a program that reads ten integer numbers and outputs the number of
        // // inputs which are greater than 50, less than 50 or equal to 50. The program
        // // should also display the average of all numbers greater than 50 and the
        // // average of all numbers less than 50.

        int sumoflessthan50 = 0;
        int sumofmorethan50 = 0;
        int numofmorethan50 = 0;
        int numoflessthan50 = 0;
        int numofequalto50 = 0;

        System.out.println("Enter ten integers: ");

        for (int i = 0; i < 10; i++) {

            int intNum = scan.nextInt();

            if (intNum > 50) {
                numofmorethan50++;
                sumofmorethan50 += intNum;

            } else if (intNum < 50) {
                numoflessthan50++;
                sumoflessthan50 += intNum;
            } else {
                numofequalto50++;
            }
        }

        double avgmorethan50 = (numofmorethan50 > 0) ? sumofmorethan50
                / numofmorethan50 : 0;
        double avglessthan50 = (numoflessthan50 > 0) ? sumoflessthan50
                / numoflessthan50 : 0;

        System.out.println("Number of inputs greater than 50: " + numofmorethan50);
        System.out.println("Number of inputs less than 50: " + numoflessthan50);
        System.out.println("Number of inputs equal to 50: " + numofequalto50);
        System.out.println("Average of numbers greater than 50: " + avgmorethan50);
        System.out.println("Average of numbers less than 50: " + avglessthan50);

        // Write a program that asks the user for a positive nonzero integer value. The
        // program should use a loop to get the sum of all the integers from 1 up to the
        // number entered. For example, if the user enters 50, the loop will find the
        // sum of 1+2+3+4+….+50.

        System.out.print("Enter nonzero positive integer: ");

        int sumOfAllNumbers = scan.nextInt();

        int sums = 0;

        if (sumOfAllNumbers > 0) {
            for (int i = 1; i <= sumOfAllNumbers; i++) {
                sums = sums + i;
            }
            System.out.println("The sum of the numbers is: " + sums);
        } else {
            System.out.println("Please enter positive integer!");
        }

        // Write a program to calculate the HCF of Two given numbers.

        System.out.println("Enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println(num1);

        scan.close();

    }
}
