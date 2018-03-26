package automaattestid;
import org.junit.*;
import static org.junit.Assert.*;

public class ruumalaTest{
	@Test
	public void ruumala(){
		assertEquals(100.00, ruumala.nnpyraRuumala(5.0, 12.0), 0.01); 
	}
}