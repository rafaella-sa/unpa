package Ejer11;

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
		   	 else P = P.getDerecha(); 
		 	 }
		 	if ( Ant == null) 
		 		raiz = Nuevo;
		 	else
		 		if (Ant.getInfo() > valor)
		 			Ant.setIzquierda(Nuevo); 
		 		else Ant.setDerecha(Nuevo);
		 }		 



public Nodo buscarNodo(int elem)
		{
		return busqueda(elem,getRaiz(),false);
		}

private Nodo busqueda(int valor,Nodo n,boolean enc)
		{
		if(n==null||enc==true)
			return n;
		else
		{
			if(n.getInfo()==valor)
				enc=true;
			else
				if(n.getInfo() < valor)
					n=n.getDerecha();
				else
					n=n.getIzquierda();
			return busqueda(valor,n,enc);}
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
	
public boolean busqueda(Nodo n,int valor, boolean enc)
{
 if(n==null ||enc==true)
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



//PUNTO a)
public int alturaDelArbol( Nodo p)
			{
			if(p == null)
				return-1;
			else{
				if( alturaDelArbol(p.getIzquierda())> alturaDelArbol(p.getDerecha()))
					return 1+ alturaDelArbol(p.getIzquierda());
				else
					return 1+alturaDelArbol(p.getDerecha());
				}
			}


//PUNTO b)
public int cantidadDeElem(Nodo p)
			{
		    if(p==null)
		    	return 0;
		    else
		    	return 1+cantidadDeElem(p.getIzquierda())+ cantidadDeElem(p.getDerecha());
			}


//PUNTO c)
public void mostrarHojas(Nodo p)
			{
		     if(p != null){
		    	 if(p.esHoja())
		    		 System.out.println("Hoja " + p.getInfo());
		    	 else
		    	 	{
		    		 mostrarHojas(p.getDerecha());
		    		 mostrarHojas(p.getIzquierda());
		    	 	}
		     }
			}


//PUNTO d)
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


//Punto e)

public  void descendientesElemento(Nodo p)
		{
	     inorden(p.getIzquierda());
	     inorden(p.getDerecha());
		}

//Punto F)

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


//Punto G)

public void padreElemento(Nodo p, int elem)
			  {
	          if(p.getDerecha()==null && p.getIzquierda()==null)
	        	  System.out.println("No tiene padre es la raiz!!!");
	          else
	          	 {
	        	   if(p.getIzquierda()!=null && p.getIzquierda().getInfo()==elem)
	        		   System.out.println("El padre de "+elem+" es:"+p.getInfo());
	        	   else
	        		   if(p.getDerecha()!=null && p.getDerecha().getInfo()==elem)
	        			   System.out.println("El padre de "+elem+" es:"+p.getInfo());
		         padreElemento(p.getIzquierda(),elem);
		         padreElemento(p.getDerecha(),elem);
	           	 }
	       }


//Punto H)

public void hermanosElemento(Nodo p, int elem)
			  {
	          if(p!=null)
	          	{
	        	  if(p.getDerecha()!=null && p.getDerecha().getInfo()==elem)
	        		System.out.println("Hermano de:"+elem+"es: "+p.getIzquierda().getInfo());
	        	  else
	        	     {
	        		  if(p.getIzquierda()!=null && p.getIzquierda().getInfo()==elem)
	        			  System.out.println("Hermano de:"+elem+"es: "+p.getDerecha().getInfo());
	        		  hermanosElemento(p.getDerecha(),elem);
		        	  hermanosElemento(p.getIzquierda(),elem);
	        	     }  
	          	}
			  }
public int cantHojas(Nodo p){
	if(p == null)
		return 0;
	else
		if(p.esHoja())
   		 	return 1;
   	else{
   		 return cantHojas(p.getDerecha()) + cantHojas(p.getIzquierda());
	}
	}

}

