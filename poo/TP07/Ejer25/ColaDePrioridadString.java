package Ejer25;



public class ColaDePrioridadString // implementación de montículo
 {
	MonticuloString elementos;
 	public ColaDePrioridadString()
 	{
 	elementos = new MonticuloString();
 	}
 	public Trabajo suprimir()
 	{
 	Trabajo sacado = elementos.eliminar(1); // siempre elimina la raíz
 	return sacado;
 	}
 	public void insertar(Trabajo nuevo)
 	{
 	elementos.añadirTrabajo(nuevo);
 	}
 	boolean estaVacia()
 	{
 	return elementos.estaVacia();
 	}
 	boolean estaLlena()
 	{
 		return elementos.estaLlena();
 	}
 	public void limpiarColaPrioridad()
 	{
 		while(!this.estaVacia())
 		{
 			this.suprimir();
 		}
 	}
 	void mostrarCola()
	{
 		elementos.mostrar();
	}
 }
 

