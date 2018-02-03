package ej08;
public class Circulo implements Figura {
	//atributos
	protected Punto centro;
	protected double radio;
	protected String borde, fondo;
	//constructor
	protected Circulo(Punto centro, double radio, String borde, String fondo){
		this.borde = borde;
		this.fondo = fondo;
		this.radio = radio;
		this.centro = centro;
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
	//dibujar el circulo
	public void dibujar() {
		System.out.println("Dibujando el círculo");
	}
	//calcular el perímetro del circulo
	public double perimetro() {
		double per = 2 * Math.PI * radio;
		return per;
	}
	//calcular la superficie del circulo
	public double superficie() {
		double sup = Math.PI * radio * radio;
		return sup;
	}	
}
