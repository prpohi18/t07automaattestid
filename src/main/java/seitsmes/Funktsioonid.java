package seitsmes;
public class Funktsioonid{
public static boolean onAlgarv(int arv){
    for (int i=2; i<arv; i++) {
        if (arv%i == 0) {
            return false;
        }
    }
    return true;  
    }
}