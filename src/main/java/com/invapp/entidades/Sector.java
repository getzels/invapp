package com.invapp.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sector database table.
 * 
 */
@Entity
@NamedQuery(name="Sector.findAll", query="SELECT s FROM Sector s")
public class Sector implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="sec_codigo")
	private String secCodigo;

	@Column(name="sec_descripcion")
	private String secDescripcion;

	@Column(name="sec_estado")
	private String secEstado;

	@Column(name="sec_fecha_hora_crea")
	private Timestamp secFechaHoraCrea;

	@Column(name="sec_fecha_hora_modi")
	private Timestamp secFechaHoraModi;

	@Column(name="sec_usr_codigo_crea")
	private String secUsrCodigoCrea;

	@Column(name="sec_usr_codigo_modi")
	private String secUsrCodigoModi;

	//bi-directional many-to-one association to Provincia
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="pai_codigo", referencedColumnName="pai_codigo"),
		@JoinColumn(name="pro_codigo", referencedColumnName="pro_codigo")
		})
	private Provincia provincia;

	public Sector() {
	}

	public String getSecCodigo() {
		return this.secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public String getSecDescripcion() {
		return this.secDescripcion;
	}

	public void setSecDescripcion(String secDescripcion) {
		this.secDescripcion = secDescripcion;
	}

	public String getSecEstado() {
		return this.secEstado;
	}

	public void setSecEstado(String secEstado) {
		this.secEstado = secEstado;
	}

	public Timestamp getSecFechaHoraCrea() {
		return this.secFechaHoraCrea;
	}

	public void setSecFechaHoraCrea(Timestamp secFechaHoraCrea) {
		this.secFechaHoraCrea = secFechaHoraCrea;
	}

	public Timestamp getSecFechaHoraModi() {
		return this.secFechaHoraModi;
	}

	public void setSecFechaHoraModi(Timestamp secFechaHoraModi) {
		this.secFechaHoraModi = secFechaHoraModi;
	}

	public String getSecUsrCodigoCrea() {
		return this.secUsrCodigoCrea;
	}

	public void setSecUsrCodigoCrea(String secUsrCodigoCrea) {
		this.secUsrCodigoCrea = secUsrCodigoCrea;
	}

	public String getSecUsrCodigoModi() {
		return this.secUsrCodigoModi;
	}

	public void setSecUsrCodigoModi(String secUsrCodigoModi) {
		this.secUsrCodigoModi = secUsrCodigoModi;
	}

	public Provincia getProvincia() {
		return this.provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

}