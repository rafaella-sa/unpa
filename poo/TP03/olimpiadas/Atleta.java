package olimpiadas;
import java.io.*;
public abstract class Atleta implements Serializable {
	
	public String nombre, apellido;
	
	public Atleta(String nombre, String apellido){
		this.nombre=nombre;
		this.apellido=apellido;
		
	}
	
	public abstract String getDisciplina();
	
	public void guardarAtleta(String fileName){
		
		try
		{
			FileOutputStream fos= new FileOutputStream (fileName);
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(this);
			oos.close();
		}
		
		catch(IOException ioe)
		{
			System.out.println("Excepción escribiendo atleta");
		}
		
	}

}
