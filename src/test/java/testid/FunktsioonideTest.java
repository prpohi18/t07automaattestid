package testid;
import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonideTest{
    @Test
    public void lahutamiseTest(){
       assertEquals(1, Funktsioonid.lahuta(3, 2));
	   assertEquals(9, Funktsioonid.lahuta(10, 1));
    }
	
	@Test
    public void ymbermooduTest(){
       assertEquals(14, Funktsioonid.ristkylikuymbermoot(4, 3));
	   assertEquals(16, Funktsioonid.ristkylikuymbermoot(1, 7));
    }
	
	@Test
    public void pindalaTest(){
       assertEquals(20, Funktsioonid.ristkylikupindala(4, 5));
	   assertEquals(6, Funktsioonid.ristkylikupindala(2, 3));
	   assertEquals(30, Funktsioonid.ristkylikupindala(6, 5));
    }
}  
