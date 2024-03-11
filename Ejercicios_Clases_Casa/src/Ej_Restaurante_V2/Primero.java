package Ej_Restaurante_V2;

public class Primero extends Platos
{
	//------- Atributos -------
	protected boolean sePuedeCompartir;

	//------ Constructores ----
	public Primero(String nombre, int precio, boolean sePuedeCompartir) 
	{
		super(nombre, precio);
		this.sePuedeCompartir = sePuedeCompartir;
	}
	//si no se especifica si se puede compartir
	public Primero(String nombre, int precio) 
	{
		super(nombre, precio);
		this.sePuedeCompartir = false;
	}	

	//-------- Getters/Setters --------
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
