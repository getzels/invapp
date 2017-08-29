package com.invapp.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="clt_direccion")
	private String cltDireccion;

	@Column(name="clt_email")
	private String cltEmail;

	@Column(name="clt_fecha_hora_creacion")
	private Timestamp cltFechaHoraCreacion;

	@Column(name="clt_fecha_hora_modi")
	private Timestamp cltFechaHoraModi;

	@Column(name="clt_nombre_empresa")
	private String cltNombreEmpresa;

	@Column(name="clt_rnc")
	private String cltRnc;

	@Column(name="clt_telefono1")
	private String cltTelefono1;

	@Column(name="clt_telefono2")
	private String cltTelefono2;

	@Column(name="clt_usr_codigo_crea")
	private String cltUsrCodigoCrea;

	@Column(name="clt_usr_codigo_modi")
	private String cltUsrCodigoModi;

	@Column(name="codigo_empresa1")
	private String codigoEmpresa1;

	@Column(name="prov_codigo")
	private String provCodigo;

	@Column(name="sec_codigo")
	private String secCodigo;

	//bi-directional many-to-one association to Inventario
	@OneToMany(mappedBy="cliente")
	private List<Inventario> inventarios;

	//bi-directional many-to-one association to TipoEmpresa
	@ManyToOne
	@JoinColumn(name="codigo_empresa", referencedColumnName="codigo_empresa")
	private TipoEmpresa tipoEmpresa;

	public Cliente() {
	}

	public String getCltDireccion() {
		return this.cltDireccion;
	}

	public void setCltDireccion(String cltDireccion) {
		this.cltDireccion = cltDireccion;
	}

	public String getCltEmail() {
		return this.cltEmail;
	}

	public void setCltEmail(String cltEmail) {
		this.cltEmail = cltEmail;
	}

	public Timestamp getCltFechaHoraCreacion() {
		return this.cltFechaHoraCreacion;
	}

	public void setCltFechaHoraCreacion(Timestamp cltFechaHoraCreacion) {
		this.cltFechaHoraCreacion = cltFechaHoraCreacion;
	}

	public Timestamp getCltFechaHoraModi() {
		return this.cltFechaHoraModi;
	}

	public void setCltFechaHoraModi(Timestamp cltFechaHoraModi) {
		this.cltFechaHoraModi = cltFechaHoraModi;
	}

	public String getCltNombreEmpresa() {
		return this.cltNombreEmpresa;
	}

	public void setCltNombreEmpresa(String cltNombreEmpresa) {
		this.cltNombreEmpresa = cltNombreEmpresa;
	}

	public String getCltRnc() {
		return this.cltRnc;
	}

	public void setCltRnc(String cltRnc) {
		this.cltRnc = cltRnc;
	}

	public String getCltTelefono1() {
		return this.cltTelefono1;
	}

	public void setCltTelefono1(String cltTelefono1) {
		this.cltTelefono1 = cltTelefono1;
	}

	public String getCltTelefono2() {
		return this.cltTelefono2;
	}

	public void setCltTelefono2(String cltTelefono2) {
		this.cltTelefono2 = cltTelefono2;
	}

	public String getCltUsrCodigoCrea() {
		return this.cltUsrCodigoCrea;
	}

	public void setCltUsrCodigoCrea(String cltUsrCodigoCrea) {
		this.cltUsrCodigoCrea = cltUsrCodigoCrea;
	}

	public String getCltUsrCodigoModi() {
		return this.cltUsrCodigoModi;
	}

	public void setCltUsrCodigoModi(String cltUsrCodigoModi) {
		this.cltUsrCodigoModi = cltUsrCodigoModi;
	}

	public String getCodigoEmpresa1() {
		return this.codigoEmpresa1;
	}

	public void setCodigoEmpresa1(String codigoEmpresa1) {
		this.codigoEmpresa1 = codigoEmpresa1;
	}

	public String getProvCodigo() {
		return this.provCodigo;
	}

	public void setProvCodigo(String provCodigo) {
		this.provCodigo = provCodigo;
	}

	public String getSecCodigo() {
		return this.secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public List<Inventario> getInventarios() {
		return this.inventarios;
	}

	public void setInventarios(List<Inventario> inventarios) {
		this.inventarios = inventarios;
	}

	public Inventario addInventario(Inventario inventario) {
		getInventarios().add(inventario);
		inventario.setCliente(this);

		return inventario;
	}

	public Inventario removeInventario(Inventario inventario) {
		getInventarios().remove(inventario);
		inventario.setCliente(null);

		return inventario;
	}

	public TipoEmpresa getTipoEmpresa() {
		return this.tipoEmpresa;
	}

	public void setTipoEmpresa(TipoEmpresa tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

}