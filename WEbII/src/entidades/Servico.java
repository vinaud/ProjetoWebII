package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Servico {

	
	private String nome;
	
	@Id
	@GeneratedValue
	private long id;
}
