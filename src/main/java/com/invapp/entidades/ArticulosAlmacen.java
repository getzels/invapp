package com.invapp.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the articulos_almacen database table.
 * 
 */
@Entity
@Table(name="articulos_almacen")
@NamedQuery(name="ArticulosAlmacen.findAll", query="SELECT a FROM ArticulosAlmacen a")
public class ArticulosAlmacen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ara_costo")
	private BigDecimal araCosto;

	@Column(name="ara_estado")
	private String araEstado;

	@Column(name="ara_fecha_hora_crea")
	private Timestamp araFechaHoraCrea;

	@Column(name="ara_fecha_hora_modi")
	private Timestamp araFechaHoraModi;

	@Column(name="ara_marca")
	private String araMarca;

	@Column(name="ara_maximo")
	private Long araMaximo;

	@Column(name="ara_minimo")
	private Long araMinimo;

	@Column(name="ara_ubicacion")
	private String araUbicacion;

	@Column(name="ara_usr_codigo_crea")
	private String araUsrCodigoCrea;

	@Column(name="ara_usr_codigo_modi")
	private String araUsrCodigoModi;

	//bi-directional many-to-one association to Articulo
	@ManyToOne
	@JoinColumn(name="art_codigo", referencedColumnName="art_codigo")
	private Articulo articulo;

	public ArticulosAlmacen() {
	}

	public BigDecimal getAraCosto() {
		return this.araCosto;
	}

	public void setAraCosto(BigDecimal araCosto) {
		this.araCosto = araCosto;
	}

	public String getAraEstado() {
		return this.araEstado;
	}

	public void setAraEstado(String araEstado) {
		this.araEstado = araEstado;
	}

	public Timestamp getAraFechaHoraCrea() {
		return this.araFechaHoraCrea;
	}

	public void setAraFechaHoraCrea(Timestamp araFechaHoraCrea) {
		this.araFechaHoraCrea = araFechaHoraCrea;
	}

	public Timestamp getAraFechaHoraModi() {
		return this.araFechaHoraModi;
	}

	public void setAraFechaHoraModi(Timestamp araFechaHoraModi) {
		this.araFechaHoraModi = araFechaHoraModi;
	}

	public String getAraMarca() {
		return this.araMarca;
	}

	public void setAraMarca(String araMarca) {
		this.araMarca = araMarca;
	}

	public Long getAraMaximo() {
		return this.araMaximo;
	}

	public void setAraMaximo(Long araMaximo) {
		this.araMaximo = araMaximo;
	}

	public Long getAraMinimo() {
		return this.araMinimo;
	}

	public void setAraMinimo(Long araMinimo) {
		this.araMinimo = araMinimo;
	}

	public String getAraUbicacion() {
		return this.araUbicacion;
	}

	public void setAraUbicacion(String araUbicacion) {
		this.araUbicacion = araUbicacion;
	}

	public String getAraUsrCodigoCrea() {
		return this.araUsrCodigoCrea;
	}

	public void setAraUsrCodigoCrea(String araUsrCodigoCrea) {
		this.araUsrCodigoCrea = araUsrCodigoCrea;
	}

	public String getAraUsrCodigoModi() {
		return this.araUsrCodigoModi;
	}

	public void setAraUsrCodigoModi(String araUsrCodigoModi) {
		this.araUsrCodigoModi = araUsrCodigoModi;
	}

	public Articulo getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

}