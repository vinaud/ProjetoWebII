package controladores;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import negocio.UsuarioNegocio;
import entidades.Usuario;
import exceptions.DAOException;
import exceptions.UserNotFOundException;

@ManagedBean(value = "sessionMB")
@SessionScoped
public class SessionMB {
	
	public Usuario logado;
	public UsuarioNegocio negocio;
	public boolean logged;
	
	String username = "";
	String password = "";
	
	
	public SessionMB()
	{
		this.logado = null;
		negocio = new UsuarioNegocio();
		this.logged = false;
		 
	}
	
	public String login() 
	{
		try
		{
		System.out.println("entrou");
		logado = negocio.getUsuarioLogin( username,  password);
		System.out.println("logou");
		this.logged = true;
		
		return "index?faces-redirect=true";
		}
		
		catch(UserNotFOundException e)
		{
			System.out.println("usernotfound");
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Login", "Usuário ou senha incorreto(s)" );
			FacesContext.getCurrentInstance().addMessage(null, message);
			return "fail";
		}
		
		catch(DAOException e)
		{
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Login", "Erro no banco, tente novamente mais tarde" );
			FacesContext.getCurrentInstance().addMessage(null, message);
			return "fail";
		}
	}
	
	public String logout()
	{
		this.logado = null;
		this.logged = false;
		
		
		return "success";
	}

	public Usuario getLogado() {
		return logado;
	}
	
	public boolean getLogged()
	{
		return logged;
	}

	public UsuarioNegocio getNegocio() {
		return negocio;
	}

	public void setNegocio(UsuarioNegocio negocio) {
		this.negocio = negocio;
	}


	public void setLogado(Usuario logado) {
		this.logado = logado;
	}

	public void setLogged(boolean logged) {
		this.logged = logged;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
