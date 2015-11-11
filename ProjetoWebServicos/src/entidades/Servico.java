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
	public String nome;
	
	@Column
	private String descricao;
	
	@Column
	private Integer nota;
	
	@Column
	public String categoria;
	
	@Id
	@GeneratedValue
	private long id;

	public Servico(String nome, String descricao,Integer d, String categoria) {
		this.nome = nome;
		this.descricao = descricao;
		this.nota = d;
		this.categoria = categoria;
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

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
