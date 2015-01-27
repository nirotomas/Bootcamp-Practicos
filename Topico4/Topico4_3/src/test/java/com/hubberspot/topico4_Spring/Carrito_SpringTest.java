/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hubberspot.topico4_Spring;

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
public class Carrito_SpringTest {
    
    public Carrito_SpringTest() {
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

    @Test
    public void testSomeMethod() {
        
        //ClassPathXmlApplicationContext context1 =  new ClassPathXmlApplicationContext("");
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/beans.xml");
        Carrito carrito = (Carrito)context.getBean("carrito");
        System.out.println("the message is: "+ carrito.toString());
        
    }
    
}
