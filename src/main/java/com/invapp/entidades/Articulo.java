package com.invapp.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the articulos database table.
 * 
 */
@Entity
@Table(name="articulos")
@NamedQuery(name="Articulo.findAll", query="SELECT a FROM Articulo a")
public class Articulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="art_codigo_barra")
	private String artCodigoBarra;

	@Column(name="art_descripcion")
	private String artDescripcion;

	@Column(name="art_descripcion_corta")
	private String artDescripcionCorta;

	@Column(name="art_estado")
	private String artEstado;

	@Column(name="art_existencia")
	private Long artExistencia;

	@Column(name="art_ind_articulo_nuevo")
	private String artIndArticuloNuevo;

	@Column(name="art_medida")
	private String artMedida;

	@Column(name="cod_marca")
	private String codMarca;

	@Column(name="fecha_hora_creacion")
	private Timestamp fechaHoraCreacion;

	@Column(name="fecha_hora_modi")
	private Timestamp fechaHoraModi;

	@Column(name="usr_codigo_crea")
	private String usrCodigoCrea;

	@Column(name="usr_codigo_modi")
	private String usrCodigoModi;

	//bi-directional many-to-one association to ArticulosAlmacen
	@OneToMany(mappedBy="articulo")
	private List<ArticulosAlmacen> articulosAlmacens;

	public Articulo() {
	}

	public String getArtCodigoBarra() {
		return this.artCodigoBarra;
	}

	public void setArtCodigoBarra(String artCodigoBarra) {
		this.artCodigoBarra = artCodigoBarra;
	}

	public String getArtDescripcion() {
		return this.artDescripcion;
	}

	public void setArtDescripcion(String artDescripcion) {
		this.artDescripcion = artDescripcion;
	}

	public String getArtDescripcionCorta() {
		return this.artDescripcionCorta;
	}

	public void setArtDescripcionCorta(String artDescripcionCorta) {
		this.artDescripcionCorta = artDescripcionCorta;
	}

	public String getArtEstado() {
		return this.artEstado;
	}

	public void setArtEstado(String artEstado) {
		this.artEstado = artEstado;
	}

	public Long getArtExistencia() {
		return this.artExistencia;
	}

	public void setArtExistencia(Long artExistencia) {
		this.artExistencia = artExistencia;
	}

	public String getArtIndArticuloNuevo() {
		return this.artIndArticuloNuevo;
	}

	public void setArtIndArticuloNuevo(String artIndArticuloNuevo) {
		this.artIndArticuloNuevo = artIndArticuloNuevo;
	}

	public String getArtMedida() {
		return this.artMedida;
	}

	public void setArtMedida(String artMedida) {
		this.artMedida = artMedida;
	}

	public String getCodMarca() {
		return this.codMarca;
	}

	public void setCodMarca(String codMarca) {
		this.codMarca = codMarca;
	}

	public Timestamp getFechaHoraCreacion() {
		return this.fechaHoraCreacion;
	}

	public void setFechaHoraCreacion(Timestamp fechaHoraCreacion) {
		this.fechaHoraCreacion = fechaHoraCreacion;
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

	public List<ArticulosAlmacen> getArticulosAlmacens() {
		return this.articulosAlmacens;
	}

	public void setArticulosAlmacens(List<ArticulosAlmacen> articulosAlmacens) {
		this.articulosAlmacens = articulosAlmacens;
	}

	public ArticulosAlmacen addArticulosAlmacen(ArticulosAlmacen articulosAlmacen) {
		getArticulosAlmacens().add(articulosAlmacen);
		articulosAlmacen.setArticulo(this);

		return articulosAlmacen;
	}

	public ArticulosAlmacen removeArticulosAlmacen(ArticulosAlmacen articulosAlmacen) {
		getArticulosAlmacens().remove(articulosAlmacen);
		articulosAlmacen.setArticulo(null);

		return articulosAlmacen;
	}

}