package com.andre.agenda.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tactividad database table.
 * 
 */
@Entity
@NamedQuery(name="Tactividad.findAll", query="SELECT t FROM Tactividad t")
public class Tactividad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TACTIVIDAD_IDACTIVIDAD_GENERATOR", sequenceName="TACTIVIDAD_IDACTIVIDAD_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TACTIVIDAD_IDACTIVIDAD_GENERATOR")
	private Integer idactividad;

	private String descripcion;

	private boolean estado;

	@Temporal(TemporalType.DATE)
	private Date fechafin;

	@Temporal(TemporalType.DATE)
	@Column(name="\"fechaInicio\"")
	private Date fechaInicio;

	@Temporal(TemporalType.DATE)
	private Date fechamodificacion;

	@Temporal(TemporalType.DATE)
	private Date fecharegistro;

	private String lugar;

	private String nombre;

	//bi-directional many-to-one association to Tusuario
	@ManyToOne
	@JoinColumn(name="idusuario")
	private Tusuario tusuario;

	public Tactividad() {
	}

	public Integer getIdactividad() {
		return this.idactividad;
	}

	public void setIdactividad(Integer idactividad) {
		this.idactividad = idactividad;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean getEstado() {
		return this.estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Date getFechafin() {
		return this.fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechamodificacion() {
		return this.fechamodificacion;
	}

	public void setFechamodificacion(Date fechamodificacion) {
		this.fechamodificacion = fechamodificacion;
	}

	public Date getFecharegistro() {
		return this.fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	public String getLugar() {
		return this.lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tusuario getTusuario() {
		return this.tusuario;
	}

	public void setTusuario(Tusuario tusuario) {
		this.tusuario = tusuario;
	}

}