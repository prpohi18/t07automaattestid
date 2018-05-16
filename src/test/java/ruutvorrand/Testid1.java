package ruutvorrand;
import org.junit.*;
import static org.junit.Assert.*;
public class Testid1{
   @Test
   public void test1(){
      assertEquals(3, 1+2);
   }
   @Test
   public void X(){
     assertEquals(-1.0, Ruut.leiaX(1.0, 2.0, 1.0), 0.0);
	 
   }
   @Test
   public void Y(){
     assertEquals(-1.0, Ruut.leiaY(1.0, 2.0, 1.0), 0.0);
	 
   }
   @Test
   public void determinant(){
     assertEquals(0.0, Ruut.determinant(1.0, 2.0, 1.0), 0.0);
	 
   }
}

