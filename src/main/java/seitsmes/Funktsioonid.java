package seitsmes;
public class Funktsioonid{

   public static boolean kolmnurknurgad(int nurk1, int nurk2, int nurk3){
    int vastus;
    vastus = nurk1 + nurk2 + nurk3;
    if(vastus == 180){
        return true;
    }
    return false;
   }
}
