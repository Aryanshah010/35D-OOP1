package week4;

public class prefixpostfix {
    public static void main(String[] args) {
        int prefixvalue = 10;
        /* Note the value change in same liine */
        System.out.println(++prefixvalue);
        System.out.println(prefixvalue);
        System.out.println(prefixvalue);
        int postfix = 20;
        /* Note the value doesn't change in same line */
        System.out.println(postfix++);
        System.out.println(postfix);
        System.out.println(postfix);

    }

}
