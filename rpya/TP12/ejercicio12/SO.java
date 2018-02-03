package ejercicio12;
public class SO {
	private ColaTrabajo[]prioridad;
	private int dim=10;
		
	SO(){
		prioridad=new ColaTrabajo[dim];
		for(int i=0;i<dim;i++){
		 prioridad[i]=prioridad[i];
	}
	}
	public void agregarTrabajo(Trabajo trabajo ){
		if(trabajo.getUser()>=0 && trabajo.getUser()<=99)
			prioridad[0].insertar(trabajo);
		 else if(trabajo.getUser()>=100& trabajo.getUser()<=199)
				prioridad[1].insertar(trabajo);
			else if(trabajo.getUser()>=200 && trabajo.getUser()<=299)
					prioridad[2].insertar(trabajo);
				else if(trabajo.getUser()>=300 && trabajo.getUser()<=399)
						prioridad[3].insertar(trabajo);
					else if(trabajo.getUser()>=400 && trabajo.getToke()<=499)
							prioridad[4].insertar(trabajo);	
						else if(trabajo.getUser()>=500 && trabajo.getUser()<=599)
								prioridad[5].insertar(trabajo);
							else if(trabajo.getUser()>=600&& trabajo.getUser()<=699)
								prioridad[6].insertar(trabajo);
								else if(trabajo.getUser()>=700 && trabajo.getUser()<=799)
									prioridad[7].insertar(trabajo);
									else if(trabajo.getUser()>=800&& trabajo.getUser()<=899)
										prioridad[8].insertar(trabajo);
										else if(trabajo.getToke()>=900&& trabajo.getToke()<=999)
												prioridad[9].insertar(trabajo);
	}
	
	public int obtenerSiguienteTrabajo(){
		int i=0;
		Trabajo ent;
		ent=null;
		
		if(!prioridad[i].estaVacio())
			ent=prioridad[i].borrar();
			return ent.getToke();	
	}
	
	
	public void notificar(int toke){
		System.out.println("El token borrado por mantemimiento es: "+toke);
		}
	
	public void limpiarTrabajo(){
		Trabajo ent;
		ent=null;
		int r;
		for(int i=0;i<dim;i++){
			if(!prioridad[i].estaVacio()){
				ent=prioridad[i].borrar();
				System.out.println(i+" "+ent.getToke());
				r=ent.getToke();
				notificar(r);
				}
		}
	}

}
