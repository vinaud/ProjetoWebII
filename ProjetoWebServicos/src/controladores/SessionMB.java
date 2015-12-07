package controladores;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import negocio.UsuarioNegocio;
import entidades.Usuario;

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
		this.logged = true;
		
		return "success";
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
