/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeffreyquan
 */
public class Game {
    
    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;
    
    public Game(String hometeam, String visitingteam, int homepoints, int visitingpoints) {
        this.homeTeam = hometeam;
        this.visitingTeam = visitingteam;
        this.homePoints = homepoints;
        this.visitingPoints = visitingpoints;
    }
    
    public String getHomeTeam() {
        return homeTeam;
    }
    
    public String getVisitingTeam() {
        return visitingTeam;
    }
    
    public boolean winnerIs(String team) {
        if (team.equals(homeTeam) && homePoints > visitingPoints) {
            return true;
        }
        
        if (team.equals(visitingTeam) && visitingPoints > homePoints) {
            return true;
        }
        
        return false;
    }
}
