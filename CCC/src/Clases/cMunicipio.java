/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Manuel
 */
public class cMunicipio {
	cConexion1 c = new cConexion1();

public void INSERTAR (String nombre, String pais, String departamento){
	
 c.UID("INSERT INTO municipios(nombre, pais, departamento) values('"+nombre+"','"+pais+"','"+nombre+"')");
}
public void MODIFICAR (int codigo, String nombre, String pais, String departamento){
 c.UID("UPDATE municipios set nombre='"+nombre+"',pais='"+pais+"', departamento='"+departamento+"' where codigo ="+codigo);
}
}
