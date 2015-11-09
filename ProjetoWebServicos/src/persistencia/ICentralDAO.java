package persistencia;

import java.util.ArrayList;

import entidades.Central;
import exceptions.DAOException;

public interface ICentralDAO {

		public ArrayList<Central> returnCentral(String nome) throws DAOException;
		public ArrayList<Central> returnAllCentral() throws DAOException;
		public ArrayList<Central> insertCentral(Central s) throws DAOException;
		public ArrayList<Central> deleteCentral()throws DAOException;
		public ArrayList<Central> updateCentral()throws DAOException;
	}

