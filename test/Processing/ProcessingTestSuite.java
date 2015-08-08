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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Piraveen Mahesan
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Processing.SpectrogramTest.class, Processing.LowPassFilterTest.class, Processing.ShowGraphPressedTest.class, Processing.NoiseRemovePressedTest.class, Processing.GraphicRenderTest.class, Processing.PlayPressedTest.class})
public class ProcessingTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
