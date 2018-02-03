package ejer14;

public class Kiosco {
	private String nombre;
	private Articulo []elementos;
	private int dim;
	private boolean abierto;
	//Constructor
	Kiosco(String name){
		nombre= name;
		elementos=new Articulo [1000];
		abierto=false;
		dim=0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Articulo[] getElementos() {
		return elementos;
	}

	public void setElementos(Articulo[] elementos) {
		this.elementos = elementos;
	}

	public int getDim() {
		return dim;
	}

	public void setDim(int dim) {
		this.dim = dim;
	}

	public boolean isAbierto() {
		return abierto;
	}

	public void setAbierto(boolean abierto) {
		this.abierto = abierto;
	}
	//comprar
	public void comprar (Articulo a, int cant){
		boolean encontrado= false;
		int i=0;
			while (i < dim & ! encontrado){
				if (elementos[i].getCodigo() == a.getCodigo())
					encontrado = true;
				else
					i++;
			}
			if (encontrado == true)
				elementos[i].setStock(elementos [i].getStock()+ cant);
			else
			{
				elementos[dim]=a;
				elementos[dim].setStock(cant);
				dim++;
			}
			}
	public void vender(int codigo, int cant){
		int aux = 0;
		boolean encontrado= false;
			
			int i=0;
			while (i< dim & !encontrado){
				if (elementos[i].getCodigo()== codigo)
					encontrado=true;
				else
					i++;
			}
			
			if (encontrado== true && cant < elementos[i].getStock()){
				aux=elementos[i].getStock()-cant;
				elementos[i].setStock(aux);
				System.out.println("el stock restante es: " +elementos[i].getStock());
			}
			else
				System.out.println("no hay suficiente stock para vender esa cantidad, hay "+ elementos[i].getStock() + "productos");
	}
	
	public void controlStock(){
		for (int i=0; i< dim; i++){
			if ( elementos[i].getStock()==0)
				System.out.println("el articulo:" + elementos[i].getNombre()+ " no tiene stock");
			else
				System.out.println("el articulo" + elementos[i].getNombre() + " tiene stock");
		
		}
		
	}
	public void mostrarArticulos(){
		for (int i=0; i< dim; i++){
			System.out.println("nombre:" +elementos[i].getNombre());
			System.out.println("codigo: "+ elementos[i].getCodigo());
			System.out.println("descripcion: "+ elementos[i].getDescripcion());
			System.out.println("Stock: "+ elementos[i].getStock());
			
		}
	
	}
}
