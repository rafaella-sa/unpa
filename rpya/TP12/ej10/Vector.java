package ej10;

public class Vector {
	private int dim;
	private int[]vector;
	private int actual;

	public Vector(int dimension)
	{
		vector= new int [dimension];
		dim=dimension;
		actual=0;
	}
	public void agregarElem(int elem)
			{
		if(actual< dim)
		{
			vector[actual]=elem;
			actual++;
		}
			}
	public void posParAsendentente()
	{
		int i, aux,j;
		for(i=1; i< actual; i++)
		{
			aux=vector[i];
			j=i--;
			while(j%2==0 && vector[j]>aux)
			{
				vector[j++]=vector[j];
				j--;
			}
		}
	}
	public void posImparDentente()
	{
		int i, aux,j;
		for(i=1; i< actual; i++)
		{
			aux=vector[i];
			j=i--;
			while(j%2!=0 && vector[j]<aux)
			{
				vector[j++]=vector[j];
				j--;
			}
		}
	}
	public void buscarDatoPos(int dato, int dato2)
	{
		
	int i=0;
	 for(i=0 ;i<actual; i++)
	     {
	       while(i%2==0 || i%2!=0 )
	            {
		         if(dato==vector[i])
		        	 System.out.println("El dato es:" + vector[i]);       
			     else
	                 if(dato2== vector[i])
	                	 System.out.println("El dato es:" + vector[i]);
	                 
	                   
	            }
	       }	    
	}
	public void mostrarVector()
	{
		int i;
		for(i=0; i<actual;i++)
			System.out.println("los elementos son:" + vector[i]);
	}

	}


