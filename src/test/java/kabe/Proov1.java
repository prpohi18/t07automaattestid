package kabe;

public class Proov1 {
    public static void main(String[] args){
        KabeLaud laud=new DaisyKabeLaud();
        laud.algseis();
        System.out.println(laud);
        laud.paiguta("B4", 'v');
        System.out.println(laud);
    }
}
