package RistoranteAzarquiel;

public class Carne extends Plato
{
	//------- Atributos -------
	protected String tipoCoccion;

	//------ Constructores ----
	public Carne(String nombre, int precio, String tipoCoccion) 
	{
		super(nombre, precio);
		this.tipoCoccion = tipoCoccion;
	}

	public String getTipoCoccion() {
		return tipoCoccion;
	}

	//-------- Métodos --------
	public void setTipoCoccion(String tipoCoccion) 
	{
		this.tipoCoccion = tipoCoccion;
	}

	//*Imprimir
	@Override
	public String toString() {
		return "Carne [nombre=" + nombre + ", precio=" + precio + ", tipoCoccion=" + tipoCoccion + "]";
	}

	
}
