/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class wrTest {

    public wrTest() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        Wrap wr = new Wrap("My word!", 3);
        //wr.getWrapString();
        System.out.println(wr.getWrapString());
       // assertEquals(wr.getWrapString(), "");
    }
    
      @Test
    public void testSomeMethod1() {
        // TODO review the generated test code and remove the default call to fail.
        Wrap wr = new Wrap("My world!", 5);
        //wr.getWrapString();
        System.out.println(wr.getWrapString()); 
    }
    
      @Test
    public void testSomeMethod2() {
        // TODO review the generated test code and remove the default call to fail.
        Wrap wr = new Wrap("your word!", 6);
       // wr.getWrapString();
        System.out.println(wr.getWrapString()); 
    }

}
