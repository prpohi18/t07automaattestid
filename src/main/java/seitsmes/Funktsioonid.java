package seitsmes;
import java.lang.Math;
public class Funktsioonid{
   public static int korruta(int arv1, int arv2){
      return arv1*arv2;
   }
   public static double kolmnurgaPindala(double kylg1, double kylg2, double kylg3) {
	   double circum = poolYmbermootu(kylg1, kylg2, kylg3);
	   return Math.sqrt((circum*(circum-kylg1)*(circum-kylg2)*(circum-kylg3)));
   }
   
   public static double poolYmbermootu(double kylg1, double kylg2, double kylg3) {
	   return (kylg1+kylg2+kylg3)/2;
   }
   
   public static double ruuduPind(double kylg1) {
	   return (kylg1*kylg1);
   }
   
   public static int rng(int min, int max) {
	    int range = (max - min) + 1;     
		return (int)(Math.random() * range) + min;
   }
}
