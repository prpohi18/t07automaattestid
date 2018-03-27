       
import com.mycompany.kodunetoo7.Ruumala;
import org.junit.*;
import static org.junit.Assert.*;

public class RuumalaTest {
    public void Test() {
        
    }
    @Before
    public void setUp(){
        Ruumala r1 = new Ruumala(3,4,5);
        Ruumala r2 = new Ruumala(4,5,6);
       
    }    
    
    @Test
    public void test2(){
        assertEquals(60.0,Ruumala.tulemus(3,4,5));
    }
    
    
}
