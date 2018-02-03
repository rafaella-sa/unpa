package PruebaEjer3Char;

import Ejer9.Nodo;



public class Arbol {

	     private Nodo raiz;
	     
	     
public Arbol()
		 {
	      raiz=null;
		 }
 
public	void insertar (char valor)
		 {
		 Nodo Nuevo, P, Ant;
		 Nuevo = new Nodo(valor); 
		 P = raiz;
		 Ant = null;
		 while(P!=null)
		 	 {
		   	 Ant = P;
		   	 if (P.getInfo() > valor)
		   		 P = P.getIzquierda(); 
		   	 else P = P.getDerecha(); 
		 	 }
		 	if ( Ant == null) 
		 		raiz = Nuevo;
		 	else
		 		if (Ant.getInfo() > valor)
		 			Ant.setIzquierda(Nuevo); 
		 		else Ant.setDerecha(Nuevo);
		 }		 
		 
		 
public boolean buscar (char valor)
		 {
	      Nodo P;
	      P = raiz;
	      boolean encontrado = false;
	      while ( P != null && !encontrado)
	    	  if ( P.getInfo() == valor)
	    		  encontrado = true;
	    	  else
	    		  if ( P.getInfo() < valor)
	    			  P = P.getDerecha();
	    		  else P = P.getIzquierda();
	      return encontrado;
		 }


public boolean busqueda(Nodo n,char valor, boolean enc)
		{
		 if(n==null |enc==true)
			 return enc;
		 else
		    {
			 if(n.getInfo()==valor)
				 return true;
			 else
				 if(n.getInfo() < valor)
					 n=n.getDerecha();
				 else n=n.getIzquierda();
			 return busqueda(n,valor,enc);
		    }
		}


public void eliminar(char valor)
		 {
		  Nodo p = raiz;
		  Nodo t = null;
		  while(p.getInfo() != valor ) 
		      {
			  t = p;
			  if ( valor > p.getInfo() )
				  p = p.getDerecha();
			  else
				  p = p.getIzquierda();
		      }
		  if ( p.esHoja() )
			  if ( t == null ) raiz = null; 
			  else if ( p == t.getIzquierda() )
				  t.setIzquierda(null);
			  else t.setDerecha(null); 
		  else if (p.tieneUnHijo()) 
			  if (t.getIzquierda() == p)
				  t.setIzquierda(p.getUnicoHijo());
			  else
				  t.setDerecha(p.getUnicoHijo()); 
		  else 
		  {
			  Nodo q = buscaMenor(p);
			  p.setInfo(q.getInfo());
			  t = p; 
			  p = p.getIzquierda();
			  while (p != q)
			      {
				  t = p;
				  p = p.getDerecha(); 
			      }
			  if (q==t.getIzquierda())
				  t.setIzquierda(q.getIzquierda()); 
			  else	
				  if (q.tieneUnHijo())
					  t.setDerecha(q.getUnicoHijo());
				  else
					  t.setDerecha(null); 
		  	}
		 }
	
public Nodo getRaiz()
{
 return raiz;
}

public Nodo buscaMenor(Nodo p) 
		 {
		  Nodo aux = p.getIzquierda(); 
		  while ( aux.getDerecha() != null)
			  aux = aux.getDerecha(); 
		  return aux;
		 }


public void inorden ( Nodo P)
			{
    		if(P != null)                      
    		  {                                
              inorden (P.getIzquierda());
              System.out.print("|"+P.getInfo()+"|");
              inorden (P.getDerecha());
    		  }
			}



public void preorden ( Nodo P)
		   {
    	   if(P != null)                       
           	 {                                
              System.out.print("|"+P.getInfo()+"|");
              preorden (P.getIzquierda());
              preorden (P.getDerecha());
            }
		   }



public void postorden ( Nodo P)
		   {
    		if(P != null)                       
    		  {                               
               postorden (P.getIzquierda());
               postorden (P.getDerecha());
               System.out.print("|"+P.getInfo()+"|");
    		  }
		   }



	
	
}
