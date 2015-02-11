/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tomas
 */
public class DAOCourse extends DAO{
    
    public ResultSet selectCourse() {
    
        try {
            abrirBD();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT s.first_name as student_n,s.last_name as student_ln,t.first_name as teacher_n,t.last_name as teacher_ln,c.name \n" +
                                    " FROM `high-school`.course as c, `high-school`.student as s, `high-school`.teacher as t order by(s.last_name);");
        } catch (SQLException e) {
            System.out.println("Error: no se pudo consultar los datos.\n" + e);
            cerrarBD();
            return null;
        }
        return rs;
    }
}
