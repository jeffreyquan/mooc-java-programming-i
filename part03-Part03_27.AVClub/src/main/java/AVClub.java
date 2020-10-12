
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String string = scanner.nextLine();
            
            if (string.equals("")) {
                break;
            }
            
            String[] words = string.split(" ");
        
            for (String word : words) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        } 
    }
}
