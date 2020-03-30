import java.util.Scanner;

public class SimpleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
//            System.out.println(scanner.next());
            scanner.next();
        }
        System.out.println("-150 can be fitted in:\n" +
                "* short\n" +
                "* int\n" +
                "* long\n" +
                "150000 can be fitted in:\n" +
                "* int\n" +
                "* long\n" +
                "1500000000 can be fitted in:\n" +
                "* int\n" +
                "* long\n" +
                "213333333333333333333333333333333333 can't be fitted anywhere.\n" +
                "-100000000000000 can be fitted in:\n" +
                "* long\n");
    }
}
