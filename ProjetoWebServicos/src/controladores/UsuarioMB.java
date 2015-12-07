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
	public String nome;
	public String username;
	public String sobrenome;
	public String email;
	public String senha;
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
		user = new Usuario();
		user.setNome(nome);
		user.setUsername(username);
		user.setSobrenome(sobrenome);
		user.setEmail(email);
		user.setSenha(senha);
		
		
		try 
		{
		
		negocio.insereUsuario(user);
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro", "Usuário cadastrado com sucesso:" + (user.getUsername()));
		FacesContext.getCurrentInstance().addMessage(null, message);
		
		return "index?faces-redirect=true";
		} 
		
		catch (DAOException e)
		{
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro", "Erro no banco, cadastro não efetuado");
			 FacesContext.getCurrentInstance().addMessage(null, message);
			 e.printStackTrace();

				
		}
		catch (UsuarioExistenteException e) 
		{
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro", "Usuário "+ (user.getUsername()) +" já existente. Insira outro username");
			FacesContext.getCurrentInstance().addMessage(null, message);
			e.printStackTrace();
			
		}
		
		
		 
		return "fail";
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public UsuarioNegocio getNegocio() {
		return negocio;
	}

	public void setNegocio(UsuarioNegocio negocio) {
		this.negocio = negocio;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
