import java.util.Scanner;

public class Task2Week2 {
    public static void main(String[] args) {
        /* check whether a person can vote or not */
        Scanner task = new Scanner(System.in);
        // System.out.print("Enter your age: ");
        // int age = task.nextInt();
        // if (age >= 18) {
        // System.out.println("You can vote!");

        // } else {
        // System.out.println("You cannot vote");
        // }

        // /* simple interest */

        // System.out.println("Enter principle,Rate and Time:");
        // float principle = task.nextFloat();
        // float rate = task.nextFloat();
        // float time = task.nextFloat();

        // float simpleInterest = (principle * rate * time) / 100;
        // System.out.println(simpleInterest);

        // /* Area of triangle and volume of cube and cuboid */
        // System.out.println("Enter the base and height of the triangle: ");
        // double base = task.nextDouble();
        // double height = task.nextDouble();
        // double AOT = 0.5 * base * height;
        // System.out.println("The Area of Triangle is: " + AOT);

        // System.out.println();

        // System.out.println("Enter the length,breadth and height of the cuboid: ");
        // float length = task.nextFloat();
        // float breadth = task.nextFloat();
        // float h = task.nextFloat();
        // float cuboid = length * breadth * h;
        // System.out.println("The Area of cuboid is : " + cuboid);
        // System.out.println();
        // System.out.print("Enter the length of the cube: ");
        // float side = task.nextFloat();
        // float cube = side * side * side;
        // System.out.println("The area of cube is : " + cube);

        // /* Sum and product of two numbers and also division of the both answers */

        // System.out.println("Enter any two numbers: ");
        // double num1 = task.nextDouble();
        // double num2 = task.nextDouble();
        // double sum = num1 + num2;
        // double product = num1 * num2;

        // System.out.println("The sum is : " + sum);
        // System.out.println("The product is : " + product);

        // double divide = sum / product;
        // System.out.println(divide);
        // System.out.println();

        /*
         * Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz.
         */
        // System.out.println("Enter your name,age and field of interest:");
        // String name = task.nextLine();
        // int a = task.nextInt();
        // String interest = task.next();
        // System.out.print(
        // "Hey, my name is " + name + "and my roll number is " + a + ". My field of
        // interest are " + interest);

        /* Area and perimeter of square */
        System.out.print("\nEnter length of a square: ");
        double len = task.nextDouble();
        double AOS = len * len;
        double POS = 4 * len;
        System.out.println("The Area of square is " + AOS);
        System.out.println("The perimeter of square is " + POS);

        System.out.println();
        /* Area of rectangle */
        System.out.println("Enter length and breadth of a rectangle: ");
        double leng = task.nextDouble();
        double bre = task.nextDouble();
        double AOR = leng * bre;
        int AreaOfRectangle = (int) AOR;
        System.out.println("The area of the rectangle is" + AreaOfRectangle);

        System.out.println();

        /* Total Marks and Percentage of four subject */

        System.out.println("Enter the marks in four subjects: ");

        int math = task.nextInt();
        int science = task.nextInt();
        int english = task.nextInt();
        int computer = task.nextInt();

        int totalMarks = math + science + english + computer;
        double perc = (totalMarks / 4) * 100;

        if (perc >= 70) {
            System.out.println("First Class");
        } else if (perc > 59) {
            System.out.println("Upper Second Class");
        } else if (perc > 49) {
            System.out.println("Second Class");
        } else if (perc >= 40) {
            System.out.println("Third Class");
        } else {
            System.out.println("Fail");
        }
        task.close();

    }

}
