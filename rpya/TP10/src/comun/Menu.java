package comun;

public class Menu {
	final int cantItem=10;
	public String [] items;
	public int actual;
	
	public Menu()
	{
	items=new String[cantItem];
	items[0]="salir";
	actual=1;
	}
	public void agregarItem(String item)
	{
	items[actual]=item;
	actual++;
	return;
	}
	public void eliminarItems(int num)
	{
		if (num>0 && num<actual)
			{
	    
			
			}
		return;
	}
	public void eliminarTodos()
		{
		return;    
		}
	public int ejecutarMenu()
		{
		System.out.println("***Menu Principal***");
		for(int i=1; i<actual; i++)
				System.out.println(i+".- "+items[i]);
		System.out.println("0.- "+items[0]);
		System.out.println();
		System.out.print("Opcion a elegir: ");
		int opcion=Console.readInt();
		return opcion;
		}
}
