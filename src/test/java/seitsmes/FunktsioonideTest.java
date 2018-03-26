package seitsmes;
import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonideTest{
    @Test
    public void keskmiseTest(){
       assertEquals(5, Funktsioonid.keskmine(3, 7));
	   assertEquals(7, Funktsioonid.keskmine(4, 10));
    }
	@Test
    public void korrutusTest(){
       assertEquals(18, Funktsioonid.korrutus(3, 6));
	   assertEquals(15, Funktsioonid.korrutus(3, 5));
    }
}
