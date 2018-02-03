package Punto14;

public class Kiosco {
	// declaracion de atributos
	String nombre;
	int cantprod;
	int dim;
	Articulos art [];
	boolean abierto;

	// constructor
	Kiosco(boolean abierto, String nombre) {
		this.abierto = abierto;
		this.nombre = nombre;
		abierto = false;
		nombre = "El Don";
	}

	// set/get
	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	void setEstado(boolean estado) {
		this.abierto = estado;
	}

	String getNombre() {
		return nombre;
	}

	boolean getEstado() {
		return abierto;
	}

	// metodos
	
	void compraArticulo() {
		Articulos []art = new Articulos [dim];

	}

	void vendeArticulo() {

	}

}
