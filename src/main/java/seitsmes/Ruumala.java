package seitsmes;
public class Ruumala{
   public static double KeraRuumala(double r){
    return 4/3*3.14159265359*Math.pow(r, 3);
   }
   public static double SilindriRuumala(double r, double h){
       return 3.14159265359*Math.pow(r, 2)*h;
   }

}
