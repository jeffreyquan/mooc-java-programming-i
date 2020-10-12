
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
           
            String firstName = scanner.nextLine();
            
            if (firstName.isEmpty()) {
                break;
            }
            
            String lastName = scanner.nextLine();
            
            if (lastName.isEmpty()) {
                break;
            }
            
            String idNumber = scanner.nextLine();
            
            if (idNumber.isEmpty()) {
                break;
            }
            
            infoCollection.add(new PersonalInformation(firstName, lastName, idNumber));
        }
        
        for (PersonalInformation info: infoCollection) {
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
    }
}
