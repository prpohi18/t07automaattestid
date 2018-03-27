       
import com.mycompany.kodunetoo7.Ruumala;

import org.junit.*;
import static org.junit.Assert.*;

public class RuumalaTest {
    public void Test() {
        
    }
    protected Ruumala r1;
    protected Ruumala r2;
    @Before
    public void setUp(){
        r1 = new Ruumala(3,4,5);
        r2 = new Ruumala(4,5,6); 
    }    
    
    @Test
    public void test1(){
       assertTrue("esimese ruumala on 60",(r1.tulemus() == 60.0));
        
    }
    @Test
    public void test2(){
        assertTrue("teise ruumala on 120",(r2.tulemus() == 120.0));
       
    }
    
    @Test
    public void test3(){
        assertTrue("esimene väiksem või võrdne teisega",(r1.tulemus() <= r2.tulemus()));
    }
    
}
