package ej12;

public class Alquiler {
protected int dni;
protected String nombre;
protected int fechainicio;
protected int fechafin;
protected int posamarre;
protected Barco barco;
protected Alquiler(int dni, String nombre, int fechainicio, int fechafin, int posamarre, Barco barco){
	this.dni = dni;
	this.nombre = nombre;
	this.fechainicio = fechainicio;
	this.fechafin = fechafin;
	this.posamarre = posamarre;
	this.barco = barco;
}
public int getDni() {
	return dni;
}
public void setDni(int dni) {
	this.dni = dni;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getFechainicio() {
	return fechainicio;
}
public void setFechainicio(int fechainicio) {
	this.fechainicio = fechainicio;
}
public int getFechafin() {
	return fechafin;
}
public void setFechafin(int fechafin) {
	this.fechafin = fechafin;
}
public int getPosamarre() {
	return posamarre;
}
public void setPosamarre(int posamarre) {
	this.posamarre = posamarre;
}

}
