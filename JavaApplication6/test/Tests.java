/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaapplication6.Tehted;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Taavi Meinberg
 */
public class Tests {
    
    public Tests() {
        
    }
    Tehted test = new Tehted();
    @Test
    public void kaheksaRuudus(){
        assertEquals(64, test.ruut(8, 2),0.02);
    }
    public void kaheksaNeljandas(){
        assertEquals(4096, test.ruut(8, 4),0.02);
    }
    
}
