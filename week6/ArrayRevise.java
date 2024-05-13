package week6;

public class ArrayRevise {

    public static int arrayFinder(String[] str, String str1) {

        for (int index = 0; index < str.length - 1; index++) {
            if (str[index] == str1) {
                return index;

            }

        }
        return -1;
    }

    public static int[] addToArray(int[] values, int value) {
        int[] add = new int[values.length];
        for (int index = 0; index < values.length; index++) {
            add[index] = values[index] + value;
        }
        return add;
    }

    public static void main(String[] args) {

        int[] arrayTeroTupi = { 69, 96, 120, 12, 123 };
        System.out.println(arrayTeroTupi[3]);

        /* Looping an array */

        for (int index = 0; index < arrayTeroTupi.length - 1; index++) {
            System.out.println("index " + index + " value " + arrayTeroTupi[index]);
        }
        String[] names = { "Ram", "John", "Shyam", "doe" };

        String finder = "Shyam";
        for (int index = 0; index < names.length; index++) {
            if (names[index] == finder) {
                System.out.println("Index found:" + index);
                break;
            }
        }

        /*
         * Make a function named arrayFinder
         * that takes array of String and String Finder
         * return the index if found else return -1
         */

        String[] str = { "aryan", "raju", "kaju", "aaditya" };
        String str1 = "raju";
        System.out.println(arrayFinder(str, str1));

        /*
         * MAke a function addToArray
         * that takes array of int , int value
         * loop array of int and add the value to each elment
         * returns array if int of new value
         * Eg, [1,2,3,4],10
         * Returns [11,12, 13,14]
         */

        int[] values = { 1, 2, 3, 4 };
        int value = 10;

        int[] arraySum = addToArray(values, value);
        for (int i = 0; i < arraySum.length; i++) {

            System.out.println(arraySum[i]);
        }

    }
}
