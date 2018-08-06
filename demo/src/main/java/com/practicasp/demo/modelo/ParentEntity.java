package com.practicasp.demo.modelo;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;
//Esta clase son para los campos comunes. Esta clase es la que va ha heredar todas las entidades
@MappedSuperclass
//Indica que los accesos va ha acerse sobre el atributo y no a la propiedad
@Access(AccessType.FIELD)
public class ParentEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4642881392201064811L;

	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",unique=true, nullable=false)
	private Long Id;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}
}
