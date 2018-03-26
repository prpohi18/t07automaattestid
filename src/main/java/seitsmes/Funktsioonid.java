package seitsmes;
public class Funktsioonid{
    public static double distance(double x1, double y1, double x2, double y2){
        double d = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
        return d;
    }
	public static double xDistance(double x1, double y1, double x2, double y2){
		double c = distance(0.0, 0.0, x1, y1);
		return c;
	}
	public static double yDistance(double x1, double y1, double x2, double y2){
		double c = distance(0.0, 0.0, x2, y2);
		return c;
	}
	
}