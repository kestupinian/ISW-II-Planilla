/*prueba
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Manuel
 */
public class cConexion {
	private Connection cnx = null;
    private Statement sttm = null;

    public void UID(String sqlcad) {
        try {
            cnx = (Connection) DriverManager.getConnection("jdbc:mysql://root@localhost:3306/prueba");
            sttm = (Statement) cnx.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            sttm.executeUpdate(sqlcad);
        } catch (Exception e) {
            System.out.println("ERROR=" + e.getMessage());
        }
    }

}
