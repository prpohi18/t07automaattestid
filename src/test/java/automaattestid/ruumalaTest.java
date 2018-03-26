package automaattestid;
import org.junit.*;
import static org.junit.Assert.*;

public class ruumalaTest{
	@Test
	public void ruumala(){
		assertEquals(100.00, ruumala.nnpyraRuumala(5.0, 12.0), 0.01);
		assertEquals(328.56, ruumala.nnpyraRuumala(7.4, 18.0), 0.01);
		assertEquals(211.96, ruumala.nnpyraRuumala(9.6, 6.9), 0.01);		
	}
}