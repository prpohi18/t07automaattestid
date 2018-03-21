import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class Test1 {
    
    public Test1() {
    }
    
    Kolmnurk k1;
    Kolmnurk k2;
    @Before
    public void setUp() {
        k1 = new Kolmnurk(5, 7, 10);
        k2 = new Kolmnurk(5, 3, 10);
    }
    
    @Test public void possibleToMake() {
        assertEquals(true, k1.canMake());
        assertEquals(false, k2.canMake());
    }
    
    @Test public void kylg() {
        assertEquals(5, k1.a);
        assertEquals(5, k1.getSide(1));
    }
    
    
}
