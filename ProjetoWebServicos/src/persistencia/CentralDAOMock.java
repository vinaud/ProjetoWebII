package persistencia;

import java.util.ArrayList;

import entidades.Central;
import exceptions.DAOException;

public class CentralDAOMock implements ICentralDAO {

	public ArrayList<Central> centrals;
	public CentralDAOMock()
	{
		this.centrals = new ArrayList<Central>();
		centrals.add(new Central("Central do Cidadão Via Direta"));
		centrals.add(new Central("Central do Cidadão Alecrim"));
	}
	
	@Override
	public ArrayList<Central> returnCentral(String nome) throws DAOException {
		ArrayList<Central> pesquisado = new ArrayList<Central>();
		for (int i = 0; i < centrals.size(); i++)
		{
			if (((Central) centrals.listIterator(i)).getNome().contains(nome))
			{
				pesquisado.add(((Central) centrals.listIterator(i)));
			}
		}
		return pesquisado;
	}

	@Override
	public ArrayList<Central> returnAllCentral() throws DAOException {
		
		return centrals;
	}

	@Override
	public ArrayList<Central> insertCentral(Central s) throws DAOException {
		centrals.add(s);
		return centrals;
	}

	@Override
	public ArrayList<Central> deleteCentral() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Central> updateCentral() throws DAOException {
		return null;
	}

}
