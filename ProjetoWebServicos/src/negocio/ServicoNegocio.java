package negocio;

import java.util.ArrayList;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import entidades.Servico;
import exceptions.DAOException;
import persistencia.IServicoDAO;
import persistencia.ServicoDAOMock;

@ManagedBean
@SessionScoped
public class ServicoNegocio {
	
	public IServicoDAO dao = new ServicoDAOMock(); ;
	
	public ArrayList<Servico> getListaServicos() throws DAOException
	{
		return dao.returnAllServico();
	}
	
	public ArrayList<Servico> insereServico(Servico s) throws DAOException
	{
		return dao.insertServico(s);
	}

	public ArrayList<Servico> buscaServico(String busca) throws DAOException 
	{
			return dao.returnServico(busca);
	}

	public ArrayList<Servico> buscaCategoria(String buscaCategoria) throws DAOException 
	{
			return dao.returnServicoCategoria(buscaCategoria);
	}
	
	public ArrayList<Servico> atualizarAvaliacao(Servico s, Integer novaNota) throws DAOException
	{
		if(s.getVoteCount() == 0)
		{
			s.setNota(novaNota);
		}
		
		else
		{
			int n =(( s.getNota() + novaNota )/ 2);
			s.setNota(n);
		}
		
		s.setVoteCount(s.getVoteCount() + 1);
		
		return dao.returnAllServico();
	}
	
	public void atualizarServico(Servico s) throws DAOException
	{
		dao.updateServico(s);
	}


}
