package controladores;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import negocio.UsuarioNegocio;
import entidades.Usuario;
import exceptions.DAOException;
import exceptions.UsuarioExistenteException;

@ManagedBean(value = "usuarioMB")
@SessionScoped
public class UsuarioMB {

	public Usuario user; 
	private UsuarioNegocio negocio;
	
	public UsuarioMB()
	{
		user = new Usuario();
		negocio = new UsuarioNegocio();
		
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}
	
	public String cadastrar()
	{
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro", "Usuário cadastrado com sucesso:" + (user.getUsername()));
		try 
		{
			
		negocio.insereUsuario(user);
		  
		} 
		
		catch (DAOException e)
		{
			 message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro", "Erro no banco, cadastro não efetuado");
			e.printStackTrace();
		}
		catch (UsuarioExistenteException e) 
		{
			message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro", "Usuário "+ (user.getUsername()) +" já existente. Insira outro username");
			e.printStackTrace();
		}
		finally
		{
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
		 
		 return null;
		
	}
}
