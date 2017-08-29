package com.invapp.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the pais database table.
 * 
 */
@Entity
@Table(name="pais")
@NamedQuery(name="Pai.findAll", query="SELECT p FROM Pai p")
public class Pai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="pai_descripcion")
	private String paiDescripcion;

	@Column(name="pai_estado")
	private String paiEstado;

	@Column(name="pai_fecha_hora_crea")
	private Timestamp paiFechaHoraCrea;

	@Column(name="pai_fecha_hora_modi")
	private Timestamp paiFechaHoraModi;

	@Column(name="pai_usr_codigo_crea")
	private String paiUsrCodigoCrea;

	@Column(name="pai_usr_codigo_modi")
	private String paiUsrCodigoModi;

	//bi-directional many-to-one association to Provincia
	@OneToMany(mappedBy="pai")
	private List<Provincia> provincias;

	public Pai() {
	}

	public String getPaiDescripcion() {
		return this.paiDescripcion;
	}

	public void setPaiDescripcion(String paiDescripcion) {
		this.paiDescripcion = paiDescripcion;
	}

	public String getPaiEstado() {
		return this.paiEstado;
	}

	public void setPaiEstado(String paiEstado) {
		this.paiEstado = paiEstado;
	}

	public Timestamp getPaiFechaHoraCrea() {
		return this.paiFechaHoraCrea;
	}

	public void setPaiFechaHoraCrea(Timestamp paiFechaHoraCrea) {
		this.paiFechaHoraCrea = paiFechaHoraCrea;
	}

	public Timestamp getPaiFechaHoraModi() {
		return this.paiFechaHoraModi;
	}

	public void setPaiFechaHoraModi(Timestamp paiFechaHoraModi) {
		this.paiFechaHoraModi = paiFechaHoraModi;
	}

	public String getPaiUsrCodigoCrea() {
		return this.paiUsrCodigoCrea;
	}

	public void setPaiUsrCodigoCrea(String paiUsrCodigoCrea) {
		this.paiUsrCodigoCrea = paiUsrCodigoCrea;
	}

	public String getPaiUsrCodigoModi() {
		return this.paiUsrCodigoModi;
	}

	public void setPaiUsrCodigoModi(String paiUsrCodigoModi) {
		this.paiUsrCodigoModi = paiUsrCodigoModi;
	}

	public List<Provincia> getProvincias() {
		return this.provincias;
	}

	public void setProvincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}

	public Provincia addProvincia(Provincia provincia) {
		getProvincias().add(provincia);
		provincia.setPai(this);

		return provincia;
	}

	public Provincia removeProvincia(Provincia provincia) {
		getProvincias().remove(provincia);
		provincia.setPai(null);

		return provincia;
	}

}