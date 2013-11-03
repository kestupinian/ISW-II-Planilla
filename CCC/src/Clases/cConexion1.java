/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Manuel
 */
public class cConexion1 {
    private Connection cnx = null;
    private Statement sttm = null;

    public void UID(String sqlcad) {
        try {
			String servidor = "jdbc:mysql://localhost/prueba";
            String usuarioDB="root";
            String passwordDB="";
            cnx= DriverManager.getConnection(servidor,usuarioDB,passwordDB);
            //cnx = DriverManager.getConnection("jdbc:mysql://localhost/ccc");
            sttm = cnx.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            sttm.executeUpdate(sqlcad);
        } catch (Exception e) {
            System.out.println("ERROR=" + e.getMessage());
        }
    }
	}
