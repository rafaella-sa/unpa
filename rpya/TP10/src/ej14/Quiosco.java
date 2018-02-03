package ej14;
public class Quiosco {
	//declaraciones
	private Articulo[] elementos;
	private int dimension, actual;
	private boolean abierto;	
	//constructor del quiosco
	public Quiosco(){
		dimension = 100;
		actual = 0;
		elementos = new Articulo[dimension];
		abierto = false;
	}	
	//agregar artículo
	public void comprarArticulo(Articulo producto, int sto){
		boolean encontrado = false;
		int i = 0;
		int aux;
		int pos = 0;
		if(getEstadoQuiosco()){
			while(i < actual && !encontrado)
				if (elementos[i].getCodigo()==producto.getCodigo()){
					encontrado = true;
					pos = i;
				}
		    	else 
		    	    i++; 
		}
		if(encontrado){
		    	aux = elementos[pos].getStock()+ sto;
		    	elementos[pos].setStock(aux);
		        }
		else{
			if(getEstadoQuiosco()){
				elementos[actual] = producto;
				elementos[actual].setStock(sto);
				actual++;
			}
		}
	}
	//vender articulo
	public void venderArticulo(int cod, int sto){
		int aux;
		int pos = 0;
		boolean encontrado = false;
        int i = 0;
	    while(i<actual && !encontrado){
	         if (elementos[i].getCodigo()==cod){
	        	 encontrado=true;
	        	 pos = i;
	         }	        	
	         else
	    	    i++; 
	    }
	    if (encontrado) 
		    if(elementos[pos].getStock() >= sto){
		    	 aux = elementos[pos].getStock()- sto;
		    	 elementos[pos].setStock (aux);
		    }
		    else
		    	System.out.println("No hay stock para vender.");   	
	    else  
	    	System.out.println("No existe el producto");	    	 
	     }	
	//abrir quiosco
	public void abrirQuiosco(){
			abierto = true;
		}		
	//cerrar quiosco
	public void cerrarQuiosco(){
			abierto = false;
		}		
	//ver estado del quiosco
	public boolean getEstadoQuiosco(){
			return abierto;
		}
	//buscar solo los articulo que estan en 0
	public void controlDeStock(){
		int i;
		int cont = 0;
		for(i = 0; i < actual; i++){
			if(elementos[i].getStock() == 0){
				System.out.println("No hay unidades de " + elementos[i].getDescripcion() + " en el quiosco.");
				cont++;
			}
		}
		if(cont == actual)
			System.out.println("El stock del quiosco está vacío.");
	}
	//mostrar productos
	public void mostrarArticulos() {
	     for (int i=0; i<actual; i++){ 
	    	 if(elementos[i].getStock() > 0){
	    		 System.out.println("El quiosco posee: ");
	    		 System.out.println (elementos[i].getStock()+" unidades de " +elementos[i].getDescripcion());
	    	 }	
	    }
	}
}
