package ej12;
public class Trabajo {
	private int usuario;
	private int token;
	public Trabajo(int usuario, int token){
		this.usuario = usuario;
		this.token = token;
	}
	public int getUsuario() {
		return usuario;
	}
	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}
	public int getToken() {
		return token;
	}
	public void setToken(int token) {
		this.token = token;
	}
}
