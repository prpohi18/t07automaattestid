package seitsmes;
public class Funktsioonid{
   
	public static double kmiarvutus(double mass, double pikkus){
		return Math.round((mass/(pikkus*pikkus))* 100d) / 100d;
   }
}
