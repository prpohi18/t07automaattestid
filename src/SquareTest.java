import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void Test() {
        int test = 5;
        int result = Square.square(5);
        assertEquals( 25, result);
    }
}