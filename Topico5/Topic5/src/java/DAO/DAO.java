/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;

/**
 *
 * @author Tomas
 */
public class DAO {
    
    protected Connection conn;
    protected Statement stmt;
    protected ResultSet rs;

    public Connection abrirBD() throws SQLException {
            try {
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost/high-school","root","root");
            }
            catch(Exception e) {
                    System.out.println("Error: no se puede conectar con la base de datos.\n" + e);
            }
            conn.setAutoCommit(false);
            return conn;
    }

    public void cerrarBD() {
            try {
                    stmt.close();
                    conn.close();
            }
            catch(SQLException e) {
                    System.out.println("Error: no se puede cerrar la conexion con la base de datos.\n" + e);
            }
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getStmt() {
        return stmt;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
    
}