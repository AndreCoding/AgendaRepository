package com.andre.agenda.daointerface;

import javax.persistence.EntityManager;

import com.andre.agenda.entity.Tusuario;

public interface IDaoUsuario {
	
	public boolean insert(EntityManager em, Tusuario usuario) throws Exception;
	
	public Tusuario getByIdUsuario(EntityManager em, int idUsuario) throws Exception;
	
	public boolean update(EntityManager em, Tusuario usuario) throws Exception;

}
