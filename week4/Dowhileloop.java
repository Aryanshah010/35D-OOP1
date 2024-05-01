package week4;

public class Dowhileloop {
    public static void main(String[] args) {
        int num1 = 0;
        while (num1 < 0) {
            System.out.println("while checks condition first");
        }
        /* Do while checks conditon after first iteration */
        do {
            System.out.println("Do while checks conditoin after");

        } while (num1 < 0);

        /* This means do while loop runs at least once */

    }

}
