package automaattestid;
import java.lang.Math;

public class ruumala {
	public static double nnpyraRuumala(double pserv, double korgus){
		double V = 1.0/3.0 * Math.pow(pserv, 2) * korgus;
		return V;
	} 
}