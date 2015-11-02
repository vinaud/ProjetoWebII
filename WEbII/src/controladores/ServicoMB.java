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

	
	public ServicoMB() throws DAOException
	{
		negocio = new ServicoNegocio();
		servicos = retrieveServicos();
		
	}
	
	public ArrayList<Servico> retrieveServicos() throws DAOException
	{
		
			return negocio.getListaServicos();
		 
	
	}

}
