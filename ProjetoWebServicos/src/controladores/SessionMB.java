package controladores;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import negocio.UsuarioNegocio;
import entidades.Usuario;

@ManagedBean(value = "sessionMB")
@SessionScoped
public class SessionMB {
	
	Usuario logado;
	UsuarioNegocio negocio;
	
	public SessionMB()
	{
		this.logado = null;
		negocio = new UsuarioNegocio();
	}
	
	public String login()
	{
		return "success";
	}
	
	public String logout()
	{
		this.logado = null;
		return "success";
	}

	public Usuario getLogado() {
		return logado;
	}

}
