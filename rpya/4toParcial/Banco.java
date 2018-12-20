package parcial;
public class Banco {
	//atributos
	private final double retiro = 4.0;
	private final double deposito = 2.0;
	private final double consulta = 3.5;
	private final double pagos = 2.0;
	private Cola cajauno = new Cola();
	private Cola cajados = new Cola();
	//ingresar cliente en la cola
	public void ingresarCliente(Cliente c, int num){
		if(num == 1)
			cajauno.insertar(c);
		else
			cajados.insertar(c);
	}
	//atender cliente
	public void atenderCliente(int caja){
		Cliente c = new Cliente();
		if(caja == 1){
			c = cajauno.borrar();
			System.out.println("El cliente de nombre " + c.getNombre() + " fue atendido.");
			System.out.println("El tiempo total de atendimiento fue " + tiempoAtencion(c) +" min.");
		}
		else{
			c = cajados.borrar();
			System.out.println("El cliente de nombre " + c.getNombre() + " fue atendido.");
			System.out.println("El tiempo total de atendimiento fue " + tiempoAtencion(c) +" min.");
		}			
	}
	//determinar cuál caja queda disponible primero
	public int cajaDisponible(){
		Cola aux = new Cola();
		Cliente c = new Cliente();
		double cant1 = 0.0;
		double cant2 = 0.0;
		while(!cajauno.estaVacia()){
			c = cajauno.borrar();
			cant1 = cant1 + tiempoAtencion(c);
			aux.insertar(c);			
		}
		while(!aux.estaVacia()){
			cajauno.insertar(aux.borrar());
		}
		while(!cajados.estaVacia()){
			c = cajados.borrar();
			cant2 = cant2 + tiempoAtencion(c);
			aux.insertar(c);
		}
		while(!aux.estaVacia()){
			cajados.insertar(aux.borrar());
		}
		if(cant1 < cant2)
			return 1;
		else
			return 2;
	}
	//retorna el tiempo total de atención de cada cliente
	public double tiempoAtencion(Cliente c){
		double tiempor = c.getRetiro() * retiro;
		double tiempod = c.getDeposito() * deposito;
		double tiempoc = c.getConsulta() * consulta;
		double tiempop = c.getPagos() * pagos;
		return (tiempor + tiempod + tiempoc + tiempop);
	}
	//mostrar atención de la caja
	public void mostrarAtencion(){
		Pila auxuno = new Pila();
		Pila auxdos = new Pila();
		Cliente c = new Cliente();
		System.out.println("Caja UNO");
		while(!cajauno.estaVacia())
			auxuno.meter(cajauno.borrar());							
		while(!auxuno.estaVacia()){
			c = auxuno.sacar();
			System.out.println(c.getNombre() + ", " + tiempoAtencion(c) + " min.");			
			auxdos.meter(c);
		}			
		while(!auxdos.estaVacia())
			cajauno.insertar(auxdos.sacar());
		System.out.println("");
		System.out.println("Caja DOS");
		while(!cajados.estaVacia())			
			auxuno.meter(cajados.borrar());						
		while(!auxuno.estaVacia()){
			c = auxuno.sacar();
			System.out.println(c.getNombre() + ", " + tiempoAtencion(c) + " min.");
			auxdos.meter(c);
		}
		while(!auxdos.estaVacia())
			cajados.insertar(auxdos.sacar());
		System.out.println("");
	}
}
