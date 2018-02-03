package Ejer12;
public class SistemaO {
	private ColaTrabajo [] prioridades;
	int dim=5;

public SistemaO(){
	prioridades = new ColaTrabajo [dim];
	for(int i=0; i<dim;i++)
		prioridades[i]= new ColaTrabajo();
}
public void agregarJob(Trabajo T){
	if(T.getToken()>= 0 && T.getToken()<100)
		prioridades[0].insertar(T);
	else
		if(T.getToken()>=100 && T.getToken()<200)
			prioridades[1].insertar(T);
		else
			if(T.getToken()>=200&& T.getToken()<300)
				prioridades[2].insertar(T);
			else 
				if(T.getToken()>=300&&T.getToken()<400)
					prioridades[3].insertar(T);
				else 
					if(T.getToken()>=400&& T.getToken()<500)
						prioridades[4].insertar(T);
					else
						if(T.getToken()>=500&& T.getToken()<600)
							prioridades[5].insertar(T);
						else
							if(T.getToken()>=600 && T.getToken()<700)
								prioridades[6].insertar(T);
							else
								if(T.getToken()>=700 && T.getToken()<800)
									prioridades[7].insertar(T);
								else
									if(T.getToken()>=800 && T.getToken()>900)
										prioridades[8].insertar(T);
									else
										if(T.getToken()>900 && T.getToken()<1000)
											prioridades[9].insertar(T);
}
public int obtenerSigTrab(){
	Trabajo aux = new Trabajo();
	for(int i=0;i<dim;i++){
		if(!prioridades[i].estaVacia()){
			aux=prioridades[i].borrar();
			return aux.getToken();
			}
			}
	return 0;
}
public void limpiar (){
	Trabajo aux = new Trabajo();
	for(int i=0; i<dim;i++)
		while(!prioridades[i].estaVacia())
				aux=prioridades[i].borrar();
				notificar(aux.getToken());
}
public void notificar(int token){
	System.out.println("trabajo eliminado, ingrese despues" + token );

}
}

