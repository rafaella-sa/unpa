package ejercicio13;
import comun.Console;
import comun.Menu;

public class Prueba {

	public static void main(String[] args) {
		int opcion=0;
		int dim=100;
		Curso curso = new Curso(dim);
		Alumno alumno;
		Menu myMenu = new Menu();
		
		myMenu.agregarItems("Agregar un alumno");
		myMenu.agregarItems("Alumno con mayor nota");
		myMenu.agregarItems("Nota Promedio");
		myMenu.agregarItems("Cantidad de aplazado");
		myMenu.agregarItems("buscar alumno");
	    myMenu.agregarItems("Mostrar todos los alumnos");
	        
	    opcion=myMenu.ejecutarMenu();

	    while(opcion!=0)
	            {
	        switch (opcion)
	                 {
	            case 1: //agregar un alumno 
	            		{ 
	            		alumno =new Alumno();
	            		System.out.print("dni: ");
	            		int dni=Console.readInt();
	            		System.out.print("nota: ");
	            		float nota=Console.readInt();
	            		alumno.setDni(dni);
	            		alumno.setNota(nota);
	            		curso.agregarAlumno(alumno);
	            		break;
	            		}
	            case 2: //alumno con mayor nota
	            		{ 	
	            		System.out.print("Mayor nota: ");
	            		alumno=curso.alumnoMayorNota();
	            		System.out.print(alumno.getNota());
	            		System.out.println(" "+alumno.getDni());
	            		break;
	                   }
	            case 3: //nota promedio
	            		{
	            		System.out.println("Nota promedio: "+curso.notaPromedio());
	            		break;
	            		}
	            case 4: //cantidad de aplazado
	            		{
	            		System.out.println("Cantidad de aplazados: "+curso.cantidadAplazado());
	            		break;
	            }
	            case 5: //Buscar alumno
	            		{
	            		System.out.print("dni: ");
		            	int dni=Console.readInt();
	            		alumno=curso.buscarAlumno(dni);
	            		if(alumno != null)
	            		{
	            			System.out.println("dni: "+alumno.getDni());
	            			System.out.println("nota: "+alumno.getNota());
	            		}
	            		else 
	            			System.out.println("No se encuentra el alumno");
	            		break;
	            }
	            case 6: //mostrar todos los alumnos
	            	{
	            		curso.mostrarAlumno();
	            		break;
	            	}
	            default:
	            	break;
	                         	       
	            }//switch
	            opcion=myMenu.ejecutarMenu();
	       }//while
	       System.out.println("");
	       if(opcion==0)
		      System.out.println("Ha finalizado la secion!!");
         }
}
