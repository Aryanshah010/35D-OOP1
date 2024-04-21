import java.util.Scanner;

public class io {
    public static void main(String[] args) {
        /* User iutput */
        System.out.println("This statement will have line break");
        System.out.print("This will not break");
        System.out.print("This line will continue. \n");
        /*
         * String formatting using System.out.print
         * %s String, %d integral, %f floating point, %b boolean
         * This will also not break line
         */
        System.out.printf("Hello %s, good morning", "world");
        System.out.printf("The number is %d", 10);
        /* can use multiple formatter */
        System.out.printf("\nThe floating %f and boolean %b", 10.3f, false);
        System.out.println();
        /* User Input */
        Scanner scan = new Scanner(System.in);
        System.out.println("The following take whole sentence");
        String wholeOutput = scan.nextLine();
        System.out.println("The input taken is " + wholeOutput);
        System.out.println("The following take integer");
        int intInput = scan.nextInt();
        System.out.println("The input taken is " + intInput);
        System.out.println("The following take double sentence");
        double doubleInput = scan.nextDouble();
        System.out.println("The input taken is " + doubleInput);
        System.out.println("The following take boolean sentence");
        boolean boolValue = scan.nextBoolean();
        System.out.println("The input taken is " + boolValue);
        scan.close();// you must close the scanner once all input is taken

        /*
         * Task
         * Make a new scanner object scan1
         * prompt the following and take input
         * What is your name? save the input to string -> name
         * Are you over 18? save the input to boolean -> status
         * How many sibiling? save the input to integer -> sibling
         * print the following
         * Hello name,
         * Over 18?, status
         * You sibling number of sibling
         */
        Scanner scan1 = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan1.nextLine();
        System.out.println("Are you over 18?");
        boolean status = scan1.nextBoolean();
        System.out.println("How many sibling?");
        int sibling = scan1.nextInt();
        System.out.println("Hello" + name);
        System.out.println("Over 18?" + status);
        System.out.println("You have" + sibling + "number of sibling");
        scan1.close();

    }

}
