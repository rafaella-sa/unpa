package ejer13;

public class Curso {
	private int dimension;
	private Alumno []vectorAlumnos;
	private int actual;
//CONSTRUCTOR
	public Curso (int dim){
		vectorAlumnos=new Alumno [dim];
		dimension=dim;
		actual=0;
	}
	public void agregarAlumno(Alumno alumno){
		if (actual<dimension){
			vectorAlumnos[actual]=alumno;
			actual++;
		}
	}
	//retornar el dni del alumno con mayor nota.
	public Alumno alumnoMayornota(){
		Alumno mayor=new Alumno();
		for (int i=0;i<actual;i++){
			if (vectorAlumnos[i].getNota()>mayor.getNota())
				mayor=vectorAlumnos[i];
		}
		return mayor;
	}
	public float notaPromedio(){
		float suma=0;
		for (int i=0;i<actual; i++)
			suma=suma+vectorAlumnos[i].getNota();
		return suma/ actual;
	}
	public int cantidadAplazos(){
		int contador=0;
		for (int i=0; i<actual; i++){
			if (vectorAlumnos[i].getNota() <=40)
			contador++;
		}
		return contador;
			
	}
	public Alumno buscarAlumno (int dni){
		Alumno buscado = null;
		for (int i=0; i<actual; i++){
			if (vectorAlumnos[i].getDni()==dni)
				buscado=vectorAlumnos[i];
		}
		return buscado;
	}

	public void mostrarAlumnos(){
		System.out.println("datos del alumno");
		for (int i=0;i<actual;i++){
			System.out.println("dni:"+vectorAlumnos[i].getDni());
			System.out.println("nota:"+vectorAlumnos[i].getNota());
			System.out.println("");
		}
		System.out.println("");
	}
}		
	