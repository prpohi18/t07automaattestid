package seitsmes;
public class Ruumala{
   public static int KeraRuumala(int r){
    int V= (int) (4/3*3.14159265359*Math.pow(r, 3));
    return V;
   }
   public static int SilindriRuumala(int r, int h){
    int V = (int)(3.14159265359*Math.pow(r, 2)*h);
    return V;
   }

}
