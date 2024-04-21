public class javaArgument {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Not enough args");
            return;
        }
        System.out.println("Frist arg is " + args[0]);
        System.out.println("Seconf arg is " + args[1]);
    }

}
