
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number? ");
        int count = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Last number? ");
        int lastNum = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        
        while (count <= lastNum) {
            sum += count;
            count++;
        }
        
        System.out.println("The sum is: " + sum);
    }
}
