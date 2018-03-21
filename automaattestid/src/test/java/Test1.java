import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class Test1 {
    
    public Test1() {
    }
    
    Kolmnurk k;
    @Before
    public void setUp() {
        k = new Kolmnurk(5, 7, 10);
    }
    
    @Test public void kasSaab() {
        assertEquals(5, k.a);
        assertEquals(5, k.getSide(1));
    }
    
    
}
