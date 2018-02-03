package ej13;
import comun.*;
public class Main_Curso {
	public static void main(String[] args){
		Menu menu;
		menu = new Menu();
		int opcion;
		int dim = 100;
		Curso curso = new Curso(dim);
		Alumno alumno;
		menu.agregarItem("Agregar un alumno");
		menu.agregarItem("Alumno con mayor nota");
		menu.agregarItem("Nota Promedio");
		menu.agregarItem("Cantidad de aplazos");
		menu.agregarItem("Buscar alumno");
		menu.agregarItem("Mostrar todos los alumnos");
		do{
			opcion = menu.ejecutarMenu();
			switch(opcion){
				case 1: {
						alumno = new Alumno();
						int dni = Console.readInt("Ingrese el DNI: ");
						double nota=Console.readInt("Ingrese la nota: ");
						alumno.setDni(dni);
						alumno.setNota(nota);
						curso.agregarAlumno(alumno);
						break;
						}
				case 2: {
						alumno=curso.alumnoMayorNota();
						System.out.println("La mayor nota es del alumno de DNI = " + alumno.getDni()); 
						System.out.println(" y nota = " + alumno.getNota());
						break;
						}
				case 3: {
						System.out.println("La nota promedio es: " + curso.notaPromedio());
						break;
						}
				case 4: {
						System.out.println("Cantidad de aplazos: " + curso.cantidadAplazos());
						break;
						}
				case 5: {
						int dni = Console.readInt("Ingrese el DNI: ");
						alumno = curso.buscarAlumno(dni);
						if(alumno != null){
            			System.out.println("DNI: "+ alumno.getDni());
            			System.out.println("Nota: " + alumno.getNota());
						}
						else 
							System.out.println("No se encuentra el alumno.");
						break;						
						}
				case 6: {
						curso.mostrarAlumno();
						break;
						}
				default:
						break;
				}
		}
		while(opcion!=0);
		if(opcion == 0)
			System.out.println("La sección ha finalizado.");		
	}
}