package week4;

public class Forloop {
    public static void main(String[] args) {
        /* Use For loop when condition is fixed */
        // for (int index = 0; index < 5; index++) {
        // System.out.println("Loop running " + index);
        // }
        // /* Decrement loop */
        // for (int index = 10; index >= 0; index--) {
        // System.out.println("Loop running " + index);
        // }
        // /*
        // * Task
        // * Make a multiplication table of 2
        // */
        // for (int i = 1; i <= 10; i++) {
        // System.out.println("2" + "*" + i + "=" + 2 * i);
        // }
        // /* Nested loop */
        // for (int outer = 0; outer < 3; outer++) {
        // for (int inner = 2; inner >= 0; inner--) {
        // System.out.println("Inner " + inner);
        // }
        // System.out.println("Outer " + outer);
        // }
        // System.out.println();
        /*
         * Task use nested loop to do the following
         * eg:
         * Make multiplication of 1
         * 1X1=1
         * 1X2=2
         * .
         * 1X10=10
         * .
         * .
         * Multiplication of 10
         * 10X1=10
         * 10X2=20
         */
        // System.out.println();

        for (int outer = 1; outer <= 10; outer++) {
            System.out.println(" Multiplication " + outer);
            for (int i = 1; i <= 10; i++) {
                System.out.print(i);
                System.out.print(" X ");
                System.out.print(outer);
                System.out.print(" = ");
                System.out.print(i * outer);

            }
        }

    }

}
