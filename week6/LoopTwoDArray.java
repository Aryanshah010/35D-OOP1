package week6;

public class LoopTwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        arr[1][0] = 10;
        arr[1][1] = 20;
        arr[1][2] = 30;

        arr[2][0] = 100;
        arr[2][1] = 200;
        arr[2][2] = 300;

        int outarr = arr.length;

        for (int out = 0; out < outarr; out++) {
            int len = arr[out].length;
            for (int inner = 0; inner < len; inner++) {
                System.out.println(arr[out][inner]);
            }
        }
        /*
         * Visual Representation
         * [
         * [10,20],
         * [-10,-20],
         * [100,200],
         * [-100,-200]
         * ]
         */

        /* Loop outer array */

        int outerLength = arr.length; // -> 4
        for (int outer = 0; outer < outerLength; outer++) {
            System.out.println("Array in index " + outer);
            // System.out.println(arr[outer][0]);
            // System.out.println(arr[outer][1]);

            int innerArrayLength = arr[outer].length;
            for (int inner = 0; inner < innerArrayLength; inner++) {
                System.out.println(arr[outer][inner]);
            }
        }

        /*
         * Make an array of String names
         * [
         * ["Raju","Aaditya","Pooza","Aryan"],
         * ["Dipika","Vikram","Darsan","Ankit"]
         * 
         * ]
         */
        /*
         * loop each names
         * Task 2 on the same loop, the on which array is Ankit in
         * Answer should be 1
         */
        String[][] names = new String[2][4];

        names[0][0] = "Raju";
        names[0][1] = "Aaditya";
        names[0][2] = "Pooza";
        names[0][3] = "Aryan";

        names[1][0] = "Dipika";
        names[1][1] = "Vikram";
        names[1][2] = "Darsan";
        names[1][3] = "Ankit";

        int out = names.length;
        for (int outer = 0; outer < out; outer++) {
            int inn = names[outer].length;
            for (int inner = 0; inner < inn; inner++) {
                if (names[outer][inner] == "Ankit") {
                    System.out.println(outer);
                    System.out.println(inner);
                    break;
                }
            }
        }

    }

}
