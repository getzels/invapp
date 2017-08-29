package com.invapp.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the pasivos database table.
 * 
 */
@Entity
@Table(name="pasivos")
@NamedQuery(name="Pasivo.findAll", query="SELECT p FROM Pasivo p")
public class Pasivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="clt_codigo")
	private String cltCodigo;

	@Column(name="fecha_hora_crea")
	private Timestamp fechaHoraCrea;

	@Column(name="fecha_hora_modi")
	private Timestamp fechaHoraModi;

	@Column(name="inv_codigo")
	private String invCodigo;

	private BigDecimal monto;

	@Column(name="pas_descripcion")
	private String pasDescripcion;

	@Column(name="usr_codigo_crea")
	private String usrCodigoCrea;

	@Column(name="usr_codigo_modi")
	private String usrCodigoModi;

	public Pasivo() {
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

	public String getPasDescripcion() {
		return this.pasDescripcion;
	}

	public void setPasDescripcion(String pasDescripcion) {
		this.pasDescripcion = pasDescripcion;
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