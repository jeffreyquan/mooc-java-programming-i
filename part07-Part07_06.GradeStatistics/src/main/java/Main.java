import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        GradeStatistics distribution = new GradeStatistics();
 
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
 
            distribution.addPointTotal(number);
        }
 
        distribution.print();
    }
}

//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        // Write your program here -- consider breaking the program into 
//        // multiple classes.
//        
//        System.out.println("Enter point totals, -1 stops:");
//        Statistics statistics = new Statistics();
//        
//        while (true) {
//            int number = Integer.valueOf(scanner.nextLine());
//            if (number == -1) {
//                break;
//            }
//            
//            if (number >= 0 && number <= 100) {
//                statistics.addScore(number);
//            }
//            
//        }
//        
//        System.out.println("Point average (all): " + statistics.average());
//        
//        double averageOfPassing = statistics.averageOfPassing();
//        if (averageOfPassing == -1.0) {
//            System.out.println("Point average (passing): -");
//        } else {
//            System.out.println("Point average (passing): " + averageOfPassing);
//        }
//        
//        System.out.println("Pass percentage: " + statistics.passPercentage());
//        System.out.println("Grade distribution:");
//        statistics.gradeDistribution();
//    }
//}
