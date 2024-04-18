public class Variable {
    /*
     * Instance variable
     * Will need object to access this variable
     * Not shared between the object(change in one object will not change the vlaue
     * in other object
     */
    int instanceVariable = 200;
    /*
     * Static/Class Variable
     * No neeed of object,can be called from class
     * Shared between the objects
     */
    static int staticVariable = 20;

    public static void main(String[] args) {
        /* primative data type */
        byte byteValue;
        byteValue = 100;

        System.out.println(byteValue);

        short shortValue = 200;
        System.out.println(shortValue);

        int intValue1, intValue2;
        intValue1 = 10000;
        intValue2 = 2000;
        System.out.println(intValue1);
        System.out.println(intValue2);

        long longVal1 = -8000, longVal2 = 39999;
        System.out.println(longVal1);
        System.out.println(longVal2);
        float floatVal = 80.91f;
        System.out.println(floatVal);
        double doubleVal = 1000.31231d; // d is optional
        System.out.println(doubleVal);

        char charValue = 'a';
        System.out.println(charValue);
        boolean boolValue = false;
        System.out.println(boolValue);

        // byte byteValue=100; //we cannot redeclare the variable
        // byteValue=200; //intead use reassignment
        // boolean boolValue2='false'; //cannot use different type
        // byte byteValue2=1000000; //cannot exceed min and max

        /* Non primitive data type */
        String stringValue = "Yo mero string ho";
        System.out.println(stringValue);
        /* Using class */
        String stringValue2 = new String("Class biitra ko string ho");
        System.out.println(stringValue2);
        /* Object, for this we can use the same public class made */

        Variable varObject = new Variable();

        /* Use object from above to access instance variable */
        System.out.println(varObject.instanceVariable);
        /* Use class to use static variable */
        System.out.println(Variable.staticVariable);

        /* Type casting */
        /* Automatically cast from low datatype to high datatype */
        int intValueType = 200;
        double intValueConvertedToDouble = intValueType;
        System.out.println(intValueConvertedToDouble);

        /* Explicit Casting */
        double doubleValType = 180.232423d;
        int doubleValueConvertedInInt = (int) doubleValType;
        System.out.println(doubleValueConvertedInInt);
        /* Manually specify data type for eg. (int) */

        /*
         * Task
         * Make one double variable called doubleVar1=1000.12
         * Explicitly cast the variable into float, floatVar3
         * Explicitly cast the floatVar3 into int, intVar3
         * Make a String variable with "The integer is"
         * Print the String variable and print the int varable in another
         */
        double doubleVar1 = 1000.12;
        float floatVar3 = (float) doubleVar1;
        // System.out.println(floatVar3);
        int intVar3 = (int) floatVar3;
        String str = "The integer is";
        System.out.println(str);
        System.out.println(intVar3);

    }

}
