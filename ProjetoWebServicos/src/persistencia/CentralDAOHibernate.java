package persistencia;

import java.util.ArrayList;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Criteria;

import entidades.Central;
import exceptions.DAOException;

public class CentralDAOHibernate implements ICentralDAO {
	
	protected static final EntityManagerFactory
	 factory = Persistence.createEntityManagerFactory("unit");

	@Override
	public ArrayList<Central> returnCentral(String nome) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Central> returnAllCentral()throws DAOException {
		EntityManager em = factory.createEntityManager();
		Query query = (Query) em.createQuery("from Central");  
		ArrayList<Central> list = (ArrayList<Central>)  ((Criteria) query).list();
		em.close();
		return list;
	}

	@Override
	public ArrayList<Central> insertCentral(Central s)throws DAOException {
		EntityManager manager = factory.createEntityManager(); 
		
		 try {
		 manager.getTransaction().begin();
		 manager.persist(s);
		 manager.getTransaction().commit();
		 } catch (Exception e) {
			 throw new DAOException();
		 }
		
		ArrayList<Central> findAll = (ArrayList<Central>) returnAllCentral();
		return findAll; 
	}

	@Override
	public ArrayList<Central> deleteCentral() throws DAOException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Central> updateCentral()throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

}
