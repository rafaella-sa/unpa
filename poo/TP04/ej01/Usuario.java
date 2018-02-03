package ej01;
import org.contract4j5.contract.Contract;
import org.contract4j5.contract.Pre;
import org.contract4j5.contract.Post;
@Contract
public class Usuario {
	private String nombre, dni;
	private int cuenta;
	
	@Pre("args[0] != null && $args[1] != null")
	Usuario(String d, String n){
		nombre = n; dni = d; cuenta = 0;
	}
	
	@Pre("s > 0")
	@Post("$old($this.cuenta) == $this.cuenta-s")
	void conexion (int s)
	{ cuenta = cuenta + s; }
	
	@Pre("$this.cuenta > 0")
	@Post("$return == $this.cuenta * 0.32")
	double calculaFacturacion ()
	{ return cuenta * 0.32; }
	
	@Post("$old($this.cuenta) > 0")
	void reset() 
	{ cuenta = 0; }

	@Pre("$this.nombre != null")
	public String getNombre() {
		return nombre;
	}

	@Pre("$this.nombre != null")
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Pre("$this.dni != null")
	public String getDni() {
		return dni;
	}

	@Pre("$this.dni != null")
	public void setDni(String dni) {
		this.dni = dni;
	}

}
