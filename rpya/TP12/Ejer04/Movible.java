package Ejer04;
import Comun.Colaint;
public class Movible {
	private Colaint elementos;
	//constructor
	public Movible (){
		elementos=new Colaint();
	}
	public void agregarElem(int elem){
		elementos.insertar(elem);
	}
	public int cantElem(){
		Colaint aux=new Colaint();
		int cant=0;
		while (!elementos.estaVacia()){
			aux.insertar(elementos.borrar());
			cant=cant+1;
		}
		while(aux.estaLlena())
			elementos.insertar(aux.borrar());
		return cant;	
		}	
	}