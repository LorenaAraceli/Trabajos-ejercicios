package ar.edu.unju.fi.model;

public class Notas {

	private String codigo;
	private Alumno alumno;
	private Materia materia;
	private Float nota;

	public Notas() {
		// TODO Auto-generated constructor stub
	}

	public Notas(String codigo, Alumno alumno, Materia materia, Float nota) {
		super();
		this.codigo = codigo;
		this.alumno = alumno;
		this.materia = materia;
		this.nota = nota;
	}

	@Override
	public String toString() {
		return " - Notas: codigo=" + codigo+ " | Alumno: " + alumno + " | materia:" + materia +" | nota=" + nota;
	}

	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Float getNota() {
		return nota;
	}

	public void setNota(Float nota) {
		this.nota = nota;
	}
	
	
	
	
	
}
