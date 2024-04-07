package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {
	
	//main metodo
	public static void main(String[] args) { 
		
		//NOS PIDEN QUE PARA EL ALUMNO ALAVAR FACUNDO SE REGISTRE LAS NOTAS FINALES DE 4 MATERIAS (10 EN TO2)
		Alumno alumno = generarAlumno();
		registrarNotas(alumno, 2);
	}
	
	public static Alumno generarAlumno() {
		Alumno alumno = new Alumno();
		
		Scanner scanner = new Scanner(System.in);//Permite crear datos desde la consola
		System.out.println("Ingrese el legajo");
		Integer legajo =scanner.nextInt();//el next int es para pasar una cadena a un entero
		System.out.println("Ingrese el Apellido");
		String apellido =scanner.next();//next es para que pase directamente al string
		System.out.println("Ingrese el nombre");
		String nombre =scanner.next();
		
		//el valor que esta almacenado en legajo se lo asiga al atributo setLegajo del alumno.
		//los sets son para asignar valores
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		return alumno;
	}
	
	public static void registrarNotas(Alumno alumno, int numMaterias) {
		Scanner scanner = new Scanner(System.in);
		while (numMaterias<=2) {
			//cargar materia
			System.out.println("Ingrese codigo de la materia");
			String codigoMateria= scanner.next();
			System.out.println("Ingrese nombre de la materia");
			String nombreMateria= scanner.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			System.out.println("Ingrese codigo del registro de nota");
			String codigoNota= scanner.next();
			System.out.println("Ingrese la nota final");
			Float nota= scanner.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);
			
			System.out.println(registroNota.toString());
			numMaterias++;
		}
	}
}
//APUNTES
// EJEMPLO WHILE
/*
System.out.println("Inicio del programa");
int numero = 1;
while(numero<=10) {
	System.out.println(numero);
	numero++;
}
System.out.println("Fin del programa");


//EJEMPLO DO WHILE
System.out.println("Inicio del programa");
numero = 1;
do {
	System.out.println(numero);
	numero++;
	
}while(numero<=10) ;
System.out.println("Fin del programa");
*/

//se llama al metodo toString de alumno.
//System.out.println(alumno.toString());
