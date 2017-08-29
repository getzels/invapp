package com.invapp.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the provincia database table.
 * 
 */
@Entity
@NamedQuery(name="Provincia.findAll", query="SELECT p FROM Provincia p")
public class Provincia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="pro_descripcion")
	private String proDescripcion;

	@Column(name="pro_estado")
	private String proEstado;

	@Column(name="pro_fecha_hora_crea")
	private Timestamp proFechaHoraCrea;

	@Column(name="pro_fecha_hora_modi")
	private Timestamp proFechaHoraModi;

	@Column(name="pro_usr_codigo_crea")
	private String proUsrCodigoCrea;

	@Column(name="pro_usr_codigo_modi")
	private String proUsrCodigoModi;

	//bi-directional many-to-one association to Pai
	@ManyToOne
	@JoinColumn(name="pai_codigo", referencedColumnName="pai_codigo")
	private Pai pai;

	//bi-directional many-to-one association to Sector
	@OneToMany(mappedBy="provincia")
	private List<Sector> sectors;

	public Provincia() {
	}

	public String getProDescripcion() {
		return this.proDescripcion;
	}

	public void setProDescripcion(String proDescripcion) {
		this.proDescripcion = proDescripcion;
	}

	public String getProEstado() {
		return this.proEstado;
	}

	public void setProEstado(String proEstado) {
		this.proEstado = proEstado;
	}

	public Timestamp getProFechaHoraCrea() {
		return this.proFechaHoraCrea;
	}

	public void setProFechaHoraCrea(Timestamp proFechaHoraCrea) {
		this.proFechaHoraCrea = proFechaHoraCrea;
	}

	public Timestamp getProFechaHoraModi() {
		return this.proFechaHoraModi;
	}

	public void setProFechaHoraModi(Timestamp proFechaHoraModi) {
		this.proFechaHoraModi = proFechaHoraModi;
	}

	public String getProUsrCodigoCrea() {
		return this.proUsrCodigoCrea;
	}

	public void setProUsrCodigoCrea(String proUsrCodigoCrea) {
		this.proUsrCodigoCrea = proUsrCodigoCrea;
	}

	public String getProUsrCodigoModi() {
		return this.proUsrCodigoModi;
	}

	public void setProUsrCodigoModi(String proUsrCodigoModi) {
		this.proUsrCodigoModi = proUsrCodigoModi;
	}

	public Pai getPai() {
		return this.pai;
	}

	public void setPai(Pai pai) {
		this.pai = pai;
	}

	public List<Sector> getSectors() {
		return this.sectors;
	}

	public void setSectors(List<Sector> sectors) {
		this.sectors = sectors;
	}

	public Sector addSector(Sector sector) {
		getSectors().add(sector);
		sector.setProvincia(this);

		return sector;
	}

	public Sector removeSector(Sector sector) {
		getSectors().remove(sector);
		sector.setProvincia(null);

		return sector;
	}

}