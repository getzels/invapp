package com.invapp.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the tipo_empresa database table.
 * 
 */
@Entity
@Table(name="tipo_empresa")
@NamedQuery(name="TipoEmpresa.findAll", query="SELECT t FROM TipoEmpresa t")
public class TipoEmpresa implements Serializable {
	private static final long serialVersionUID = 1L;

	private String estado;

	@Column(name="fecha_hora_crea")
	private Timestamp fechaHoraCrea;

	@Column(name="fecha_hora_modi")
	private Timestamp fechaHoraModi;

	@Column(name="tipo_empresa")
	private String tipoEmpresa;

	@Column(name="usr_codigo_cra")
	private String usrCodigoCra;

	@Column(name="usr_codigo_modi")
	private String usrCodigoModi;

	//bi-directional many-to-one association to Cliente
	@OneToMany(mappedBy="tipoEmpresa")
	private List<Cliente> clientes;

	public TipoEmpresa() {
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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

	public String getTipoEmpresa() {
		return this.tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	public String getUsrCodigoCra() {
		return this.usrCodigoCra;
	}

	public void setUsrCodigoCra(String usrCodigoCra) {
		this.usrCodigoCra = usrCodigoCra;
	}

	public String getUsrCodigoModi() {
		return this.usrCodigoModi;
	}

	public void setUsrCodigoModi(String usrCodigoModi) {
		this.usrCodigoModi = usrCodigoModi;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente addCliente(Cliente cliente) {
		getClientes().add(cliente);
		cliente.setTipoEmpresa(this);

		return cliente;
	}

	public Cliente removeCliente(Cliente cliente) {
		getClientes().remove(cliente);
		cliente.setTipoEmpresa(null);

		return cliente;
	}

}