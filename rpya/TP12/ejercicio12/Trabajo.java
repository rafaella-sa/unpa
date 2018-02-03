package ejercicio12;

public class Trabajo {
	private int token;
	private int user;
	
	//CONSTRUCTOR
	Trabajo(int u, int t){
		user=u;
		token=t;
	}
	public int getToke() {
		return token;
	}
	public void setToke(int toke) {
		this.token = toke;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	

}
