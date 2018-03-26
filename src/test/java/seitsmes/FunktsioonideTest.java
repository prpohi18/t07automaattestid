package seitsmes;
import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonideTest{
	
	@Test
	    public void kmitest(){
       assertEquals(27.75, Funktsioonid.kmiarvutus(95, 1.85), 0.1);
    }	
}
