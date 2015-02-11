/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class DAOTest {
    
    public DAOTest() {
    }
    
    
    /**
     * Test of abrirBD method, of class DAO.
     */
    @Test
    public void testAbrirBD() throws Exception {
        System.out.println("abrirBD");
        DAO instance = new DAO();
        //Connection expResult = null;
        Connection result = instance.abrirBD();
        if(result == null) {
            System.out.println("Fallo");
        } else {
            System.out.println("Paso");
        }
//assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cerrarBD method, of class DAO.
     */
   /* @Test
    public void testCerrarBD() {
        System.out.println("cerrarBD");
        DAO instance = new DAO();
        instance.cerrarBD();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of getConn method, of class DAO.
     */
    @Test
    public void testGetConn() {
        System.out.println("getConn");
        DAO instance = new DAO();
        //Connection expResult = null;
        Connection result;
        try {
            result = instance.abrirBD();
        } catch (SQLException ex) {
            Logger.getLogger(DAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        result = instance.getConn();
        if(result == null) {
            System.out.println("Fallo");
        } else {
            System.out.println("Paso");
        }
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setConn method, of class DAO.
     *//*
    @Test
    public void testSetConn() {
        System.out.println("setConn");
        Connection conn = null;
        DAO instance = new DAO();
        instance.setConn(conn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStmt method, of class DAO.
     *//*
    @Test
    public void testGetStmt() {
        System.out.println("getStmt");
        DAO instance = new DAO();
        Statement expResult = null;
        Statement result = instance.getStmt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStmt method, of class DAO.
     *//*
    @Test
    public void testSetStmt() {
        System.out.println("setStmt");
        Statement stmt = null;
        DAO instance = new DAO();
        instance.setStmt(stmt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRs method, of class DAO.
     *//*
    @Test
    public void testGetRs() {
        System.out.println("getRs");
        DAO instance = new DAO();
        ResultSet expResult = null;
        ResultSet result = instance.getRs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRs method, of class DAO.
     *//*
    @Test
    public void testSetRs() {
        System.out.println("setRs");
        ResultSet rs = null;
        DAO instance = new DAO();
        instance.setRs(rs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
