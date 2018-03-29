/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeus
 */
public class aku {
    protected int aku;

    public aku(int aku){
        this.aku = aku;
    }

    public boolean checkNormal(){
        if(aku > 100 || aku < 0) {
                return false;
        } else {
                return true;
        }
    }
	
    public int getAku() {
        return aku;
    }
	
    public void charge(int hours) {
        int tempAku = aku;
        tempAku += hours*25;
        if(tempAku > 100) {
                aku = 100;
        } else {
                aku = tempAku;
        }
    }
	
    public void use(int hours) {
        int tempAku = aku;
        tempAku -= hours*25;
        if(tempAku < 0) {
                aku = 0;
        } else {
                aku = tempAku;
        }
    }
	
    public boolean checkFull(){
        if (aku == 100) {
                return  true;
        } else {
                return false;
        }
    }
	
    public boolean checkEmpty(){
        if (aku == 0) {
            return  true;
        } else {
            return false;
        }
    }
}