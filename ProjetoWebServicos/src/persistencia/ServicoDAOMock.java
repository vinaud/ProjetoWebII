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
		servicos.add(new Servico("ID","Servico para tirar carteira de identidade",4,"Documento"));
		servicos.add(new Servico("Contas","Servico para gerar 2 via de contas",4.8,"Documento"));
		servicos.add(new Servico("Reclamação","Servico para reclamar de problemas",3,"Ouvidoria"));
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
	public ArrayList<Servico> updateServico() throws DAOException {
		return null;
	}

	@Override
	public ArrayList<Servico> returnServicoCategoria(String categoria){
	ArrayList<Servico> pesquisado = new ArrayList<Servico>();
	for (int i = 0; i < servicos.size(); i++)
	{
		if(servicos.get(i).getNome().contains(categoria))
			
		{
			pesquisado.add(servicos.get(i));
		}
	}
	return pesquisado;
	}

}
