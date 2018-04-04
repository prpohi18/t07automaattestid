
import org.junit.Test;
import static org.junit.Assert.*;

public class Test1 {
    
    public Test1() {
    } 
    @Test
    public void Perimeter() {
        assertEquals(6.0, Functions.figurePerimeter(1, 2), 0.01);
        assertEquals(20.0, Functions.figurePerimeter(4, 6), 0.01);
    }
}
