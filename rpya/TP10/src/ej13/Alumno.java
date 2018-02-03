package ej13;
public class Alumno {
	private int dni; 
	private double nota;	
	public Alumno (){
		dni = 0;
		nota = 0.0;
	}
	public int getDni(){
		return dni;
	}
	public void setDni(int dni){
		this.dni = dni;
	}
	public double getNota(){
		return nota;
	}
	public void setNota(double nota){
		this.nota = nota;
	}
}
