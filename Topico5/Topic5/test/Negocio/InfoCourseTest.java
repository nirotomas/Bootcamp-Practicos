/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tomas
 */
public class InfoCourseTest {
    
    public InfoCourseTest() {
    }
    /**
     * Test of getListaComputacion method, of class InfoCourse.
     */
    @Test
    public void testGetListaCurso() {
        InfoCourse instance = new InfoCourse();
        List<String> expResult = null;
        List<String> result = instance.getListaCurso();
        
        for (int i = 0; i < result.size(); i++) {
            if(i+5>result.size()){
                return;
            } else {
                System.out.println("Course: "+result.get(i));
                System.out.println("Teacher: "+result.get(i+1)+"\t "+result.get(i+2));
                System.out.println("Student: "+result.get(i+3)+"\t "+result.get(i+4));
                //System.out.println(""+result.get(i)+" "+i);
            }
            System.out.println();
            i+=4;
        }
    }
}
