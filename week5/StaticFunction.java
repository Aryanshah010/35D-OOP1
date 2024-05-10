public class StaticFunction {
    /* in the following public and static is optional */
    public static int addTwoNumber(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public static String vendingMachine(int menu) {
        if (menu == 1) {
            return "Coke";
        }
        if (menu == 2) {
            return "Water";
        }
        if (menu == 3) {
            return "Frooti";
        }
        return "Noting";

    }

    public static boolean Even(int num) {
        if (num % 2 == 0) {
            return true;

        } else {
            return false;
        }

    }

    public static String checkEligible(int age, String name) {
        if (age > 18) {
            return ("Congralation " + name + ", you are eligible");

        } else {
            return ("Sorry " + name + ", you are not eligible");
        }
    }

    public static double MakeMultiply(double num1, double num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        // if a function is static no need to make object
        // if the function is static in same class you can simple call the method
        int sumReturn = addTwoNumber(10, 30);
        System.out.println("The sum is " + sumReturn);

        String frooti = vendingMachine(3);
        System.out.println("Frooti check" + frooti);

        /*
         * Task make a function checkEven
         * that takes one int
         * that returns a boolean
         * if the int is even return true else false
         */

        boolean evenNumber = Even(2);
        System.out.println(evenNumber);

        /*
         * Task 2
         * Make a function checkEligible
         * that takes one int age, one String bame
         * If the age is < 18
         * return String "Sorry name, you are not eligible"
         * else return "Congratulation name, you are eligible
         */
        String numbString = checkEligible(22, "Aryan");
        System.out.println(numbString);

        /*
         * Task 3
         * Make a function MakeMultiply
         * that takes 2 double
         * return a double with the multipolication of two
         */

    }
}