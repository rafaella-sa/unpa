package ej08;
public class Rectangulo implements Figura{
	//atributos
	protected Punto psi, psd, pii, pid;
	protected String borde, fondo;
	//constructor
	protected Rectangulo(Punto psi, Punto psd, Punto pii, Punto pid, String borde, String fondo){
		this.psi = psi;
		this.psd = psd;
		this.pii = pii;
		this.pid = pid;
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
	//calcular la superficie del rectángulo
	public double superficie(){
		double sup = (psd.x - psi.x) * (psi.y - pii.y);
		return sup;
	}
	//calcular el perímetro del rectángulo
	public double perimetro(){
		double per = 2 * (psd.x - psi.x) + 2 * (psi.y - pii.y);
		return per;
	}
	//dibujar el rectángulo
	public void dibujar(){
		System.out.println("Dibujando el rectángulo");
	}
}
