
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        System.out.println("Enter numbers:");
        Statistics statTwo = new Statistics();
        Statistics statThree = new Statistics();
        Statistics statFour = new Statistics();
        
        while (true) {
            int number = Integer.valueOf(scanner.next());
            
            if (number == -1) {
                break;
            }
            
            if (number % 2 == 0) {
                statThree.addNumber(number);
            } else {
                statFour.addNumber(number);
            }
            
            statTwo.addNumber(number);
        }
        
        System.out.println("Sum: " + statTwo.sum());
        System.out.println("Sum of even numbers: " + statThree.sum());
        System.out.println("Sum of odd numbers: " + statFour.sum());
    }
}
