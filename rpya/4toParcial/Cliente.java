package parcial;
public class Cliente {
	//atributos
	private String nombre;
	private int retiro, deposito, consulta, pagos;
	//constructor
	public Cliente(String nom, int ret, int dep, int con, int pag){
		nombre = nom;
		retiro = ret;
		deposito = dep;
		consulta = con;
		pagos = pag;
	}
	public Cliente(){
		nombre = "";
		retiro = 0;
		deposito = 0;
		consulta = 0;
		pagos = 0;
	}
	//atributo 'nombre'
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
	//atributo 'retiro'
	public void setRetiro(int retiro){
		this.retiro = retiro;
	}
	public double getRetiro(){
		return this.retiro;
	}
	//atributo 'deposito'
	public void setDeposito(int deposito){
		this.deposito = deposito;		
	}
	public double getDeposito(){
		return this.deposito;
	}
	//atributo 'consulta'
	public void setConsulta(int consulta){
		this.consulta = consulta;
	}
	public double getConsulta(){
		return this.consulta;
	}
	//atributo 'pagos'
	public void setPagos(int pagos){
		this.pagos = pagos;
	}
	public double getPagos(){
		return this.pagos;
	}
}
