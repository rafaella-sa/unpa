package ej12;
public class SistemaOperativo {
	private ColaTrabajos[] prioridades;
	int dim = 10;
	//constructor
	public SistemaOperativo(){
		prioridades = new ColaTrabajos [dim];
		for(int i = 0; i < dim; i++)
			prioridades[i] = new ColaTrabajos();
	}
	//agrega un trabajo en la cola
	public void anadirTrabajo(Trabajo t){
		if(t.getUsuario()>0 && t.getUsuario()<=99)
			prioridades[0].insertar(t);
	    else
	    	if(t.getUsuario()>=100 && t.getUsuario()<=199)
	    		prioridades[1].insertar(t);
	    	else
	        	if(t.getUsuario()>=200 && t.getUsuario()<=299)
	        		prioridades[2].insertar(t);
	        	else
	            	if(t.getUsuario()>=300 && t.getUsuario()<=399)
	            		prioridades[3].insertar(t);
	            	else
	                	if(t.getUsuario()>=400 && t.getUsuario()<=499)
	                		prioridades[4].insertar(t);
	                	else
	                    	if(t.getUsuario()>=500 && t.getUsuario()<=599)
	                    		prioridades[5].insertar(t);
	                    	else
	                        	if(t.getUsuario()>=600 && t.getUsuario()<=699)
	                        		prioridades[6].insertar(t);
	                        	else
	                            	if(t.getUsuario()>=700 && t.getUsuario()<=799)
	                            		prioridades[7].insertar(t);
	                            	else
	                                	if(t.getUsuario()>=800 && t.getUsuario()<=899)
	                                		prioridades[8].insertar(t);
	                                	else
	                                    	if(t.getUsuario()>=900 && t.getUsuario()<=999)
	                                    		prioridades[9].insertar(t);	                                    	
	}
	//obtiene el siguiente trabajo
	public Trabajo obtenerSiguienteTrabajo(){
		for(int i = 0; i < dim; i++){
			if(!prioridades[i].estaVacia())
				return prioridades[i].borrar();	
		} 
		return null;
	}
	//limpia todos los trabajos
	public void limpiarTrabajos(){
		Trabajo t = null;
		String m = "El siguiente trabajo fue eliminado: ";
		for(int i = 0; i < dim; i++){
			while(!prioridades[i].estaVacia()){
				t = prioridades[i].borrar();
				notificar(t, m);
		    }
	   }
	}
	//emite una notificación de borrado del trabajo
	public void notificar(Trabajo token, String idmensaje){
		System.out.println (idmensaje + token.getToken());
	}
}
