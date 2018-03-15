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
        if(suund>4){
            suund = 1;
        }
    }

    void edasi(){ 
        if(suund==1){
            x++;       
        }else if(suund==2){
            y++;
        }else if(suund==3){
            x--;
        } else if(suund==4){
            y--;
        }
    }

    @Override
    public String toString() {
        if (suund==1){
            return ">";
        }
        else if(suund==2){
            return "V";
        }
        else if(suund==3){
            return "<";   
        }
        else {
            return "^";
        }
               
    }
    
}