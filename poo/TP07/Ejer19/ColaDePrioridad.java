package Ejer19;

public class ColaDePrioridad {

	private Monticulo elementos;
	
	
public	ColaDePrioridad()
		 {
		  elementos = new Monticulo();
		 }


public int suprimir()
		{
		int sacado = elementos.eliminar(1); // siempre elimina la raíz
		return sacado;
		}


public	void insertar(int nuevo)
		{
		elementos.insertar(nuevo);
		}


public	boolean estaVacia()
		{
		return elementos.estaVacio();
		}


public	boolean estaLlena()
		{// implementar
		return false;
		}
public Monticulo getMonticulo()
{
 return this.elementos;
}


}