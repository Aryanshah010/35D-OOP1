package week4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        // 1. Write a program that asks your name and prints “Hello your name” five
        // times. Use a loop.
        System.out.print("Enter your name: ");
        Scanner task4 = new Scanner(System.in);
        String name = task4.nextLine();
        for (int index = 0; index < 5; index++) {
            System.out.println(name);
        }

        // Write a program that displays the following table (note that 1 mile is 1.609
        // kilometers):

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

        task4.close();
    }

}