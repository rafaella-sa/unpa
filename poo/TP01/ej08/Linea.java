package ej08;
public class Linea implements Figura{
	//atributos
	protected double largo;
	protected String borde, fondo;
	//constructor
	protected Linea(double largo, String borde, String fondo){
		this.largo = largo;
		this.borde = borde;
		this.fondo = fondo;
	}
	//devolver el color de borde
	public String getBorde() {
		return borde;
	}
	//cambiar el color de borde
	public void setBorde(String borde) {
		this.borde = borde;
	}
	//devolver el color de fondo
	public String getFondo() {
		return fondo;
	}
	//cambiar el color de fondo
	public void setFondo(String fondo) {
		this.fondo = fondo;
	}
	//dibujar la línea
	public void dibujar() {
		System.out.println("Dibujando la línea");
	}
	//calcular el perímetro de la línea
	public double perimetro() {
		return largo;
	}
	//calcular la superficie de la línea
	public double superficie() {
		return largo;
	}
}
