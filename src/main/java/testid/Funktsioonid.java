package testid;
public class Funktsioonid{
   public static int lahuta(int arv1, int arv2){
      return arv1-arv2;
   }
	
	public static int ristkylikuymbermoot(int pikkus, int laius){
		int ymbermoot;
		ymbermoot = (pikkus+laius)*2;
		return ymbermoot;
	}
	
	public static int ristkylikupindala(int a, int b){
		int pindala;
		pindala = a*b;
		return pindala;
	}	
}