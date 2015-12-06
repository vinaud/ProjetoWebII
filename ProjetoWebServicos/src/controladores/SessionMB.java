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
	
	public String hello = "";
	
	
	public SessionMB()
	{
		this.logado = null;
		negocio = new UsuarioNegocio();
		this.logged = false;
		
		this.hello = "Bem vindo (a)";
		 
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
		
		this.hello = "Bem vindo (a)";
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

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public void setLogado(Usuario logado) {
		this.logado = logado;
	}

	public void setLogged(boolean logged) {
		this.logged = logged;
	}

	

}
