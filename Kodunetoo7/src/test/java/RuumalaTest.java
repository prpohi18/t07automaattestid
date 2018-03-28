       
import com.mycompany.kodunetoo7.Ruumala;

import org.junit.*;
import static org.junit.Assert.*;

public class RuumalaTest {
    public void Test() {
        
    }
    protected Ruumala r1;
    protected Ruumala r2;
    double tulemus2;
    double tulemus1;
    @Before
    public void setUp(){
        r1 = new Ruumala(3,4,5);
        tulemus1 = r1.tulemus();
        r2 = new Ruumala(4,5,6); 
        tulemus2 = r2.tulemus();
    }    
    
    @Test
    public void test1(){
       assertTrue("esimese ruumala ei ole 60",(tulemus1 == 60.0));
        
    }
    @Test
    public void test2(){
        assertTrue("teise ruumala ei ole 120",(tulemus2 == 120.0));
       
    }
    
    @Test
    public void test3(){
        assertTrue("esimene ei ole väiksem või võrdne teisega",(r1.tulemus() <= r2.tulemus()));
    }
    
}
