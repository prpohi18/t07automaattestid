package seitsmes;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid1{
	@Test
    public void test1(){
       assertEquals(16, Arvutused.umbermoot(5, 3));
	   assertEquals(22, Arvutused.umbermoot(4, 7));
    }
	@Test
	public void test2(){
		assertEquals(12, Arvutused.pindala(4, 3));
		assertEquals(16, Arvutused.pindala(8, 2));
	}
}

