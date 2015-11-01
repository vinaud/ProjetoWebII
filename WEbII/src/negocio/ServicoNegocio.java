package negocio;

import java.util.ArrayList;

import entidades.Servico;
import exceptions.DAOException;
import persistencia.IServicoDAO;
import persistencia.ServicoDAOHibernate;
import persistencia.ServicoDAOMock;

public class ServicoNegocio {
	
	private IServicoDAO dao ;
	
	public ServicoNegocio()
	{
		dao = new ServicoDAOMock();
	}
	
	public ArrayList<Servico> getListaServicos() throws DAOException
	{
		return dao.returnAllServico();
	}

}
