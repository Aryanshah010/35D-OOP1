package week4;

public class JumpStatement {
    public static void main(String[] args) {
        for (int index = 0; index < 5; index++) {
            if (index == 3) {
                break;
            }
            System.out.println("Index " + index);
        }

        int count = 0;
        while (count <= 10) {
            if (count == 6) {
                break;

            }
            System.out.println("Count " + count);
            count++;

        }
        for (int index = 0; index < 5; index++) {
            if (index == 3) {
                continue;
            }
            System.out.println("Continue index" + index);
        }
        /*
         * Task WAP to run for loop from -5 to 5
         * break the loop if the index is positive
         */
        for (int num = -5; num <= 5; num++) {
            if (num >= 0) {
                break;
            }
            System.out.println(num);
        }
        /*
         * Task 2
         * Loop from 1 -20 using any loop
         * Only print the value if it is even
         * use continye to do this task
         */

        for (int num = 1; num <= 20; num++) {
            if (num % 2 != 0) {
                continue;
            }
            System.out.println(num);
        }

    }

}
