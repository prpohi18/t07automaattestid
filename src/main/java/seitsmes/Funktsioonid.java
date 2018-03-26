package seitsmes;
public class Funktsioonid{
   public static int korruta(int arv1, int arv2){
       return arv1*arv2;
    }
   public static double kolmnurgaPindala(double kylg1, double kylg2, double kylg3){
       double p = poolYmbermootu(kylg1, kylg2, kylg3);
       return Math.sqrt(p*(p - kylg1)*(p - kylg2)*(p - kylg3));
    }
   /*public static double kolmnurgaPindala(double kylg1, double kylg2, double kylg3){
       return 24;
    }*/
   public static double poolYmbermootu(double kylg1, double kylg2, double kylg3){
       return (kylg1+kylg2+kylg3)/2.0;
    }
    public static double ruumala(double pikkus, double korgus, double laius){
        if(pikkus < 0 || korgus < 0 || laius < 0){
            return 0;
        }else{
            return pikkus*korgus*laius;
        }
    }
}
