package controladores;

import java.util.ArrayList;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import negocio.ServicoNegocio;
import entidades.Servico;
import exceptions.DAOException;

@ManagedBean
@SessionScoped
public class ServicoMB {
	
	public ArrayList<Servico> servicos;
	public ServicoNegocio negocio;
	public Servico s;

	
	public ServicoMB() throws DAOException
	{
		negocio = new ServicoNegocio();
		s = new Servico();
		 retrieveServicos();
		
	}
	
	public String retrieveServicos() throws DAOException
	{
		
			servicos = negocio.getListaServicos();
			return "success";
		 
	
	}
	
	public String insereServico() throws DAOException
	{
		
			servicos = negocio.insereServico(s);
			
			 return "index?faces-redirect=true";
		 
	
	}

}
