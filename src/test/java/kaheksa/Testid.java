package kaheksa;
import org.junit.*;
import static org.junit.Assert.*;

public class Testid {
    Arvutused a = new Arvutused();
    @Test
    public void asteTest() {
        assertEquals(4.0, a.aste(2, 2), 0.0);
        assertEquals(27.0, a.aste(3, 3), 0.0);
        assertEquals(36.0, a.aste(6, 2), 0.0);
    }

    @Test
    public void korrutusTest() {
        assertEquals(20.0, a.korrutis(5, 4), 0.0);
        assertEquals(6.0, a.korrutis(2, 3), 0.0);
        assertEquals(36.0, a.korrutis(6, 6), 0.0);
    }

}