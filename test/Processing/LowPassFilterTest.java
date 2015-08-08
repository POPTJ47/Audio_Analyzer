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
public class LowPassFilterTest {
    
    public LowPassFilterTest() {
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
     * Test of sinc method, of class LowPassFilter.
     */
    @Test
    public void testSinc() {
        System.out.println("sinc");
        double x = 0.0;
        LowPassFilter instance = null;
        double expResult = 0.0;
        double result = instance.sinc(x);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBytesFromDoubles method, of class LowPassFilter.
     */
    @Test
    public void testGetBytesFromDoubles() {
        System.out.println("getBytesFromDoubles");
        double[] audioData = null;
        int storedSamples = 0;
        LowPassFilter instance = null;
        byte[] expResult = null;
        byte[] result = instance.getBytesFromDoubles(audioData, storedSamples);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of writeWavFile method, of class LowPassFilter.
     */
    @Test
    public void testWriteWavFile() {
        System.out.println("writeWavFile");
        byte[] audioDataBytes = null;
        int storedSamples = 0;
        String fileName = "";
        LowPassFilter instance = null;
        instance.writeWavFile(audioDataBytes, storedSamples, fileName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of lowPassFilter method, of class LowPassFilter.
     */
    @Test
    public void testLowPassFilter() {
        System.out.println("lowPassFilter");
        double[] audioDataIn = null;
        double[] audioDataOut = null;
        LowPassFilter instance = null;
        instance.lowPassFilter(audioDataIn, audioDataOut);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class LowPassFilter.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        LowPassFilter instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of transformSignal method, of class LowPassFilter.
     */
    @Test
    public void testTransformSignal() throws Exception {
        System.out.println("transformSignal");
        LowPassFilter instance = null;
        instance.transformSignal();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
