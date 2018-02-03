package ejer13;

public class Alumno {
	private int dni=0;
	private float nota=0;

	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		if (nota>=0 && nota <= 100)
			this.nota = nota;
	}

}


