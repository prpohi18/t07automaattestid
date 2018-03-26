package seitsmes;
public class Funktsioonid{
   public static double Pyramiidiruumala(double põhjapindala, double kõrgus ){
		if(põhjapindala < 0 || kõrgus < 0){
			return 0;
		}else{
			return ((1.0/3)*põhjapindala*kõrgus);
		}
	}
}
