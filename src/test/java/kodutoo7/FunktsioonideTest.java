package kodutoo7;
import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonideTest{
    @Test
    public void Test1(){
       assertEquals(625, Funktsioonid.umbermoot(5), 0.01);
    }
    
    @Test
    public void Test2(){
       assertEquals(15, Funktsioonid.pindala1(3, 5), 0.01);
    }
	
	@Test
    public void Test3(){
       assertEquals(24, Funktsioonid.pindala2(8, 6), 0.01);
    }
   
}