package ej03;
public class Televisor {
	//declaración de atributos
	private boolean estado;
	private int canal, volumen, ultimocanal;
	private final int maxvolumen = 100;
	//constructor
	public Televisor(){
		estado = false;
		canal = 0;
		volumen = 0;
		ultimocanal = 0;
	}	
	//definición de metodos
	public boolean getEstado(){		
		return estado;
	}		
	public void setEstado(boolean estado){
		this.estado = estado;
	}
	public void setCanal(int canal){
		if (canal<0 & canal>125){                                                      
				this.ultimocanal = this.canal;                                                            
				this.canal = this.canal + 1;
		}
		else{
			this.ultimocanal = this.canal;
			this.canal = canal;
		}
	}	
	public int getCanal(){
		return canal;		
	}	
	public void setVolumen(int volumen){
		if (volumen < maxvolumen)
			this.volumen=volumen;
	}	
	public int getVolumen(){
			return volumen;	
	}
	public void verUltimocanal(){
		this.canal = ultimocanal;
	}
	public void encenderTelevisor(){
		estado = true;
	}	
	public void apagarTelevisor(){
		estado = false;
	}
}
