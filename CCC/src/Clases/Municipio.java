/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Manuel
 */
public class Municipio {
	
	cConexion c = new cConexion();
	
public void GUARDAR (int codigo, String nombre){
c.UID("INSERT INSERT INTO prueba.municipios (codigo,nombre) VALUES("+codigo+",'"+nombre+"')");
}
}
