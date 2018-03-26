package seitsmes;
import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonideTest{
	public void silindriRuumalaTest1(){
		assertEquals(240, Funktsioonid.silindriRuumala(5, 8), 0.1);
	}
}