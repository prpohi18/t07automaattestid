package ruutvorrand;
public class Ruut{
    //Sisesta [a b c] (ax2 + bx + c = 0)
    public static double leiaX(double a, double b, double c){
        double D, x1;
        D=0;
        x1=0;
    	D = b*b - 4*a*c;
    	x1 = (-b + Math.sqrt(D)) / (2*a);
		return x1;
    }
	public static double leiaY(double a, double b, double c){
        double D, x2;
        D=0;
        x2=0;
    	D = b*b - 4*a*c;
    	x2 = (-b - Math.sqrt(D)) / (2*a);
		return x2;
    }

    public static double determinant(double a, double b, double c){
		double D;
        D=0;
    	D = b*b - 4*a*c;
		return D;
    }
}