/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author manuel
 */
public class cEmpresa {
    cConexion1 c = new cConexion1();

        
public void MODIFICAR (int codigo, String nombre, String direccion, String municipio, String departamento, String telefono, String nit, String registro){
 c.UID("UPDATE empresa set nombre='"+nombre+"',direccion='"+direccion+"', municipio= '"+municipio+"', departamento= '"+departamento+"', nit= '"+nit+"', registro= '"+registro+"' where codigo ="+codigo);
}
}
