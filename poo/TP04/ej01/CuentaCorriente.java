package ej01;
import org.contract4j5.contract.Contract;
import org.contract4j5.contract.Pre;
import org.contract4j5.contract.Post;

@Contract
public class CuentaCorriente {
	private int numero;
	private double saldo;
	private double descubierto;
	
	@Pre("$args[0] > 0 && args[1] <= 3000")
	CuentaCorriente(int numero, double descubierto){ 
		this.numero=numero;
		this.descubierto=descubierto;
		}
	
	@Pre("$this.saldo >= importe || $this.descubierto > 0 ")
	@Post("$old($this.saldo) == $this.saldo + importe || $this.saldo == 0.0")
	void extraer(double importe){
		if(saldo >= importe)
			saldo = saldo - importe;
		else{
			saldo = saldo - importe;
			double monto = saldo * (-1);
			descubierto = descubierto - monto;
			saldo = saldo + monto;
		}
	}
	
	@Pre("importe > 0.0")
	@Post("$old($this.saldo) == $this.saldo - importe")
	void depositar(double importe)
	{saldo = saldo + importe;}
	
	@Post("$return == $this.saldo")
	double getSaldo()
	{return saldo;}
	
	@Post("$return == $this.descubierto")
	double getDescubierto()
	{return descubierto;}
	
	@Post("$return == $this.numero")
	int getNumero()
	{return numero;}
	}

