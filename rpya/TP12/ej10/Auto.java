package ej10;

public class Auto {
	private String patente;
	private int movimiento;

	public Auto (String pat)
	{
		patente = pat;
		movimiento=0;
	}
	public int getMovimiento() {
		return movimiento;
	}

	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public void  cantMovi()
	{
		movimiento++;
	}
}
