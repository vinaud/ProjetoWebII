package negocio;

import java.util.ArrayList;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import entidades.Servico;
import exceptions.DAOException;
import persistencia.IServicoDAO;
import persistencia.ServicoDAOHibernate;
import persistencia.ServicoDAOMock;

@ManagedBean
@SessionScoped
public class ServicoNegocio {
	
	public IServicoDAO dao = new ServicoDAOMock(); ;
	
	
	
	public ArrayList<Servico> getListaServicos() throws DAOException
	{
		return dao.returnAllServico();
	}

}
