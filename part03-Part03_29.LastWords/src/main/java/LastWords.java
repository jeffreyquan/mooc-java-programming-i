
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.nextLine();
            
            if (string.equals("")) {
                break;
            }
            
            String[] parts = string.split(" ");
            System.out.println(parts[parts.length - 1]);
        }
    }
}
