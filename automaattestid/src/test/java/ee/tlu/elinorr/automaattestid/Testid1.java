package ee.tlu.elinorr.automaattestid;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class Testid1 {
    
    public Testid1() {
    }
    @Test
    public void esimene(){
        assertEquals(5, 3+2);
    }
    Kilpkonn k;
    @Before
    public void setUp(){
        k=new Kilpkonn(3, 5);
        //System.out.println("Loogi kilpkonn");
    }
    
    @Test public void loomine(){
        assertEquals(3, k.kysiX());
        assertEquals(5, k.kysiY());
        assertEquals(1, k.kysiSuund());
    }
    @Test public void keeramine(){
        assertEquals(1, k.kysiSuund());
        k.keeraParemale();
        assertEquals(2, k.kysiSuund());
        k.keeraParemale();
        assertEquals(3, k.kysiSuund());
        k.keeraParemale();
        assertEquals(4, k.kysiSuund());
        k.keeraParemale();
        assertEquals(1, k.kysiSuund());
    }    
    void kontrolliAsend(int x, int y, int suund){
        assertEquals(x, k.kysiX());
        assertEquals(y, k.kysiY());
        assertEquals(suund, k.kysiSuund());
    }
    @Test public void liikumine(){
        kontrolliAsend(3, 5, 1);
        k.edasi();
        kontrolliAsend(4, 5, 1);
        k.keeraParemale();
        k.edasi();
        kontrolliAsend(4, 6, 2);
        k.keeraParemale();
        k.edasi();
        kontrolliAsend(3, 6, 3);
        k.keeraParemale();
        k.edasi();
        kontrolliAsend(3, 5, 4);
        k.keeraParemale();
        k.edasi();
        kontrolliAsend(4, 5, 1);
    }
    @Test public void kuvamine(){
        assertThat(k.toString(), is(">"));
        k.keeraParemale();
        assertThat(k.toString(), is("v"));
        k.keeraParemale();
        assertThat(k.toString(), is("<"));
        k.keeraParemale();
        assertThat(k.toString(), is("^"));
        k.keeraParemale();
        assertEquals(">", k.toString());
    }
}
