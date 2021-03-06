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
		centrals.add(new Central("Central do Cidad�o Via Direta","A Central do Cidad�o foi criada em maio de 2008 para servir de canal de comunica��o direta entre o cidad�o e o Supremo Tribunal Federal (STF), com o objetivo de facilitar o acesso �s informa��es sobre a compet�ncia, o funcionamento e as atribui��es da Suprema Corte.",-5.840348,-35.209706));
		centrals.add(new Central("Central do Cidad�o Alecrim","A Central do Cidad�o foi criada em maio de 2008 para servir de canal de comunica��o direta entre o cidad�o e o Supremo Tribunal Federal (STF), com o objetivo de facilitar o acesso �s informa��es sobre a compet�ncia, o funcionamento e as atribui��es da Suprema Corte.",-5.7952444,-35.2174835));
	}
	
	@Override
	public Central returnCentral(String nome) throws DAOException {
		
		for (int i = 0; i < centrals.size(); i++)
		{
			if (centrals.get(i).getNome().equals(nome))
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

	@Override
	public ArrayList<Central> updateCentral(Central s) {
		for (int i = 0; i < centrals.size(); i++)
		{
			if (centrals.get(i).getNome().equals(s.getNome()))
			
			{
				centrals.add(s);
				centrals.remove(i);
				break;
			}
		}
		return centrals;
		
	}

}
