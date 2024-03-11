package Contadores;

public class ContadorDecimales extends Contador
{
	//------- Atributos -------
	protected double valor;
	
	//------ Constructores ----
	public ContadorDecimales(float valor) {
		super();
		this.valor = valor;
	}
	
	//-------- Métodos --------
	public double getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	//-------- Métodos Heredados --------
	@Override
	public void incrementar() 
	{
		this.valor = (valor + (0.1));	
	}
	@Override
	public void decrementar() 
	{
		this.valor = (valor - (0.1));
	}
	@Override
	public void resetear()
	{
		this.valor = 0.0;
	}

	//*Imprimir
		@Override
	public String toString() {
		return "ContadorDecimales [valor=" + valor + "]";
	}
	
}
