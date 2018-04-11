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
    public static double interestSum(double base, double percentage, double duration){
        double interestOutput = base + (base * percentage * duration);
        return interestOutput;
    }
    public static void main(String[] args){
        double a = interestSum(1200, 0.05, 12);
        System.out.println(a);
    }
}
