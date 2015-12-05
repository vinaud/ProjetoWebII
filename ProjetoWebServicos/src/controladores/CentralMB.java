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
	
	public Central pesquisado;
	
	public Central exibido;
	
	public String comment = " ";

	
	public CentralMB() throws DAOException
	{
		negocio = new CentralNegocio();
		c = new Central();
		exibido = new Central();
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
	
	/*public String pesquisaCentral() throws DAOException, IOException
	{
		
			centrals = negocio.buscaCentral(busca);
			 return "/WebContent/resultadoPesquisa.xhtml?faces-redirect=true";
		 
	
	}*/
	
	public String pesquisaCentral(String central) throws DAOException, IOException
	{
		//System.out.println("Entrei");
		pesquisado = negocio.buscaCentral(central);
		//System.out.println("sai");
		 return "central.xhtml?faces-redirect=true";
		 
	
	}
	
	public String comentar() throws DAOException
	{
		
		
		this.exibido.comentarios.add(comment);
		
		
		negocio.atualizarCentral(exibido);
		 //System.out.println("gg");
		 
		
		return "central.xhtml?faces-redirect=true";
	}
	
	public String getExibido(Central p)
	{
		this.exibido = p;
		 return "central.xhtml?faces-redirect=true";
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

	public Central getPesquisado() {
		return pesquisado;
	}

	public void setPesquisado(Central pesquisado) {
		this.pesquisado = pesquisado;
	}
	
	public Central getExibido() {
		return exibido;
	}

	public void setExibido(Central exibido) {
		this.exibido = exibido;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
