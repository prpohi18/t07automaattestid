package seitsmes;
import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonideTest{
	@Test
	public void pindala1(){
		assertEquals(48.0, Funktsioonid.hulknurgaPindala(8, 2, 6), 0.01);
	}
}
