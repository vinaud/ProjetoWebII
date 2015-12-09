package entidades;


import javax.persistence.Column;
import javax.persistence.Id;

public class JoinCentralServico {
	
	/* Classe que faz a associação entre uma central de serviço e seus serviços */
	
	@Id
	private long centralID;
	
	@Id
	private long servicoID;
	
	@Column
	private int tempo;
	
	@Column
	private Integer nota;

	public long getCentralID() {
		return centralID;
	}

	public void setCentralID(long centralID) {
		this.centralID = centralID;
	}

	public long getServicoID() {
		return servicoID;
	}

	public void setServicoID(long servicoID) {
		this.servicoID = servicoID;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

}
