package org.cibertec.ciberpet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CITAS")
public class Citas {
	@Id
	@Column(name="CODIGO")
	private int codigo;
	
	@Column(name="DUENO")
	private String nomdueno;
	
	@Column(name="MASCOTA")
	private String nommascota;
	
	@Column(name="TIPO")
	private int idtipo;
	
	@Column(name="PESO")
	private double peso;
	
	@Column(name="FECHA")
	private String fecreg;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomdueno() {
		return nomdueno;
	}
	public void setNomdueno(String nomdueno) {
		this.nomdueno = nomdueno;
	}
	public String getNommascota() {
		return nommascota;
	}
	public void setNommascota(String nommascota) {
		this.nommascota = nommascota;
	}
	public int getIdtipo() {
		return idtipo;
	}
	public void setIdtipo(int idtipo) {
		this.idtipo = idtipo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getFecreg() {
		return fecreg;
	}
	public void setFecreg(String fecreg) {
		this.fecreg = fecreg;
	}
	@Override
	public String toString() {
		return "Citas [codigo=" + codigo + ", nomdueno=" + nomdueno + ", nommascota=" + nommascota + ", idtipo="
				+ idtipo + ", peso=" + peso + ", fecreg=" + fecreg + "]";
	}
	
}
