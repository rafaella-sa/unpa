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
		boolean encontrado=false;
		int i=0;
		int aux;
		if(getEstadoQuiosco()){
			while(i<actual && !encontrado)
				if (elementos[i].getCodigo()==producto.getCodigo())
					encontrado=true;
		    	else 
		    	    i++; 
		}
		if (encontrado){
		    	 aux= elementos[i].getStock()+ sto;
		    	 elementos[i].setStock(aux);
		        }
		else {
			elementos[actual]=producto;
			elementos[actual].setStock(sto);
			actual++;    	    	 
			if(getEstadoQuiosco()){
				elementos[actual] = producto;
				actual++;
				}
			}
		}

	//vender articulo
	public void venderArticulo(int cod, int sto){
		int aux;
		boolean encontrado=false;
        int i=0;
	    while(i<actual && !encontrado)
	         {
	         if (elementos[i].getCodigo()==cod){
	        	encontrado=true;
	            }
	         else {
	    	    i++; 
	            }
	         }
	    if (encontrado){
		    if(elementos[i].getStock()>=sto) {
		    	 aux= elementos[i].getStock()- sto;
		    	 elementos[i].setStock (aux);
		    	}
		    else   {
		    	System.out.println("No hay stock para vender");
		       }
        	}
	    else  {
	    	System.out.println("No existe el producto");	    	 
	    	}
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
		
	//mostrar productos
	public void mostrarArticulos() {
	     for (int i=0; i<actual; i++)
	    	 System.out.println (elementos[i].getStock()+" productos de " +elementos[i].getDescripcion());
		}


		
	
}
