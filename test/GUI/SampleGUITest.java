/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.image.BufferedImage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Piraveen Mahesan
 */
public class SampleGUITest {
    
    public SampleGUITest() {
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

    /**
     * Test of generate method, of class SampleGUI.
     */
    @Test
    public void testGenerate() {
        System.out.println("generate");
        SampleGUI instance = new SampleGUI();
        instance.generate();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of makeRoundedCorner method, of class SampleGUI.
     */
    @Test
    public void testMakeRoundedCorner() {
        System.out.println("makeRoundedCorner");
        BufferedImage image = null;
        int cornerRadius = 0;
        BufferedImage expResult = null;
        BufferedImage result = SampleGUI.makeRoundedCorner(image, cornerRadius);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class SampleGUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SampleGUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
