package negocio;

import java.util.ArrayList;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import entidades.Central;
import exceptions.DAOException;
import persistencia.ICentralDAO;
import persistencia.CentralDAOHibernate;
import persistencia.CentralDAOMock;

@ManagedBean
@SessionScoped
public class CentralNegocio {
	
	public ICentralDAO dao = new CentralDAOMock(); ;
	
	
	
	public ArrayList<Central> getListaCentrals() throws DAOException
	{
		return dao.returnAllCentral();
	}
	
	public ArrayList<Central> insereCentral(Central c) throws DAOException
	{
		return dao.insertCentral(c);
	}

	public ArrayList<Central> buscaCentral(String busca) throws DAOException {
	
			return dao.returnCentral(busca);
		
	}


}
