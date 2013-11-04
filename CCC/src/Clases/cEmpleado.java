/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author manuel
 */
public class cEmpleado {
    
	cConexion1 c = new cConexion1();

        
public void MODIFICAR (int codigo, String nombre, String apellido, String estado_civil, String telefono, String correo, String direccion, String municipio, String departamento, String dui, String nit, String isss, String afp, String nup, String empresa, String nivel, String cargo, String sueldo){
 c.UID("UPDATE empleado set nombre='"+nombre+"',apellido='"+apellido+"', estado_civil= '"+estado_civil+"', telefono= '"+telefono+"', correo= '"+correo+"', direccion= '"+direccion+"', municipio='"+municipio+"', departamento='"+departamento+"', dui='"+dui+"', nit='"+nit+"', isss='"+isss+"', afp='"+afp+"', nup='"+nup+"', empresa='"+empresa+"', nivel='"+nivel+"', cargo='"+cargo+"', sueldo='"+sueldo+"' where codigo ="+codigo);
}
}

