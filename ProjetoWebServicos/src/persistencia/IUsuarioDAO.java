package persistencia;

import java.util.ArrayList;


import entidades.Usuario;
import exceptions.DAOException;

public interface IUsuarioDAO {
	public Usuario returnUsuario(String username) throws DAOException;
	public ArrayList<Usuario> returnAllUsuario() throws DAOException;
	public ArrayList<Usuario> insertUsuario(Usuario u) throws DAOException;
	public ArrayList<Usuario> deleteUsuario()throws DAOException;
	public ArrayList<Usuario> updateUsuario(Usuario u)throws DAOException;
	public boolean existeUsuario(String user);
}
