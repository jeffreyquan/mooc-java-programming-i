
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String name = scanner.nextLine();
        System.out.println("Give an integer:");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double floatingNum = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string " + name);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + floatingNum);
        System.out.println("You gave the boolean " + trueOrFalse);
    }
}
