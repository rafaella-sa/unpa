package Ejer14;

public class Arbol {

	     private Nodo raiz;
	     
	     
public Arbol()
		 {
	      raiz=null;
		 }
 
public	void insertar (int valor)
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
		   	 else
		   		 P = P.getDerecha(); 
		 	 }
		    Nodo aux=busquedaN(valor,getRaiz() ,false);
		    
		    if(aux!=null)
		    	aux.incrementar();
		    	
		    else
		    	{
		    	if(Ant == null) 
		    		raiz = Nuevo;
		    	
		    	else
		    		if(Ant.getInfo() > valor)
		    			Ant.setIzquierda(Nuevo); 
		    		else 
		    			Ant.setDerecha(Nuevo);
		    	}
		    } 
/*		 
//Punto A)
public int cantidadDeElem(Nodo p)
			{
			 if(p==null)
				 return 0;
			 else
			 	{
				  return cantidadDeElem(p.getIzquierda().getCont())+ cantidadDeElem(p.getDerecha().getCont());
			 	}
			}

*/
//Punto B)	 
public int alturaDelArbol( Nodo p)
			{
			 if(p == null)
				 return-1;
			 else
			 	{
				 if(alturaDelArbol(p.getIzquierda())> alturaDelArbol(p.getDerecha()))
					 return 1+ alturaDelArbol(p.getIzquierda());
				 else
					 return 1+alturaDelArbol(p.getDerecha());
			 	}
			}


//PUNTO C)
public void mostrarPorNivel(Nodo p, int n)
			{
		     if(p != null)
		       {
		    	if(n==0)
		    		System.out.println("Los elementos del nivel " + p.getInfo());
		    	else
		    	   {
		    		mostrarPorNivel(p.getDerecha(),n-1);
		    		mostrarPorNivel(p.getIzquierda(),n-1);
		    	   }
		    	}		
			}




//Punto D)

public void antecesores(Nodo p, int elem)
			  {
	           if(p!=null && p.getInfo()!=elem)
	           	 {
	        	  System.out.println(p.getInfo());
	        	  if(elem > p.getInfo())
					  antecesores(p.getDerecha(),elem); 
				  else
					  antecesores(p.getIzquierda(), elem);
			      }	           	 
			  }




public boolean busqueda(Nodo n,int valor, boolean enc)
			{
		     if(n==null |enc==true)
		    	 return enc;
		     else
		       {
		    	 if(n.getInfo()==valor)
		    		 enc=true;
		    	 else
		    		 if(n.getInfo() < valor)
		    			 n=n.getDerecha();
		    		 else n=n.getIzquierda();
		    	 return busqueda(n,valor,enc);}
			}


public Nodo busquedaN(int valor,Nodo n,boolean enc)
			{
			 if(n==null|enc==true)
				 return n;
			 else
			   {
				 if(n.getInfo()==valor)
					 enc=true;
				 else
					 if ( n.getInfo() < valor)
						 n=n.getDerecha();
					 else n=n.getIzquierda();
				 return busquedaN(valor,n,enc);}
			}


public boolean estaVacio()
		{
	     return (raiz==null);
	    }

public Nodo getRaiz()
		{
		 return raiz;
		} 


public void eliminar(int valor)
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
		  if(p.getCont()>1)
		     p.decrementar();
		  else
		  {
		  if(p.esHoja())
			  if(t == null )
				  raiz = null; 
			  else 
				  if(p == t.getIzquierda())
					  t.setIzquierda(null);
				  else
					  t.setDerecha(null); 
		  else
			  if (p.tieneUnHijo()) 
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
				  while(p != q)
			      	  {
					  t = p;
					  p = p.getDerecha(); 
			      	  }
				  if(q==t.getIzquierda())
					  t.setIzquierda(q.getIzquierda()); 
				  else	
					  if (q.tieneUnHijo())
						  t.setDerecha(q.getUnicoHijo());
					  else
						  t.setDerecha(null); 
			      }
		 	}
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
              System.out.println("|"+P.getInfo()+"|"+"cont: "+P.getCont());
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
