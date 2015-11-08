package persistencia;

import java.util.ArrayList;

import entidades.Servico;
import exceptions.DAOException;

public interface IServicoDAO {

		public ArrayList<Servico> returnServico(String nome) throws DAOException;
		public ArrayList<Servico> returnServicoCategoria(String nome) throws DAOException;
		public ArrayList<Servico> returnAllServico() throws DAOException;
		public ArrayList<Servico> insertServico(Servico s) throws DAOException;
		public ArrayList<Servico> deleteServico()throws DAOException;
		public ArrayList<Servico> updateServico()throws DAOException;
	}

