package Ej_Restaurante_V2;

public abstract class Platos 
{
	//------- Atributos -------
	protected String nombre;
	protected int precio;
	
	//------ Constructores ----
	
	public Platos(String nombre, int precio) 
	{
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	//-------- Getters/Setters --------

	public String getNombre() 
	{ 
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public int getPrecio() 
	{
		return precio;
	}

	public void setPrecio(int precio) 
	{
		this.precio = precio;
	}
	
	//*Imprimir	
	@Override
	public String toString() {
		return "Platos [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
}
