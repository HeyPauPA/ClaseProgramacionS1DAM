package RistoranteAzarquiel;

public class Postre extends Plato
{
	//------- Atributos -------
	protected boolean tieneAzucar;

	//------ Constructores ----
	public Postre(String nombre, int precio, boolean tieneAzucar) 
	{
		super(nombre, precio);
		this.tieneAzucar = tieneAzucar;
	}

	//-------- Métodos --------
	public boolean isTieneAzucar() {
		return tieneAzucar;
	}
	
	public void setTieneAzucar(boolean tieneAzucar) {
		this.tieneAzucar = tieneAzucar;
	}

	//*Imprimir
	@Override
	public String toString() {
		return "Postre [nombre=" + nombre + ", precio=" + precio + ", tieneAzucar=" + tieneAzucar + "]";
	}
	
	
}
