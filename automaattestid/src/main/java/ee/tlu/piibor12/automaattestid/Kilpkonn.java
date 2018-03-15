package ee.tlu.piibor12.automaattestid;
public class Kilpkonn {
    int x;
    int y;
    int suund=1;
    public Kilpkonn(int kx, int ky) {
        x=kx;
        y=ky;
    }

    int kysiX() {
        return x;
    }
    int kysiY() {
        return y;
    }

    Object kysiSuund() {
        return suund;
    }

    void keeraParemale() {
        suund++;
    }
    
}