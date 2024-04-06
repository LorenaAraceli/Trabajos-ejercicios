package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.Notas;

public class Main {

	public static void main(String[] args) {
		
		
		// registro de notas
		
		Alumno alumno = new Alumno();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("- Ingrese legajo: ");
		Integer legajo = scanner.nextInt();
		System.out.println("- Ingrese apellido: ");
	    String apellido = scanner.next();
		System.out.println("- Ingrese nombre: ");
		String nombre = scanner.next();
		System.out.println("************************************");
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		
		
		System.out.println(alumno.toString());
		
		System.out.println("************************************");
		
		int numMaterias = 1;
		while (numMaterias <= 4) {
			
			System.out.println("   ");
			System.out.println("- ingrese el codigo de la materia: ");
			String codMateria = scanner.next();
			System.out.println("- ingrese el nombre de la materia: ");
			String nomMateria = scanner.next();
			System.out.println("*****************************************");
			
			Materia materia = new Materia(codMateria, nomMateria);		
		

			System.out.println("- ingrese el codigo de nota: ");
			String codNota = scanner.next();
			System.out.println("- ingrese la nota: ");
			Float notaFinal = scanner.nextFloat();
			System.out.println("***************************************************************************************************************");
			
		    Notas notas = new Notas(codNota, alumno, materia, notaFinal);
		   
		    System.out.println(notas.toString());
		    
		    numMaterias++;
		    
		    System.out.println("****************************************************************************************************************");
		    
		}
		
	}

}
