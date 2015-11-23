package persistencia;

import java.util.ArrayList;

import entidades.Central;
import exceptions.DAOException;

public class CentralDAOMock implements ICentralDAO {

	public ArrayList<Central> centrals;
	public Central pesquisado;
	public CentralDAOMock()
	{
		this.centrals = new ArrayList<Central>();
		centrals.add(new Central("Central do Cidadão Via Direta","lorem ipsum dolor...",-5.840348,-35.209706));
		centrals.add(new Central("Central do Cidadão Alecrim","lorem ipsum dolor...",-5.7952444,-35.2174835));
	}
	
	@Override
	public Central returnCentral(String nome) throws DAOException {
		
		for (int i = 0; i < centrals.size(); i++)
		{
			if (centrals.get(i).getNome().equalsIgnoreCase(nome))
			{
				pesquisado = centrals.get(i);
				break;
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
