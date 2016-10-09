package jdeyby;

import java.security.Key;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Persona {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String nombres;
	
	@Persistent
	private String apellidos;
	
	@Persistent
	private String dni;
	
	@Persistent
	private String contrasena;
	
	@Persistent
	private boolean administrador;

	public Persona(String nombres, String apellidos, String dni,
			String contrasena) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.contrasena = contrasena;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public boolean isAdministrador() {
		return administrador;
	}

	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}

	@Override
	public String toString() {
		return "Persona [key=" + key + ", nombres=" + nombres + ", apellidos="
				+ apellidos + ", dni=" + dni + ", contrasena=" + contrasena
				+ ", administrador=" + administrador + "]";
	}
}
