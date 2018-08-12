package com.practicasp.demo.modelo;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tblusers")
@Access(AccessType.FIELD)
@Data public class Users extends ParentEntity{

	private static final long serialVersionUID = 522437908196700730L;
	
	@Column(name="nombre1", nullable=false, length=20)
	private String nombre1;
	
	@Column(name="nombre2", nullable=true, length=20)
	private String nombre2; 
	
	@Column(name="ap_paterno", nullable=false, length=20)
	private String appaterno;
	
	@Column(name="ap_materno", nullable=true, length=20)
	private String apmaterno;
	
	@Column(name="telefono", nullable=true, length=15)
	private String telefono;
	
	@Column(name="direccion", nullable=false, length=50)
	private String direccion;

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getAppaterno() {
		return appaterno;
	}

	public void setAppaterno(String appaterno) {
		this.appaterno = appaterno;
	}

	public String getApmaterno() {
		return apmaterno;
	}

	public void setApmaterno(String apmaterno) {
		this.apmaterno = apmaterno;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
