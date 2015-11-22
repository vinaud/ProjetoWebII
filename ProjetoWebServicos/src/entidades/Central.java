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

}
