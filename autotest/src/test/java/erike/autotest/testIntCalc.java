/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erike.autotest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author erike
 */
public class testIntCalc {
    @Test
    public void testInterest(){
        assertEquals(720.0, interestCalculator.interest(1200, 0.05, 12), 0);
    }
    @Test
    public void testInterestSum(){
        assertEquals(1920.0, interestCalculator.interestSum(1200, 0.05, 12), 0);
    }
}
