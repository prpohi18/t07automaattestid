
package ee.tlu.ttaevik.automaattestid;

import org.junit.*;
import static org.junit.Assert.*;

public class Functiontest {
    @Test
	    public void ymbermoot(){
       assertEquals(8, Functions.ymbermoot(2, 2), 0.1);
    }
            
    @Test
	    public void korrutus(){
       assertEquals(26.01, Functions.korrutus(5.1, 5.1), 0.1);
    }
    
    @Test
	    public void tervitus(){
       assertEquals("Tere, Tauri", Functions.tervitus("Tauri"));
    }
            
/*
            -------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running ee.tlu.ttaevik.automaattestid.Functiontest
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.129 sec

Results :

Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
*/         
}
