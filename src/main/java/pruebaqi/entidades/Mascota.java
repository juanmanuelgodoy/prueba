package pruebaqi.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mascota {

	@Id
	private String id;
	private String nombre;
	private String raza;
	public Mascota(String id, String nombre, String raza) {
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	@Override
	public String toString() {
		return "Mascota [id=" + id + ", nombre=" + nombre + ", raza=" + raza + "]";
	}
	public Mascota() {
		
	}
	
	
}
