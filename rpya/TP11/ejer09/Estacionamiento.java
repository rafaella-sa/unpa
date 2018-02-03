package ejer09;
public class Estacionamiento {
	private PilaAuto elementos;
	public Estacionamiento(){
		elementos=new PilaAuto();
	}
	public void entrar(Auto a){
		while(!elementos.estaLlena())
				elementos.meter(a);
	}
	public Auto sacarAuto (Auto a){
		Auto aux=new Auto();
		PilaAuto p=new PilaAuto();
		boolean bandera=false;
		while(!elementos.estaVacia()&& bandera==false){
			aux=elementos.sacar();
			if(aux.getPatente().equals(a.getPatente()))
				bandera=true;
			else
			{
				aux.aumentar();
				p.meter(aux);

			}
			p.sacar();
			elementos.meter(aux);
		}
		return aux;
				
	}
}
	