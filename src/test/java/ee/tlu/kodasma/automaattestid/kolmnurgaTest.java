package ee.tlu.kodasma.automaattestid;

import org.junit.*;
import static org.junit.Assert.*;

public class kolmnurgaTest {   
    @Test
    public void test1() {
        assertEquals(3, 3);
    }
    
    @Test
    public void test2() {
        assertEquals(6, Kolmnurk.pindala(3, 4), 0);
    }
}
