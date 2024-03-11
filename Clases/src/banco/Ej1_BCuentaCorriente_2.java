package banco;

public class Ej1_BCuentaCorriente_2 
{
	//-- Atributos :Datos que va a manejar la clase
	
	private String iban;
	private String titular;
	private double saldo;
	
	
	//-- Constructor: Método que se crea cuando se instancia un objeto
	
	//Diferentes constructores para diferentes Casos
	// clickDer → Source → Generate Constructor using Fields...
	public Ej1_BCuentaCorriente_2 (String iban,String titular,double saldo) //metodo con el nombre de la clase 
	{																		//y sus 3 atributos (sin void ni nada)
																			//* se meteran los datos en el orden indicado
		//se crea al nacer
		this.iban = iban; //this → hace referencia a los datos del objeto el de aqui
		this.titular = titular;  // lo que dice es el dato titular de aqui es igual al dato titular que le pasemos (en la clase de pruebas)
		this.saldo = saldo;
	}
	public Ej1_BCuentaCorriente_2(String iban, String titular) 
	{
		this.iban = iban;
		this.titular = titular;
		this.saldo = 0;
	}
	
	public Ej1_BCuentaCorriente_2(String iban) 
	{
		this.iban = iban;
		this.titular = "Sin Titular";
		this.saldo = 0;
	}

	//-- Métodos: Comportamiento que la clase (la cuenta corriente) puede tener
	
	//Metodos hechos automaticamente:
	// clickDer → Source → Generate Getters and Setters...
	
	public String getTitular() 
	{
		return titular;
	}

	public void setTitular(String titular) 
	{
		this.titular = titular;
	}
	
	public String getIban() 
	{
		return iban;
	}
	
	public double getSaldo() 
	{
		return saldo;
	}
	
	//Para concertir todos los datos del objeto a string
	// clickDer → Source → Generate toString()...
	@Override
	public String toString() {
		return "Ej1_BCuentaCorriente_2 [iban=" + iban + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	//métodos hechos a mano
	public void ingresar(double cantidad) 
	{
		saldo += cantidad;
	}
	public boolean retirar(double cantidad) 
	{
		if(cantidad <= saldo) 
		{
			saldo -= cantidad;
			return true;
		}
		else 
		{
			return false;
		}
	}
}
