package ej02;
import java.util.Vector;
public class Menu_DonPipo {
	protected Vector<Comida> comidas;
	protected Vector<Bebida> bebidas;
	
	public Menu_DonPipo(){
		comidas = new Vector<Comida>(100);
		bebidas = new Vector<Bebida>(100);
	}
	
	public Vector<Comida> getComidas() {
		return comidas;
	}

	public void setComidas(Vector<Comida> comidas) {
		this.comidas = comidas;
	}

	public Vector<Bebida> getBebidas() {
		return bebidas;
	}

	public void setBebidas(Vector<Bebida> bebidas) {
		this.bebidas = bebidas;
	}

	public void agregarComida(Comida comida){
		comidas.add(comida);
	}
	
	public void agregarBebida(Bebida bebida){
		bebidas.add(bebida);
	}
	
	public Comida buscarComida(int codigo){
		boolean ok = false;
		Comida enc = null;
		int i = 0;
		while(!ok && i < comidas.capacity()){
			if(codigo == comidas.elementAt(i).getCodigo()){
				ok = true;
				enc = comidas.elementAt(i);
			}
			i++;
		}
		return enc;
	}
	
	public Bebida buscarBebida(int codigo){
		boolean ok = false;
		Bebida enc = null;
		int i = 0;
		while(!ok && i < bebidas.capacity()){
			if(codigo == bebidas.elementAt(i).getCodigo()){
				ok = true;
				enc = bebidas.elementAt(i);
			}
			i++;
		}
		return enc;
	}
	
	public void mostrarComidas(){
		System.out.println("Opciones de comida:");
		System.out.println("");
		for (int i = 0; i < comidas.size(); i++){
			System.out.println("Nombre: " + comidas.elementAt(i).getNombre());
			System.out.println("Precio: " + comidas.elementAt(i).getPrecio());
			System.out.println("Codigo: " + comidas.elementAt(i).getCodigo());
			System.out.println("");
		}
	}
	
	public void mostrarBebidas(){
		System.out.println("Opciones de bebida:");
		System.out.println("");
		for (int j = 0; j < bebidas.size(); j++){
			System.out.println("Nombre: " + bebidas.elementAt(j).getNombre());
			System.out.println("Precio: " + bebidas.elementAt(j).getPrecio());
			System.out.println("Codigo: " + bebidas.elementAt(j).getCodigo());
			System.out.println("");
		}
	}
}
