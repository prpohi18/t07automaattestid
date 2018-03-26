package seitsmes;
import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonideTest{
    @Test
    public void kolmnurknurgad(){
       assertEquals(true, Funktsioonid.kolmnurknurgad(90, 30, 60));
       assertEquals(false, Funktsioonid.kolmnurknurgad(91, 30, 60));
    }
}
