package controladores;

import java.util.ArrayList;

import javax.annotation.ManagedBean;

import negocio.ServicoNegocio;
import entidades.Servico;
import exceptions.DAOException;

@ManagedBean


public class ServicoMB {
	
	public ArrayList<Servico> servicos;
	ServicoNegocio negocio;
	
	public ServicoMB()
	{
		retrieveServicos();
		negocio = new ServicoNegocio();
	}
	
	public void retrieveServicos()
	{
		try {
			this.servicos=negocio.getListaServicos();
		} 
		catch (DAOException e) {
			
			e.printStackTrace();
		}
	}

}
