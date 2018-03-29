/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.tlu.jaagup.automaattestid;
import org.junit.*;
import static org.junit.Assert.*;
/**
 *
 * @author rober
 */
public class AutomaatTest {
    @Test
    public void MbtoGb(){
        assertEquals(2048, funktsioon.gbMb(2));
    }
}
