package seitsmes;
import org.junit.*;
import static org.junit.Assert.*;

public class RuumalaTest{
    @Test
    public void KeraTest(){
       assertEquals(33, Ruumala.KeraRuumala(2));
    }
    
    @Test
    public void SilindriTest(){
        assertEquals(25, Ruumala.SilindriRuumala(2, 2));
    }
}
