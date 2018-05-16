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
       assertEquals(24.0, Funktsioonid.kolmnurgaPindala(6, 8, 10), 0.01);
       assertEquals(0.43, Funktsioonid.kolmnurgaPindala(1, 1, 1), 0.01);
    }
    @Test
    public void ymbermooduTest1(){
       assertEquals(12, Funktsioonid.poolYmbermootu(6, 8, 10), 0.01);
    }
    @Test
    public void ruumalaTest(){
        assertEquals(125, Funktsioonid.ruumala(5, 5, 5), 0.01);
        assertEquals(224, Funktsioonid.ruumala(8, 4, 7), 0.01);
        assertEquals(0, Funktsioonid.ruumala(-1, 4, 2), 0.01);
    }
}
