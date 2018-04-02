package kaheksa;
public class Arvutused implements ArvutusedLiides{
    @Override
    public double aste(double alus, double astendaja){
        return Math.pow(alus, astendaja);
    }

    @Override
    public int korrutis(int aste1, int aste2) {
        return aste1*aste2;
    }
}