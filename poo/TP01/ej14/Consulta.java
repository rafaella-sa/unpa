package ej14;
public class Consulta {
	protected int dni;
	protected Fecha fecha;
	protected int numero;
	public Consulta(int dni, Fecha fecha, int numero){
		this.dni = dni;
		this.fecha = fecha;
		this.numero = numero;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public void getFecha(){
		this.fecha.mostrarFormatoFecha();
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
