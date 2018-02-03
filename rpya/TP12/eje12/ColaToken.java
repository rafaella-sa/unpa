package ej12;

public class ColaToken {
private Trabajo []elem;
private int dim=10;
private int frente, ultimo;

public ColaToken()
{
elem= new Trabajo [dim];
frente=0;
ultimo=0;
}
//verificar si la cola esta o no  vacia
public boolean estaVacia()
{
return (ultimo == frente);
                    
}
//verificar si la cola esta o no llena 
public boolean estaLlena()
{
int sigultimo=siguiente(ultimo);
return (sigultimo==frente);
}
//estable cual es el siguiente elemento
private int siguiente(int subind)
{
if (subind==dim-1)
return 0;
else
return subind+1;
}
//insertar elemento en la cola
public void insertar(Trabajo T)
{
if(!estaLlena())
{
ultimo=siguiente(ultimo);
elem [ultimo]=T;
}
return;
}
//borra un elemento de la cola
public Trabajo borrar()
{
if(!estaVacia())
{
	frente=siguiente(frente);
	return elem[frente];	
}
else
	return null;
}
}
