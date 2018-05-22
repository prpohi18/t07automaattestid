package ee.tlu.elinorr.automaattestid;
import org.junit.Test;
import static org.junit.Assert.*;

public class RuutTest {
    
    @Test
    public void umbermootTest(){
        assertEquals(16, Ruut.Umbermoot(4));
        assertEquals(20, Ruut.Umbermoot(5));
        assertEquals(32, Ruut.Umbermoot(8));
    }
    @Test
    public void pindalaTest(){
        assertEquals(25, Ruut.Pindala(5));
        assertEquals(36, Ruut.Pindala(6));
        assertEquals(81, Ruut.Pindala(9));
    }
    @Test
    public void ruumalaTest(){
        assertEquals(27, Ruut.Ruumala(3));
        assertEquals(512, Ruut.Ruumala(8));
        assertEquals(125, Ruut.Ruumala(5));
    }
    
}
