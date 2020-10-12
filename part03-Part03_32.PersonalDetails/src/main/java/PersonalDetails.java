
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longestName = "";
        int lengthOfLongestName = -1;
        int sum = 0;
        int count = 0;
        
        while (true) {
            String string = scanner.nextLine();
            
            if (string.equals("")) {
                break;
            }
            
            String[] parts = string.split(",");
            sum += Integer.valueOf(parts[1]);
            count++;
            int lengthOfName = parts[0].length();
            if (lengthOfName > lengthOfLongestName) {
                lengthOfLongestName = lengthOfName;
                longestName = parts[0];
            }
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0 * sum / count);

    }
}
