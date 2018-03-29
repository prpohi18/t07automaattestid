/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zeus
 */
public class Tests {
    
    private aku akuNormal;
    private aku akuOver;
    private aku akuUnder;

    @Before
    public void setUp() {
        akuNormal = new aku(63);
        akuOver = new aku(103);
        akuUnder = new aku(-5);
    }
	
    @Test
    public void testGetAku1() {
        assertEquals(akuNormal.getAku(), 63);
    }

    @Test
    public void testChargeOneHour() {
		akuNormal.charge(1);
        assertEquals(akuNormal.getAku(), 88);
    }

    @Test
    public void testOverCharge() {
        akuNormal.charge(5);
        assertEquals(akuNormal.getAku(), 100);
    }

    @Test
    public void testUseOneHour1() {
        akuNormal.use(1);
        assertEquals(akuNormal.getAku(), 38);
    }
	
    @Test
    public void testOverUse() {
        akuNormal.use(5);
        assertEquals(akuNormal.getAku(), 0);
    }
	
    @Test
    public void testIsNormalNormal() {
        assertEquals(akuNormal.checkNormal(), true);
    }
	
    @Test
    public void testIsNormalOver() {
        assertEquals(akuOver.checkNormal(), false);
    }
	
    @Test
    public void testIsNormalUnder() {
        assertEquals(akuUnder.checkNormal(), false);
    }
}
