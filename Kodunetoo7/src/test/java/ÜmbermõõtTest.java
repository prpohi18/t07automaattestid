       
import com.mycompany.kodunetoo7.Ümbermõõt;

import org.junit.*;
import static org.junit.Assert.*;
public class ÜmbermõõtTest {
    public void Test() {
        
    }
    protected Ümbermõõt r1;
    protected Ümbermõõt r2;
    double tulemus2;
    double tulemus1;
    @Before
    public void setUp(){
        r1 = new Ümbermõõt(3,4);
        tulemus1 = r1.tulemus();
        r2 = new Ümbermõõt(4,5); 
        tulemus2 = r2.tulemus();
    }    
    
    @Test
    public void test1(){
       assertTrue("esimese ümbermõõt ei ole 6",(tulemus1 == 6.0));
        
    }
    @Test
    public void test2(){
        assertTrue("teise ümbermõõt ei ole 10",(tulemus2 == 10.0));
       
    }
    
    @Test
    public void test3(){
        assertTrue("esimene ei ole väiksem või võrdne teisega",(r1.tulemus() <= r2.tulemus()));
    }
}
