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
public class NoiseRemovePressedTest {
    
    public NoiseRemovePressedTest() {
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
     * Test of NoiceRemoving method, of class NoiseRemovePressed.
     */
    @Test
    public void testNoiceRemoving() {
        System.out.println("NoiceRemoving");
        SampleGUI form = null;
        NoiseRemovePressed instance = new NoiseRemovePressed();
        instance.NoiceRemoving(form);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of undoNoiceRemoving method, of class NoiseRemovePressed.
     */
    @Test
    public void testUndoNoiceRemoving() {
        System.out.println("undoNoiceRemoving");
        NoiseRemovePressed instance = new NoiseRemovePressed();
        instance.undoNoiceRemoving();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
