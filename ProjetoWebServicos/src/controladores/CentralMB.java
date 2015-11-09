package controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import negocio.CentralNegocio;
import entidades.Central;
import exceptions.DAOException;

@ManagedBean(value = "centralMB")
@SessionScoped
public class CentralMB {
	
	public ArrayList<Central> centrals;
	public CentralNegocio negocio;
	public Central c;
	public String nome ="";
	
	public String busca = "";
	public String buscaCategoria = "";

	
	public CentralMB() throws DAOException
	{
		negocio = new CentralNegocio();
		c = new Central();
		 retrieveCentrals();
		
	}
	
	public String retrieveCentrals() throws DAOException
	{
		
			centrals = negocio.getListaCentrals();
			return "success";
		 
	
	}
	
	public String insereCentral() throws DAOException
	{
		
			c = new Central();
			c.setNome(nome);
			centrals = negocio.insereCentral(c);
			
			 return "listaCentrais?faces-redirect=true";
		 
	
	}
	
	public String pesquisaCentral() throws DAOException, IOException
	{
		
			centrals = negocio.buscaCentral(busca);
			 return "/WebContent/resultadoPesquisa.xhtml?faces-redirect=true";
		 
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public ArrayList<Central> getCentrals() {
		return centrals;
	}

	public void setCentrals(ArrayList<Central> centrals) {
		this.centrals = centrals;
	}

	public CentralNegocio getNegocio() {
		return negocio;
	}

	public void setNegocio(CentralNegocio negocio) {
		this.negocio = negocio;
	}

	public Central getC() {
		return c;
	}

	public void setS(Central c) {
		this.c = c;
	}

	public String getBusca() {
		return busca;
	}

	public void setBusca(String busca) {
		this.busca = busca;
	}

}
