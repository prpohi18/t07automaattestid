package seitsmes;
import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonTest {
    @Test
    public void distanceTest(){
        assertEquals(4.0, Funktsioonid.distance(4.0, 3.0, 8.0, 3.0), 0.01);
    }
	
	@Test
    public void areaTest(){
        assertEquals(379.94, Funktsioonid.area(11), 0.01);
    }
	
	@Test
    public void circumferenceTest(){
        assertEquals(69.08, Funktsioonid.circumference(11), 0.01);
    }
	
}