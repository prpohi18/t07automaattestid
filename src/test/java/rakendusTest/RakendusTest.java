package rakendusTest;

import org.junit.Test;
import static org.junit.Assert.*;

public class RakendusTest {
    @Test
    public void testKorrutamine() {
        System.out.println("KORRUTAMINE");
        double a = 6;
        double b = 2;
        assertEquals(2.5, Rakendus.korrutamine(a,b),0);
    }

    @Test
    public void testJagamine() {
        System.out.println("JAGAMINE");
        double a = 6;
        double b = 2;
        assertEquals(3, Rakendus.jagamine(a,b),0);
    }
    
}
/*
Results :


Failed tests:
  RakendusTest.testKorrutamine:12 expected:<2.5> but was:<12.0> <--- PIDIGI VALE TULEMA

Tests run: 2, Failures: 1, Errors: 0, Skipped: 0

*/