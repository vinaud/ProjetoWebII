package entidades;

import java.util.ArrayList;

import javax.annotation.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@ManagedBean
@Entity
public class Central {
	
	@Column
	private String nome;
	
	@Column
	private String descricao;
	
	@Column
	private double lat;
	
	@Column
	private double longi;
	
	@Column
	public ArrayList<Comentario> comentarios = new ArrayList<Comentario>();
	
	@Id
	@GeneratedValue
	private long id;
	
	 @OneToMany(fetch = FetchType.LAZY)
     private ArrayList<Servico> cervicos;
	
	public Central(String nome, String descricao, double d, double e){
		this.nome = nome;
		this.descricao = descricao;
		this.lat = d;
		this.longi = e;
	}
	
	public Central(){
		//Auto
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome2) {
		this.nome = nome2;
		
	}
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(long lat) {
		this.lat = lat;
	}

	public double getLongi() {
		return longi;
	}

	public void setLongi(long longi) {
		this.longi = longi;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public ArrayList<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(ArrayList<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

}
