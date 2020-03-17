package pruebaqi.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Administrador {

	@Id
	private String id;
	private String nombre;
	private String apellido;
}
