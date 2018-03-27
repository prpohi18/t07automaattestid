       
import com.mycompany.kodunetoo7.Ruumala;
import org.junit.*;
import static org.junit.Assert.*;

public class RuumalaTest {
    public void Test() {
        
    }
    
    @Test
    public void test1() {
        assertEquals(2,3,4);
    }
    @Test
    public void test2(){
        assertEquals(30.0,Ruumala.tulemus(3,4,5));
    }
    
}
