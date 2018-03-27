package kabe;
public interface KabeLaud{
   public int veergKoodiks(char veerg); //A->0, H->7
   public int ridaKoodiks(char rida); //8->0, 1->7
   public void paiguta(String asukoht, char sisu);
   public char kysi(String asukoht);
   public void algseis();
   public int ristkpindala(int a1, int a2);
}
