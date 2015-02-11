/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Tomas
 */
public class DAOStudent extends DAO {
    
    public Connection insertStudent(Student stu) throws SQLException {
    //    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
       
        try {
            abrirBD();
            stmt = conn.createStatement();
            stmt.execute("INSERT INTO `high-school`.`student` (`reg_number`,`first_name`, `last_name`) "
                         + "VALUES ('"+stu.getRegNumber()+"','"+stu.getFirstName()+"', '"+stu.getLastName()+"');");
        } catch (SQLException e) {
            System.out.println("Error: no se pudo registrar el estudiante en la base de datos.\n" + e);
            cerrarBD();
            return null;
        }
        conn.commit();
        cerrarBD();
        
        return conn;
    }
}
