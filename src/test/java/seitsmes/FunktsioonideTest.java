package seitsmes;
import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonideTest{
	@Test
	public void ymbermoot(){
		assertEquals(15.0, Funktsioonid.hulknurgaYmbermoot(5, 3), 0.01);
		assertEquals(80.0, Funktsioonid.hulknurgaYmbermoot(8, 10), 0.01);
		assertEquals(24.0, Funktsioonid.hulknurgaYmbermoot(4, 6), 0.01);
	}
    
    @Test
    public void pindala1(){
       assertEquals(22.5, Funktsioonid.hulknurgaPindala(3, 5, 3), 0.01);
	   assertEquals(200.0, Funktsioonid.hulknurgaPindala(5, 8, 10), 0.01);
	   assertEquals(24.0, Funktsioonid.hulknurgaPindala(2, 4, 6), 0.01);
    }
}