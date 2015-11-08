package persistencia;

import java.util.ArrayList;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Criteria;

import antlr.collections.List;
import entidades.Servico;
import exceptions.DAOException;

public class ServicoDAOHibernate implements IServicoDAO {
	
	protected static final EntityManagerFactory
	 factory = Persistence.createEntityManagerFactory("unit");

	@Override
	public ArrayList<Servico> returnServico(String nome) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Servico> returnAllServico()throws DAOException {
		EntityManager em = factory.createEntityManager();
		Query query = (Query) em.createQuery("from Servico");  
		ArrayList<Servico> list = (ArrayList<Servico>)  ((Criteria) query).list();
		em.close();
		return list;
	}

	@Override
	public ArrayList<Servico> insertServico(Servico s)throws DAOException {
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

	@Override
	public ArrayList<Servico> returnServicoCategoria(String nome)
			throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

}
