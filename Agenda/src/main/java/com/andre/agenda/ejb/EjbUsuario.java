package com.andre.agenda.ejb;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.andre.agenda.dao.DaoUsuario;
import com.andre.agenda.daointerface.IDaoUsuario;
import com.andre.agenda.ejbinterface.IEjbUsuario;
import com.andre.agenda.entity.Tusuario;

@Stateless
public class EjbUsuario implements IEjbUsuario {

	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	private EntityTransaction et = null;
	
	private List<Tusuario> listaUsuario;
	private Tusuario usuario;
	
	public EjbUsuario(){
		this.usuario= new Tusuario();
	}
	
	@Override
	public boolean insert() {
		try{
			SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
			
			String fechaActual = sf.format(new Date());
			
			usuario.setFecharegistro(new Date(fechaActual));
			usuario.setFechamodificacion(new Date(fechaActual));
			
			IDaoUsuario daoUsuario = new DaoUsuario();
			
			emf = Persistence.createEntityManagerFactory("Agenda");
			em = emf.createEntityManager();
			et = em.getTransaction();
			
			et.begin();
			daoUsuario.insert(em, this.usuario);
			return true;
			
		}catch(Exception e){
			if(et!=null){
				et.rollback();
			}
			
			System.out.println("Error: " + e.getMessage());
			return false;
		}finally{
			if(em!=null){
				em.close();
				em=null;
			}
			if(emf!=null){
				emf.close();
				emf = null;
			}
			et=null;
		}
	}

	@Override
	public List<Tusuario> getListaUsuario() {
		// TODO Auto-generated method stub
		return this.listaUsuario;
	}

	@Override
	public void setListaUsuario(List<Tusuario> listaUsuarios) {
		// TODO Auto-generated method stub
		this.listaUsuario=listaUsuarios;
	}

	@Override
	public Tusuario getUsuario() {
		// TODO Auto-generated method stub
		return this.usuario;
	}

	@Override
	public void setUsuario(Tusuario usuario) {
		// TODO Auto-generated method stub
		this.usuario=usuario;
	}

}
