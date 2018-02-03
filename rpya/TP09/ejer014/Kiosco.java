package ejer014;

public class Kiosco {
	String nombre;
	Articulo []elementos;
	int dim;
	boolean abierto;

	//Constructor
	Kiosco(String number){
		nombre= number;
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
				elementos[i].stock= elementos [i].stock+ cant;
			else
				elementos[dim]=a;
				elementos[dim].stock=cant;
				dim++;
	
			}
	public void vender(Articulo prod, int cant){
		boolean encontrado= false;
		
			int i=0;
			while (i< dim & !encontrado){
				if (elementos[i].getCodigo()== prod.getCodigo())
					encontrado=true;
				else
					i++;
			}
			if (encontrado== true)
				elementos[i].stock=elementos[i].stock -cant;
			
		}
	
	public void controlStock(){
		for (int i=0; i< dim; i++){
			if ( elementos[i].stock==0)
				System.out.println("el articulo:" + elementos[i]+"no tiene stock");
			
		}
		
	}
}