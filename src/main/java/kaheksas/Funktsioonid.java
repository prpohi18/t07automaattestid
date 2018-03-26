package kaheksas;
public class Funktsioonid{
   public static double teoreem(int arv1, int arv2){
      return Math.sqrt((arv1*arv1) + (arv2*arv2));
   }
   
   public static double ym(int arv1, int arv2, double c){
      c = teoreem(5, 12);
	  return arv1+arv2+c;
   }
}
