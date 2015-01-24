package com.andre.agenda.dao;

import javax.persistence.EntityManager;

import com.andre.agenda.daointerface.IDaoUsuario;
import com.andre.agenda.entity.Tusuario;

public class DaoUsuario implements IDaoUsuario {

	@Override
	public boolean insert(EntityManager em, Tusuario usuario) throws Exception {
		// TODO Auto-generated method stub
		em.persist(usuario);
		return true;
	}

	@Override
	public Tusuario getByIdUsuario(EntityManager em, int idUsuario)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(EntityManager em, Tusuario usuario) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
