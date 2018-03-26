package seitsmes;
public class Kolmnurga_pindala{
	public static double korrutis(double alus, double k6rgus){
		return alus*k6rgus;
	}
	
	public static double pindala(double alus, double k6rgus){
		double korrutis=korrutis(alus, k6rgus);
		return korrutis/2;
	}
}