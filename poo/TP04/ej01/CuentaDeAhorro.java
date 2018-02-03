package ej01;
import org.contract4j5.contract.Contract;
import org.contract4j5.contract.Pre;
import org.contract4j5.contract.Post;
import org.contract4j5.contract.Invar;
@Contract
public class CuentaDeAhorro {
	private int numero;
	private double saldo;
	@Invar("$this.saldo >= 0.0")
	
	@Pre("numero > 0")
	CuentaDeAhorro(int numero)
	{ this.numero = numero; }
	
	@Pre("$this.saldo >= importe")
	@Post("$old($this.saldo) == $this.saldo + importe")
	void extraer(double importe)
	{ saldo = saldo - importe; }
	
	@Pre("importe > 0.0")
	@Post("$old($this.saldo) == $this.saldo - importe")
	void depositar(double importe)
	{ saldo = saldo + importe; }
	
	@Post("$return == $this.saldo")
	double getSaldo()
	{ return saldo; }
	
	@Post("$return == $this.numero")
	int getNumero()
	{ return numero; }
}
