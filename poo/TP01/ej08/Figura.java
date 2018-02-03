package ej08;
public interface Figura {
	double superficie();
	double perimetro();
	void dibujar();
	void setBorde(String borde);
	void setFondo(String fondo);
	String getBorde();
	String getFondo();
}
