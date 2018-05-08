package seitsmes;
import org.junit.*;
import static org.junit.Assert.*;

public class AsukohaTest{
    @Test
    public void test1(){
       Asukoht a=new Asukoht(3, 4);
       assertEquals(3, a.kysiX(), 0.01);
       assertEquals(4, a.kysiY(), 0.01);
    }
}

