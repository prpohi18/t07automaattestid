package kolmnurk;
import org.junit.*;
import static org.junit.Assert.*;
public class pindalaTest{
   @Test
   public void test1(){
      assertEquals(3, 3);
   }
   @Test
   public void test2(){
      assertEquals(6, pindala.pindala(3, 4), 0);
   }
}