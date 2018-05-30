package kodutoo;
import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonideTest {
    @Test
    public void Test1(){
        assertEquals(6.0, Funktsioonid.pindala(1, 1, 1), 0.01);
    }

    @Test
    public void Test2(){
        assertEquals(6.0, Funktsioonid.ruumala(1, 2, 3), 0.01);
    }

    @Test
    public void Test3(){
        assertEquals(15.0, Funktsioonid.diameeter(10, 5, 10), 0.01);
    }
}
