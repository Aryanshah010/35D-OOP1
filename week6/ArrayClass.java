package week6;

public class ArrayClass {
    public static void main(String[] args) {
        /* To create an array define datatype followed by [] */
        int[] FirstArray;
        /* Initializing the array we need new reference */
        FirstArray = new int[6]; // Here the new int[6] -> 6 refers to the size of array
        /* The size of an array can be further access by length */
        int FirstArrayLength = FirstArray.length;
        System.out.println("First array size is " + FirstArrayLength);

        /* Using index for array operation */
        FirstArray[0] = 12;
        FirstArray[1] = 20;
        FirstArray[2] = 69;

        /* To print the array use the same index */
        System.out.println("The first element is in  0 index " + FirstArray[0]);

        /* Can also create a new int value */

        int secondArrayIndex = FirstArray[2];
        System.out.println("The second element stored " + secondArrayIndex);
        // Declaration and Initilization
        // int[] mySecondArray = new int[6];

        // /* Declaration and Initilization and value assigned */
        // int[] thirdArray = { 12, 40, 450, 50, 96, 69 };
        // /* Or using constructor */
        // int[] fourthArray = new int[] { 1, 2, 3, 4 };

        /*
         * Task
         * Create a array of int called myFifth array
         * with size of 5
         * insert the value of 10,20,30,40,50
         * print the value of an array as well as the multiplied by 2
         * EG:
         * 10 20
         * 20 40
         * 30 60
         * 40 80
         * 50 100
         */

        for (int arr = 0; arr <= 4; arr++) {
            int[] myFifthArray = { 10, 20, 30, 40, 50 };
            System.out.println(myFifthArray[arr] + " " + myFifthArray[arr] * 2);
        }

    }

}
