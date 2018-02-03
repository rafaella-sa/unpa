
package Ejer25;


public class Trabajo {

	String token;
	int id;
	
	public Trabajo(String t,int i) {
		
		token=t;
		id=i;
	}
	
	//set's
	
	public void setToken(String t)
	{
		token=t;
	}
	
	public void setId(int i)
	{
		id=i;
	}
	
	//get's
	
	public int getId()
	{
		return id;
	}
	
	public String getToken()
	{
		return token;
	}
	

}
