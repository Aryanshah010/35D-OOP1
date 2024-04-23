import java.util.Scanner;

public class OperatorClass {
    public static void main(String[] args) {
        /* Arithemitic Operators */
        int a = 10, b = 10;
        int sum = a + b; // here the "+" is an arithemitic operators
        System.out.println("Addition for a+b is " + sum);
        System.out.println("Difference for a-b is " + (a - b));
        System.out.println("Multiplication for axb is " + (a * b));
        System.out.println("Division for a/b is " + (a / b));
        System.out.println("Modulo for a and b is " + (a % 2));

        /* Assignment Operators */
        int aNumber1;
        aNumber1 = 10;
        /* or declare and assign */
        int aNumber2 = 20;
        /* assing with another variable */
        int aNumber3 = aNumber1;
        System.out.println("Assignment with +=" + (aNumber1 += 10));
        aNumber2 -= 30; // same as aNumber2 = aNumber2 - 30:
        System.out.println("Assignment with -=" + (aNumber2 -= aNumber3));

        /* Relational Operators */
        int rNumber1 = 10, rNumber2 = 20;
        System.out.println("rNumber1 equals to rNumber2?" + (rNumber1 == rNumber2));
        System.out.println("rNumber1 greater than rNumber2?" + (rNumber1 > rNumber2));
        System.out.println("rNumber1 lessthan or equals to rNumber2?" + (rNumber1 <= rNumber2));
        System.out.println("rNumber1 not equals to rNumber2?" + (rNumber1 != rNumber2));

        /* Logical Operators */
        int lNumber1 = 10, lNumber2 = 12;
        boolean lExpression1 = lNumber1 == lNumber2;
        boolean lExpression2 = lNumber1 <= lNumber2;
        System.out.println("And operator uses &&" + (lExpression1 && lExpression2));
        System.out.println("or operator uses || " + (lExpression1 || lExpression2));
        System.out.println("Not operator uses ! " + !lExpression1);

        /* Unary Operator */
        int uNumber1 = 10;
        uNumber1++; // meaning uNumber1 = uNumber1 + 1;
        System.out.println("Unary for increament is ++ " + uNumber1);
        uNumber1--;
        System.out.println("Unary for decrement is -- " + uNumber1);

        /* Tenary i\operator */
        int tNumber1 = 10, tNumber2 = 10;
        boolean tExpression = tNumber1 == tNumber2;
        /*
         * one line if else , see the given example in if else
         * String output;
         * if(tExpression == true){
         * output ="True statement";
         * }else{
         * output = "False statement";
         * }
         */
        String output = tExpression ? "True statement" : "False Statement";
        /*
         * Here we can assign a string out with one expression
         * if expression is true it will return the value after the "?"
         * if the expression is false it will return the value after the ":"
         */
        int numberOutput = tNumber1 < tNumber2 ? 10 : 20;
        System.out.println(output);
        System.out.println(numberOutput);

        /*
         * Task 1
         * Write a program to print weather a variable is greater or equal to 18
         */
        int r = 22;
        if (r >= 18) {
            System.out.println("Given variable is greater or equal to 18");
        } else {
            System.out.println("Given variable is not greater or equal to 18");
        }

        /*
         * Task 2
         * Write a program to print simple intrest from variables
         * Make 3 variable for amount , time and rate and save the calculation into a
         * variable
         * Formula :
         * Si = amount * time * rate /100;
         */
        int amount = 2000, time = 4, rate = 13;

        int Si = amount * time * rate / 100;
        System.out.println("Simple intrest is " + Si);

        /*
         * Task 3
         * Write a program to print the area and perimeter of rectangle
         * a = l * b
         * p = 2 (l+b)
         */
        int l = 4, br = 5;
        int ar, pr;
        ar = l * br;
        pr = 2 * (l + br);
        System.out.println("area of rectangle is " + ar);
        System.out.println("perimeter of rectangle is " + pr);

        /*
         * Task 4
         * Complete the task 1 using tenary operators
         */
        int tva = 18;
        boolean tvar = tva >= 18;
        String toutput = tvar ? "The variable is greater than or equal to 18." : "The variable is less than 18";
        System.out.println(toutput);

        Scanner tern = new Scanner(System.in);
        System.out.println("Enter a number:");
        int t = tern.nextInt();

        String ooe = t % 2 == 0 ? "even" : "odd";
        System.out.println(ooe);
        tern.close();

    }

}
