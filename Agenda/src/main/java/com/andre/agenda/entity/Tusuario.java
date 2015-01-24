package com.andre.agenda.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the tusuario database table.
 * 
 */
@Entity
@NamedQuery(name="Tusuario.findAll", query="SELECT t FROM Tusuario t")
public class Tusuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TUSUARIO_IDUSUARIO_GENERATOR", sequenceName="TUSUARIO_IDUSUARIO_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TUSUARIO_IDUSUARIO_GENERATOR")
	private Integer idusuario;

	private String apellido;

	private String correo;

	@Temporal(TemporalType.DATE)
	private Date fechamodificacion;

	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	@Temporal(TemporalType.DATE)
	private Date fecharegistro;

	private String nombre;

	private String password;

	//bi-directional many-to-one association to Tactividad
	@OneToMany(mappedBy="tusuario")
	private List<Tactividad> tactividads;

	public Tusuario() {
	}

	public Integer getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFechamodificacion() {
		return this.fechamodificacion;
	}

	public void setFechamodificacion(Date fechamodificacion) {
		this.fechamodificacion = fechamodificacion;
	}

	public Date getFechanacimiento() {
		return this.fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public Date getFecharegistro() {
		return this.fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Tactividad> getTactividads() {
		return this.tactividads;
	}

	public void setTactividads(List<Tactividad> tactividads) {
		this.tactividads = tactividads;
	}

	public Tactividad addTactividad(Tactividad tactividad) {
		getTactividads().add(tactividad);
		tactividad.setTusuario(this);

		return tactividad;
	}

	public Tactividad removeTactividad(Tactividad tactividad) {
		getTactividads().remove(tactividad);
		tactividad.setTusuario(null);

		return tactividad;
	}

}