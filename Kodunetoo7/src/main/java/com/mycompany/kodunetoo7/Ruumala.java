
package com.mycompany.kodunetoo7;



public class Ruumala {

    
    public static int a;
    public static int b;
    public static int h;
    public Ruumala(int ka, int kb,int kh) {
        a=ka;
        b=kb;
        h=kh;
    }
    
    public static double Ruumala1(int a,int b, int h){
        return a * b * h;
    }
    

    public static double tulemus() {
        double V = Ruumala1(a,b,h);
                return V;
    }

    
        
}
