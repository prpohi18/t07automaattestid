package seitsmes;
import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonideTest{
    @Test
    public void korrutuseTest(){
       assertEquals(6, Funktsioonid.korruta(3, 2));
    }
    
    @Test
    public void pindala1(){
       assertEquals(6.0, Funktsioonid.kolmnurgaPindala(3, 4, 5), 0.01);
       assertEquals(24.0, Funktsioonid.kolmnurgaPindala(6, 8, 10), 0.01);
       assertEquals(0.43, Funktsioonid.kolmnurgaPindala(1, 1, 1), 0.01);
    }
    @Test
    public void ymbermooduTest1(){
       assertEquals(12, Funktsioonid.poolYmbermootu(6, 8, 10), 0.01);
    }
	
	@Test
	public void ruuduTest(){
		assertEquals(4, Funktsioonid.ruuduPind(2), 0.01);
		assertEquals(16, Funktsioonid.ruuduPind(4), 0.01);
	}
	
	@Test
	public void rngTest(){
		assertTrue((Funktsioonid.rng(5, 10)) >= 5);
		assertTrue((Funktsioonid.rng(5, 10)) <= 10);
	}
	
	
}
