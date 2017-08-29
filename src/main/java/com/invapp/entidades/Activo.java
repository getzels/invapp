package com.invapp.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the activos database table.
 * 
 */
@Entity
@Table(name="activos")
@NamedQuery(name="Activo.findAll", query="SELECT a FROM Activo a")
public class Activo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="act_descripcion")
	private String actDescripcion;

	@Column(name="clt_codigo")
	private String cltCodigo;

	@Column(name="fecha_hora_crea")
	private Timestamp fechaHoraCrea;

	@Column(name="fecha_hora_modi")
	private Timestamp fechaHoraModi;

	@Column(name="inv_codigo")
	private String invCodigo;

	private BigDecimal monto;

	@Column(name="usr_codigo_crea")
	private String usrCodigoCrea;

	@Column(name="usr_codigo_modi")
	private String usrCodigoModi;

	public Activo() {
	}

	public String getActDescripcion() {
		return this.actDescripcion;
	}

	public void setActDescripcion(String actDescripcion) {
		this.actDescripcion = actDescripcion;
	}

	public String getCltCodigo() {
		return this.cltCodigo;
	}

	public void setCltCodigo(String cltCodigo) {
		this.cltCodigo = cltCodigo;
	}

	public Timestamp getFechaHoraCrea() {
		return this.fechaHoraCrea;
	}

	public void setFechaHoraCrea(Timestamp fechaHoraCrea) {
		this.fechaHoraCrea = fechaHoraCrea;
	}

	public Timestamp getFechaHoraModi() {
		return this.fechaHoraModi;
	}

	public void setFechaHoraModi(Timestamp fechaHoraModi) {
		this.fechaHoraModi = fechaHoraModi;
	}

	public String getInvCodigo() {
		return this.invCodigo;
	}

	public void setInvCodigo(String invCodigo) {
		this.invCodigo = invCodigo;
	}

	public BigDecimal getMonto() {
		return this.monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public String getUsrCodigoCrea() {
		return this.usrCodigoCrea;
	}

	public void setUsrCodigoCrea(String usrCodigoCrea) {
		this.usrCodigoCrea = usrCodigoCrea;
	}

	public String getUsrCodigoModi() {
		return this.usrCodigoModi;
	}

	public void setUsrCodigoModi(String usrCodigoModi) {
		this.usrCodigoModi = usrCodigoModi;
	}

}