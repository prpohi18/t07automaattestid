package kodutoo;
public class Funktsioonid{
    public static double pindala(int a, int b, int c){
        return 2*(a*b + b*c + a*c);
    }

    public static double ruumala(int a, int b, int c){
        return a*b*c;
    }

    public static double diameeter(int a, int b, int c){
        double d = Math.sqrt(ruut(a) + ruut(b) + ruut(c));
        return d;
    }
    public static double ruut(int x){
      System.out.println(x*x);
        return x*x;
    }
}
