package seitsmes;
public class Funktsioonid{
   public static double pyth(double arv1, double arv2){
        double vastus = Math.round(Math.sqrt(Math.pow(arv1, 2) + Math.pow(arv2, 2)) * 1000D) / 1000D;
    return vastus;
   }

   public static double pindala(double arv1, double arv2){
        double pindala = (arv1 * arv2) / 2;
    return pindala;
    }
}