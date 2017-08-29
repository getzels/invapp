package com.invapp.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the inv_detalle database table.
 * 
 */
@Entity
@Table(name="inv_detalle")
@NamedQuery(name="InvDetalle.findAll", query="SELECT i FROM InvDetalle i")
public class InvDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="art_codigo")
	private String artCodigo;

	@Column(name="art_descripcion")
	private String artDescripcion;

	@Column(name="dti_cantidad")
	private Long dtiCantidad;

	@Column(name="dti_costo_total")
	private BigDecimal dtiCostoTotal;

	@Column(name="dti_precio")
	private BigDecimal dtiPrecio;

	@Column(name="dti_total")
	private BigDecimal dtiTotal;

	private String medida;

	@Column(name="reg_id")
	private double regId;

	//bi-directional many-to-one association to Inventario
	@ManyToOne
	@JoinColumn(name="inv_codigo", referencedColumnName="inv_codigo")
	private Inventario inventario;

	public InvDetalle() {
	}

	public String getArtCodigo() {
		return this.artCodigo;
	}

	public void setArtCodigo(String artCodigo) {
		this.artCodigo = artCodigo;
	}

	public String getArtDescripcion() {
		return this.artDescripcion;
	}

	public void setArtDescripcion(String artDescripcion) {
		this.artDescripcion = artDescripcion;
	}

	public Long getDtiCantidad() {
		return this.dtiCantidad;
	}

	public void setDtiCantidad(Long dtiCantidad) {
		this.dtiCantidad = dtiCantidad;
	}

	public BigDecimal getDtiCostoTotal() {
		return this.dtiCostoTotal;
	}

	public void setDtiCostoTotal(BigDecimal dtiCostoTotal) {
		this.dtiCostoTotal = dtiCostoTotal;
	}

	public BigDecimal getDtiPrecio() {
		return this.dtiPrecio;
	}

	public void setDtiPrecio(BigDecimal dtiPrecio) {
		this.dtiPrecio = dtiPrecio;
	}

	public BigDecimal getDtiTotal() {
		return this.dtiTotal;
	}

	public void setDtiTotal(BigDecimal dtiTotal) {
		this.dtiTotal = dtiTotal;
	}

	public String getMedida() {
		return this.medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public double getRegId() {
		return this.regId;
	}

	public void setRegId(double regId) {
		this.regId = regId;
	}

	public Inventario getInventario() {
		return this.inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

}