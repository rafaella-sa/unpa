package ej1;

public class Menu {

	final int cantItem=10;
	String[]items;
	int actual;
	public Menu()
	{
		items=new String [cantItem];
		items[0]= "Salir";
		actual=1;
		
	}
	public void agregarItem(String item)
	{
		items [actual]= item;
		actual++;
		return;
	}
	public void eliminarItem(int num)
	{
		if(num>0 & num < actual)
		{
	}
		return;}
	public void eliminarTodos()
	{
	return;	
	}
	public int ejecutarMenu()
	{
		System.out.println("***Menu Principal***");
		for(int i=1; i< actual; i++)
				System.out.println(i+".-" + items [i]);
		System.out.println("0.-"+  items[0]);
		System.out.println();
		System.out.println("Opcion a elegir:");
		int opcion= Console.readInt();
		return opcion;
	}
	}


