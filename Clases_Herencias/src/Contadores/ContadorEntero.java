package Contadores;

public class ContadorEntero extends Contador 
{
	//------- Atributos -------
	protected int valor;

	//------ Constructores ----
	public ContadorEntero(int valor) {
		super();
		this.valor = valor;
	}
	//-------- Métodos --------

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	//-------- Métodos Heredados --------
	@Override
	public void incrementar() {
		this.valor++;
	}
	@Override
	public void decrementar() 
	{
		this.valor--;
	}
	@Override
	public void resetear() 
	{
		this.valor=0;		
	}
	
	//*Imprimir
	@Override
	public String toString() {
		return "ContadorEntero [valor=" + valor + "]";
	}

	
	
	
}
