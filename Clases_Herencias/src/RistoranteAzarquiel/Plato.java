package RistoranteAzarquiel;

public abstract class Plato 
{
	//------- Atributos -------
	protected String nombre;
	protected int precio;
	
	//------ Constructores ----
	public Plato(String nombre, int precio) 
	{
		this.nombre = nombre;
		this.precio = precio;
	}

	//-------- Métodos --------
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	//*Imprimir
	@Override
	public String toString() 
	{
		return "Plato [nombre=" + nombre + ", precio=" + precio + "]";
	}

	
}
