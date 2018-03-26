package kaheksas;
import org.junit.*;
import static org.junit.Assert.*;

public class FunktsioonideTest{
    @Test
    public void pytTest(){
       assertEquals(13, Funktsioonid.teoreem(5, 12), 0.01);
    }
    
    @Test
    public void ymTest(){
       assertEquals(30.0, Funktsioonid.ym(5, 12, 13), 0.01);
    }
   
}
