package week4;

import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        int num = 0;
        /* While takes boolean expression inside () */
        /*
         * The loop will run repeatatively when the boolean is true
         * If the boolean is false the loop will end
         */
        while (num < 5) {
            System.out.println("While loop " + num);
            num++;

        }
        /*
         * In while loop the condition is checked at the beginning
         * If tehh condition is false in initil check the loop will not run
         */
        System.out.println("Please type the value between 0-100");
        Scanner scan = new Scanner(System.in);
        int intValue = scan.nextInt();
        while (intValue < 0 || intValue > 100) {
            System.out.println("Please input between 0-100");

            intValue = scan.nextInt();

        }
        System.out.println("END LOOP");
        /*
         * Use a while loop to
         * ask user for an int value
         * if the user input positive value
         * promt user to input negative value
         * loop until the user input negative int value
         */
        System.out.println("Please enter negative value");
        int negValue = scan.nextInt();
        while (negValue >= 0) {
            System.out.println("Please enter negative value");
            negValue = scan.nextInt();
        }
        System.out.println("The negative value is " + negValue);

        scan.close();

    }

}
