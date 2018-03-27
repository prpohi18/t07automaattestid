package homework7;

import org.junit.Test;
import static org.junit.Assert.*;


public class testsUnit {
    @Test
    public void testUnit() {
        assertEquals(6.66, mainClass.averageNR(4,7,9), 0.1);
        
    }
}
