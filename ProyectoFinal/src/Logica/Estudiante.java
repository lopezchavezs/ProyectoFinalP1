package Logica;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String usuario;
	private String contrasenia;
	private ArrayList<Prisma> misPrismas;
	
	
	public Estudiante(String nombre, String apellido, String usuario, String contrasenia) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		misPrismas = new ArrayList<>();
	}
	public ArrayList<Prisma> getMisPrismas() {
		return misPrismas;
	}

	public void setMisPrismas(ArrayList<Prisma> misPrismas) {
		this.misPrismas = misPrismas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	

}
