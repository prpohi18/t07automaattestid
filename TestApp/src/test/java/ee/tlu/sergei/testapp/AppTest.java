
package ee.tlu.sergei.testapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testKronKesk2() {
        System.out.println("KronKesk2");
        double[] b = {1, 2, 3, 4};
        assertEquals(2.5, App.KronKesk2(b), 0);
    }

    @Test
    public void testArraySum() {
        System.out.println("ArraySum");
        double[] a = {1,2,3};
        assertEquals(6, App.ArraySum(a), 0);
    }
    
}
