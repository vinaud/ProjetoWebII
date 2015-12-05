package persistencia;

import java.util.ArrayList;

import entidades.Usuario;
import exceptions.DAOException;

public class UsuarioDAOMock implements IUsuarioDAO {

	@Override
	public ArrayList<Usuario> returnUsuario(String username)
			throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Usuario> returnAllUsuario() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Usuario> insertUsuario(Usuario u) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Usuario> deleteUsuario() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Usuario> updateUsuario(Usuario u) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

}
