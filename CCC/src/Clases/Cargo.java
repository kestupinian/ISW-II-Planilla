/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Manuel
 */
@Entity
@Table(name = "cargo", catalog = "prueba", schema = "")
@NamedQueries({
	@NamedQuery(name = "Cargo.findAll", query = "SELECT c FROM Cargo c"),
	@NamedQuery(name = "Cargo.findByCodigo", query = "SELECT c FROM Cargo c WHERE c.codigo = :codigo"),
	@NamedQuery(name = "Cargo.findByNombre", query = "SELECT c FROM Cargo c WHERE c.nombre = :nombre")})
public class Cargo implements Serializable {
	@Transient
	private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
	private Integer codigo;
	@Basic(optional = false)
    @Column(name = "nombre")
	private String nombre;

	public Cargo() {
	}

	public Cargo(Integer codigo) {
		this.codigo = codigo;
	}

	public Cargo(Integer codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		Integer oldCodigo = this.codigo;
		this.codigo = codigo;
		changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		String oldNombre = this.nombre;
		this.nombre = nombre;
		changeSupport.firePropertyChange("nombre", oldNombre, nombre);
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codigo != null ? codigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Cargo)) {
			return false;
		}
		Cargo other = (Cargo) object;
		if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Mantenimientos.Cargo[ codigo=" + codigo + " ]";
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(listener);
	}
	
}
