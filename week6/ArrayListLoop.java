package week6;

import java.util.ArrayList;

public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Aayam");
        names.add("Adhar");
        names.add("Yausan");
        names.add("Niraj");
        names.add("Rijan");

        /* To Loop, find the length/element count, .size() */
        int namesLength = names.size();
        /* Loop same as array */
        for (int index = 0; index < namesLength; index++) {
            // Get each element with .get(index)

            String singleName = names.get(index);
            System.out.println("Index: " + index + " Value " + singleName);
        }

        /* Using foreach in java, iterate with element/actual value */
        for (String element : names) {
            System.out.println(element);
        }

        /*
         * Task
         * Make an ArrayList animals
         * ["Cat","Tiger","Dog","Elephant"]
         * Make two more ArrayList called, wildAnimal, domesticAnimal
         * Loop the animals
         * If the element/value is "Cat", "Dog" add in domesticAnimal
         * If the element/value is "Tiger","Elephant" add in wildAnimal
         * Print domesticAnimal ,wildAnimal
         */

        ArrayList<String> animals = new ArrayList<>();
        ArrayList<String> wildAnimal = new ArrayList<>();
        ArrayList<String> domesticAnimal = new ArrayList<>();

        animals.add("Cat");
        animals.add("Tiger");
        animals.add("Dog");
        animals.add("Elephant");

        int animalsLen = animals.size();
        for (int index = 0; index < animalsLen; index++) {
            String single = animals.get(index);
            if (single == "Cat" || single == "Dog") {
                domesticAnimal.add(single);
            } else {
                wildAnimal.add(single);
            }

        }
        System.out.println(domesticAnimal);
        System.out.println(wildAnimal);

        // using each

        // for (String elem : animals) {
        // if (elem == "Cat" || elem == "Dog") {
        // domesticAnimal.add(elem);
        // } else {
        // wildAnimal.add(elem);
        // }

        // }
        // System.out.println(domesticAnimal);
        // System.out.println(wildAnimal);

    }

}
