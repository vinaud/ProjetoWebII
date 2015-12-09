package negocio;

import persistencia.IUsuarioDAO;
import persistencia.UsuarioDAOMock;
import entidades.Usuario;
import exceptions.DAOException;
import exceptions.UserNotFOundException;
import exceptions.UsuarioExistenteException;

public class UsuarioNegocio {
	private IUsuarioDAO dao;
	
	public UsuarioNegocio()
	{
		dao = new UsuarioDAOMock();
	}

	public void insereUsuario(Usuario user) throws DAOException, UsuarioExistenteException 
	{
		if(! dao.existeUsuario(user.getUsername()))
		{
			dao.insertUsuario(user);
		}
		else
		{
			throw new UsuarioExistenteException();
		}
	}

	public Usuario getUsuarioLogin(String username, String password) throws UserNotFOundException, DAOException
	{
		if(dao.existeUsuarioSenha(username, password))
		{
			return dao.returnUsuario(username);
		}
		throw new UserNotFOundException();
		
	}

}
