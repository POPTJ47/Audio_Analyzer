/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class DBConnectionTest {
    
    public DBConnectionTest() {
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
     * Test of getconn method, of class DBConnection.
     */
    @Test
    public void testGetconn() {
        System.out.println("getconn");
        DBConnection instance = new DBConnection();
        Connection expResult = null;
        Connection result = instance.getconn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class DBConnection.
     */
    @Test
    public void testExecute_String() throws Exception {
        System.out.println("execute");
        String query = "";
        DBConnection instance = new DBConnection();
        ResultSet expResult = null;
        ResultSet result = instance.execute(query);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class DBConnection.
     */
    @Test
    public void testExecute_PreparedStatement() throws Exception {
        System.out.println("execute");
        PreparedStatement statement = null;
        DBConnection instance = new DBConnection();
        ResultSet expResult = null;
        ResultSet result = instance.execute(statement);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class DBConnection.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        DBConnection instance = new DBConnection();
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
