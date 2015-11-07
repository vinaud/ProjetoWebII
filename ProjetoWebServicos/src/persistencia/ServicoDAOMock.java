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
		servicos.add(new Servico("ID","Servico para tirar carteira de identidade"));
		servicos.add(new Servico("Contas","Servico para gerar 2 via de contas"));
		servicos.add(new Servico("Reclamação","Servico para reclamar de problemas"));
	}
	
	@Override
	public Servico returnServico(String nome) throws DAOException {
		// TODO Auto-generated method stub
		return null;
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

}
