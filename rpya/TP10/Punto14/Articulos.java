package Punto14;

public class Articulos {
	// declaracion de atributos
	private String descripcion;
	private float precio = 00;
	private int codigo;
	private int stock;

	// constructor
	Articulos(String descripcion, int precio, int codigo, int stock) {
		this.precio = precio;
		this.descripcion = descripcion;
		this.precio = precio;
		this.codigo = codigo;
		this.stock = stock;
	}

	// set/get
	void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
		return;
	}

	void setPrecio(float precio) {
		this.precio = precio;
		precio=00;
		return;
	}

	void setCodigo(int codigo) {
		this.codigo = codigo;
		return;
	}

	void setStock(int stock) {
		this.stock = stock;
		return;
	}

	String getDescripcion() {
		return descripcion;
	}

	float getPrecio(float precio) {
		return precio;
	}

	int getCodigo(int codigo) {
		return codigo;
	}

	int getStock(int stock) {
		return stock;
	}
}
