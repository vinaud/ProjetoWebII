package entidades;

import java.util.ArrayList;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
	private Integer voteCount ;
	
	@Column
	public String categoria;
	
	@Column
	private int tempo;
	
	@Column
	public ArrayList<Comentario> comentarios = new ArrayList<Comentario>();
	
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
    private Central central;

	public Servico(String nome, String descricao,Integer d, String categoria, long id, int tempo) {
		this.nome = nome;
		this.descricao = descricao;
		this.nota = d;
		this.categoria = categoria;
		voteCount = 1;
		this.id = id;
		this.tempo = tempo;
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

	public Integer getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(Integer voteCount) {
		this.voteCount = voteCount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public ArrayList<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(ArrayList<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	
}
