/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubberspot.spring;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Tomas
 */
public class CarritoSpringTest {
    
    public CarritoSpringTest() {
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
     * Test of getMessage method, of class CarritoSpring.
     *//*
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        CarritoSpring instance = new CarritoSpring();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setMessage method, of class CarritoSpring.
     *//*
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "";
        CarritoSpring instance = new CarritoSpring();
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/beans.xml");
        CarritoSpring carrito = (CarritoSpring)context.getBean("messageId");
        
        System.out.println("the message is: "+ carrito.getMessage());
    }
    
}
