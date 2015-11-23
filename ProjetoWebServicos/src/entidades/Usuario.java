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
public class Usuario {

	@Column
	public String nome;
	
	@Column
	private String sobrenome;
	
	@Column
	public String email;
	
	@Id
	@GeneratedValue
	private long id;
}
