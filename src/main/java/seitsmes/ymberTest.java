package seitsmes;
import org.junit.*;
import static org.junit.Assert.*;
public class ymberTest{
	 @Test
     public void Test1(){
       assertEquals(625, Functions.ymbermoot(5,4), 0.01);

	}
	@Test
     public void Test2(){
       assertEquals(625, Functions.vastus(4,2), 0.01);

	}
	
}