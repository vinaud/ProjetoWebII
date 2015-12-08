package persistencia;

import java.util.ArrayList;

import entidades.Usuario;
import exceptions.DAOException;

public class UsuarioDAOMock implements IUsuarioDAO {

	public ArrayList<Usuario> usuarios;
	
	public UsuarioDAOMock()
	{
		this.usuarios = new ArrayList<Usuario>();
	}
	
	
	@Override
	public Usuario returnUsuario(String username)
			throws DAOException {
		for (int i = 0; i < usuarios.size(); i++)
		{
			if(usuarios.get(i).getUsername().equals(username))
			
			{
				return usuarios.get(i);
				
			}
		}
		return null;
	}
	
	public boolean existeUsuario(String user) {
		for (int i = 0; i < usuarios.size(); i++)
		{
			if(usuarios.get(i).getUsername().equals(user))
			
			{
				return true;
				
			}
		}
		return false;
	}
	
	public boolean existeUsuarioSenha(String user, String senha) {
		for (int i = 0; i < usuarios.size(); i++)
		{
			if(usuarios.get(i).getUsername().equals(user) && usuarios.get(i).getSenha().equals(senha))
			
			{
				return true;
				
			}
		}
		return false;
	}
	

	@Override
	public ArrayList<Usuario> returnAllUsuario() throws DAOException {
		
		return usuarios;
	}

	@Override
	public ArrayList<Usuario> insertUsuario(Usuario u) throws DAOException {
		usuarios.add(u);
		return usuarios;
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
