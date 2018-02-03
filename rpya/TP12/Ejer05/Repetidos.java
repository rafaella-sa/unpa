package Ejer05;
import Comun.Colaint;
public class Repetidos {
	private Colaint elementos;
	//constructor
	public Repetidos(){
	elementos=new Colaint();
	}
	public void agregarelem(int elem){
		while(!elementos.estaLlena()){
			elementos.insertar(elem);
		}
	}
	public int contRepetidos(int num){
		Colaint aux=new Colaint();
		int cont=0;
		int valor;
		while(elementos.estaVacia()){
			valor=elementos.borrar();
			if(valor==num){
				aux.insertar(valor);
				cont++;
			}
			}
		while(!aux.estaVacia()){
			valor=aux.borrar();
			elementos.insertar(valor);
		}
		return cont;
		}
	/*public Colaint elimrep(){
		int aux;
		Colaint c=new Colaint();
		while(!elementos.estaVacia()){
			aux=elementos.borrar();
			if(!contRepetidos(aux)==0);
				
		}
	}*/
}
