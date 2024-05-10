package week6;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] data = { 10, 20, 30, 40, 50 };
        int arrayLength = data.length;
        /* First approach */
        for (int index = 0; index < arrayLength; index++) {
            System.out.println("Index " + index + " Value " + data[index]);
        }
        System.out.println("Using length-1");

        /* Second approach */
        for (int index = 0; index <= arrayLength - 1; index++) {
            System.out.println("Index " + index + " Value " + data[index]);
        }
        // data[100]; this will crash, no index accessible

        /*
         * Task Make an array of length 10
         * Add the value as 10,20,30....100
         * Make another array with the same length 10
         * Add the value of first array in negative
         * Use loop on first array to complete this
         * second array should be -10,-20,-30.....-100
         * Print the second array
         */

        int[] arrayTask = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int arrayTaskLength = arrayTask.length;

        int[] secondArrayTask = new int[10];

        for (int arr = 0; arr <= arrayTaskLength - 1; arr++) {

            secondArrayTask[arr] = -arrayTask[arr];
            System.out.println(secondArrayTask[arr]);

        }
        System.out.println();
        /*
         * Task
         * print the second array in descending
         * should be :-100,-90,-80,....,-10
         * Note: start loop from (length - 1) to 0
         */
        int secondArrayLength = secondArrayTask.length;
        for (int index = secondArrayLength - 1; index >= 0; index--) {
            System.out.println(secondArrayTask[index]);
        }

    }

}
