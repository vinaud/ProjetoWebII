package controladores;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import negocio.UsuarioNegocio;
import entidades.Usuario;

@ManagedBean(value = "sessionMB")
@SessionScoped
public class SessionMB {
	
	private Usuario logado;
	private UsuarioNegocio negocio;
	private boolean logged;
	
//	private int size = 50;  
  //  private String notFound = "default";
	
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

}
