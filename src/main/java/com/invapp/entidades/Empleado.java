package com.invapp.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the empleado database table.
 * 
 */
@Entity
@NamedQuery(name="Empleado.findAll", query="SELECT e FROM Empleado e")
public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="clt_codigo")
	private String cltCodigo;

	@Column(name="emp_cedula")
	private String empCedula;

	@Column(name="emp_codigo")
	private String empCodigo;

	@Column(name="emp_direccion")
	private String empDireccion;

	@Column(name="emp_email")
	private String empEmail;

	@Column(name="emp_estado")
	private String empEstado;

	@Column(name="emp_nombre")
	private String empNombre;

	@Column(name="emp_telefono1")
	private String empTelefono1;

	@Column(name="emp_telefono2")
	private String empTelefono2;

	@Column(name="fecha_hora_crea")
	private Timestamp fechaHoraCrea;

	@Column(name="fecha_hora_modi")
	private Timestamp fechaHoraModi;

	@Column(name="sal_codigo")
	private String salCodigo;

	@Column(name="usr_codigo_crea")
	private String usrCodigoCrea;

	@Column(name="usr_codigo_modi")
	private String usrCodigoModi;

	public Empleado() {
	}

	public String getCltCodigo() {
		return this.cltCodigo;
	}

	public void setCltCodigo(String cltCodigo) {
		this.cltCodigo = cltCodigo;
	}

	public String getEmpCedula() {
		return this.empCedula;
	}

	public void setEmpCedula(String empCedula) {
		this.empCedula = empCedula;
	}

	public String getEmpCodigo() {
		return this.empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public String getEmpDireccion() {
		return this.empDireccion;
	}

	public void setEmpDireccion(String empDireccion) {
		this.empDireccion = empDireccion;
	}

	public String getEmpEmail() {
		return this.empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpEstado() {
		return this.empEstado;
	}

	public void setEmpEstado(String empEstado) {
		this.empEstado = empEstado;
	}

	public String getEmpNombre() {
		return this.empNombre;
	}

	public void setEmpNombre(String empNombre) {
		this.empNombre = empNombre;
	}

	public String getEmpTelefono1() {
		return this.empTelefono1;
	}

	public void setEmpTelefono1(String empTelefono1) {
		this.empTelefono1 = empTelefono1;
	}

	public String getEmpTelefono2() {
		return this.empTelefono2;
	}

	public void setEmpTelefono2(String empTelefono2) {
		this.empTelefono2 = empTelefono2;
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

	public String getSalCodigo() {
		return this.salCodigo;
	}

	public void setSalCodigo(String salCodigo) {
		this.salCodigo = salCodigo;
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