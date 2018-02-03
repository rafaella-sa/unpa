package Ejer25;



public class ColaDePrioridadString // implementaci�n de mont�culo
 {
	MonticuloString elementos;
 	public ColaDePrioridadString()
 	{
 	elementos = new MonticuloString();
 	}
 	public Trabajo suprimir()
 	{
 	Trabajo sacado = elementos.eliminar(1); // siempre elimina la ra�z
 	return sacado;
 	}
 	public void insertar(Trabajo nuevo)
 	{
 	elementos.a�adirTrabajo(nuevo);
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
 

