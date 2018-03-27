package homework7;

import org.junit.Test;
import static org.junit.Assert.*;


public class testsUnit {
    @Test
    public void testUnit() {
        assertEquals(6.66, mainClass.averageNr(4,7,9), 0.1); //third is delta which is a must with floating numbers (basically it's max allowed difference)
        
    }
}
