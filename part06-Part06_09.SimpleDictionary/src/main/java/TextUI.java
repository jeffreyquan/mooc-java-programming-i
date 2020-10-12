
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeffreyquan
 */
public class TextUI {
    
    private SimpleDictionary simpleDictionary;
    private Scanner scanner;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start() {
 
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
 
            processCommand(input);
            System.out.println("");
        }
 
        System.out.println("Bye bye!");
    }
 
    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("search")) {
            search();
        } else {
            System.out.println("Unknown command");
        }
    }
 
    public void add() {
        System.out.print("Word: ");
        String word = this.scanner.nextLine();
        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();
        this.simpleDictionary.add(word, translation);
    }
 
    public void search() {
        System.out.print("To be translated: ");
        String word = this.scanner.nextLine();
 
        if (this.simpleDictionary.translate(word) == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + this.simpleDictionary.translate(word));
        }
    }
    
}
