package banco;

public class Ej1_CuentaCorriente 
{
	//Atributos :Datos que va a manejar la clase
	
	//	public → todo el mundo puede acceder 
	//	private → atributos que quiero proteger
	
	private String iban;
	private String titular;
	private double saldo;
	
	//Métodos: Comportamiento que la clase (la cuenta corriente) puede tener

	public String dimeElTitular()
	{
		return titular;
	}
	
	public String dimeElIban()
	{
		return iban;
	}
	
	public double dimeElSaldo() 
	{
		return saldo;
	}
	
	public void cambiaElTitular(String nuevoTitular) 
	{
		titular = nuevoTitular;
	}
	
	public void ingresar(double cantidad) 
	{
		saldo += cantidad;
	}
	
	public void retirar(double cantidad) 
	{
		if(cantidad <= saldo) 
		{		
			saldo -= cantidad;
		}
		else
			System.out.println("Saldo insuficiente");
	}
	
}
