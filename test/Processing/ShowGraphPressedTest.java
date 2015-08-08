/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processing;

import GUI.SampleGUI;
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
public class ShowGraphPressedTest {
    
    public ShowGraphPressedTest() {
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
     * Test of ShowingGraph method, of class ShowGraphPressed.
     */
    @Test
    public void testShowingGraph() {
        System.out.println("ShowingGraph");
        SampleGUI form = null;
        ShowGraphPressed instance = new ShowGraphPressed();
        instance.ShowingGraph(form);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
