package ej10;

public class Estacionamiento {
	private ColaAuto est;
	
	public Estacionamiento()
	{
	est= new ColaAuto();
	}

	public void llegaAuto(Auto auto)
	{
		if(!est.estaLlena())
			est.insertar(auto);
		else
			System.out.println("no hay lugar");
	}
	public Auto saleAuto(String patente)
	{
		ColaAuto aux= new ColaAuto();
		boolean encuentra=false;
	  Auto auto=null, autoAux=null;
		while(!est.estaVacia() && encuentra)
		{
			auto=est.borrar();
			if(auto.getPatente() == patente)
				encuentra=true;
			else
				aux.insertar(auto);
		}
		while(!est.estaVacia())
		{
			autoAux= est.borrar();
			aux.insertar(autoAux);
		}
		while(!aux.estaVacia())
		{
			autoAux= aux.borrar();
			aux.insertar(autoAux);
		}
		return auto;
	}
	public void mostrarEsta()
	{
		est.mostrar();
	}
}
