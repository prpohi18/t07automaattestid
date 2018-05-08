package rakendusTest;

public class Rakendus {
       public static double korrutamine(double a, double b){
        double vastus;
        vastus = a * b;
        return vastus;
     }
     
     
    public static double jagamine(double a, double b){
        double vastus;
        vastus = a / b;
        return vastus;
    }
    public static void main(String[] args) {
        double a = 6;
        double b = 2;
        System.out.println(korrutamine(a,b));
        System.out.println(jagamine(a,b));
    }
}