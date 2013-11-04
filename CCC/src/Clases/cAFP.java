/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Manuel
 */
public class cAFP {
	cConexion1 c = new cConexion1();


public void INSERTAR (String nombre, String porcentaje){
	
 c.UID("INSERT INTO afp(nombre, porcentaje) values('"+nombre+"','"+porcentaje+"')");
}
public void MODIFICAR (int codigo, String nombre, String porcentaje){
 c.UID("UPDATE afp set nombre='"+nombre+"',porcentaje='"+porcentaje+"' where codigo ="+codigo);
}
}