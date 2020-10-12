
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        
        int factorial = 1;
        int count = 1;
        
        while (count <= number) {
            factorial *= count;
            count++;
        }
        
        System.out.println("Factorial: " + factorial);
    }
}
