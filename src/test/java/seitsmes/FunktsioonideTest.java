package seitsmes;
import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonideTest{
    @Test
    public void korrutuseTest(){
       assertEquals(6, Funktsioonid.korruta(3, 2));
    }
    
    @Test
    public void pindala1(){
       assertEquals(6.0, Funktsioonid.kolmnurgaPindala(3, 4, 5), 0.01);
    }
}
