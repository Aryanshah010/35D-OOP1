package week6;

public class MultiDimArray {
    public static void main(String[] args) {
        /* Create N-dimension array add number of square bracket */
        // 1D Array
        int[] oneDArray;
        // 2D Array
        int[][] twoDArray;
        // 3D Array
        // int[][][] threeDArray;

        // Memory Allocation
        twoDArray = new int[3][5];
        oneDArray = new int[2];

        /*
         * [
         * [10,20,0,0,0],
         * [0,0,69,0,0],
         * [0,0,0,0,96]
         * ]
         */

        /* To take the first inner array use index */
        oneDArray[0] = 11;
        /* To take the value in first array use internal index */
        // twoDArray[0][0] = 10;
        // twoDArray[0][1] = 100;
        // twoDArray[1][2] = 69;
        // twoDArray[2][4] = 96;
        // System.out.println(twoDArray[0][0]);

        /*
         * Fill the following
         * [
         * [10,20,30,40,50],
         * [80,90,100,110,120],
         * [150,160,170,180,200]
         * ]
         */
        twoDArray[0][0] = 10;
        twoDArray[0][1] = 20;
        twoDArray[0][2] = 30;
        twoDArray[0][3] = 40;
        twoDArray[0][4] = 50;

        twoDArray[1][0] = 80;
        twoDArray[1][1] = 90;
        twoDArray[1][2] = 100;
        twoDArray[1][3] = 110;
        twoDArray[1][4] = 120;

        twoDArray[2][0] = 150;
        twoDArray[2][1] = 160;
        twoDArray[2][2] = 170;
        twoDArray[2][3] = 180;
        twoDArray[2][4] = 200;
        /*
         * Now print the 1st index
         * 80
         * 90
         * 100
         * 110
         * 120
         */
        System.out.println(twoDArray[1][0]);
        System.out.println(twoDArray[1][1]);
        System.out.println(twoDArray[1][2]);
        System.out.println(twoDArray[1][3]);
        System.out.println(twoDArray[1][4]);

        /* Multi Dim array memory allocation and assignment */
        // int[][] arrayTwo = {
        // { 10, 20, 30 },
        // { 20, 30, 40 },
        // { 100, 200, 300 },
        // { 3, 4, 5 }

        // };
        // [4][3]

    }

}
