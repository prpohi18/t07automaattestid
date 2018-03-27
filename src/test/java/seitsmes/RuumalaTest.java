package seitsmes;
import org.junit.*;
import static org.junit.Assert.*;

public class RuumalaTest{
    @Test
    public void KeraTest(){
       assertEquals(25, Ruumala.KeraRuumala(2));
    }
}