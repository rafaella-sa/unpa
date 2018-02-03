package ej12;

public class Trabajo {
private int user;
private int token;

//constructor
public Trabajo(int u, int t)
{
	user=u;
	token=t;
}

public int getUser() {
	return user;
}

public void setUser(int user) {
	this.user = user;
}

public int getToken() {
	return token;
}

public void setToken(int token) {
	this.token = token;
}


}
