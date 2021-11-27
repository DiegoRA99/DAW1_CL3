package org.cibertec.ciberpet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TIPO")
public class Tipo {

	@Id
	@Column(name="CODIGO")
	private int codigo;
	
	@Column(name="DESCRIPCION")
	private String descripcion;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Tipo [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}
	
	
}
