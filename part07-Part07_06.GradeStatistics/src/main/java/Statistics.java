import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeffreyquan
 */
public class Statistics {
    
    private final int passingScore = 50;
    private ArrayList<Integer> scores;
    private ArrayList<Integer> passingScores;
    
    public Statistics() {
        this.scores = new ArrayList<>();
        this.passingScores = new ArrayList<>();
    }
    
    public void addScore(int score) {
        if (score >= 0 && score <= 100) {
            scores.add(score);
            
            if (score >= passingScore) {
                passingScores.add(score);
            }
        }
    }
    
    public int sum(ArrayList<Integer> scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        
        return sum;
    }
    
    public int count(ArrayList<Integer> scores) {
        return scores.size();
    }
    
    public double average() {
        return 1.0 * sum(this.scores) / count(this.scores);
    }
    
    public double averageOfPassing() {
        if (count(this.passingScores) == 0) {
            return -1.0;
        } 
        
        return 1.0 * sum(this.passingScores) / count(this.passingScores);
    }
    
    public double passPercentage() {
        return 100 * 1.0 * count(this.passingScores) / count(this.scores);
    }
    
    public int convertScoreToGrade(int score) {
       int grade;
        if (score < 50) {
            grade = 0;
        } else if (score < 60) {
            grade = 1;
        } else if (score < 70) {
            grade = 2;
        } else if (score < 80) {
            grade = 3;
        } else if (score < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

       return grade;            
    }
    
    public void gradeDistribution() {
        int gradeZero = 0;
        int gradeOne = 0;
        int gradeTwo = 0;
        int gradeThree = 0;
        int gradeFour = 0;
        int gradeFive = 0;
        
        for (int score : scores) {
            int grade = convertScoreToGrade(score);
            
            switch(grade) {
                case 0:
                    gradeZero += 1;
                    break;
                case 1:
                    gradeOne += 1;
                    break;
                case 2: 
                    gradeTwo += 1;
                    break;
                case 3:
                    gradeThree +=1;
                    break;
                case 4:
                    gradeFour +=1;
                    break;
                case 5:
                    gradeFive +=1;
                    break;
            }
        }
        
        System.out.print("5: ");
        printStars(gradeFive);
        
        System.out.println("");
        
        System.out.print("4: ");
        printStars(gradeFour);
        
        System.out.println("");
        
        System.out.print("3: ");
        printStars(gradeThree);
        
        System.out.println("");
        
        System.out.print("2: ");
        printStars(gradeTwo);
        
        System.out.println("");
        
        System.out.print("1: ");
        printStars(gradeOne);
        
        System.out.println("");
        
        System.out.print("0: ");
        printStars(gradeZero);
        
        System.out.println("");
    }
   
    
    public void printStars(int count) {
        int i = 0;
        while (i < count) {
            System.out.print("*");
            i++;
        } 
    }
}
