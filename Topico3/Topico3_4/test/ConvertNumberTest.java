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
 * @author Tomas
 */
public class ConvertNumberTest {
    
    public ConvertNumberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        ConvertNumber cn;
        cn = new ConvertNumber();
        cn.ConvertNumberToWord(32);
        System.out.println(""+cn);
        RomanToDecimal rm = new RomanToDecimal();
        RomanToDecimal.romanToDecimal("XIV");
        System.out.println(" "+rm.decimalToRoman(14));
        
        //assertEquals("", ""+cn);
        //fail("The test case is a prototype.");
    }
    
}
