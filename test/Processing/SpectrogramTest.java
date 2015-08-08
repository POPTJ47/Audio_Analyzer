/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processing;

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
public class SpectrogramTest {
    
    public SpectrogramTest() {
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
     * Test of getSpectrogramData method, of class Spectrogram.
     */
    @Test
    public void testGetSpectrogramData() {
        System.out.println("getSpectrogramData");
        Spectrogram instance = null;
        double[][] expResult = null;
        double[][] result = instance.getSpectrogramData();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAbsoluteSpectrogramData method, of class Spectrogram.
     */
    @Test
    public void testGetAbsoluteSpectrogramData() {
        System.out.println("getAbsoluteSpectrogramData");
        Spectrogram instance = null;
        double[][] expResult = null;
        double[][] result = instance.getAbsoluteSpectrogramData();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumFrames method, of class Spectrogram.
     */
    @Test
    public void testGetNumFrames() {
        System.out.println("getNumFrames");
        Spectrogram instance = null;
        int expResult = 0;
        int result = instance.getNumFrames();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFramesPerSecond method, of class Spectrogram.
     */
    @Test
    public void testGetFramesPerSecond() {
        System.out.println("getFramesPerSecond");
        Spectrogram instance = null;
        int expResult = 0;
        int result = instance.getFramesPerSecond();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumFrequencyUnit method, of class Spectrogram.
     */
    @Test
    public void testGetNumFrequencyUnit() {
        System.out.println("getNumFrequencyUnit");
        Spectrogram instance = null;
        int expResult = 0;
        int result = instance.getNumFrequencyUnit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUnitFrequency method, of class Spectrogram.
     */
    @Test
    public void testGetUnitFrequency() {
        System.out.println("getUnitFrequency");
        Spectrogram instance = null;
        double expResult = 0.0;
        double result = instance.getUnitFrequency();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFftSampleSize method, of class Spectrogram.
     */
    @Test
    public void testGetFftSampleSize() {
        System.out.println("getFftSampleSize");
        Spectrogram instance = null;
        int expResult = 0;
        int result = instance.getFftSampleSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOverlapFactor method, of class Spectrogram.
     */
    @Test
    public void testGetOverlapFactor() {
        System.out.println("getOverlapFactor");
        Spectrogram instance = null;
        int expResult = 0;
        int result = instance.getOverlapFactor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
