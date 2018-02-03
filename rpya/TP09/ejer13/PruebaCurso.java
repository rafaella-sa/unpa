package ejer13;

import comun.Console;
import comun.Menu;
public class PruebaCurso {

	public static void main(String[] args) {
	int opcion=0;
	int dim=100;
	Curso curso=new Curso(dim);
	Alumno alumno;
	Menu myMenu=new Menu ();
	myMenu.agregarItem("agregar alumno");
	myMenu.agregarItem("alumno con mayor nota");
	myMenu.agregarItem("Nota promedio");
	myMenu.agregarItem("Cantidad de aplazos");
	myMenu.agregarItem("Buscar Alumno");
	myMenu.agregarItem("Ver todos los alumnos");
	do
	{
		opcion = myMenu.ejecutarMenu();
		switch (opcion)
		{
		case 1: {
			alumno=new Alumno();
			System.out.println("dni: ");
			int dni=Console.readInt();
			System.out.println("nota: ");
			float nota=Console.readFloat();
			alumno.setDni(dni);
			alumno.setNota(nota);
			curso.agregarAlumno(alumno);
			break;
		}
		case 2: {
			System.out.println("Mayor nota");
			alumno=curso.alumnoMayornota();
			System.out.println(alumno.getNota());
			System.out.println(" "+alumno.getDni());
			break;
		}
		case 3:{
			System.out.println("nota promedio:"+curso.notaPromedio());
			break;
		}
		case 4:{
			System.out.println("cantidad de aplazos"+curso.cantidadAplazos());
			break;
		}
		case 5:{
			System.out.println("Dni: ");
			int dni=Console.readInt();
			alumno= curso.buscarAlumno(dni);
			if(alumno != null){
				System.out.println("Dni: " +alumno.getDni());
				System.out.println("Nota: " +alumno.getNota());
			}
			else 
				System.out.println("No se encontro el alumno");
				
			break;
		}
		case 6: {
			curso.mostrarAlumnos();
		}
		default:{
			break;
		}

	}
	}while (opcion != 0);

	}
}
