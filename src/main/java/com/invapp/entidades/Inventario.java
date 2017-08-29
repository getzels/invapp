package com.invapp.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the inventario database table.
 * 
 */
@Entity
@NamedQuery(name="Inventario.findAll", query="SELECT i FROM Inventario i")
public class Inventario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="fecha_hora_crea")
	private Timestamp fechaHoraCrea;

	@Column(name="fecha_hora_modi")
	private Timestamp fechaHoraModi;

	@Column(name="inv_costo")
	private BigDecimal invCosto;

	@Column(name="inv_estado")
	private String invEstado;

	@Column(name="inv_fecha")
	private Timestamp invFecha;

	@Column(name="total_articulos")
	private BigDecimal totalArticulos;

	@Column(name="usr_codigo_crea")
	private String usrCodigoCrea;

	@Column(name="usr_codigo_modi")
	private String usrCodigoModi;

	//bi-directional many-to-one association to InvDetalle
	@OneToMany(mappedBy="inventario")
	private List<InvDetalle> invDetalles;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="clt_codigo", referencedColumnName="clt_codigo")
	private Cliente cliente;

	public Inventario() {
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

	public BigDecimal getInvCosto() {
		return this.invCosto;
	}

	public void setInvCosto(BigDecimal invCosto) {
		this.invCosto = invCosto;
	}

	public String getInvEstado() {
		return this.invEstado;
	}

	public void setInvEstado(String invEstado) {
		this.invEstado = invEstado;
	}

	public Timestamp getInvFecha() {
		return this.invFecha;
	}

	public void setInvFecha(Timestamp invFecha) {
		this.invFecha = invFecha;
	}

	public BigDecimal getTotalArticulos() {
		return this.totalArticulos;
	}

	public void setTotalArticulos(BigDecimal totalArticulos) {
		this.totalArticulos = totalArticulos;
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

	public List<InvDetalle> getInvDetalles() {
		return this.invDetalles;
	}

	public void setInvDetalles(List<InvDetalle> invDetalles) {
		this.invDetalles = invDetalles;
	}

	public InvDetalle addInvDetalle(InvDetalle invDetalle) {
		getInvDetalles().add(invDetalle);
		invDetalle.setInventario(this);

		return invDetalle;
	}

	public InvDetalle removeInvDetalle(InvDetalle invDetalle) {
		getInvDetalles().remove(invDetalle);
		invDetalle.setInventario(null);

		return invDetalle;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}