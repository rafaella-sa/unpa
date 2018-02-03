package ejercicio13;

public class Curso {
	//declaracion de atributo
	private int dimension;
	private Alumno[]vectorAlumno;
	private int actual;
	public Curso(int dim){
		vectorAlumno= new Alumno [dim];
		dimension=dim;
		actual=0;
	}
	
	public void agregarAlumno(Alumno alumno){
		if(actual<dimension){
			vectorAlumno[actual] = alumno;
			actual++;
		}
	}
	
	//a) retornar el DNI del alumno con mayor nota
	public Alumno alumnoMayorNota(){
		Alumno mayor=new Alumno();
		for(int i=0;i<actual;i++){
			if(vectorAlumno[i].getNota()>mayor.getNota())
				mayor=vectorAlumno[i];
		}
		return mayor;
	}

	//b) retornar la nota promedio
	public float notaPromedio(){
		float suma=0;
		for(int i=0;i<actual;i++)
			suma=suma + vectorAlumno[i].getNota();
		return suma/actual;
	}
	//c) Retornar la cantidad de aplazado (valor<=40).
	public int cantidadAplazado(){
		int contador=0;
		for(int i=0;i<actual;i++){
			if(vectorAlumno[i].getNota()<=40)
				contador++;
		}
		return contador;
	}
	
	//d) Retornar la nota de un determinado alumno
	public Alumno buscarAlumno(int dni){
		Alumno buscado=null;
		for(int i=0;i<actual;i++){
			if(vectorAlumno[i].getNota()==dni)
				buscado=vectorAlumno[i];
		}
		return buscado;
	}	
	
	//muestra todo los alumnos por console
	public void mostrarAlumno(){
		System.out.println("******* Dato de alumno *******");
		for( int i=0; i<actual;i++){
			System.out.println("dni: "+vectorAlumno[i].getDni());
			System.out.println("nota: "+vectorAlumno[i].getNota());
			System.out.println("");
		}
		System.out.println("******************************");
	}
}