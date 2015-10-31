package persistencia;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Servico;
import exceptions.DAOException;

public class ServicoDAO implements IServicoDAO {
	
	protected static final EntityManagerFactory
	 factory = Persistence.createEntityManagerFactory("unit");

	@Override
	public Servico returnServico(String nome) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Servico> returnAllServico()throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Servico> insertServicos(Servico s)throws DAOException {
		EntityManager manager = factory.createEntityManager(); 
		
		 try {
		 manager.getTransaction().begin();
		 manager.persist(s);
		 manager.getTransaction().commit();
		 } catch (Exception e) {
			 throw new DAOException();
		 }
		
		ArrayList<Servico> findAll = (ArrayList<Servico>) returnAllServico();
		return findAll; 
	}

	@Override
	public ArrayList<Servico> deleteServico() throws DAOException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Servico> updateServico()throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

}
