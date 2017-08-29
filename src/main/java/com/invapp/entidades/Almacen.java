package com.invapp.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the almacen database table.
 * 
 */
@Entity
@NamedQuery(name="Almacen.findAll", query="SELECT a FROM Almacen a")
public class Almacen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="alm_codigo")
	private String almCodigo;

	@Column(name="alm_descripcion")
	private String almDescripcion;

	@Column(name="alm_estado")
	private String almEstado;

	@Column(name="alm_fecha_hora_crea")
	private Timestamp almFechaHoraCrea;

	@Column(name="alm_fecha_hora_modi")
	private Timestamp almFechaHoraModi;

	@Column(name="alm_usr_codigo_crea")
	private String almUsrCodigoCrea;

	@Column(name="alm_usr_codigo_modi")
	private String almUsrCodigoModi;

	@Column(name="clt_codigo")
	private String cltCodigo;

	public Almacen() {
	}

	public String getAlmCodigo() {
		return this.almCodigo;
	}

	public void setAlmCodigo(String almCodigo) {
		this.almCodigo = almCodigo;
	}

	public String getAlmDescripcion() {
		return this.almDescripcion;
	}

	public void setAlmDescripcion(String almDescripcion) {
		this.almDescripcion = almDescripcion;
	}

	public String getAlmEstado() {
		return this.almEstado;
	}

	public void setAlmEstado(String almEstado) {
		this.almEstado = almEstado;
	}

	public Timestamp getAlmFechaHoraCrea() {
		return this.almFechaHoraCrea;
	}

	public void setAlmFechaHoraCrea(Timestamp almFechaHoraCrea) {
		this.almFechaHoraCrea = almFechaHoraCrea;
	}

	public Timestamp getAlmFechaHoraModi() {
		return this.almFechaHoraModi;
	}

	public void setAlmFechaHoraModi(Timestamp almFechaHoraModi) {
		this.almFechaHoraModi = almFechaHoraModi;
	}

	public String getAlmUsrCodigoCrea() {
		return this.almUsrCodigoCrea;
	}

	public void setAlmUsrCodigoCrea(String almUsrCodigoCrea) {
		this.almUsrCodigoCrea = almUsrCodigoCrea;
	}

	public String getAlmUsrCodigoModi() {
		return this.almUsrCodigoModi;
	}

	public void setAlmUsrCodigoModi(String almUsrCodigoModi) {
		this.almUsrCodigoModi = almUsrCodigoModi;
	}

	public String getCltCodigo() {
		return this.cltCodigo;
	}

	public void setCltCodigo(String cltCodigo) {
		this.cltCodigo = cltCodigo;
	}

}