
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Last number?");
        int lastNum = Integer.valueOf(scanner.nextLine());
        int count = 1;
        int sum = 0;
        
        while (count <= lastNum) {
            sum += count;
            count++;
        }
        
        System.out.println("The sum is " + sum);
    }
}
