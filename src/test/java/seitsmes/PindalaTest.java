package seitsmes;
import org.junit.*;
import static org.junit.Assert.*; 

public class PindalaTest{
    @Test
    public void korrutiseTest(){
       assertEquals(20, Kolmnurga_pindala.korrutis(4, 5), 0.1);
    }
	
	@Test
	public void pindalaTest(){
		assertEquals(10.0, Kolmnurga_pindala.pindala(4, 5), 0.1);
	}
}
