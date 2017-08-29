package com.invapp.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ganancia_porcentual database table.
 * 
 */
@Entity
@Table(name="ganancia_porcentual")
@NamedQuery(name="GananciaPorcentual.findAll", query="SELECT g FROM GananciaPorcentual g")
public class GananciaPorcentual implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="sal_codigo")
	private String salCodigo;

	@Column(name="sal_porciento")
	private Integer salPorciento;

	public GananciaPorcentual() {
	}

	public String getSalCodigo() {
		return this.salCodigo;
	}

	public void setSalCodigo(String salCodigo) {
		this.salCodigo = salCodigo;
	}

	public Integer getSalPorciento() {
		return this.salPorciento;
	}

	public void setSalPorciento(Integer salPorciento) {
		this.salPorciento = salPorciento;
	}

}