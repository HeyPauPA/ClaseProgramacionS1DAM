package banco;

public class Persona 
{
	// --- Atributos ----	
	private String nombre;
	private String dni;
	private int telefono;
//	private String direccion;
//	private String eMail;
	
	// --- Constructor ---
	public Persona(String nombre, String dni, int telefono) 
	{
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
	}
	public Persona(String nombre, String dni) 
	{
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = 000000000;
	}
	
	// --- Metodos ---
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public int getTelefono() 
	{
		return telefono;
	}
	public void setTelefono(int telefono) 
	{
		this.telefono = telefono;
	}
	public String getDni() 
	{
		return dni;
	}
	
	//Para escribirlo
	@Override
	public String toString() 
	{
		return "Persona [nombre = " + nombre + ", dni = " + dni + ", telefono = " + telefono + "]";
	}
	
	
}



