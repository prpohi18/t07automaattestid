package Testid;
import Automaat.Funktsioonid;
import org.junit.*;
import static org.junit.Assert.*;

public class AutoTest{
    @Test
    public void keskmiseTest(){
       assertEquals(5, Funktsioonid.keskmine(5, 5));
	   assertEquals(7, Funktsioonid.keskmine(7, 7));
    }
	@Test
    public void NelinurkTest(){
       assertEquals(16, Funktsioonid.Nelinurk(4, 4));
	   assertEquals(9, Funktsioonid.Nelinurk(3, 3));
    }
}

/*-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running Testid.AutoTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.101 sec

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0*/