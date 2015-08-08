/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processing;

import com.musicg.wave.Wave;
import com.musicg.wave.extension.Spectrogram;
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
public class GraphicRenderTest {
    
    public GraphicRenderTest() {
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
     * Test of renderWaveform method, of class GraphicRender.
     */
    @Test
    public void testRenderWaveform_Wave_String() {
        System.out.println("renderWaveform");
        Wave wave = null;
        String filename = "";
        GraphicRender instance = new GraphicRender();
        instance.renderWaveform(wave, filename);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of renderWaveform method, of class GraphicRender.
     */
    @Test
    public void testRenderWaveform_3args() {
        System.out.println("renderWaveform");
        Wave wave = null;
        float timeStep = 0.0F;
        String filename = "";
        GraphicRender instance = new GraphicRender();
        instance.renderWaveform(wave, timeStep, filename);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of renderSpectrogram method, of class GraphicRender.
     */
    @Test
    public void testRenderSpectrogram() {
        System.out.println("renderSpectrogram");
        Spectrogram spectrogram = null;
        String filename = "";
        GraphicRender instance = new GraphicRender();
        instance.renderSpectrogram(spectrogram, filename);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of renderSpectrogramData method, of class GraphicRender.
     */
    @Test
    public void testRenderSpectrogramData() {
        System.out.println("renderSpectrogramData");
        double[][] spectrogramData = null;
        String filename = "";
        GraphicRender instance = new GraphicRender();
        instance.renderSpectrogramData(spectrogramData, filename);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setVerticalMarker method, of class GraphicRender.
     */
    @Test
    public void testSetVerticalMarker() {
        System.out.println("setVerticalMarker");
        int x = 0;
        GraphicRender instance = new GraphicRender();
        instance.setVerticalMarker(x);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHorizontalMarker method, of class GraphicRender.
     */
    @Test
    public void testSetHorizontalMarker() {
        System.out.println("setHorizontalMarker");
        int y = 0;
        GraphicRender instance = new GraphicRender();
        instance.setHorizontalMarker(y);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resetMarkers method, of class GraphicRender.
     */
    @Test
    public void testResetMarkers() {
        System.out.println("resetMarkers");
        GraphicRender instance = new GraphicRender();
        instance.resetMarkers();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
