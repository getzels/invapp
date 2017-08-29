package com.invapp.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the cuentas database table.
 * 
 */
@Entity
@Table(name="cuentas")
@NamedQuery(name="Cuenta.findAll", query="SELECT c FROM Cuenta c")
public class Cuenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="clt_codigo")
	private String cltCodigo;

	@Column(name="cuenta_codigo")
	private String cuentaCodigo;

	@Column(name="cuenta_estado")
	private String cuentaEstado;

	@Column(name="cuenta_monto_total")
	private BigDecimal cuentaMontoTotal;

	@Column(name="descripcion_cuenta")
	private String descripcionCuenta;

	@Column(name="fecha_hora_crea")
	private Timestamp fechaHoraCrea;

	@Column(name="fecha_hora_modi")
	private Timestamp fechaHoraModi;

	@Column(name="usr_codigo_crea")
	private String usrCodigoCrea;

	@Column(name="usr_codigo_modi")
	private String usrCodigoModi;

	public Cuenta() {
	}

	public String getCltCodigo() {
		return this.cltCodigo;
	}

	public void setCltCodigo(String cltCodigo) {
		this.cltCodigo = cltCodigo;
	}

	public String getCuentaCodigo() {
		return this.cuentaCodigo;
	}

	public void setCuentaCodigo(String cuentaCodigo) {
		this.cuentaCodigo = cuentaCodigo;
	}

	public String getCuentaEstado() {
		return this.cuentaEstado;
	}

	public void setCuentaEstado(String cuentaEstado) {
		this.cuentaEstado = cuentaEstado;
	}

	public BigDecimal getCuentaMontoTotal() {
		return this.cuentaMontoTotal;
	}

	public void setCuentaMontoTotal(BigDecimal cuentaMontoTotal) {
		this.cuentaMontoTotal = cuentaMontoTotal;
	}

	public String getDescripcionCuenta() {
		return this.descripcionCuenta;
	}

	public void setDescripcionCuenta(String descripcionCuenta) {
		this.descripcionCuenta = descripcionCuenta;
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