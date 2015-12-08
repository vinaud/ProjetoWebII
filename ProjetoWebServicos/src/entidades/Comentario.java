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
public class Comentario {

	@Id
	@GeneratedValue
	private long id;
	
	@Column
	public String comentario; //o comentário propriamente dito
	
	@Column
	public String comentador; //username de quem criou o comentário

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getComentador() {
		return comentador;
	}

	public void setComentador(String comentador) {
		this.comentador = comentador;
	}
}
