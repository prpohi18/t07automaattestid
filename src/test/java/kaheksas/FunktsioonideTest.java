package kaheksas;
import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonideTest{
    @Test
    public void Test1(){
       assertEquals(5, Funktsioonid.pyth(3, 4), 0.01);
    }
    
    @Test
    public void Test2(){
       assertEquals(12.0, Funktsioonid.ymbermoot(3, 4, 5), 0.01);
    }
   
}
