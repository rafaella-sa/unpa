package Ejer25;


public class Sistema {

	
	ColaDePrioridadString []trabajos;
	int i;
	public Sistema(){
	
		trabajos=new ColaDePrioridadString[10];
		i=0;
		for(i=0;i<10;i++)
		{
			trabajos[i]=new ColaDePrioridadString();
		}
		
	}
	
	void cargarTrabajo(int u,String nuevo) // agrega un elemento en la cola
	   { 
	     Trabajo t=new Trabajo(nuevo,u);
	     
	     if(u>=0 && u<100)
	     {
	     	trabajos[0].insertar(t);
	     }
	     
	     if(u>=100 && u<200)
	     {
	     	trabajos[1].insertar(t);
	     }
	     
	     if(u>=200 && u<300)
	     {
	     	trabajos[2].insertar(t);
	     }
	     
	     if(u>=300 && u<400)
	     {
	     	trabajos[3].insertar(t);
	     }
	     
	     if(u>=400 && u<500)
	     {
	     	trabajos[4].insertar(t);
	     }
	     
	     if(u>=500 && u<600)
		 {
	     	trabajos[5].insertar(t);
		 }
	     
		 if(u>=600 && u<700)
		 {
		 	trabajos[6].insertar(t);
		 }
		 
		 if(u>=700 && u<800)
		 {
		 	trabajos[7].insertar(t);
		 }
		 
		 if(u>=800 && u<900)
		 {
		 	trabajos[8].insertar(t);
		 }
		 
		 if(u>=900 && u<1000)
		 {
		 	trabajos[9].insertar(t);
		 }
	     
	   }
	void ejecutar()
	   {
	   	int i=0;
	   	boolean b=false;
	   	do
	   	{
	   	b=trabajos[i].estaVacia();
	    if (b==true)
	       System.out.println("Cola de prioridad :"+(i+1)+ " vacia!!!!!");
	      else 
	      {
	       System.out.println("Cola de prioridad :"+(i+1)+ " ejecutado trabajo: "+trabajos[i].suprimir().getToken());
	      }
	    i++;
	    if (i==10)
	    {
	     i=0;
	     b=false;
	     System.out.println("No hay trabajos para ejecutar !!!!!");
	    }
	    	
	   }
	   while(b==true);
	}

	void MostrarTodo()
	{    int i;
		for (i=0;i<10;i++)
		     {
		     	System.out.println("Cola de trabajos"+(i+1));
		     	trabajos[i].mostrarCola();
		     	System.out.println();
		     }
		
	}
	void MeVoy()
	      {
	      ColaDePrioridadString nada;
	      nada=new ColaDePrioridadString();	
	      int i;
	      System.out.println("Se termino el dia sera hasta mañana bye bye!!!!");
	      for (i=0;i<10;i++)
		     {	
		     	System.out.println("Cola de trabajos "+(i+1)+" Eliminada!!!!!");
		     	trabajos[i]=nada;
		     	System.out.println("Se han perdido los trabajos pendientes");
		    System.out.println();
		     }

	}
	
	
	
	
}
