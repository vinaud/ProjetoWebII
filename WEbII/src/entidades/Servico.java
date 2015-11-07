package entidades;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@ManagedBean
@SessionScoped
@Entity
public class Servico {

	@Column
	private String nome;
	
	@Column
	private String descricao;
	
	@Id
	@GeneratedValue
	private long id;

	public Servico(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	public Servico() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
