package seitsmes;
import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonideTest{
	
	@Test
	    public void kmitest(){
       assertEquals(27.75, Funktsioonid.kmiarvutus(95, 1.85), 0.1);
    }	
}

/*
Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.239s
[INFO] Finished at: Mon Mar 26 08:40:35 EEST 2018
[INFO] Final Memory: 17M/243M
[INFO] ------------------------------------------------------------------------
[tammkert@greeny t07automaattestid]$
*/
