package ej15;

public class Camping extends Alojamiento{
	protected int cantcarpas;
	protected int cantbanos;
	protected boolean restaurant;
	protected Camping(boolean privado, double cantmetros, int cantcarpas, int cantbanos, boolean restaurant){
		super(privado, cantmetros);
		this.cantcarpas = cantcarpas;
		this.cantbanos = cantbanos;
		this.restaurant = restaurant;
	}
	public int getCantcarpas() {
		return cantcarpas;
	}
	public void setCantcarpas(int cantcarpas) {
		this.cantcarpas = cantcarpas;
	}
	public int getCantbanos() {
		return cantbanos;
	}
	public void setCantbanos(int cantbanos) {
		this.cantbanos = cantbanos;
	}
	public boolean isRestaurant() {
		return restaurant;
	}
	public void setRestaurant(boolean restaurant) {
		this.restaurant = restaurant;
	}
}
