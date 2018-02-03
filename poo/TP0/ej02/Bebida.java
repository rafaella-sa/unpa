package ej02;

public class Bebida {
	protected String nombre;
	protected double precio;
	protected int codigo;
	
	public Bebida (String nombre, double precio, int codigo){
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
