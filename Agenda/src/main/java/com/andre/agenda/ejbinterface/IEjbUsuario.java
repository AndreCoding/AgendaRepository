package com.andre.agenda.ejbinterface;

import java.util.List;

import javax.ejb.Local;

import com.andre.agenda.entity.Tusuario;


@Local
public interface IEjbUsuario {

	public boolean insert();
	
	
	public List<Tusuario> getListaUsuario();
	public void setListaUsuario(List<Tusuario> listaUsuarios);
	
	public Tusuario getUsuario();
	public void setUsuario(Tusuario usuario);
}
