package week7;

public class FirstOOP {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Raju";
        person1.age = 19;
        person1.gender = 'M';
        System.out.println(person1.name);
        person1.intro();

        // Task create two object of person and call intro func

        Person person2 = new Person();
        Person person3 = new Person();
        person2.name = "Aaditya";
        person2.age = 20;
        person2.gender = 'M';

        person3.name = "Pooza";
        person3.age = 21;
        person3.gender = 'F';

        person2.intro();
        person3.intro();

        Rectangle rec1 = new Rectangle();
        rec1.length = 80;
        rec1.breadth = 90;

        int area = rec1.AOR();
        System.out.println("The area of rectangle is: " + area);

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.name = "Audi";
        car1.colour = "Gray";
        car1.year = 2010;

        car2.name = "BMW";
        car2.colour = "Black";
        car2.year = 2000;

        car3.name = "Lamborgoni";
        car3.colour = "Red";
        car3.year = 2014;

        car1.start();
        car2.start();
        car3.start();

        car1.stop();

        int car2Year = car2.expiry();
        int car3Year = car3.expiry();

        System.out.println("Expiry date of BMW is: " + car2Year);
        System.out.println("Expiry date of Lamborgoni is: " + car3Year);

        Student std1 = new Student();
        std1.firstname = "Aryan";
        std1.lastname = "shah";
        std1.age = 19;
        std1.studentId = 230511;

        String fullname = std1.fullName();
        System.out.println(fullname);
        std1.description();

        System.out.println();

        if (std1.overEighteen() == true) {
            System.out.println("I am over 18 year");

        } else {
            System.out.println("I am not over 18 year");
        }

    }
}

class Rectangle {
    int length;
    int breadth;

    int AOR() {
        return length * breadth;
    }
}

class Person {
    String name;
    int age;
    char gender;

    void intro() {
        System.out.println("Name: " + name + " Age " + age + " Gender: " + gender);
    }

}

class Car {
    String name;
    String colour;
    int year;

    void start() {
        System.out.println(name + " is starting");

    }

    void stop() {
        System.out.println(name + " of " + colour + " colour is stopping");
    }

    int expiry() {
        int y = year + 100;
        return y;
    }
}

class Student {

    String firstname;
    String lastname;
    int studentId;
    int age;

    String fullName() {
        return ("Your full name is : " + firstname + " " + lastname);

    }

    void description() {

        System.out.print("Your name is: " + fullName() + " and your student id is: " + studentId);
    }

    boolean overEighteen() {
        if (age > 18) {
            return true;

        } else {
            return false;
        }
    }

}