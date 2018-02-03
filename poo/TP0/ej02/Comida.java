package ej02;

public class Comida {
	protected String nombre;
	protected double precio;
	protected int codigo;
	protected char tipo;
	
	public Comida (String nombre, double precio, int codigo, char tipo){
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
		this.tipo = tipo;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
