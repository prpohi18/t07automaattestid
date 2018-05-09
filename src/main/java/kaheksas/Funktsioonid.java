package kaheksas;
public class Funktsioonid{
   public static double pyth(int a, int b){
      return Math.sqrt((a*a) + (b*b));
   }
   
   public static double ymbermoot(int a, int b, double c){
      c = pyth(3, 4);
	  return a+b+c;
   }
   
   public static double pindala(int a, int b){
	  return ((a*b)/2);
   }
}