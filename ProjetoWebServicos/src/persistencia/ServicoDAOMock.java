package persistencia;

import java.util.ArrayList;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import entidades.Servico;
import exceptions.DAOException;

@ManagedBean
@SessionScoped
public class ServicoDAOMock implements IServicoDAO{

	public ArrayList<Servico> servicos;
	public ServicoDAOMock()
	{
		this.servicos = new ArrayList<Servico>();
		servicos.add(new Servico("2 Via da Identidade","Servico para tirar a segunda via da carteira de identidade nacional",4,"Documento",123,30));
		servicos.add(new Servico("2 Via da Habilita��o","Servico para gerar 2 via da carteira de habilita��o",5,"Documento",456,25));
		servicos.add(new Servico("Reclama��o","Servico para reclamar de problemas",3,"Ouvidoria",789,15));
	}
	
	@Override
	public ArrayList<Servico> returnServico(String nome) throws DAOException {
		ArrayList<Servico> pesquisado = new ArrayList<Servico>();
		for (int i = 0; i < servicos.size(); i++)
		{
			if(servicos.get(i).getNome().contains(nome))
			
			{
				pesquisado.add(servicos.get(i));
			}
		}
		return pesquisado;
	}

	@Override
	public ArrayList<Servico> returnAllServico() throws DAOException {
		
		return servicos;
	}

	@Override
	public ArrayList<Servico> insertServico(Servico s) throws DAOException {
		servicos.add(s);
		return servicos;
	}

	@Override
	public ArrayList<Servico> deleteServico() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Servico> updateServico(Servico s) throws DAOException {
		
		for (int i = 0; i < servicos.size(); i++)
		{
			if(servicos.get(i).getId() == s.getId())
			
			{
				servicos.add(s);
				servicos.remove(i);
				break;
			}
		}
		return servicos;
	}

	@Override
	public ArrayList<Servico> returnServicoCategoria(String categoria){
	ArrayList<Servico> pesquisado = new ArrayList<Servico>();
	for (int i = 0; i < servicos.size(); i++)
	{
		if(servicos.get(i).getCategoria().contains(categoria))
			
		{
			pesquisado.add(servicos.get(i));
		}
	}
	return pesquisado;
	}

}
