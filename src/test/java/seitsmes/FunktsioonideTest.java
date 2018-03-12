package seitsmes;
import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class FunktsioonideTest{
    @Test
    public void korrutuseTest(){
       assertEquals(6, Funktsioonid.korruta(3, 2));
    }
}
