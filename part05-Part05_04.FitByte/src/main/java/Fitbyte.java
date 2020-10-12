/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeffreyquan
 */
public class Fitbyte {
    
    private int age;
    private int restingHeartRate;
    
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        return (this.maximumHeartRate() - restingHeartRate) * percentageOfMaximum + restingHeartRate;
    }
    
    private double maximumHeartRate() {
        return 206.3 - (0.711 * age);
    }
}
