package Ejer19;

public class Monticulo {

	
	private int [] nodos; // arreglo de enlaces implícitos
	private int numnodos, dim;

	
public	Monticulo()
		 {
		 dim = 51;
		 nodos=new int[dim];
		 numnodos=0;
		 }


public 	int getCantidad()
			 {
			  return numnodos;
			 }

public void insertar(int nuevo)
			 {
			 if(numnodos < dim)  
			   {	 
				 numnodos++;
				 nodos[numnodos] = nuevo; // inserta al final del arbol
				 restMontArriba(); 
			   } 
			 }

public int eliminar(int indice)
 			 {
			 int aux = nodos[indice];
			 nodos[indice] = nodos[numnodos];  // rellena el hueco con la ultimo hoja
			 numnodos--;   
			 restMontAbajo(indice);
			 return aux;
 			 }

public boolean estaVacio()
			 {
			  return numnodos < 1;
			 }


public int getElem(int p)
			 {
			  return nodos[p];
			 }



public void restMontArriba()// restaura el montículo hacia arriba
			 {
			  int actual, padre, aux;
			  boolean ok=false;
			  actual=numnodos;
			  padre=actual/2;
			  while(actual >1 && !ok)
			  	 {
				  if(nodos[padre] >= nodos[actual])       
					  ok=true;
				  else
				    {  // intercambia con el padre            
					  aux = nodos[padre];
					  nodos[padre] = nodos[actual];
					  nodos[actual] = aux;
					  actual = padre;// sube
					  padre = actual/2;
				    }
			  	 }
			 }

public void restMontAbajo(int indice)    // restaura el monticulo hacia abajo
			 {
			  boolean ok = false;
			  int maxhijo, aux, raiz = indice;
			  while(raiz * 2 <= numnodos && !ok)
			      {
				  if(raiz*2 == numnodos)
					  maxhijo = raiz;
				  else
					  if (nodos[raiz*2] > nodos[raiz*2+1])          // toma el hijo de mayor valor
						  maxhijo = raiz*2;
					  else
						  maxhijo = raiz * 2 + 1;
				  if(nodos[raiz] < nodos[maxhijo])
				    {
					  aux = nodos[raiz]; // intercambia con el padre
					  nodos[raiz] = nodos[maxhijo];
					  nodos[maxhijo] = aux;
					  raiz = maxhijo;
					}
				  else
					  ok = true;
					   }
					} 




public void inorden (int indice)
			{
    		if(indice <=numnodos)                      
    		  {                                
              inorden (indice *2);
              System.out.print("|"+nodos[indice]+"|");
              inorden (indice*2+1);
    		  }
			}


public void preorden(int indice)
			  {
			   if(indice <= numnodos)//caso base 
				 {                                     
				  System.out.print("| "+nodos[indice]+"|");
				  preorden (indice * 2);
				  preorden (indice * 2 + 1);
			     }
			   }


public void postorden (int indice)
		   {
    		if(indice <=numnodos)                       
    		  {                               
               postorden (indice *2);
               postorden (indice *2+1);
               System.out.print("|"+nodos[indice]+"|");
    		  }
		   }

public void mostrar(int indice)
		   {
	       for(int i=1; i<=numnodos; i++)
	          {
	    	   System.out.print("|"+nodos[indice]+"|");
	    		 
	          }
		   }




}