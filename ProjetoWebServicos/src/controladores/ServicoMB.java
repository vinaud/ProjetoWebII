package controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RateEvent;

import negocio.ServicoNegocio;
import entidades.Servico;
import exceptions.DAOException;

@ManagedBean(value = "servicoMB")
@SessionScoped
public class ServicoMB {
	
	public ArrayList<Servico> servicos;
	public ArrayList<Servico> resPesquisa;
	public ServicoNegocio negocio;
	public Servico s;
	public String nome ="";
	public String desc ="";
	public String cat ="";
	
	public String busca = "";
	public String buscaCategoria = "";
	
	public Servico exibido;
	
	public String comment =" ";


	
	public ServicoMB() throws DAOException
	{
		negocio = new ServicoNegocio();
		s = new Servico();
		exibido = new Servico();
		 retrieveServicos();
		
	}
	
	public String retrieveServicos() throws DAOException
	{
		
			servicos = negocio.getListaServicos();
			return "success";
		 
	
	}
	
	public String insereServico() throws DAOException
	{
		//System.out.println("Entrei");
			s = new Servico();
			s.setNome(nome);
			s.setDescricao(desc);
			s.setCategoria(cat);
			s.setNota(0);
			s.setVoteCount(0);
			Random gerador = new Random();
			 
	      
			s.setId( gerador.nextInt());
			servicos = negocio.insereServico(s);
			
			 return "index?faces-redirect=true";
		 
	
	}
	
	public String pesquisaServico() throws DAOException, IOException
	{
		//System.out.println("Entrei");
			resPesquisa = negocio.buscaServico(busca);
		//	System.out.println("Entrei");
			 return "resultadoPesquisa.xhtml?faces-redirect=true";
		 
	
	}
	
	
	public String pesquisaCategoria(String categoria) throws DAOException, IOException
	{
		//System.out.println("Entrei");
		resPesquisa = negocio.buscaCategoria(categoria);
		//System.out.println("sai");
		 return "categoria.xhtml?faces-redirect=true";
		 
	
	}
	
	public void onrate(RateEvent rateEvent) throws DAOException {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Avaliação", "Você deu nota:" + ((Integer) rateEvent.getRating()).intValue());
        FacesContext.getCurrentInstance().addMessage(null, message);
        
        Integer rate = (Integer) rateEvent.getRating();
       servicos =  negocio.atualizarAvaliacao(exibido, rate);
       // System.out.println("avaliou nota :"+ rate);
        
        
        
    }
	
	public String comentar() throws DAOException
	{
		
		
		this.exibido.comentarios.add(comment);
		
		
		negocio.atualizarServico(exibido);
		 //System.out.println("gg");
		 
		
		return "servico01.xhtml?faces-redirect=true";
	}
	
	
	
	public String getExibido(Servico p)
	{
		this.exibido = p;
	//	System.out.println("entrou: "+p.getNome());
		 return "servico01.xhtml?faces-redirect=true";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public ArrayList<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(ArrayList<Servico> servicos) {
		this.servicos = servicos;
	}

	public ServicoNegocio getNegocio() {
		return negocio;
	}

	public void setNegocio(ServicoNegocio negocio) {
		this.negocio = negocio;
	}

	public Servico getS() {
		return s;
	}

	public void setS(Servico s) {
		this.s = s;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getBusca() {
		return busca;
	}

	public void setBusca(String busca) {
		this.busca = busca;
	}

	public ArrayList<Servico> getResPesquisa() {
		return resPesquisa;
	}

	public void setResPesquisa(ArrayList<Servico> resPesquisa) {
		this.resPesquisa = resPesquisa;
	}

	public Servico getExibido() {
		return exibido;
	}

	public void setExibido(Servico exibido) {
		this.exibido = exibido;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}