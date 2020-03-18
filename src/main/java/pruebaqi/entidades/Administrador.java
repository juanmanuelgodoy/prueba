package pruebaqi.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Administrador {

	@Id
	private String id;
	private String nombre;
	private String apellido;
	public Administrador(String id, String nombre, String apellido) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
Falta hacer el to String	
	
}
