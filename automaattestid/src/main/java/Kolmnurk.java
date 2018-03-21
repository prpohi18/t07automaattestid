public class Kolmnurk {
    
    int a, b, c;
    
    public Kolmnurk(int kylg1, int kylg2, int kylg3) {
        a = kylg1;
        b = kylg2;
        c = kylg3;
    }
    
    public boolean canMake() {
        if (a + b < c) {
            return false;
        }
        if (a + c < b) {
            return false;
        }
        if (b + c < a) {
            return false;
        }
        return true;
    }
    
    public int getSide(int i) {
        if (i == 1) {return a;}
        if (i == 2) {return b;}
        if (i == 3) {return c;}
        return 0;
    }
    
    
    
}
