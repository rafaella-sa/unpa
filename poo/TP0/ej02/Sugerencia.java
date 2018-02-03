package ej02;
import java.util.Vector;
public class Sugerencia {
	protected Vector<Comida> comida;
	
	public Sugerencia (){
		this.comida = new Vector<Comida>(3);
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
	
	public double calcularPrecio(){
		double precio = 0.0;
		for (int i = 0; i < comida.capacity(); i++){
			precio = precio + comida.elementAt(i).getPrecio();
		}
		double descuento = 0.2 * precio;
		precio = precio - descuento;
		return precio;
	}
	
	public void mostrar(){
		for(int i = 0; i < comida.capacity(); i++){
			System.out.println(comida.elementAt(i).getNombre());
		}
	}
}
