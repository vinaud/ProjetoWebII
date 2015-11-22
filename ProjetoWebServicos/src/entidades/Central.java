package entidades;

import javax.annotation.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@ManagedBean
@Entity
public class Central {
	
	@Column
	private String nome;
	
	@Column
	private String descricao;
	
	@Column
	private long lat;
	
	@Column
	private long longi;
	
	@Id
	@GeneratedValue
	private long id;
	
	public Central(String nome){
		this.nome = nome;
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

	public long getLat() {
		return lat;
	}

	public void setLat(long lat) {
		this.lat = lat;
	}

	public long getLongi() {
		return longi;
	}

	public void setLongi(long longi) {
		this.longi = longi;
	}

}
