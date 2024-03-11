package RistoranteAzarquiel;

public class Primero extends Plato
{
	//------- Atributos -------
	protected boolean sePuedeCompartir;

	//------ Constructores ----
	public Primero(String nombre, int precio, boolean sePuedeCompartir) 
	{
		super(nombre, precio);
		this.sePuedeCompartir = sePuedeCompartir;
	}
	
	//-------- Métodos --------

	public boolean isSePuedeCompartir() {
		return sePuedeCompartir;
	}

	public void setSePuedeCompartir(boolean sePuedeCompartir) {
		this.sePuedeCompartir = sePuedeCompartir;
	}

	//*Imprimir
	@Override
	public String toString() {
		return "Primero [nombre=" + nombre + ", precio=" + precio + ", sePuedeCompartir=" + sePuedeCompartir + "]";
	}
	
	
}
