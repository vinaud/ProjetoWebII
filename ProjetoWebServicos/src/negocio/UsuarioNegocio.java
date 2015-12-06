package negocio;

import persistencia.IUsuarioDAO;
import persistencia.UsuarioDAOMock;
import entidades.Usuario;
import exceptions.DAOException;
import exceptions.UsuarioExistenteException;

public class UsuarioNegocio {
	private IUsuarioDAO dao;
	
	public UsuarioNegocio(){
		dao = new UsuarioDAOMock();
	}

	public void insereUsuario(Usuario user) throws DAOException, UsuarioExistenteException {
		if(dao.returnUsuario(user.getUsername()) !=null)
		{
		dao.insertUsuario(user);
		}
		else
		{
			throw new UsuarioExistenteException();
		}
		
	}

}
