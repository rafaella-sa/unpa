package ej12;
public class SistemaOperativo {
private ColaToken[] prioridades;
int dim=10;


public SistemaOperativo()
{
	prioridades = new ColaToken [dim];
	int i;
	for(i=0;i <dim; i++)
		prioridades[i]  = new ColaToken();
}
 public void agregarTrabajo(Trabajo t)
 {
 if(t.getUser()>0 && t.getUser()<=99)
	 prioridades[0].insertar(t);
    else
    	if(t.getUser()>=100 && t.getUser()<=199)
    		prioridades[1].insertar(t);
    	else
        	if(t.getUser()>=200 && t.getUser()<=299)
        		prioridades[2].insertar(t);
        	else
            	if(t.getUser()>=300 && t.getUser()<=399)
            		prioridades[3].insertar(t);
            	else
                	if(t.getUser()>=400 && t.getUser()<=499)
                		prioridades[4].insertar(t);
                	else
                    	if(t.getUser()>=500 && t.getUser()<=599)
                    		prioridades[5].insertar(t);
                    	else
                        	if(t.getUser()>=600 && t.getUser()<=699)
                        		prioridades[6].insertar(t);
                        	else
                            	if(t.getUser()>=700 && t.getUser()<=799)
                            		prioridades[7].insertar(t);
                            	else
                                	if(t.getUser()>=800 && t.getUser()<=899)
                                		prioridades[8].insertar(t);
                                	else
                                    	if(t.getUser()>=900 && t.getUser()<=999)
                                    		prioridades[9].insertar(t);
                                    	
 }
public Trabajo obtenerSiguienteTrabajo()
{
	int i;
	for(i=0; i<dim; i++)
	{
	 if(!prioridades[i].estaVacia())
		return prioridades[i].borrar();	
	} 
	return null;
}
public void limpiarTrabajo()
{
	Trabajo t=null;
	String p= "eliminado";
	int i;
	for(i=0; i< dim; i++) 
	{
		while(!prioridades[i].estaVacia())
		{
	    t=prioridades[i].borrar();
	    this.notificar(t, p);
	    }
   }

}
public void notificar(Trabajo t, String p)
{
	System.out.println (p + t.getToken());
}

}


