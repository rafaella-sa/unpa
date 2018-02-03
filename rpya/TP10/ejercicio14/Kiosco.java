package ejercicio14;

public class Kiosco {
	
	//declaracuion de atriburos
	private Articulo[]vectorArticulo;
	private int actual;
	private int dimension;
	private boolean estado;
	private String nombre;
	//construtor
	Kiosco(String nom){
		nombre=nom;
		dimension=100;
		actual=0;
		vectorArticulo=new Articulo[dimension];
		estado= false;
	}
	//METODO
	
	public boolean abrirKiosco(){
		estado=true;
		return estado;
	}
	public boolean estadoKiosco(){
		return estado;
	}
	public void controlarStock(Articulo producto){
		boolean encontrado=false;
		int i=0;
		while(i<actual && encontrado==false){
		if(producto.getStock()== vectorArticulo[i].getStock()){
			System.out.println("Hay stock");
			encontrado=true;
		}
		else {
			System.out.println ("hay stock");
			i++;
		}
		}
	}
	
	public void comprarArticulo(Articulo producto, int can){
		boolean encontrado=false;
		int i=0;
		int aux;
		if(abrirKiosco()){
			   while(i<actual && !encontrado)
		    	    {
		    	     if (vectorArticulo[i].getCodigo()==producto.getCodigo()) {
		    	    	 encontrado=true;
		    	        }
		    	     else {
		    	    	i++; 
		    	        }
		    	     }
			}
		    if (encontrado){
		    	 aux= vectorArticulo[i].getStock()+ can;
		    	 vectorArticulo[i].setStock (aux);
		        }
		     else {
		       	 vectorArticulo[actual]=producto;
		       	 vectorArticulo[actual].setStock(can);
		       	 actual++;    	    	 
		         }
		    }
	
	public void venderProductos (int cod, int cant) {
		int aux;
		boolean encontrado=false;
        int i=0;
	    while(i<actual && !encontrado)
	         {
	         if (vectorArticulo[i].getCodigo()==cod){
	        	encontrado=true;
	            }
	         else {
	    	    i++; 
	            }
	         }
	    if (encontrado){
		    if(vectorArticulo[i].getStock()>=cant) {
		    	 aux= vectorArticulo[i].getStock()- cant;
		    	 vectorArticulo[i].setStock (aux);
		    	}
		    else   {
		    	System.out.println("No hay stock para vender");
		       }
        	}
	    else  {
	    	System.out.println("No existe el producto");	    	 
	    	}
	     }

	public void mostrarProducto() {
     for (int i=0; i<actual; i++)   {
    	 System.out.println (vectorArticulo[i].getStock()+" productos de " +vectorArticulo[i].getDescripcion());
       }
     return;
       }
}
