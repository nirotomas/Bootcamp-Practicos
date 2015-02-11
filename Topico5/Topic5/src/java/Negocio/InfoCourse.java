/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DAO.DAOCourse;
import DTO.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Tomas
 * 
 * Esta clase debe Exteder de un BeanFactory, el bean de Spring
 */
public class InfoCourse {
      public List<String> getListaCurso() {
        //DTOArticulo articulo;
        List lista = new ArrayList();
        Course c = new Course();
        Student s = new Student ();
        Teacher t =new Teacher();
        DAOCourse course = new DAOCourse();
        ResultSet rs = course.selectCourse();
        try {
            while (rs.next()) {
                
                c.setName(rs.getString("c.name"));
                s.setFirstName(rs.getString("student_n"));
                s.setLastName(rs.getString("student_ln"));
                t.setFirstName(rs.getString("teacher_n"));
                t.setLastName(rs.getString("teacher_ln"));
                
                lista.add(c.getName());
                lista.add(s.getFirstName());
                lista.add(s.getLastName());
                lista.add(t.getFirstName());
                lista.add(t.getLastName());
            }
            if (lista.isEmpty() == true) {
                course.cerrarBD();
                return null;
            }
        } catch (SQLException ex) {
            System.out.println(""+ex);
        }
        course.cerrarBD();
        return lista;        
    }
}
