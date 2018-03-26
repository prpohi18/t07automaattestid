package seitsmes;
import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonideTest{
    @Test
    public void pythTest(){
       assertEquals(6.403, Funktsioonid.pyth(5, 4), 0.0);
       assertEquals(3.606, Funktsioonid.pyth(2, 3), 0.0);
       assertEquals(8.485, Funktsioonid.pyth(6, 6), 0.0);
    }

    @Test
    public void pindalaTest(){
       assertEquals(10.0, Funktsioonid.pindala(5, 4), 0.0);
       assertEquals(3.0, Funktsioonid.pindala(2, 3), 0.0);
       assertEquals(18.0, Funktsioonid.pindala(6, 6), 0.0);
    }
}