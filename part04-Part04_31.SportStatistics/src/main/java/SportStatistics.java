
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scanner.nextLine();
        
        System.out.println("Team:");
        String team = scanner.nextLine();
        
        ArrayList<Game> games = readFromFile(file);
        
        ArrayList<Game> gamesOfATeam = new ArrayList<>();
        
        for (Game game: games) {
            if (team.equals(game.getHomeTeam()) || team.equals(game.getVisitingTeam())) {
                gamesOfATeam.add(game);
            }
        }
        
        int numberOfGamesPlayed = gamesOfATeam.size();
            
        System.out.println("Games: " + numberOfGamesPlayed);
        
        int wins = 0;
        for (Game game: gamesOfATeam) {
            if (game.winnerIs(team)) {
                wins++;
            }
        }
        
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (numberOfGamesPlayed - wins));
        
    }
    
    public static ArrayList<Game> readFromFile(String file) {
        
        ArrayList<Game> games = new ArrayList<>();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                
                if (line.isEmpty()) {
                    continue;
                }
                
                String[] parts = line.split(",");
                
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);
                
                games.add(new Game(homeTeam, visitingTeam, homePoints, visitingPoints));
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + file);
        }
        
        return games;
    }

}
