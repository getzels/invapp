package com.invapp.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the activos_fijos database table.
 * 
 */
@Entity
@Table(name="activos_fijos")
@NamedQuery(name="ActivosFijo.findAll", query="SELECT a FROM ActivosFijo a")
public class ActivosFijo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="act_codigo")
	private String actCodigo;

	@Column(name="act_costo")
	private BigDecimal actCosto;

	@Column(name="act_descripcion")
	private String actDescripcion;

	@Column(name="act_despreciacion")
	private BigDecimal actDespreciacion;

	@Column(name="act_estado")
	private String actEstado;

	@Column(name="act_estado_compra")
	private String actEstadoCompra;

	@Column(name="act_marca")
	private String actMarca;

	@Column(name="act_modelo")
	private String actModelo;

	@Column(name="clt_codigo")
	private String cltCodigo;

	@Column(name="fecha_hora_crea")
	private Timestamp fechaHoraCrea;

	@Column(name="fecha_hora_modi")
	private Timestamp fechaHoraModi;

	@Column(name="usr_codigo_crea")
	private String usrCodigoCrea;

	@Column(name="usr_codigo_modi")
	private String usrCodigoModi;

	public ActivosFijo() {
	}

	public String getActCodigo() {
		return this.actCodigo;
	}

	public void setActCodigo(String actCodigo) {
		this.actCodigo = actCodigo;
	}

	public BigDecimal getActCosto() {
		return this.actCosto;
	}

	public void setActCosto(BigDecimal actCosto) {
		this.actCosto = actCosto;
	}

	public String getActDescripcion() {
		return this.actDescripcion;
	}

	public void setActDescripcion(String actDescripcion) {
		this.actDescripcion = actDescripcion;
	}

	public BigDecimal getActDespreciacion() {
		return this.actDespreciacion;
	}

	public void setActDespreciacion(BigDecimal actDespreciacion) {
		this.actDespreciacion = actDespreciacion;
	}

	public String getActEstado() {
		return this.actEstado;
	}

	public void setActEstado(String actEstado) {
		this.actEstado = actEstado;
	}

	public String getActEstadoCompra() {
		return this.actEstadoCompra;
	}

	public void setActEstadoCompra(String actEstadoCompra) {
		this.actEstadoCompra = actEstadoCompra;
	}

	public String getActMarca() {
		return this.actMarca;
	}

	public void setActMarca(String actMarca) {
		this.actMarca = actMarca;
	}

	public String getActModelo() {
		return this.actModelo;
	}

	public void setActModelo(String actModelo) {
		this.actModelo = actModelo;
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