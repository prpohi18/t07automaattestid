package t07automaattestid;
import org.junit.*;
import static org.junit.Assert.*;
public class HulknurkTest{
	@Test
	public void pindalatest(){
		assertEquals(60, KorraparaneHulknurk.hulknurk(6, 4, 5));
		assertEquals(3, KorraparaneHulknurk.hulknurk(1, 2, 3));
	}
}