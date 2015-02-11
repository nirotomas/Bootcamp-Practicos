/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Student;
import java.sql.Connection;
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
public class DAOStudentTest {
    
    public DAOStudentTest() {
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
     * Test of insertStudent method, of class DAOStudent.
     */
    @Test
    public void testInsertStudent() {
        System.out.println("insertStudent");
        Student stu = null;
        DAOStudent instance = new DAOStudent();
        //Connection expResult = null;
        
        Student s1 = new Student("Tomas", "Niro",50);
        
        Connection result = instance.insertStudent(s1);
        if(result == null)System.out.println("no paso");
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
