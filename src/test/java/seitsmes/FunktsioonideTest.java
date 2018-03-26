package seitsmes;
import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonideTest{
    @Test
    public void algarvuTest(){
       assertEquals(true, Funktsioonid.onAlgarv(5));
       assertEquals(false, Funktsioonid.onAlgarv(6));
       assertEquals(true, Funktsioonid.onAlgarv(7));
       assertEquals(false, Funktsioonid.onAlgarv(10));
       assertEquals(true, Funktsioonid.onAlgarv(11));
    }
}