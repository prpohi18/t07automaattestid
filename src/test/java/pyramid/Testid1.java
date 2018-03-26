package pyramid;

import org.junit.*;
import static org.junit.Assert.*;

public class Testid1{

  @Test
  public void test(){
    assertEquals(3, 1+2);
  }
  
  @Test
  public void test1(){
    assertEquals(12, Pyramid.areaCheck(2, 3, 4));
  }
}
