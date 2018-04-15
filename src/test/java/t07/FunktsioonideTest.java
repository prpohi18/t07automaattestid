package t07;
import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonideTest{
    @Test
    public void kolmnurktest(){
        assertEquals(6, Funktsioonid.kolmnurk(1, 2, 3));
        assertEquals(7, Funktsioonid.kolmnurk(3, 3, 1));
    }
    public void ristkyliktest(){
        assertEquals(200, Funktsioonid.ristkylik(20, 10));
        assertEquals(200, Funktsioonid.ristkylik(10, 20));
    }
}
