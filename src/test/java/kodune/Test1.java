package kodune;
import org.junit.*;
import static org.junit.Assert.*;
public class Test1{
  @Test
  public void ylesanneLoomine(){
    kolmaskylg yl=new kolmaskylg(3, 2, 45);
    assertEquals("3.0&2.0&45.0", yl.toString());
    assertEquals(2.1, yl.checkSide3(), 0.1);
  }

}
