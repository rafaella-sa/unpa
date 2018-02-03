package olimpiadas;

public class Ciclista extends Atleta {

	private byte peso;
	
	public Ciclista(String nombre, String apellido, byte peso)
	{
		super(nombre, apellido);
		this.peso=peso;
		
	}
	
	public Ciclista()
	{
		super("nombre","apellido");
		this.peso=60;
	}
	
	public String toString()
	{
		String s="El ciclista de "+ peso +" Kilogramos, se llama" +  nombre +" "+ apellido;
		return s;
	}
	
	public String getDisciplina()
	{
		return "Ciclismo";
	}
}
