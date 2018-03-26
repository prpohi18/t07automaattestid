package seitsmes;
import org.junit.*;
import static org.junit.Assert.*;

public class RuumalaTest{
    @Test
    public void Ruumala1(){
       assertEquals(3.3, Funktsioonid.Pyramiidiruumala(5, 2), 0.1);
       assertEquals(26.6, Funktsioonid.Pyramiidiruumala(8, 10), 0.1);
    }
}
