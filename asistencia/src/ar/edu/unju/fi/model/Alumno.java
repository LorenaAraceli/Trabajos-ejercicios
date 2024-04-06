package ar.edu.unju.fi.model;

public class Alumno {
	private Integer legajo;
	private String apellido;
	private String nombre;

	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(Integer legajo, String apellido, String nombre) {
		super();
		this.legajo = legajo;
		this.apellido = apellido;
		this.nombre = nombre;
	}

	
	@Override
	public String toString() {
		return "Legajo:" + legajo + " , Apellido:" + apellido + " , Nombre=" + nombre;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
