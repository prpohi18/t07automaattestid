/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erike.autotest;

/**
 *
 * @author erike
 */
public class interestCalculator {
    public static double interest(double base, double percentage, double duration){
        double interestOutput = base * percentage * duration;
        return interestOutput;
    }
    public static double interestSum(double base, double percentage, double duration){
        double interestOutput = base + (base * percentage * duration);
        return interestOutput;
    }
    public static void main(String[] args){
        double base = 1200;
        double percentage = 0.05;
        double duration = 12;
        double a = interest(base, percentage, duration);
        double b = interestSum(base, percentage, duration);
        System.out.println("Intress: "  + a);
        System.out.println("Summa: " + b);
    }
}
