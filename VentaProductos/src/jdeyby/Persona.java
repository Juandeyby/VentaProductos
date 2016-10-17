package jdeyby;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class Persona {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	
	private String usuario;
	
	@Persistent
	private String contrasena;
	
	@Persistent
	private String nombres;
	
	@Persistent
	private String apellidos;
	
	@Persistent
	private String dni;
	
	@Persistent
	private boolean administrador;
	
	public Persona(String usuario, String contrasena, String nombres,
			String apellidos, String dni, boolean administrador) {
		super();
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.administrador = administrador;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
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

	public boolean isAdministrador() {
		return administrador;
	}

	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}

	public String getUsuario() {
		return usuario;
	}

	@Override
	public String toString() {
		return "Persona [usuario=" + usuario + ", contrasena=" + contrasena
				+ ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", dni=" + dni + ", administrador=" + administrador + "]";
	}
}
