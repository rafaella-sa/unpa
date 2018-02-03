package ej02;

import java.util.Vector;

public class Opcion {
	protected Vector<Comida> comida;
	protected Vector<Bebida> bebida;

	public Opcion(){
		this.comida = new Vector<Comida>();
		this.bebida = new Vector<Bebida>();		
	}

	public Vector<Bebida> getBebida() {
		return bebida;
	}

	public void setBebida(Vector<Bebida> bebida) {
		this.bebida = bebida;
	}

	public Vector<Comida> getComida() {
		return comida;
	}

	public void setComida(Vector<Comida> comida) {
		this.comida = comida;
	}

	public void agregarPlato(Comida plato){
		comida.add(plato);
	}
	
	public void agregarBebida(Bebida beb){
		bebida.add(beb);
	}
	
	public double calcularPrecio(){
		double precio = 0.0;
		for (int i = 0; i < comida.size(); i++){
			precio = precio + comida.elementAt(i).getPrecio();
		}
		for (int i = 0; i < bebida.size(); i++){
			precio = precio + bebida.elementAt(i).getPrecio();
		}
		return precio;
	}
	
	public void mostrar(){
		for(int i = 0; i < comida.size(); i++)
			System.out.println(comida.elementAt(i).getNombre());		
		for(int i = 0; i < bebida.size(); i++)
			System.out.println(bebida.elementAt(i).getNombre());	
	}
}
